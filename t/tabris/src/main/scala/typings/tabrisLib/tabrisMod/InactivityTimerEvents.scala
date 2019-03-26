package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InactivityTimerEvents extends NativeObjectEvents {
  /**
    * Fired when the [*delay*](#delay) property has changed.
    * @param value The new value of [*delay*](#delay).
    */
  var delayChanged: js.UndefOr[
    js.Function1[/* event */ PropertyChangedEvent[InactivityTimer, scala.Double], scala.Unit]
  ] = js.undefined
  /**
    * Fired when the app has not been interacted with since the configured delay.
    */
  var timeout: js.UndefOr[js.Function1[/* event */ EventObject[InactivityTimer], scala.Unit]] = js.undefined
}

object InactivityTimerEvents {
  @scala.inline
  def apply(
    delayChanged: /* event */ PropertyChangedEvent[InactivityTimer, scala.Double] => scala.Unit = null,
    timeout: /* event */ EventObject[InactivityTimer] => scala.Unit = null
  ): InactivityTimerEvents = {
    val __obj = js.Dynamic.literal()
    if (delayChanged != null) __obj.updateDynamic("delayChanged")(js.Any.fromFunction1(delayChanged))
    if (timeout != null) __obj.updateDynamic("timeout")(js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[InactivityTimerEvents]
  }
}

