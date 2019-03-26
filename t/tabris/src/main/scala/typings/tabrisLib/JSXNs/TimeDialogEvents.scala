package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeDialogEvents extends NativeObjectEvents {
  /**
    * Fired when the time dialog was closed.
    */
  var onClose: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.TimeDialogCloseEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*date*](#date) property has changed.
    * @param value The new value of [*date*](#date).
    */
  var onDateChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TimeDialog, stdLib.Date], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when a time was selected by the user.
    */
  var onSelect: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.TimeDialogSelectEvent, scala.Unit]] = js.undefined
}

object TimeDialogEvents {
  @scala.inline
  def apply(
    onClose: /* event */ tabrisLib.tabrisMod.TimeDialogCloseEvent => scala.Unit = null,
    onDateChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.TimeDialog, stdLib.Date] => scala.Unit = null,
    onSelect: /* event */ tabrisLib.tabrisMod.TimeDialogSelectEvent => scala.Unit = null
  ): TimeDialogEvents = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onDateChanged != null) __obj.updateDynamic("onDateChanged")(js.Any.fromFunction1(onDateChanged))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[TimeDialogEvents]
  }
}

