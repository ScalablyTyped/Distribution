package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.IAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoreDispatcher extends ICoreAcceleratorKeys {
  
  var hasThreadAccess: Boolean = js.native
  
  def processEvents(options: CoreProcessEventsOption): Unit = js.native
  
  def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): IAsyncAction = js.native
  
  def runIdleAsync(agileCallback: IdleDispatchedHandler): IAsyncAction = js.native
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
    val __obj = js.Dynamic.literal(hasThreadAccess = hasThreadAccess.asInstanceOf[js.Any], onacceleratorkeyactivated = onacceleratorkeyactivated.asInstanceOf[js.Any], processEvents = js.Any.fromFunction1(processEvents), runAsync = js.Any.fromFunction2(runAsync), runIdleAsync = js.Any.fromFunction1(runIdleAsync))
    __obj.asInstanceOf[ICoreDispatcher]
  }
  
  @scala.inline
  implicit class ICoreDispatcherOps[Self <: ICoreDispatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasThreadAccess(value: Boolean): Self = this.set("hasThreadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessEvents(value: CoreProcessEventsOption => Unit): Self = this.set("processEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunAsync(value: (CoreDispatcherPriority, DispatchedHandler) => IAsyncAction): Self = this.set("runAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRunIdleAsync(value: IdleDispatchedHandler => IAsyncAction): Self = this.set("runIdleAsync", js.Any.fromFunction1(value))
  }
}
