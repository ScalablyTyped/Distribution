package typings.winrt.Windows.UI.Core

import typings.winrt.Windows.Foundation.IAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreDispatcher extends ICoreDispatcher
object CoreDispatcher {
  
  @scala.inline
  def apply(
    hasThreadAccess: Boolean,
    onacceleratorkeyactivated: js.Any,
    processEvents: CoreProcessEventsOption => Unit,
    runAsync: (CoreDispatcherPriority, DispatchedHandler) => IAsyncAction,
    runIdleAsync: IdleDispatchedHandler => IAsyncAction
  ): CoreDispatcher = {
    val __obj = js.Dynamic.literal(hasThreadAccess = hasThreadAccess.asInstanceOf[js.Any], onacceleratorkeyactivated = onacceleratorkeyactivated.asInstanceOf[js.Any], processEvents = js.Any.fromFunction1(processEvents), runAsync = js.Any.fromFunction2(runAsync), runIdleAsync = js.Any.fromFunction1(runIdleAsync))
    __obj.asInstanceOf[CoreDispatcher]
  }
}
