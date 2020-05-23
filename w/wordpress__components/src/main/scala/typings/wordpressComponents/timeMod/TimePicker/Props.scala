package typings.wordpressComponents.timeMod.TimePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Date string to use as current time. If not set, current time is used.
    */
  var currentTime: js.UndefOr[String] = js.undefined
  /**
    * Whether we use a 12-hour clock. With a 12-hour clock, an AM/PM
    * widget is displayed and the time format is assumed to be MM-DD-YYYY.
    */
  var is12Hour: js.UndefOr[Boolean] = js.undefined
  /**
    * Function to call when the time value changes.
    */
  def onChange(time: String): Unit
}

object Props {
  @scala.inline
  def apply(onChange: String => Unit, currentTime: String = null, is12Hour: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (currentTime != null) __obj.updateDynamic("currentTime")(currentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(is12Hour)) __obj.updateDynamic("is12Hour")(is12Hour.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

