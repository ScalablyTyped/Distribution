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

