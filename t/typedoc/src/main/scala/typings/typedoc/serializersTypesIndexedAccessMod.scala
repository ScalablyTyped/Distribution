package typings.typedoc

import typings.typedoc.anon.PickIndexedAccessTypetype
import typings.typedoc.modelsMod.IndexedAccessType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesIndexedAccessMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/indexed-access", "IndexedAccessTypeSerializer")
  @js.native
  class IndexedAccessTypeSerializer protected () extends TypeSerializerComponent[IndexedAccessType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: IndexedAccessType, obj: PickIndexedAccessTypetype): typings.typedoc.schemaMod.IndexedAccessType = js.native
  }
}
