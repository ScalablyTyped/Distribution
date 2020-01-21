package typings.typedoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TocPlugin")
@js.native
class TocPlugin ()
  extends typings.typedoc.outputPluginsMod.TocPlugin

/* static members */
@JSImport("typedoc", "TocPlugin")
@js.native
object TocPlugin extends js.Object {
  def buildToc(
    model: typings.typedoc.reflectionsMod.Reflection,
    trail: js.Array[typings.typedoc.reflectionsMod.Reflection],
    parent: typings.typedoc.navigationItemMod.NavigationItem
  ): Unit = js.native
  def buildToc(
    model: typings.typedoc.reflectionsMod.Reflection,
    trail: js.Array[typings.typedoc.reflectionsMod.Reflection],
    parent: typings.typedoc.navigationItemMod.NavigationItem,
    restriction: js.Array[String]
  ): Unit = js.native
}

