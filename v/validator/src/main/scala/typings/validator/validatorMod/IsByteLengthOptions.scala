package typings.validator.validatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsByteLengthOptions extends js.Object {
  /**
    * @default undefined
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * @default 0
    */
  var min: js.UndefOr[Double] = js.undefined
}

object IsByteLengthOptions {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): IsByteLengthOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsByteLengthOptions]
  }
}

