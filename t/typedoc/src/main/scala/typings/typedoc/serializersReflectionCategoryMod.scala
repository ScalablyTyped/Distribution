package typings.typedoc

import typings.typedoc.anon.PartialReflectionCategory
import typings.typedoc.reflectionCategoryMod.ReflectionCategory
import typings.typedoc.serializationComponentsMod.SerializerComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/reflection-category", JSImport.Namespace)
@js.native
object serializersReflectionCategoryMod extends js.Object {
  @js.native
  class ReflectionCategorySerializer () extends SerializerComponent[ReflectionCategory] {
    def toObject(category: ReflectionCategory, obj: PartialReflectionCategory): typings.typedoc.schemaMod.ReflectionCategory = js.native
  }
  
  /* static members */
  @js.native
  object ReflectionCategorySerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

