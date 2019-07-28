package typings.sweetalert.typingsModulesOptionsButtonsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonOptions extends js.Object {
  var className: js.UndefOr[String | js.Array[String]] = js.undefined
  var closeModal: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ButtonOptions {
  @scala.inline
  def apply(
    className: String | js.Array[String] = null,
    closeModal: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    value: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined
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

