package typings.wordpressEditPost.pluginDocumentSettingPanelMod.PluginDocumentSettingPanel

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.dashiconMod.Dashicon.Icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  /**
    * An optional class name added to the row.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * A Dashicon slug or a custom JSX element to be rendered when the sidebar is pinned to
    * toolbar.
    */
  var icon: js.UndefOr[Icon | Element] = js.undefined
  /**
    * The machine-friendly name for the panel.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The title of the panel.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    icon: Icon | Element = null,
    name: String = null,
    title: String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

