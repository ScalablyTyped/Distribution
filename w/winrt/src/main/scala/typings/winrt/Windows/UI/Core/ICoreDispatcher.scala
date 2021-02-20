package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
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
  implicit class ICoreDispatcherMutableBuilder[Self <: ICoreDispatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasThreadAccess(value: Boolean): Self = StObject.set(x, "hasThreadAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessEvents(value: CoreProcessEventsOption => Unit): Self = StObject.set(x, "processEvents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRunAsync(value: (CoreDispatcherPriority, DispatchedHandler) => IAsyncAction): Self = StObject.set(x, "runAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRunIdleAsync(value: IdleDispatchedHandler => IAsyncAction): Self = StObject.set(x, "runIdleAsync", js.Any.fromFunction1(value))
  }
}
