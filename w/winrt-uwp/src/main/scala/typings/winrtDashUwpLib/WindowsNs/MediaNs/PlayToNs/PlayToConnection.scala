package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a Play To connection. */
@JSGlobal("Windows.Media.PlayTo.PlayToConnection")
@js.native
abstract class PlayToConnection () extends js.Object {
  /** Occurs when an error is encountered for the Play To connection. */
  @JSName("onerror")
  var onerror_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToConnection, PlayToConnectionErrorEventArgs] = js.native
  /** Occurs when the state of the Play To connection has changed. */
  @JSName("onstatechanged")
  var onstatechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToConnection, PlayToConnectionStateChangedEventArgs] = js.native
  /** Occurs when the Play To connection is transferred to the next Play To source. */
  @JSName("ontransferred")
  var ontransferred_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToConnection, PlayToConnectionTransferredEventArgs] = js.native
  /** Gets the state of the Play To connection. */
  var state: PlayToConnectionState = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.error,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToConnection, PlayToConnectionErrorEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToConnection, PlayToConnectionStateChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_transferred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.transferred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToConnection, PlayToConnectionTransferredEventArgs]
  ): scala.Unit = js.native
  /** Occurs when an error is encountered for the Play To connection. */
  def onerror(ev: PlayToConnectionErrorEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToConnection]): scala.Unit = js.native
  /** Occurs when the state of the Play To connection has changed. */
  def onstatechanged(
    ev: PlayToConnectionStateChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToConnection]
  ): scala.Unit = js.native
  /** Occurs when the Play To connection is transferred to the next Play To source. */
  def ontransferred(
    ev: PlayToConnectionTransferredEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[PlayToConnection]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.error,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToConnection, PlayToConnectionErrorEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToConnection, PlayToConnectionStateChangedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_transferred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.transferred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[PlayToConnection, PlayToConnectionTransferredEventArgs]
  ): scala.Unit = js.native
}

