package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CastingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the actual connection with a casting device. */
@JSGlobal("Windows.Media.Casting.CastingConnection")
@js.native
abstract class CastingConnection () extends js.Object {
  /** Gets the casting device with which a connection has been made. */
  var device: CastingDevice = js.native
  /** Indicates an error occurred while attempting to make a casting connection. */
  @JSName("onerroroccurred")
  var onerroroccurred_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingConnection, CastingConnectionErrorOccurredEventArgs] = js.native
  /** Indicates a change in the State property. */
  @JSName("onstatechanged")
  var onstatechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingConnection, _] = js.native
  /** Gets and sets the content source that is being casted through the connection to the casting device. The content can be set and changed at any time and doing so does not disconnect the connection. */
  var source: CastingSource = js.native
  /** Gets the current state of the connection. */
  var state: CastingConnectionState = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_erroroccurred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.erroroccurred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingConnection, CastingConnectionErrorOccurredEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingConnection, _]
  ): scala.Unit = js.native
  /** Closes the casting connection. */
  def close(): scala.Unit = js.native
  /**
                   * Terminates a casting connection. The content that was rendering remotely returns to the local element that you retrieved the casting source from.
                   * @return The status of the termination.
                   */
  def disconnectAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CastingConnectionErrorStatus] = js.native
  /** Indicates an error occurred while attempting to make a casting connection. */
  def onerroroccurred(
    ev: CastingConnectionErrorOccurredEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CastingConnection]
  ): scala.Unit = js.native
  /** Indicates a change in the State property. */
  def onstatechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[CastingConnection]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_erroroccurred(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.erroroccurred,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingConnection, CastingConnectionErrorOccurredEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[CastingConnection, _]
  ): scala.Unit = js.native
  /**
                   * Starts the process of casting to a casting device. When called, this method pairs the c sting device, if necessary, and verifies access to the casting device with the user. If the user denies the app access to the device, casting fails. Otherwise, a connection is established, and content is sent to the device. During this time, the connection state changes to connecting, then to connected. If a casting source is set, the state changes to rendering once playback begins.
                   * @param value The content to be casted.
                   * @return The status of the casting connection request.
                   */
  def requestStartCastingAsync(value: CastingSource): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[CastingConnectionErrorStatus] = js.native
}

