package typings.typedoc.distLibConverterPluginsCategoryPluginMod

import typings.typedoc.distLibConverterComponentsMod.ConverterComponent
import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsReflectionCategoryMod.ReflectionCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", "CategoryPlugin")
@js.native
class CategoryPlugin () extends ConverterComponent {
  var categorize: js.Any = js.native
  var categorizeByGroup: Boolean = js.native
  var categoryOrder: js.Array[String] = js.native
  var defaultCategory: String = js.native
  var groupCategorize: js.Any = js.native
  var lumpCategorize: js.Any = js.native
  var onBegin: js.Any = js.native
  var onEndResolve: js.Any = js.native
  var onResolve: js.Any = js.native
}

/* static members */
@JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", "CategoryPlugin")
@js.native
object CategoryPlugin extends js.Object {
  var WEIGHTS: js.Array[String] = js.native
  var defaultCategory: String = js.native
  def getCategory(reflection: Reflection): String = js.native
  def getReflectionCategories(reflections: js.Array[Reflection]): js.Array[ReflectionCategory] = js.native
  def sortCatCallback(a: ReflectionCategory, b: ReflectionCategory): Double = js.native
}

