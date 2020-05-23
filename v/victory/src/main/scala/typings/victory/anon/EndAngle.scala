package typings.victory.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndAngle extends js.Object {
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var endAngle: js.UndefOr[Double] = js.undefined
  var padAngle: js.UndefOr[Double] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
}

object EndAngle {
  @scala.inline
  def apply(
    data: js.Array[_] = null,
    endAngle: js.UndefOr[Double] = js.undefined,
    padAngle: js.UndefOr[Double] = js.undefined,
    startAngle: js.UndefOr[Double] = js.undefined
  ): EndAngle = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padAngle)) __obj.updateDynamic("padAngle")(padAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndAngle]
  }
}

