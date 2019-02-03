package typings
package typedocLib.distLibConverterPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin")
@js.native
class CategoryPlugin ()
  extends typedocLib.distLibConverterPluginsCategoryPluginMod.CategoryPlugin

/* static members */
@JSImport("typedoc/dist/lib/converter/plugins", "CategoryPlugin")
@js.native
object CategoryPlugin extends js.Object {
  var WEIGHTS: js.Array[java.lang.String] = js.native
  def getCategory(reflection: typedocLib.distLibModelsReflectionsMod.Reflection): java.lang.String = js.native
  def getReflectionCategories(reflections: js.Array[typedocLib.distLibModelsReflectionsMod.Reflection]): js.Array[typedocLib.distLibModelsReflectionCategoryMod.ReflectionCategory] = js.native
  def sortCallback(
    a: typedocLib.distLibModelsReflectionsMod.Reflection,
    b: typedocLib.distLibModelsReflectionsMod.Reflection
  ): scala.Double = js.native
  def sortCatCallback(
    a: typedocLib.distLibModelsReflectionCategoryMod.ReflectionCategory,
    b: typedocLib.distLibModelsReflectionCategoryMod.ReflectionCategory
  ): scala.Double = js.native
}

