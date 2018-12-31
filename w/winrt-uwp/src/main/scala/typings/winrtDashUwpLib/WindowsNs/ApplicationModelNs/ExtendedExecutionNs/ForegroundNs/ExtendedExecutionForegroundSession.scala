package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ExtendedExecutionNs.ForegroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports managing a request for extended foreground execution. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.Foreground.ExtendedExecutionForegroundSession")
@js.native
/** Creates an ExtendedExecutionForegroundSession object */
class ExtendedExecutionForegroundSession () extends js.Object {
  /** Gets or sets a string to display in the shell. */
  var description: java.lang.String = js.native
  /** This event occurs when the system revokes extended execution. */
  @JSName("onrevoked")
  var onrevoked_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[_, ExtendedExecutionForegroundRevokedEventArgs] = js.native
  /** Gets or sets the reason for the extended execution request. */
  var reason: ExtendedExecutionForegroundReason = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_revoked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.revoked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[_, ExtendedExecutionForegroundRevokedEventArgs]
  ): scala.Unit = js.native
  /** Closes the session and removes the application's extended execution capability. */
  def close(): scala.Unit = js.native
  /** This event occurs when the system revokes extended execution. */
  def onrevoked(ev: ExtendedExecutionForegroundRevokedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_revoked(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.revoked,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[_, ExtendedExecutionForegroundRevokedEventArgs]
  ): scala.Unit = js.native
  /**
    * Requests extended execution
    * @return The result of the request.
    */
  def requestExtensionAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[ExtendedExecutionForegroundResult] = js.native
}

