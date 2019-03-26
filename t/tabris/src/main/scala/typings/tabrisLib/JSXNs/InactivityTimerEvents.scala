package typings
package tabrisLib.JSXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InactivityTimerEvents extends NativeObjectEvents {
  /**
    * Fired when the [*delay*](#delay) property has changed.
    * @param value The new value of [*delay*](#delay).
    */
  var onDelayChanged: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.InactivityTimer, scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Fired when the app has not been interacted with since the configured delay.
    */
  var onTimeout: js.UndefOr[
    js.Function1[
      /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.InactivityTimer], 
      scala.Unit
    ]
  ] = js.undefined
}

object InactivityTimerEvents {
  @scala.inline
  def apply(
    onDelayChanged: /* event */ tabrisLib.tabrisMod.PropertyChangedEvent[tabrisLib.tabrisMod.InactivityTimer, scala.Double] => scala.Unit = null,
    onTimeout: /* event */ tabrisLib.tabrisMod.EventObject[tabrisLib.tabrisMod.InactivityTimer] => scala.Unit = null
  ): InactivityTimerEvents = {
    val __obj = js.Dynamic.literal()
    if (onDelayChanged != null) __obj.updateDynamic("onDelayChanged")(js.Any.fromFunction1(onDelayChanged))
    if (onTimeout != null) __obj.updateDynamic("onTimeout")(js.Any.fromFunction1(onTimeout))
    __obj.asInstanceOf[InactivityTimerEvents]
  }
}

