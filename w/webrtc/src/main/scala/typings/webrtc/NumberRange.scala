package typings.webrtc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberRange extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
}

object NumberRange {
  @scala.inline
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): NumberRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberRange]
  }
}

