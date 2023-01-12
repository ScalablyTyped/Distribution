package typings.xrm.Xrm.Events

import typings.xrm.XrmEnum.SaveMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveEventArgumentsAsync
  extends StObject
     with SaveEventArguments {
  
  /**
    * @summary Call to prevent default 10 second timeout in async OnSave event handlers.
    * @description When using an async save the handler will wait for the promise to be fulfilled.
    * To ensure that a save completes in a timely manner the handler throws a timeout exception after
    * 10 seconds to let you know to tune the async OnSave event for better performance. When the
    * disableAsyncTimeout is set, the timeout for that handler will not be applied. It will continue
    * to wait for that handler's promise to be fulfilled.
    * This should be used with caution as it might affect the performance of the form save.
    * @see {@link https://learn.microsoft.com/power-apps/developer/model-driven-apps/clientapi/reference/events/form-onsave#async-onsave-timeouts Async onSave timeouts}
    */
  def disableAsyncTimeout(): Unit
}
object SaveEventArgumentsAsync {
  
  inline def apply(
    disableAsyncTimeout: () => Unit,
    getSaveMode: () => SaveMode,
    isDefaultPrevented: () => Boolean,
    preventDefault: () => Unit,
    preventDefaultOnError: () => Unit
  ): SaveEventArgumentsAsync = {
    val __obj = js.Dynamic.literal(disableAsyncTimeout = js.Any.fromFunction0(disableAsyncTimeout), getSaveMode = js.Any.fromFunction0(getSaveMode), isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = js.Any.fromFunction0(preventDefault), preventDefaultOnError = js.Any.fromFunction0(preventDefaultOnError))
    __obj.asInstanceOf[SaveEventArgumentsAsync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveEventArgumentsAsync] (val x: Self) extends AnyVal {
    
    inline def setDisableAsyncTimeout(value: () => Unit): Self = StObject.set(x, "disableAsyncTimeout", js.Any.fromFunction0(value))
  }
}
