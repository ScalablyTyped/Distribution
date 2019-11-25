package typings.sweetalert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseModal extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String | js.Any] = js.undefined
}

object Anon_CloseModal {
  @scala.inline
  def apply(closeModal: js.UndefOr[Boolean] = js.undefined, value: String | js.Any = null): Anon_CloseModal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloseModal]
  }
}

