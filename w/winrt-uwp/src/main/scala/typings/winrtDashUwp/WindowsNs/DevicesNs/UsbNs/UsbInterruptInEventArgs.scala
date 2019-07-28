package typings.winrtDashUwp.WindowsNs.DevicesNs.UsbNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler for the DataReceived event. */
@JSGlobal("Windows.Devices.Usb.UsbInterruptInEventArgs")
@js.native
abstract class UsbInterruptInEventArgs () extends js.Object {
  /** Gets data from the interrupt IN endpoint. */
  var interruptData: IBuffer = js.native
}

