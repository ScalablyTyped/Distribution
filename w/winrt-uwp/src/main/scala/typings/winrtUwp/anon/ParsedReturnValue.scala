package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Usb.UsbEndpointDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsedReturnValue extends StObject {
  
  /** Receives a UsbEndpointDescriptor object. */ var parsed: UsbEndpointDescriptor = js.native
  
  /** True, if the specified UsbDescriptor object is a USB endpoint descriptor. Otherwise, false. */ var returnValue: Boolean = js.native
}
object ParsedReturnValue {
  
  @scala.inline
  def apply(parsed: UsbEndpointDescriptor, returnValue: Boolean): ParsedReturnValue = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedReturnValue]
  }
  
  @scala.inline
  implicit class ParsedReturnValueMutableBuilder[Self <: ParsedReturnValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParsed(value: UsbEndpointDescriptor): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
