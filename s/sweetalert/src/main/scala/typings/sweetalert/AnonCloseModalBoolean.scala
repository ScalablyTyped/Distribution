package typings.sweetalert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloseModalBoolean extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.undefined
}

object AnonCloseModalBoolean {
  @scala.inline
  def apply(closeModal: js.UndefOr[Boolean] = js.undefined): AnonCloseModalBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloseModalBoolean]
  }
}

