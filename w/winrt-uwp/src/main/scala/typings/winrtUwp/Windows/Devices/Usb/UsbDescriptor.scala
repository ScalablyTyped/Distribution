package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the type of descriptor, its size (in bytes), and gets the descriptor data. */
trait UsbDescriptor extends js.Object {
  /** Gets the type of descriptor. */
  var descriptorType: Double
  /** Gets the length of the descriptor. */
  var length: Double
  /**
    * Reads descriptor data in the caller-supplied buffer.
    * @param buffer A caller-supplied buffer that receives descriptor data.
    */
  def readDescriptorBuffer(buffer: IBuffer): Unit
}

object UsbDescriptor {
  @scala.inline
  def apply(descriptorType: Double, length: Double, readDescriptorBuffer: IBuffer => Unit): UsbDescriptor = {
    val __obj = js.Dynamic.literal(descriptorType = descriptorType.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], readDescriptorBuffer = js.Any.fromFunction1(readDescriptorBuffer))
    __obj.asInstanceOf[UsbDescriptor]
  }
}

