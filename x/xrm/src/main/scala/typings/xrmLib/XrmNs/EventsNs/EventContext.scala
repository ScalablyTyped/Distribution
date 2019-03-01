package typings
package xrmLib.XrmNs.EventsNs

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
  def getContext(): xrmLib.XrmNs.GlobalContext
  /**
    * Gets the handler's depth, which is the order in which the handler is executed.
    * @returns The depth, a 0-based index.
    */
  def getDepth(): scala.Double
  /**
    * Gets a reference to the object for which event occurred.
    * @returns The event source.
    */
  def getEventSource(): xrmLib.XrmNs.AttributesNs.Attribute | xrmLib.XrmNs.ControlsNs.Control | xrmLib.XrmNs.Entity
  /**
    * Gets a reference to the currnet form context
    * @returns The {@link FormContext form context}
    */
  def getFormContext(): xrmLib.XrmNs.FormContext
  /**
    * @summary Gets the shared variable with the specified key.
    * @param T Generic type parameter.
    * @param key The key.
    * @returns The shared variable.
    * @desc Gets the shared variable with the specified key.
    * Used to pass values between handlers of an event.
    */
  def getSharedVariable[T](key: java.lang.String): T
  /**
    * @summary Sets a shared variable.
    * @param T Generic type parameter.
    * @param key The key.
    * @param value The value.
    * @desc Sets the shared variable with the specified key.
    * Used to pass values between handlers of an event.
    */
  def setSharedVariable[T](key: java.lang.String, value: T): scala.Unit
}

object EventContext {
  @scala.inline
  def apply(
    getContext: js.Function0[xrmLib.XrmNs.GlobalContext],
    getDepth: js.Function0[scala.Double],
    getEventSource: js.Function0[
      xrmLib.XrmNs.AttributesNs.Attribute | xrmLib.XrmNs.ControlsNs.Control | xrmLib.XrmNs.Entity
    ],
    getFormContext: js.Function0[xrmLib.XrmNs.FormContext],
    getSharedVariable: js.Function1[java.lang.String, js.Any],
    setSharedVariable: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): EventContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContext")(getContext)
    __obj.updateDynamic("getDepth")(getDepth)
    __obj.updateDynamic("getEventSource")(getEventSource)
    __obj.updateDynamic("getFormContext")(getFormContext)
    __obj.updateDynamic("getSharedVariable")(getSharedVariable)
    __obj.updateDynamic("setSharedVariable")(setSharedVariable)
    __obj.asInstanceOf[EventContext]
  }
}

