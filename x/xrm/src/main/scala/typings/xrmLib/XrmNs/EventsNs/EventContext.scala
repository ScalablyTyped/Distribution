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

