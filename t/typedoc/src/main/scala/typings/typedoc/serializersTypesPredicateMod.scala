package typings.typedoc

import typings.typedoc.modelsMod.PredicateType
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/types/predicate", JSImport.Namespace)
@js.native
object serializersTypesPredicateMod extends js.Object {
  
  @js.native
  class PredicateTypeSerializer () extends TypeSerializerComponent[PredicateType] {
    
    def toObject(`type`: PredicateType, obj: js.Any): js.Any = js.native
  }
}
