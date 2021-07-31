package typings.typedoc

import typings.typedoc.modelsMod.PredicateType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesPredicateMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/predicate", "PredicateTypeSerializer")
  @js.native
  class PredicateTypeSerializer protected () extends TypeSerializerComponent[PredicateType] {
    def this(owner: Serializer) = this()
    
    def toObject(`type`: PredicateType, obj: js.Any): js.Any = js.native
  }
}
