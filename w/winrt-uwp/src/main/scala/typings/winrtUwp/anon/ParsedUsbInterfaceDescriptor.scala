package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Usb.UsbInterfaceDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedUsbInterfaceDescriptor extends StObject {
  
  /** Receives a UsbInterfaceDescriptor object. */ var parsed: UsbInterfaceDescriptor = js.native
  
  /** True, if the specified UsbDescriptor object is USB interface descriptor. Otherwise, false. */ var returnValue: Boolean = js.native
}
object ParsedUsbInterfaceDescriptor {
  
  @scala.inline
  def apply(parsed: UsbInterfaceDescriptor, returnValue: Boolean): ParsedUsbInterfaceDescriptor = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedUsbInterfaceDescriptor]
  }
  
  @scala.inline
  implicit class ParsedUsbInterfaceDescriptorMutableBuilder[Self <: ParsedUsbInterfaceDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParsed(value: UsbInterfaceDescriptor): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
