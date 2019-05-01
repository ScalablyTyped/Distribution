package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetEvents extends NativeObjectEvents {
  /**
    * Fired when the [*actions*](#actions) property has changed.
    * @param value The new value of [*actions*](#actions).
    */
  var onActionsChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.ActionSheet, js.Array[tabrisLib.Anon_CancelDefault]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the action sheet was closed.
    */
  var onClose: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.ActionSheet], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*message*](#message) property has changed.
    * @param value The new value of [*message*](#message).
    */
  var onMessageChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.ActionSheet, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when an action was selected.
    */
  var onSelect: js.UndefOr[js.Function1[/* event */ tabrisLib.tabrisMod.ActionSheetSelectEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*title*](#title) property has changed.
    * @param value The new value of [*title*](#title).
    */
  var onTitleChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.ActionSheet, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
}

object ActionSheetEvents {
  @scala.inline
  def apply(
    onActionsChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.ActionSheet, js.Array[tabrisLib.Anon_CancelDefault]] => scala.Unit = null,
    onClose: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.ActionSheet] => scala.Unit = null,
    onMessageChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.ActionSheet, java.lang.String] => scala.Unit = null,
    onSelect: /* event */ tabrisLib.tabrisMod.ActionSheetSelectEvent => scala.Unit = null,
    onTitleChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.ActionSheet, java.lang.String] => scala.Unit = null
  ): ActionSheetEvents = {
    val __obj = js.Dynamic.literal()
    if (onActionsChanged != null) __obj.updateDynamic("onActionsChanged")(js.Any.fromFunction1(onActionsChanged))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onMessageChanged != null) __obj.updateDynamic("onMessageChanged")(js.Any.fromFunction1(onMessageChanged))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onTitleChanged != null) __obj.updateDynamic("onTitleChanged")(js.Any.fromFunction1(onTitleChanged))
    __obj.asInstanceOf[ActionSheetEvents]
  }
}

