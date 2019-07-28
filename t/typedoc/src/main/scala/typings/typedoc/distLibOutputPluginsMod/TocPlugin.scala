package typings.typedoc.distLibOutputPluginsMod

import typings.typedoc.distLibModelsReflectionsMod.Reflection
import typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins", "TocPlugin")
@js.native
class TocPlugin ()
  extends typings.typedoc.distLibOutputPluginsTocPluginMod.TocPlugin

/* static members */
@JSImport("typedoc/dist/lib/output/plugins", "TocPlugin")
@js.native
object TocPlugin extends js.Object {
  def buildToc(model: Reflection, trail: js.Array[Reflection], parent: NavigationItem): Unit = js.native
  def buildToc(
    model: Reflection,
    trail: js.Array[Reflection],
    parent: NavigationItem,
    restriction: js.Array[String]
  ): Unit = js.native
}

