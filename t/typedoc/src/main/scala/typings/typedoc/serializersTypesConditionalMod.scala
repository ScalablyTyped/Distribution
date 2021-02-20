package typings.typedoc

import typings.typedoc.anon.PickConditionalTypetypeTy
import typings.typedoc.modelsMod.ConditionalType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesConditionalMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/conditional", "ConditionalTypeSerializer")
  @js.native
  class ConditionalTypeSerializer protected () extends TypeSerializerComponent[ConditionalType] {
    def this(owner: Serializer) = this()
    
    def toObject(conditional: ConditionalType, obj: PickConditionalTypetypeTy): typings.typedoc.schemaMod.ConditionalType = js.native
  }
}
