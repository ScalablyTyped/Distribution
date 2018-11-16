package typings
package typedocLib.distLibSerializationSerializersSourcesSourceDashReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/sources/source-reference", "SourceReferenceContainerSerializer")
@js.native
class SourceReferenceContainerSerializer ()
  extends typedocLib.distLibSerializationComponentsMod.SerializerComponent[
      typedocLib.distLibSerializationSerializersModelsSourceDashReferenceDashWrapperMod.SourceReferenceWrapper
    ] {
  @JSName("serializeGroupSymbol")
  var serializeGroupSymbol_SourceReferenceContainerSerializer: ScalablyTyped.runtime.Instantiable1[
    /* sourceReference */ typedocLib.distLibModelsSourcesFileMod.SourceReference, 
    typedocLib.distLibSerializationSerializersModelsSourceDashReferenceDashWrapperMod.SourceReferenceWrapper
  ] = js.native
  def serializeGroup(instance: js.Any): scala.Boolean = js.native
}

@JSImport("typedoc/dist/lib/serialization/serializers/sources/source-reference", "SourceReferenceContainerSerializer")
@js.native
object SourceReferenceContainerSerializer extends js.Object {
  var PRIORITY: scala.Double = js.native
}

