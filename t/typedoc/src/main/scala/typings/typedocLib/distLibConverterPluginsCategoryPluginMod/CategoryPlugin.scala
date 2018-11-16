package typings
package typedocLib.distLibConverterPluginsCategoryPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", "CategoryPlugin")
@js.native
class CategoryPlugin ()
  extends typedocLib.distLibConverterComponentsMod.ConverterComponent {
  var onEndResolve: js.Any = js.native
  var onResolve: js.Any = js.native
}

@JSImport("typedoc/dist/lib/converter/plugins/CategoryPlugin", "CategoryPlugin")
@js.native
object CategoryPlugin extends js.Object {
  var WEIGHTS: js.Array[_] = js.native
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

