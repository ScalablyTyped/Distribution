package typings.typedoc

import typings.typedoc.anon.PickUnionTypetype
import typings.typedoc.modelsMod.UnionType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnionMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/union", "UnionTypeSerializer")
  @js.native
  class UnionTypeSerializer protected () extends TypeSerializerComponent[UnionType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: UnionType, obj: PickUnionTypetype): typings.typedoc.schemaMod.UnionType = js.native
  }
}
