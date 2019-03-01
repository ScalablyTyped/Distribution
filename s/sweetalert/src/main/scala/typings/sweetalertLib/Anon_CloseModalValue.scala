package typings
package sweetalertLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseModalValue extends js.Object {
  var closeModal: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CloseModalValue {
  @scala.inline
  def apply(closeModal: js.UndefOr[scala.Boolean] = js.undefined, value: java.lang.String = null): Anon_CloseModalValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeModal)) __obj.updateDynamic("closeModal")(closeModal)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_CloseModalValue]
  }
}

