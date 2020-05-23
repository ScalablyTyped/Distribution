package typings.wordpressComponents.dateMod.DatePicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * The current date and time at initialization. Optionally pass in `null`
    * to specify no date is currently selected. Defaults to current date.
    */
  var currentDate: js.UndefOr[String] = js.undefined
  /**
    * Whether we use a 12-hour clock. With a 12-hour clock, an AM/PM
    * widget is displayed and the time format is assumed to be MM-DD-YYYY.
    */
  var is12Hour: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback function that should return a `boolean` to signify if the
    * day is valid or not.
    */
  var isInvalidDate: js.UndefOr[js.Function1[/* date */ Date, Boolean]] = js.undefined
  /**
    * Function to call when the date value changes.
    */
  def onChange(currentDate: String): Unit
}

object Props {
  @scala.inline
  def apply(
    onChange: String => Unit,
    currentDate: String = null,
    is12Hour: js.UndefOr[Boolean] = js.undefined,
    isInvalidDate: /* date */ Date => Boolean = null
  ): Props = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (!js.isUndefined(is12Hour)) __obj.updateDynamic("is12Hour")(is12Hour.get.asInstanceOf[js.Any])
    if (isInvalidDate != null) __obj.updateDynamic("isInvalidDate")(js.Any.fromFunction1(isInvalidDate))
    __obj.asInstanceOf[Props]
  }
}

