package typings.wordpressEditPost.pluginSidebarMoreMenuItemMod.PluginSidebarMoreMenuItem

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  /**
    * A Dashicon slug or a custom JSX element to be rendered to the left of the menu item
    * label.
    */
  var icon: js.UndefOr[Icon | Element] = js.undefined
  /**
    * A string identifying the target sidebar you wish to be activated by this menu item. Must
    * be the same as the `name` prop you have given to that sidebar.
    */
  var target: String
}

object Props {
  @scala.inline
  def apply(target: String, children: ReactNode = null, icon: Icon | Element = null): Props = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

