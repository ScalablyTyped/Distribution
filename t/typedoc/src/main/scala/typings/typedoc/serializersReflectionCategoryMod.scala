package typings.typedoc

import org.scalablytyped.runtime.Instantiable1
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
    @JSName("serializeGroupSymbol")
    var serializeGroupSymbol_ReflectionCategorySerializer: Instantiable1[/* title */ String, ReflectionCategory] = js.native
  }
  
  /* static members */
  @js.native
  object ReflectionCategorySerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

