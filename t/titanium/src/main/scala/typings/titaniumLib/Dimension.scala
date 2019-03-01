package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A simple object consisting of the position and size measurements.
  */
trait Dimension extends js.Object {
  /**
  	 * The height measurement.
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The width measurement.
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The x-axis coordinate of the position.
  	 */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The y-axis coordinate of the position.
  	 */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): Dimension = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
}

