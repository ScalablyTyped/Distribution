package typings.winrtUwp.Windows.Media.Casting

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.erroroccurred
import typings.winrtUwp.winrtUwpStrings.statechanged
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
  var onerroroccurred_Original: TypedEventHandler[CastingConnection, CastingConnectionErrorOccurredEventArgs] = js.native
  /** Indicates a change in the State property. */
  @JSName("onstatechanged")
  var onstatechanged_Original: TypedEventHandler[CastingConnection, _] = js.native
  /** Gets and sets the content source that is being casted through the connection to the casting device. The content can be set and changed at any time and doing so does not disconnect the connection. */
  var source: CastingSource = js.native
  /** Gets the current state of the connection. */
  var state: CastingConnectionState = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_erroroccurred(
    `type`: erroroccurred,
    listener: TypedEventHandler[CastingConnection, CastingConnectionErrorOccurredEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[CastingConnection, _]): Unit = js.native
  /** Closes the casting connection. */
  def close(): Unit = js.native
  /**
    * Terminates a casting connection. The content that was rendering remotely returns to the local element that you retrieved the casting source from.
    * @return The status of the termination.
    */
  def disconnectAsync(): IPromiseWithIAsyncOperation[CastingConnectionErrorStatus] = js.native
  /** Indicates an error occurred while attempting to make a casting connection. */
  def onerroroccurred(ev: CastingConnectionErrorOccurredEventArgs with WinRTEvent[CastingConnection]): Unit = js.native
  /** Indicates a change in the State property. */
  def onstatechanged(ev: js.Any with WinRTEvent[CastingConnection]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_erroroccurred(
    `type`: erroroccurred,
    listener: TypedEventHandler[CastingConnection, CastingConnectionErrorOccurredEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(`type`: statechanged, listener: TypedEventHandler[CastingConnection, _]): Unit = js.native
  /**
    * Starts the process of casting to a casting device. When called, this method pairs the c sting device, if necessary, and verifies access to the casting device with the user. If the user denies the app access to the device, casting fails. Otherwise, a connection is established, and content is sent to the device. During this time, the connection state changes to connecting, then to connected. If a casting source is set, the state changes to rendering once playback begins.
    * @param value The content to be casted.
    * @return The status of the casting connection request.
    */
  def requestStartCastingAsync(value: CastingSource): IPromiseWithIAsyncOperation[CastingConnectionErrorStatus] = js.native
}

