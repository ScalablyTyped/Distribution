package typings.validator.mod.validator

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
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): IsByteLengthOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsByteLengthOptions]
  }
}

