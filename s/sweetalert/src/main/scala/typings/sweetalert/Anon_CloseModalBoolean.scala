package typings.sweetalert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseModalBoolean extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.undefined
}

object Anon_CloseModalBoolean {
  @scala.inline
  def apply(closeModal: js.UndefOr[Boolean] = js.undefined): Anon_CloseModalBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloseModalBoolean]
  }
}

