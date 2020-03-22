package typings.typedoc

import typings.typedoc.schemaMod.SourceReference
import typings.typedoc.serializationComponentsMod.SerializerComponent
import typings.typedoc.serializersModelsMod.SourceReferenceWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/sources/source-reference", JSImport.Namespace)
@js.native
object sourceReferenceMod extends js.Object {
  @js.native
  class SourceReferenceContainerSerializer () extends SerializerComponent[SourceReferenceWrapper] {
    def toObject(hasSourceReference: SourceReferenceWrapper, obj: PartialSourceReference): SourceReference = js.native
  }
  
  /* static members */
  @js.native
  object SourceReferenceContainerSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

