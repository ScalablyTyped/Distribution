package typings.winrtUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a way for the app to get an Advanced Query Syntax (AQS) string by specifying the class code, subclass code, and the protocol code defined by the device. The properties in this class are passed in the call to GetDeviceClassSelector . */
trait UsbDeviceClass extends StObject {
  
  /** Gets or sets the class code of the device. */
  var classCode: Double
  
  /** Gets or sets the protocol code of the device. */
  var protocolCode: Double
  
  /** Gets or sets the subclass code of the device. */
  var subclassCode: Double
}
object UsbDeviceClass {
  
  @scala.inline
  def apply(classCode: Double, protocolCode: Double, subclassCode: Double): UsbDeviceClass = {
    val __obj = js.Dynamic.literal(classCode = classCode.asInstanceOf[js.Any], protocolCode = protocolCode.asInstanceOf[js.Any], subclassCode = subclassCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbDeviceClass]
  }
  
  @scala.inline
  implicit class UsbDeviceClassMutableBuilder[Self <: UsbDeviceClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassCode(value: Double): Self = StObject.set(x, "classCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolCode(value: Double): Self = StObject.set(x, "protocolCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubclassCode(value: Double): Self = StObject.set(x, "subclassCode", value.asInstanceOf[js.Any])
  }
}
