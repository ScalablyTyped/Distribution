package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreDispatcher extends ICoreAcceleratorKeys {
  var hasThreadAccess: scala.Boolean
  def processEvents(options: CoreProcessEventsOption): scala.Unit
  def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def runIdleAsync(agileCallback: IdleDispatchedHandler): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object ICoreDispatcher {
  @scala.inline
  def apply(
    hasThreadAccess: scala.Boolean,
    onacceleratorkeyactivated: js.Any,
    processEvents: js.Function1[CoreProcessEventsOption, scala.Unit],
    runAsync: js.Function2[
      CoreDispatcherPriority, 
      DispatchedHandler, 
      winrtLib.WindowsNs.FoundationNs.IAsyncAction
    ],
    runIdleAsync: js.Function1[IdleDispatchedHandler, winrtLib.WindowsNs.FoundationNs.IAsyncAction]
  ): ICoreDispatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasThreadAccess")(hasThreadAccess)
    __obj.updateDynamic("onacceleratorkeyactivated")(onacceleratorkeyactivated)
    __obj.updateDynamic("processEvents")(processEvents)
    __obj.updateDynamic("runAsync")(runAsync)
    __obj.updateDynamic("runIdleAsync")(runIdleAsync)
    __obj.asInstanceOf[ICoreDispatcher]
  }
}

