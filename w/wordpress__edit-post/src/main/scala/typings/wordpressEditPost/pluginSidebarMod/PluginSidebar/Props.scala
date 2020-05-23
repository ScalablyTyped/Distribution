package typings.wordpressEditPost.pluginSidebarMod.PluginSidebar

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  /**
    * An optional class name added to the sidebar body.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * A Dashicon slug or a custom JSX element to be rendered when the sidebar is pinned to
    * toolbar.
    */
  var icon: js.UndefOr[Icon | Element] = js.undefined
  /**
    * Whether to allow to pin sidebar to toolbar.
    * @defaultValue `true`
    */
  var isPinnable: js.UndefOr[Boolean] = js.undefined
  /**
    * A string identifying the sidebar. Must be unique for every sidebar registered within the
    * scope of your plugin.
    */
  var name: String
  /**
    * Title displayed at the top of the sidebar.
    */
  var title: String
}

object Props {
  @scala.inline
  def apply(
    name: String,
    title: String,
    children: ReactNode = null,
    className: String = null,
    icon: Icon | Element = null,
    isPinnable: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isPinnable)) __obj.updateDynamic("isPinnable")(isPinnable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

