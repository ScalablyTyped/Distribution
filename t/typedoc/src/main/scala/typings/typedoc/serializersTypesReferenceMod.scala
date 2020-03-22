package typings.typedoc

import typings.typedoc.modelsMod.ReferenceType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/reference", JSImport.Namespace)
@js.native
object serializersTypesReferenceMod extends js.Object {
  @js.native
  class ReferenceTypeSerializer () extends TypeSerializerComponent[ReferenceType] {
    def toObject(`type`: ReferenceType, obj: PickReferenceTypetypePart): typings.typedoc.schemaMod.ReferenceType = js.native
  }
  
}

