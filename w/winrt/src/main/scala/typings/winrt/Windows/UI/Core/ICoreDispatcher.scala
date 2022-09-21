package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICoreDispatcher
  extends StObject
     with ICoreAcceleratorKeys {
  
  var hasThreadAccess: Boolean
  
  def processEvents(options: CoreProcessEventsOption): Unit
  
  def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): IAsyncAction
  
  def runIdleAsync(agileCallback: IdleDispatchedHandler): IAsyncAction
}
object ICoreDispatcher {
  
  inline def apply(
    hasThreadAccess: Boolean,
    onacceleratorkeyactivated: Any,
    processEvents: CoreProcessEventsOption => Unit,
    runAsync: (CoreDispatcherPriority, DispatchedHandler) => IAsyncAction,
    runIdleAsync: IdleDispatchedHandler => IAsyncAction
  ): ICoreDispatcher = {
    val __obj = js.Dynamic.literal(hasThreadAccess = hasThreadAccess.asInstanceOf[js.Any], onacceleratorkeyactivated = onacceleratorkeyactivated.asInstanceOf[js.Any], processEvents = js.Any.fromFunction1(processEvents), runAsync = js.Any.fromFunction2(runAsync), runIdleAsync = js.Any.fromFunction1(runIdleAsync))
    __obj.asInstanceOf[ICoreDispatcher]
  }
  
  extension [Self <: ICoreDispatcher](x: Self) {
    
    inline def setHasThreadAccess(value: Boolean): Self = StObject.set(x, "hasThreadAccess", value.asInstanceOf[js.Any])
    
    inline def setProcessEvents(value: CoreProcessEventsOption => Unit): Self = StObject.set(x, "processEvents", js.Any.fromFunction1(value))
    
    inline def setRunAsync(value: (CoreDispatcherPriority, DispatchedHandler) => IAsyncAction): Self = StObject.set(x, "runAsync", js.Any.fromFunction2(value))
    
    inline def setRunIdleAsync(value: IdleDispatchedHandler => IAsyncAction): Self = StObject.set(x, "runIdleAsync", js.Any.fromFunction1(value))
  }
}
