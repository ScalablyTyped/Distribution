package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertDialogEvents extends NativeObjectEvents {
  /**
    * Fired when the [*buttons*](#buttons) property has changed.
    * @param value The new value of [*buttons*](#buttons).
    */
  var buttonsChanged: js.UndefOr[
    js.Function1[
      /* event */ PropertyChangedEvent[AlertDialog, tabrisLib.Anon_CancelNeutral], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the dialog was closed for any reason.
    */
  var close: js.UndefOr[js.Function1[/* event */ AlertDialogCloseEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the dialog was closed by pressing the 'cancel' button.
    */
  var closeCancel: js.UndefOr[js.Function1[/* event */ EventObject[AlertDialog], scala.Unit]] = js.undefined
  /**
    * Fired when the dialog was closed by pressing the 'neutral' button.
    */
  var closeNeutral: js.UndefOr[js.Function1[/* event */ EventObject[AlertDialog], scala.Unit]] = js.undefined
  /**
    * Fired when the dialog was closed by pressing the 'ok' button.
    */
  var closeOk: js.UndefOr[js.Function1[/* event */ EventObject[AlertDialog], scala.Unit]] = js.undefined
  /**
    * Fired when the [*message*](#message) property has changed.
    * @param value The new value of [*message*](#message).
    */
  var messageChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[AlertDialog, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*textInputs*](#textInputs) property has changed.
    * @param value The new value of [*textInputs*](#textInputs).
    */
  var textInputsChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[AlertDialog, js.Array[TextInput]], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*title*](#title) property has changed.
    * @param value The new value of [*title*](#title).
    */
  var titleChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[AlertDialog, java.lang.String], scala.Unit]
  ] = js.undefined
}

object AlertDialogEvents {
  @scala.inline
  def apply(
    buttonsChanged: /* event */ PropertyChangedEvent[AlertDialog, tabrisLib.Anon_CancelNeutral] => scala.Unit = null,
    close: /* event */ AlertDialogCloseEvent => scala.Unit = null,
    closeCancel: /* event */ EventObject[AlertDialog] => scala.Unit = null,
    closeNeutral: /* event */ EventObject[AlertDialog] => scala.Unit = null,
    closeOk: /* event */ EventObject[AlertDialog] => scala.Unit = null,
    messageChanged: /* event */ PropertyChangedEvent[AlertDialog, java.lang.String] => scala.Unit = null,
    textInputsChanged: /* event */ PropertyChangedEvent[AlertDialog, js.Array[TextInput]] => scala.Unit = null,
    titleChanged: /* event */ PropertyChangedEvent[AlertDialog, java.lang.String] => scala.Unit = null
  ): AlertDialogEvents = {
    val __obj = js.Dynamic.literal()
    if (buttonsChanged != null) __obj.updateDynamic("buttonsChanged")(js.Any.fromFunction1(buttonsChanged))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (closeCancel != null) __obj.updateDynamic("closeCancel")(js.Any.fromFunction1(closeCancel))
    if (closeNeutral != null) __obj.updateDynamic("closeNeutral")(js.Any.fromFunction1(closeNeutral))
    if (closeOk != null) __obj.updateDynamic("closeOk")(js.Any.fromFunction1(closeOk))
    if (messageChanged != null) __obj.updateDynamic("messageChanged")(js.Any.fromFunction1(messageChanged))
    if (textInputsChanged != null) __obj.updateDynamic("textInputsChanged")(js.Any.fromFunction1(textInputsChanged))
    if (titleChanged != null) __obj.updateDynamic("titleChanged")(js.Any.fromFunction1(titleChanged))
    __obj.asInstanceOf[AlertDialogEvents]
  }
}

