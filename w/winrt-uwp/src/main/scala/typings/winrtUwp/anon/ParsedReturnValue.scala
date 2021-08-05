package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsedReturnValue extends StObject {
  
  /** Receives a UsbEndpointDescriptor object. */ var parsed: UsbEndpointDescriptor
  
  /** True, if the specified UsbDescriptor object is a USB endpoint descriptor. Otherwise, false. */ var returnValue: Boolean
}
object ParsedReturnValue {
  
  inline def apply(parsed: UsbEndpointDescriptor, returnValue: Boolean): ParsedReturnValue = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedReturnValue]
  }
  
  extension [Self <: ParsedReturnValue](x: Self) {
    
    inline def setParsed(value: UsbEndpointDescriptor): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
