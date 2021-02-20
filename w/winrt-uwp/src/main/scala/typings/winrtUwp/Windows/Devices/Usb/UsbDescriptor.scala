package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the type of descriptor, its size (in bytes), and gets the descriptor data. */
@js.native
trait UsbDescriptor extends StObject {
  
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
  implicit class UsbDescriptorMutableBuilder[Self <: UsbDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescriptorType(value: Double): Self = StObject.set(x, "descriptorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadDescriptorBuffer(value: IBuffer => Unit): Self = StObject.set(x, "readDescriptorBuffer", js.Any.fromFunction1(value))
  }
}
