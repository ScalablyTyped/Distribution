package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateDialogEvents extends NativeObjectEvents {
  /**
    * Fired when the date dialog was closed.
    */
  var close: js.UndefOr[js.Function1[/* event */ DateDialogCloseEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*date*](#date) property has changed.
    * @param value The new value of [*date*](#date).
    */
  var dateChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[DateDialog, stdLib.Date], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*maxDate*](#maxDate) property has changed.
    * @param value The new value of [*maxDate*](#maxDate).
    */
  var maxDateChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[DateDialog, stdLib.Date], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*minDate*](#minDate) property has changed.
    * @param value The new value of [*minDate*](#minDate).
    */
  var minDateChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[DateDialog, stdLib.Date], scala.Unit]
  ] = js.undefined
  /**
    * Fired when a date was selected by the user.
    */
  var select: js.UndefOr[js.Function1[/* event */ DateDialogSelectEvent, scala.Unit]] = js.undefined
}

object DateDialogEvents {
  @scala.inline
  def apply(
    close: /* event */ DateDialogCloseEvent => scala.Unit = null,
    dateChanged: /* event */ PropertyChangedEvent[DateDialog, stdLib.Date] => scala.Unit = null,
    maxDateChanged: /* event */ PropertyChangedEvent[DateDialog, stdLib.Date] => scala.Unit = null,
    minDateChanged: /* event */ PropertyChangedEvent[DateDialog, stdLib.Date] => scala.Unit = null,
    select: /* event */ DateDialogSelectEvent => scala.Unit = null
  ): DateDialogEvents = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (dateChanged != null) __obj.updateDynamic("dateChanged")(js.Any.fromFunction1(dateChanged))
    if (maxDateChanged != null) __obj.updateDynamic("maxDateChanged")(js.Any.fromFunction1(maxDateChanged))
    if (minDateChanged != null) __obj.updateDynamic("minDateChanged")(js.Any.fromFunction1(minDateChanged))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    __obj.asInstanceOf[DateDialogEvents]
  }
}

