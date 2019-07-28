package typings.winrt.WindowsNs.UINs.CoreNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoreDispatcher extends ICoreAcceleratorKeys {
  var hasThreadAccess: Boolean
  def processEvents(options: CoreProcessEventsOption): Unit
  def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): IAsyncAction
  def runIdleAsync(agileCallback: IdleDispatchedHandler): IAsyncAction
}

object ICoreDispatcher {
  @scala.inline
  def apply(
    hasThreadAccess: Boolean,
    onacceleratorkeyactivated: js.Any,
    processEvents: CoreProcessEventsOption => Unit,
    runAsync: (CoreDispatcherPriority, DispatchedHandler) => IAsyncAction,
    runIdleAsync: IdleDispatchedHandler => IAsyncAction
  ): ICoreDispatcher = {
    val __obj = js.Dynamic.literal(hasThreadAccess = hasThreadAccess, onacceleratorkeyactivated = onacceleratorkeyactivated, processEvents = js.Any.fromFunction1(processEvents), runAsync = js.Any.fromFunction2(runAsync), runIdleAsync = js.Any.fromFunction1(runIdleAsync))
  
    __obj.asInstanceOf[ICoreDispatcher]
  }
}

