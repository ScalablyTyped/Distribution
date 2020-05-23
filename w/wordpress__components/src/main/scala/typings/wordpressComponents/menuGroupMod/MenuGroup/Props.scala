package typings.wordpressComponents.menuGroupMod.MenuGroup

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  var className: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[ReactNode] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: ReactNode = null, className: String = null, label: ReactNode = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

