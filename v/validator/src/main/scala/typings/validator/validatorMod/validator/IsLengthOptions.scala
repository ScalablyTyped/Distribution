package typings.validator.validatorMod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsLengthOptions extends js.Object {
  /**
    * @default undefined
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * @default 0
    */
  var min: js.UndefOr[Double] = js.undefined
}

object IsLengthOptions {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): IsLengthOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLengthOptions]
  }
}

