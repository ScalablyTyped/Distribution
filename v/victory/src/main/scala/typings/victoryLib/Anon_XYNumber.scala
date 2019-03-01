package typings
package victoryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYNumber extends js.Object {
  var x: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, scala.Double])] = js.undefined
  var y: js.UndefOr[scala.Double | (js.Tuple2[scala.Double, scala.Double])] = js.undefined
}

object Anon_XYNumber {
  @scala.inline
  def apply(
    x: scala.Double | (js.Tuple2[scala.Double, scala.Double]) = null,
    y: scala.Double | (js.Tuple2[scala.Double, scala.Double]) = null
  ): Anon_XYNumber = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XYNumber]
  }
}

