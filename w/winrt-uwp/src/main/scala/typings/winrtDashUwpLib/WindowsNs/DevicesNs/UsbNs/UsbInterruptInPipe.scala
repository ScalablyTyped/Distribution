package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pipe that the underlying USB driver opens to communicate with a USB interrupt IN endpoint of the device. The object also enables the app to specify an event handler. That handler that gets invoked when data is read from the endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbInterruptInPipe")
@js.native
abstract class UsbInterruptInPipe () extends js.Object {
  /** Gets the object that represents the endpoint descriptor associated with the USB interrupt IN endpoint. */
  var endpointDescriptor: UsbInterruptInEndpointDescriptor = js.native
  /** Raised when the interrupt pipe receives data from the interrupt IN endpoint. */
  @JSName("ondatareceived")
  var ondatareceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UsbInterruptInPipe, UsbInterruptInEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_datareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UsbInterruptInPipe, UsbInterruptInEventArgs]
  ): scala.Unit = js.native
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB interrupt IN endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearStallAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Raised when the interrupt pipe receives data from the interrupt IN endpoint. */
  def ondatareceived(ev: UsbInterruptInEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[UsbInterruptInPipe]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_datareceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.datareceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UsbInterruptInPipe, UsbInterruptInEventArgs]
  ): scala.Unit = js.native
}

