package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A pair of coordinates used to describe the location of a <Titanium.UI.View>.
  */
trait Point extends js.Object {
  /**
  	 * The x-axis coordinate of this point.
  	 */
  var x: js.UndefOr[Double | String] = js.undefined
  /**
  	 * The y-axis coordinate of this point.
  	 */
  var y: js.UndefOr[Double | String] = js.undefined
}

object Point {
  @scala.inline
  def apply(x: Double | String = null, y: Double | String = null): Point = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

