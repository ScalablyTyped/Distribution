package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.revoked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Supports managing a request for background execution. */
@js.native
trait ExtendedExecutionSession extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_revoked(`type`: revoked, listener: TypedEventHandler[_, ExtendedExecutionRevokedEventArgs]): Unit = js.native
  
  /** Closes the session and removes the application's capability to run in the background. */
  def close(): Unit = js.native
  
  /** Gets or sets a string to display in the shell. */
  var description: String = js.native
  
  /** The Revoked event occurs when the system revokes background execution. */
  def onrevoked(ev: ExtendedExecutionRevokedEventArgs with WinRTEvent[_]): Unit = js.native
  /** The Revoked event occurs when the system revokes background execution. */
  @JSName("onrevoked")
  var onrevoked_Original: TypedEventHandler[_, ExtendedExecutionRevokedEventArgs] = js.native
  
  /** Gets or sets a value to show progress in the shell. */
  var percentProgress: Double = js.native
  
  /** Gets or sets the reason for the for the background execution request. */
  var reason: ExtendedExecutionReason = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_revoked(`type`: revoked, listener: TypedEventHandler[_, ExtendedExecutionRevokedEventArgs]): Unit = js.native
  
  /**
    * Requests background execution.
    * @return The result of the request.
    */
  def requestExtensionAsync(): IPromiseWithIAsyncOperation[ExtendedExecutionResult] = js.native
}
