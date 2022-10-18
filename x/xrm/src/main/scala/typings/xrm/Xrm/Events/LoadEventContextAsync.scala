package typings.xrm.Xrm.Events

import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.FormContext
import typings.xrm.Xrm.GlobalContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Asynchronous Form OnLoad event context.
  * In the API documentation, this is sometimes referred to as the executionContext.
  * Synchronous version see {@link LoadEventContext}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/events/form-onsave#asynchronous-event-handler-support Form OnSave event: Asynchronous event handler support}
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/execution-context Execution context (Client API reference)}
  */
trait LoadEventContextAsync
  extends StObject
     with LoadEventContext
object LoadEventContextAsync {
  
  inline def apply(
    getContext: () => GlobalContext,
    getDepth: () => Double,
    getEventArgs: () => LoadEventArguments,
    getEventSource: () => typings.xrm.Xrm.Attributes.Attribute[Any] | Control | Entity,
    getFormContext: () => FormContext,
    getSharedVariable: String => Any,
    setSharedVariable: (String, Any) => Unit
  ): LoadEventContextAsync = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
    __obj.asInstanceOf[LoadEventContextAsync]
  }
}
