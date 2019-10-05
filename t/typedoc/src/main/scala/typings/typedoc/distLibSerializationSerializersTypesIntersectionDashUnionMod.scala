package typings.typedoc

import typings.typedoc.distLibSerializationComponentsMod.TypeSerializerComponent
import typings.typedoc.distLibSerializationSerializersTypesIntersectionDashUnionMod.IntersectionUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/intersection-union", JSImport.Namespace)
@js.native
object distLibSerializationSerializersTypesIntersectionDashUnionMod extends js.Object {
  @js.native
  class IntersectionTypeSerializer () extends TypeSerializerComponent[IntersectionUnion]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.distLibModelsMod.IntersectionType
    - typings.typedoc.distLibModelsMod.UnionType
  */
  trait IntersectionUnion extends js.Object
  
}

