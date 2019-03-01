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

object TimepickerOptions {
  @scala.inline
  def apply(
    end: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    start: scala.Int | scala.Double = null
  ): TimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerOptions]
  }
}

