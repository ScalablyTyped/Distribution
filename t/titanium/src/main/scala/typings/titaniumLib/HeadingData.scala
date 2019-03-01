package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding compass heading data.
  */
trait HeadingData extends js.Object {
  /**
  	 * Accuracy of the compass heading, in platform-specific units.
  	 */
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Declination in degrees from magnetic North.
  	 */
  var magneticHeading: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Timestamp for the heading data, in milliseconds.
  	 */
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Declination in degrees from true North.
  	 */
  var trueHeading: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Raw geomagnetic data for the X axis.
  	 */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Raw geomagnetic data for the Y axis.
  	 */
  var y: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Raw geomagnetic data for the Z axis.
  	 */
  var z: js.UndefOr[scala.Double] = js.undefined
}

object HeadingData {
  @scala.inline
  def apply(
    accuracy: scala.Int | scala.Double = null,
    magneticHeading: scala.Int | scala.Double = null,
    timestamp: scala.Int | scala.Double = null,
    trueHeading: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): HeadingData = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (magneticHeading != null) __obj.updateDynamic("magneticHeading")(magneticHeading.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (trueHeading != null) __obj.updateDynamic("trueHeading")(trueHeading.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingData]
  }
}

