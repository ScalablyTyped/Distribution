package typings.sweetalert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseModalValue extends js.Object {
  var closeModal: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object Anon_CloseModalValue {
  @scala.inline
  def apply(closeModal: js.UndefOr[Boolean] = js.undefined, value: String = null): Anon_CloseModalValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloseModalValue]
  }
}

