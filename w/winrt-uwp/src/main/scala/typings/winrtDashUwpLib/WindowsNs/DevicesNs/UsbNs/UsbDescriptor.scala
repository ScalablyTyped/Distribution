package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the type of descriptor, its size (in bytes), and gets the descriptor data. */
@JSGlobal("Windows.Devices.Usb.UsbDescriptor")
@js.native
abstract class UsbDescriptor () extends js.Object {
  /** Gets the type of descriptor. */
  var descriptorType: scala.Double = js.native
  /** Gets the length of the descriptor. */
  var length: scala.Double = js.native
  /**
    * Reads descriptor data in the caller-supplied buffer.
    * @param buffer A caller-supplied buffer that receives descriptor data.
    */
  def readDescriptorBuffer(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): scala.Unit = js.native
}

