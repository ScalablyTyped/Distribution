package typings.xrm.Xrm.Events

import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.FormContext
import typings.xrm.Xrm.GlobalContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Synchronous Form OnSave event context.
  * In the API documentation, this is sometimes referred to as the executionContext.
  * Asynchronous version see {@link SaveEventContextAsync}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/events/form-onsave External Link: Form OnSave event}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/execution-context External Link: Execution context (Client API reference)}
  */
trait SaveEventContext
  extends StObject
     with EventContext {
  
  /**
    * Gets save-event arguments.
    */
  def getEventArgs(): SaveEventArguments
}
object SaveEventContext {
  
  inline def apply(
    getContext: () => GlobalContext,
    getDepth: () => Double,
    getEventArgs: () => SaveEventArguments,
    getEventSource: () => typings.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity,
    getFormContext: () => FormContext,
    getSharedVariable: String => Any,
    setSharedVariable: (String, Any) => Unit
  ): SaveEventContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
    __obj.asInstanceOf[SaveEventContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveEventContext] (val x: Self) extends AnyVal {
    
    inline def setGetEventArgs(value: () => SaveEventArguments): Self = StObject.set(x, "getEventArgs", js.Any.fromFunction0(value))
  }
}
