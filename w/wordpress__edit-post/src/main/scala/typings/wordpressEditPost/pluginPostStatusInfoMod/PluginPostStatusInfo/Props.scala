package typings.wordpressEditPost.pluginPostStatusInfoMod.PluginPostStatusInfo

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  /**
    * An optional class name added to the row.
    */
  var className: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: ReactNode = null, className: String = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

