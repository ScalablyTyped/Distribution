package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateDialogEvents extends NativeObjectEvents {
  /**
    * Fired when the date dialog was closed.
    */
  var onClose: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.DateDialogCloseEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*date*](#date) property has changed.
    * @param value The new value of [*date*](#date).
    */
  var onDateChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.DateDialog, stdLib.Date], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*maxDate*](#maxDate) property has changed.
    * @param value The new value of [*maxDate*](#maxDate).
    */
  var onMaxDateChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.DateDialog, stdLib.Date], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*minDate*](#minDate) property has changed.
    * @param value The new value of [*minDate*](#minDate).
    */
  var onMinDateChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.DateDialog, stdLib.Date], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when a date was selected by the user.
    */
  var onSelect: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.DateDialogSelectEvent, scala.Unit]] = js.undefined
}

object DateDialogEvents {
  @scala.inline
  def apply(
    onClose: /* event */ tabrisLib.tabrisMod.DateDialogCloseEvent => scala.Unit = null,
    onDateChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.DateDialog, stdLib.Date] => scala.Unit = null,
    onMaxDateChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.DateDialog, stdLib.Date] => scala.Unit = null,
    onMinDateChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.DateDialog, stdLib.Date] => scala.Unit = null,
    onSelect: /* event */ tabrisLib.tabrisMod.DateDialogSelectEvent => scala.Unit = null
  ): DateDialogEvents = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onDateChanged != null) __obj.updateDynamic("onDateChanged")(js.Any.fromFunction1(onDateChanged))
    if (onMaxDateChanged != null) __obj.updateDynamic("onMaxDateChanged")(js.Any.fromFunction1(onMaxDateChanged))
    if (onMinDateChanged != null) __obj.updateDynamic("onMinDateChanged")(js.Any.fromFunction1(onMinDateChanged))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[DateDialogEvents]
  }
}

