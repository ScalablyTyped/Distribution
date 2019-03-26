package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertDialogEvents extends NativeObjectEvents {
  /**
    * Fired when the [*buttons*](#buttons) property has changed.
    * @param value The new value of [*buttons*](#buttons).
    */
  var onButtonsChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.AlertDialog, tabrisLib.Anon_CancelNeutral], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the dialog was closed for any reason.
    */
  var onClose: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.AlertDialogCloseEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the dialog was closed by pressing the 'cancel' button.
    */
  var onCloseCancel: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.AlertDialog], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the dialog was closed by pressing the 'neutral' button.
    */
  var onCloseNeutral: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.AlertDialog], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the dialog was closed by pressing the 'ok' button.
    */
  var onCloseOk: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.AlertDialog], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*message*](#message) property has changed.
    * @param value The new value of [*message*](#message).
    */
  var onMessageChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.AlertDialog, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*textInputs*](#textInputs) property has changed.
    * @param value The new value of [*textInputs*](#textInputs).
    */
  var onTextInputsChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.AlertDialog, js.Array[tabrisLib.tabrisMod.TextInput]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*title*](#title) property has changed.
    * @param value The new value of [*title*](#title).
    */
  var onTitleChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.AlertDialog, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
}

object AlertDialogEvents {
  @scala.inline
  def apply(
    onButtonsChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.AlertDialog, tabrisLib.Anon_CancelNeutral] => scala.Unit = null,
    onClose: /* event */ tabrisLib.tabrisMod.AlertDialogCloseEvent => scala.Unit = null,
    onCloseCancel: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.AlertDialog] => scala.Unit = null,
    onCloseNeutral: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.AlertDialog] => scala.Unit = null,
    onCloseOk: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.AlertDialog] => scala.Unit = null,
    onMessageChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.AlertDialog, java.lang.String] => scala.Unit = null,
    onTextInputsChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.AlertDialog, js.Array[tabrisLib.tabrisMod.TextInput]] => scala.Unit = null,
    onTitleChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.AlertDialog, java.lang.String] => scala.Unit = null
  ): AlertDialogEvents = {
    val __obj = js.Dynamic.literal()
    if (onButtonsChanged != null) __obj.updateDynamic("onButtonsChanged")(js.Any.fromFunction1(onButtonsChanged))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onCloseCancel != null) __obj.updateDynamic("onCloseCancel")(js.Any.fromFunction1(onCloseCancel))
    if (onCloseNeutral != null) __obj.updateDynamic("onCloseNeutral")(js.Any.fromFunction1(onCloseNeutral))
    if (onCloseOk != null) __obj.updateDynamic("onCloseOk")(js.Any.fromFunction1(onCloseOk))
    if (onMessageChanged != null) __obj.updateDynamic("onMessageChanged")(js.Any.fromFunction1(onMessageChanged))
    if (onTextInputsChanged != null) __obj.updateDynamic("onTextInputsChanged")(js.Any.fromFunction1(onTextInputsChanged))
    if (onTitleChanged != null) __obj.updateDynamic("onTitleChanged")(js.Any.fromFunction1(onTitleChanged))
    __obj.asInstanceOf[AlertDialogEvents]
  }
}

