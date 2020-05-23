package typings.wordpressComponents.rowMod.PanelRow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * The class that will be added with `components-panel__row`. to the
    * classes of the wrapper div. If no `className` is passed only
    * `components-panel__row` is used.
    */
  var className: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(className: String = null): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

