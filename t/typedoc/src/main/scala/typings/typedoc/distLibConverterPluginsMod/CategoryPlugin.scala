package typings.typedoc.distLibConverterPluginsMod

import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin")
@js.native
class CategoryPlugin ()
  extends typings.typedoc.distLibConverterPluginsCategoryPluginMod.CategoryPlugin

/* static members */
@JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin")
@js.native
object CategoryPlugin extends js.Object {
  var WEIGHTS: js.Array[String] = js.native
  var defaultCategory: String = js.native
  def getCategory(reflection: Reflection): String = js.native
  def getReflectionCategories(reflections: js.Array[Reflection]): js.Array[ReflectionCategory] = js.native
  def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = js.native
}

