package typings.sweetalert.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseModalBoolean extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.undefined
}

object CloseModalBoolean {
  @scala.inline
  def apply(closeModal: js.UndefOr[Boolean] = js.undefined): CloseModalBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseModalBoolean]
  }
}

