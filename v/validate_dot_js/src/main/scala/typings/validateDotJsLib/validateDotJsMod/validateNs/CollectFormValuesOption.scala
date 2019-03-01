package typings
package validateDotJsLib.validateDotJsMod.validateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectFormValuesOption extends js.Object {
  var nullify: js.UndefOr[scala.Boolean] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
}

object CollectFormValuesOption {
  @scala.inline
  def apply(nullify: js.UndefOr[scala.Boolean] = js.undefined, trim: js.UndefOr[scala.Boolean] = js.undefined): CollectFormValuesOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(nullify)) __obj.updateDynamic("nullify")(nullify)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    __obj.asInstanceOf[CollectFormValuesOption]
  }
}

