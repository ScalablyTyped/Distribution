package typings.wordpressComponents.panelMod.Panel

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var children: ReactNode
  /**
    * The class that will be added with `components-panel`. If no
    * `className` is passed only `components-panel__body` and `is-opened`
    * is used.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Title of the `Panel`. Text will be rendered inside an `<h2>` tag.
    */
  var header: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(children: ReactNode = null, className: String = null, header: String = null): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

