package typings.wordpressEditPost.pluginPrePublishPanelMod.PluginPrePublishPanel

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  /**
    * An optional class name added to the panel.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Whether to have the panel initially opened. When no title is provided it is always
    * opened.
    * @defaultValue `false`
    */
  var initialOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Title displayed at the top of the panel.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    initialOpen: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(initialOpen)) __obj.updateDynamic("initialOpen")(initialOpen.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

