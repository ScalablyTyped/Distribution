package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXYNumber extends js.Object {
  var x: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
  var y: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.undefined
}

object AnonXYNumber {
  @scala.inline
  def apply(x: Double | (js.Tuple2[Double, Double]) = null, y: Double | (js.Tuple2[Double, Double]) = null): AnonXYNumber = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXYNumber]
  }
}

