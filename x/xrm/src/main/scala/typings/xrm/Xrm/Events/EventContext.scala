package typings.xrm.Xrm.Events

import typings.xrm.Xrm.Attributes.Attribute
import typings.xrm.Xrm.Controls.Control
import typings.xrm.Xrm.Entity
import typings.xrm.Xrm.FormContext
import typings.xrm.Xrm.GlobalContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the event context.
  * In the API documentation, this is sometimes refferred to as the executionContext.
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/clientapi-execution-context External Link: Client API execution context}
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/execution-context External Link: Execution context (Client API reference)}
  */
trait EventContext extends js.Object {
  /**
    * Gets the Xrm context.
    * @returns The Xrm context.
    */
  def getContext(): GlobalContext
  /**
    * Gets the handler's depth, which is the order in which the handler is executed.
    * @returns The depth, a 0-based index.
    */
  def getDepth(): Double
  /**
    * Gets a reference to the object for which event occurred.
    * @returns The event source.
    */
  def getEventSource(): Attribute | Control | Entity
  /**
    * Gets a reference to the currnet form context
    * @returns The {@link FormContext form context}
    */
  def getFormContext(): FormContext
  /**
    * @summary Gets the shared variable with the specified key.
    * @param T Generic type parameter.
    * @param key The key.
    * @returns The shared variable.
    * @desc Gets the shared variable with the specified key.
    * Used to pass values between handlers of an event.
    */
  def getSharedVariable[T](key: String): T
  /**
    * @summary Sets a shared variable.
    * @param T Generic type parameter.
    * @param key The key.
    * @param value The value.
    * @desc Sets the shared variable with the specified key.
    * Used to pass values between handlers of an event.
    */
  def setSharedVariable[T](key: String, value: T): Unit
}

object EventContext {
  @scala.inline
  def apply(
    getContext: () => GlobalContext,
    getDepth: () => Double,
    getEventSource: () => Attribute | Control | Entity,
    getFormContext: () => FormContext,
    getSharedVariable: String => js.Any,
    setSharedVariable: (String, js.Any) => Unit
  ): EventContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
  
    __obj.asInstanceOf[EventContext]
  }
}

