package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports managing a request for background execution. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionSession")
@js.native
class ExtendedExecutionSession () extends js.Object {
  /** Gets or sets a string to display in the shell. */
  var description: java.lang.String = js.native
  /** The Revoked event occurs when the system revokes background execution. */
  @JSName("onrevoked")
  var onrevoked_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[_, ExtendedExecutionRevokedEventArgs] = js.native
  /** Gets or sets a value to show progress in the shell. */
  var percentProgress: scala.Double = js.native
  /** Gets or sets the reason for the for the background execution request. */
  var reason: ExtendedExecutionReason = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_revoked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.revoked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[_, ExtendedExecutionRevokedEventArgs]
  ): scala.Unit = js.native
  /** Closes the session and removes the application's capability to run in the background. */
  def close(): scala.Unit = js.native
  /** The Revoked event occurs when the system revokes background execution. */
  def onrevoked(ev: ExtendedExecutionRevokedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_revoked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.revoked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[_, ExtendedExecutionRevokedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Requests background execution.
                   * @return The result of the request.
                   */
  def requestExtensionAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ExtendedExecutionResult] = js.native
}

