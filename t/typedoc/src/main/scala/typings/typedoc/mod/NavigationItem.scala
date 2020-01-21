package typings.typedoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "NavigationItem")
@js.native
class NavigationItem ()
  extends typings.typedoc.navigationItemMod.NavigationItem {
  def this(title: String) = this()
  def this(title: String, url: String) = this()
  def this(title: String, url: String, parent: typings.typedoc.navigationItemMod.NavigationItem) = this()
  def this(
    title: String,
    url: String,
    parent: typings.typedoc.navigationItemMod.NavigationItem,
    cssClasses: String
  ) = this()
  def this(
    title: String,
    url: String,
    parent: typings.typedoc.navigationItemMod.NavigationItem,
    cssClasses: String,
    reflection: typings.typedoc.abstractMod.Reflection
  ) = this()
}

/* static members */
@JSImport("typedoc", "NavigationItem")
@js.native
object NavigationItem extends js.Object {
  def create(reflection: typings.typedoc.abstractMod.Reflection): typings.typedoc.navigationItemMod.NavigationItem = js.native
  def create(
    reflection: typings.typedoc.abstractMod.Reflection,
    parent: typings.typedoc.navigationItemMod.NavigationItem
  ): typings.typedoc.navigationItemMod.NavigationItem = js.native
  def create(
    reflection: typings.typedoc.abstractMod.Reflection,
    parent: typings.typedoc.navigationItemMod.NavigationItem,
    useShortNames: Boolean
  ): typings.typedoc.navigationItemMod.NavigationItem = js.native
}

