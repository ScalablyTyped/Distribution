package typings.sweetalert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValue extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object AnonValue {
  @scala.inline
  def apply(closeModal: js.UndefOr[Boolean] = js.undefined, value: String = null): AnonValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValue]
  }
}

