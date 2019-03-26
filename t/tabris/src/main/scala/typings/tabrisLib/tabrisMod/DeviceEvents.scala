package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEvents extends NativeObjectEvents {
  /**
    * Fired when the `orientation` property has changed and the rotation animation has finished.
    * @param value The new value of [*orientation*](#orientation).
    */
  var orientationChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Device, java.lang.String], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*win_keyboardPresent*](#win_keyboardPresent) property has changed.
    * @param value The new value of [*win_keyboardPresent*](#win_keyboardPresent).
    */
  var win_keyboardPresentChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Device, scala.Boolean], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the [*win_primaryInput*](#win_primaryInput) property has changed.
    * @param value The new value of [*win_primaryInput*](#win_primaryInput).
    */
  var win_primaryInputChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[Device, scala.Boolean], scala.Unit]
  ] = js.undefined
}

object DeviceEvents {
  @scala.inline
  def apply(
    orientationChanged: /* event */ PropertyChangedEvent[Device, java.lang.String] => scala.Unit = null,
    win_keyboardPresentChanged: /* event */ PropertyChangedEvent[Device, scala.Boolean] => scala.Unit = null,
    win_primaryInputChanged: /* event */ PropertyChangedEvent[Device, scala.Boolean] => scala.Unit = null
  ): DeviceEvents = {
    val __obj = js.Dynamic.literal()
    if (orientationChanged != null) __obj.updateDynamic("orientationChanged")(js.Any.fromFunction1(orientationChanged))
    if (win_keyboardPresentChanged != null) __obj.updateDynamic("win_keyboardPresentChanged")(js.Any.fromFunction1(win_keyboardPresentChanged))
    if (win_primaryInputChanged != null) __obj.updateDynamic("win_primaryInputChanged")(js.Any.fromFunction1(win_primaryInputChanged))
    __obj.asInstanceOf[DeviceEvents]
  }
}

