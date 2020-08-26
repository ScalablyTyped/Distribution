package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the type of descriptor, its size (in bytes), and gets the descriptor data. */
@js.native
trait UsbDescriptor extends js.Object {
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

object UsbDescriptor {
  @scala.inline
  def apply(descriptorType: Double, length: Double, readDescriptorBuffer: IBuffer => Unit): UsbDescriptor = {
    val __obj = js.Dynamic.literal(descriptorType = descriptorType.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], readDescriptorBuffer = js.Any.fromFunction1(readDescriptorBuffer))
    __obj.asInstanceOf[UsbDescriptor]
  }
  @scala.inline
  implicit class UsbDescriptorOps[Self <: UsbDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescriptorType(value: Double): Self = this.set("descriptorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadDescriptorBuffer(value: IBuffer => Unit): Self = this.set("readDescriptorBuffer", js.Any.fromFunction1(value))
  }
  
}

