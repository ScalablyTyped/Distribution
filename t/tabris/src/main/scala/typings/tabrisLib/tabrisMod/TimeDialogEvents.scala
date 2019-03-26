package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeDialogEvents extends NativeObjectEvents {
  /**
    * Fired when the time dialog was closed.
    */
  var close: js.UndefOr[js.Function1[/* event */ TimeDialogCloseEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*date*](#date) property has changed.
    * @param value The new value of [*date*](#date).
    */
  var dateChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[TimeDialog, stdLib.Date], scala.Unit]
  ] = js.undefined
  /**
    * Fired when a time was selected by the user.
    */
  var select: js.UndefOr[js.Function1[/* event */ TimeDialogSelectEvent, scala.Unit]] = js.undefined
}

object TimeDialogEvents {
  @scala.inline
  def apply(
    close: /* event */ TimeDialogCloseEvent => scala.Unit = null,
    dateChanged: /* event */ PropertyChangedEvent[TimeDialog, stdLib.Date] => scala.Unit = null,
    select: /* event */ TimeDialogSelectEvent => scala.Unit = null
  ): TimeDialogEvents = {
    val __obj = js.Dynamic.literal()
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (dateChanged != null) __obj.updateDynamic("dateChanged")(js.Any.fromFunction1(dateChanged))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    __obj.asInstanceOf[TimeDialogEvents]
  }
}

