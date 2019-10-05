package typings.winrtDashUwp.Windows.Devices.Usb

import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the type of descriptor, its size (in bytes), and gets the descriptor data. */
@JSGlobal("Windows.Devices.Usb.UsbDescriptor")
@js.native
abstract class UsbDescriptor () extends js.Object {
  /** Gets the type of descriptor. */
  var descriptorType: Double = js.native
  /** Gets the length of the descriptor. */
  var length: Double = js.native
  /**
    * Reads descriptor data in the caller-supplied buffer.
    * @param buffer A caller-supplied buffer that receives descriptor data.
    */
  def readDescriptorBuffer(buffer: IBuffer): Unit = js.native
}

