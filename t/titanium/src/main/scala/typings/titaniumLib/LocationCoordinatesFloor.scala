package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object holding floor of the building on which the user is located.
  */
trait LocationCoordinatesFloor extends js.Object {
  /**
  	 * The logical floor of the building.
  	 */
  var level: js.UndefOr[scala.Double] = js.undefined
}

object LocationCoordinatesFloor {
  @scala.inline
  def apply(level: scala.Int | scala.Double = null): LocationCoordinatesFloor = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationCoordinatesFloor]
  }
}

