package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceEvents extends NativeObjectEvents {
  /**
    * Fired when the `orientation` property has changed and the rotation animation has finished.
    * @param value The new value of [*orientation*](#orientation).
    */
  var onOrientationChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Device, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*win_keyboardPresent*](#win_keyboardPresent) property has changed.
    * @param value The new value of [*win_keyboardPresent*](#win_keyboardPresent).
    */
  var onWin_keyboardPresentChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Device, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the [*win_primaryInput*](#win_primaryInput) property has changed.
    * @param value The new value of [*win_primaryInput*](#win_primaryInput).
    */
  var onWin_primaryInputChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Device, scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
}

object DeviceEvents {
  @scala.inline
  def apply(
    onOrientationChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Device, java.lang.String] => scala.Unit = null,
    onWin_keyboardPresentChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Device, scala.Boolean] => scala.Unit = null,
    onWin_primaryInputChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.Device, scala.Boolean] => scala.Unit = null
  ): DeviceEvents = {
    val __obj = js.Dynamic.literal()
    if (onOrientationChanged != null) __obj.updateDynamic("onOrientationChanged")(js.Any.fromFunction1(onOrientationChanged))
    if (onWin_keyboardPresentChanged != null) __obj.updateDynamic("onWin_keyboardPresentChanged")(js.Any.fromFunction1(onWin_keyboardPresentChanged))
    if (onWin_primaryInputChanged != null) __obj.updateDynamic("onWin_primaryInputChanged")(js.Any.fromFunction1(onWin_primaryInputChanged))
    __obj.asInstanceOf[DeviceEvents]
  }
}

