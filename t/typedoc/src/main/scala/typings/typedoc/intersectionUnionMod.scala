package typings.typedoc

import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types/intersection-union", JSImport.Namespace)
@js.native
object intersectionUnionMod extends js.Object {
  @js.native
  class IntersectionTypeSerializer () extends TypeSerializerComponent[IntersectionUnion]
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.modelsMod.IntersectionType
    - typings.typedoc.modelsMod.UnionType
  */
  trait IntersectionUnion extends js.Object
  
}

