package typings
package typedocLib.distLibOutputPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins", "TocPlugin")
@js.native
class TocPlugin ()
  extends typedocLib.distLibOutputPluginsTocPluginMod.TocPlugin

@JSImport("typedoc/dist/lib/output/plugins", "TocPlugin")
@js.native
object TocPlugin extends js.Object {
  def buildToc(
    model: typedocLib.distLibModelsReflectionsMod.Reflection,
    trail: js.Array[typedocLib.distLibModelsReflectionsMod.Reflection],
    parent: typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem
  ): scala.Unit = js.native
  def buildToc(
    model: typedocLib.distLibModelsReflectionsMod.Reflection,
    trail: js.Array[typedocLib.distLibModelsReflectionsMod.Reflection],
    parent: typedocLib.distLibOutputModelsNavigationItemMod.NavigationItem,
    restriction: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

