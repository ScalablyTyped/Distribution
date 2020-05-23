package typings.typedoc

import typings.typedoc.anon.PickIndexedAccessTypetype
import typings.typedoc.modelsMod.IndexedAccessType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/indexed-access", JSImport.Namespace)
@js.native
object serializersTypesIndexedAccessMod extends js.Object {
  @js.native
  class IndexedAccessTypeSerializer () extends TypeSerializerComponent[IndexedAccessType] {
    def toObject(`type`: IndexedAccessType, obj: PickIndexedAccessTypetype): typings.typedoc.schemaMod.IndexedAccessType = js.native
  }
  
}

