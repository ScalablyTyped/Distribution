package typings.typedoc

import typings.typedoc.anon.PickQueryTypetype
import typings.typedoc.modelsMod.QueryType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesQueryMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/query", "QueryTypeSerializer")
  @js.native
  class QueryTypeSerializer protected () extends TypeSerializerComponent[QueryType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: QueryType, obj: PickQueryTypetype): typings.typedoc.schemaMod.QueryType = js.native
  }
}
