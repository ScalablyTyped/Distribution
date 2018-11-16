package typings
package typedocLib.distLibOutputPluginsTocPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/TocPlugin", "TocPlugin")
@js.native
class TocPlugin ()
  extends typedocLib.distLibOutputComponentsMod.RendererComponent {
  var onRendererBeginPage: js.Any = js.native
}

@JSImport("typedoc/dist/lib/output/plugins/TocPlugin", "TocPlugin")
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

