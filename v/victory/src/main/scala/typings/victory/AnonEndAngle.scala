package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndAngle extends js.Object {
  var data: js.UndefOr[js.Array[_]] = js.undefined
  var endAngle: js.UndefOr[Double] = js.undefined
  var padAngle: js.UndefOr[Double] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
}

object AnonEndAngle {
  @scala.inline
  def apply(
    data: js.Array[_] = null,
    endAngle: Int | Double = null,
    padAngle: Int | Double = null,
    startAngle: Int | Double = null
  ): AnonEndAngle = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndAngle]
  }
}

