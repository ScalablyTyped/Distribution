package typings.uikit.UIkitNs

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
  var end: js.UndefOr[Double] = js.undefined
  /**
    * Defines the preferred time notation
    * @default '24h'
    * <h2>Possible value</h2>
    * '24h' or '12h'
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Start time
    * @default 0
    * <h2>Possible value</h2>
    * Integer between 0 and 24
    */
  var start: js.UndefOr[Double] = js.undefined
}

object TimepickerOptions {
  @scala.inline
  def apply(end: Int | Double = null, format: String = null, start: Int | Double = null): TimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimepickerOptions]
  }
}

