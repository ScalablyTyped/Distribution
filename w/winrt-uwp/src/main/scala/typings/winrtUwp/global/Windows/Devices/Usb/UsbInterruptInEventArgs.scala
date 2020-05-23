package typings.winrtUwp.global.Windows.Devices.Usb

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the object that is passed as a parameter to the event handler for the DataReceived event. */
@JSGlobal("Windows.Devices.Usb.UsbInterruptInEventArgs")
@js.native
abstract class UsbInterruptInEventArgs ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInEventArgs {
  /** Gets data from the interrupt IN endpoint. */
  /* CompleteClass */
  override var interruptData: IBuffer = js.native
}

