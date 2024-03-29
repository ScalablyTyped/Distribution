package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about the type of descriptor, its size (in bytes), and gets the descriptor data. */
trait UsbDescriptor extends StObject {
  
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
  
  inline def apply(descriptorType: Double, length: Double, readDescriptorBuffer: IBuffer => Unit): UsbDescriptor = {
    val __obj = js.Dynamic.literal(descriptorType = descriptorType.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], readDescriptorBuffer = js.Any.fromFunction1(readDescriptorBuffer))
    __obj.asInstanceOf[UsbDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsbDescriptor] (val x: Self) extends AnyVal {
    
    inline def setDescriptorType(value: Double): Self = StObject.set(x, "descriptorType", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setReadDescriptorBuffer(value: IBuffer => Unit): Self = StObject.set(x, "readDescriptorBuffer", js.Any.fromFunction1(value))
  }
}
