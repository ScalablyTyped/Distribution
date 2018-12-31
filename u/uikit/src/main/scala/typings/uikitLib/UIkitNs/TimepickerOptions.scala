package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimepickerOptions extends js.Object {
  /**
    * End time
    * @default 24
    * <h2>Possible value</h2>
    * Integer between 0 and 24
    */
  var end: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines the preferred time notation
    * @default '24h'
    * <h2>Possible value</h2>
    * '24h' or '12h'
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Start time
    * @default 0
    * <h2>Possible value</h2>
    * Integer between 0 and 24
    */
  var start: js.UndefOr[scala.Double] = js.undefined
}

