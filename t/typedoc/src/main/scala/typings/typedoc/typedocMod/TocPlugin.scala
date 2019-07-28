package typings.typedoc.typedocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TocPlugin")
@js.native
class TocPlugin ()
  extends typings.typedoc.distLibOutputPluginsMod.TocPlugin

/* static members */
@JSImport("typedoc", "TocPlugin")
@js.native
object TocPlugin extends js.Object {
  def buildToc(
    model: typings.typedoc.distLibModelsReflectionsMod.Reflection,
    trail: js.Array[typings.typedoc.distLibModelsReflectionsMod.Reflection],
    parent: typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem
  ): Unit = js.native
  def buildToc(
    model: typings.typedoc.distLibModelsReflectionsMod.Reflection,
    trail: js.Array[typings.typedoc.distLibModelsReflectionsMod.Reflection],
    parent: typings.typedoc.distLibOutputModelsNavigationItemMod.NavigationItem,
    restriction: js.Array[String]
  ): Unit = js.native
}

