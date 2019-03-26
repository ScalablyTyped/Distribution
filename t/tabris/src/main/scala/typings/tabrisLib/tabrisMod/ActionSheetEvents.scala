package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetEvents extends NativeObjectEvents {
  /**
    * Fired when the [*actions*](#actions) property has changed.
    * @param value The new value of [*actions*](#actions).
    */
  var actionsChanged: js.UndefOr[
    js.Function1[
      /* event */ PropertyChangedEvent[ActionSheet, js.Array[tabrisLib.Anon_Cancel]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the action sheet was closed.
    */
  var close: js.UndefOr[js.Function1[/* event */ EventObject[ActionSheet], scala.Unit]] = js.undefined
  /**
    * Fired when the [*message*](#message) property has changed.
    * @param value The new value of [*message*](#message).
    */
  var messageChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[ActionSheet, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when an action was selected.
    */
  var select: js.UndefOr[js.Function1[/* event */ ActionSheetSelectEvent, scala.Unit]] = js.undefined
  /**
    * Fired when the [*title*](#title) property has changed.
    * @param value The new value of [*title*](#title).
    */
  var titleChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[ActionSheet, java.lang.String], scala.Unit]
  ] = js.undefined
}

object ActionSheetEvents {
  @scala.inline
  def apply(
    actionsChanged: /* event */ PropertyChangedEvent[ActionSheet, js.Array[tabrisLib.Anon_Cancel]] => scala.Unit = null,
    close: /* event */ EventObject[ActionSheet] => scala.Unit = null,
    messageChanged: /* event */ PropertyChangedEvent[ActionSheet, java.lang.String] => scala.Unit = null,
    select: /* event */ ActionSheetSelectEvent => scala.Unit = null,
    titleChanged: /* event */ PropertyChangedEvent[ActionSheet, java.lang.String] => scala.Unit = null
  ): ActionSheetEvents = {
    val __obj = js.Dynamic.literal()
    if (actionsChanged != null) __obj.updateDynamic("actionsChanged")(js.Any.fromFunction1(actionsChanged))
    if (close != null) __obj.updateDynamic("close")(js.Any.fromFunction1(close))
    if (messageChanged != null) __obj.updateDynamic("messageChanged")(js.Any.fromFunction1(messageChanged))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1(select))
    if (titleChanged != null) __obj.updateDynamic("titleChanged")(js.Any.fromFunction1(titleChanged))
    __obj.asInstanceOf[ActionSheetEvents]
  }
}

