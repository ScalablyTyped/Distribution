package typings
package sweetalertLib.typingsModulesOptionsButtonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var className: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var closeModal: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    className: java.lang.String | js.Array[java.lang.String] = null,
    closeModal: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    value: js.Any = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal)
    if (text != null) __obj.updateDynamic("text")(text)
    if (value != null) __obj.updateDynamic("value")(value)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ButtonOptions]
  }
}

