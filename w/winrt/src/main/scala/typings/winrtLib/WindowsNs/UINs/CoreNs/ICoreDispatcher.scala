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
    processEvents: CoreProcessEventsOption => scala.Unit,
    runAsync: (CoreDispatcherPriority, DispatchedHandler) => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    runIdleAsync: IdleDispatchedHandler => winrtLib.WindowsNs.FoundationNs.IAsyncAction
  ): ICoreDispatcher = {
    val __obj = js.Dynamic.literal(hasThreadAccess = hasThreadAccess, onacceleratorkeyactivated = onacceleratorkeyactivated, processEvents = js.Any.fromFunction1(processEvents), runAsync = js.Any.fromFunction2(runAsync), runIdleAsync = js.Any.fromFunction1(runIdleAsync))
  
    __obj.asInstanceOf[ICoreDispatcher]
  }
}

