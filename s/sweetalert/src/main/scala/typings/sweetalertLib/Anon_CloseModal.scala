package typings
package sweetalertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseModal extends js.Object {
  var closeModal: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String | js.Any] = js.undefined
}

object Anon_CloseModal {
  @scala.inline
  def apply(closeModal: js.UndefOr[scala.Boolean] = js.undefined, value: java.lang.String | js.Any = null): Anon_CloseModal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloseModal]
  }
}

