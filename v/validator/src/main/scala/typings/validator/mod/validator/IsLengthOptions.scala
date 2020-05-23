package typings.validator.mod.validator

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
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): IsLengthOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLengthOptions]
  }
}

