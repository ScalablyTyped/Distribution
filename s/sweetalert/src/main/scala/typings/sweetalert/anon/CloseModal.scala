package typings.sweetalert.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseModal extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String | js.Any] = js.undefined
}

object CloseModal {
  @scala.inline
  def apply(closeModal: js.UndefOr[Boolean] = js.undefined, value: String | js.Any = null): CloseModal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseModal]
  }
}

