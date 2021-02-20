package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Usb.UsbConfigurationDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parsed extends StObject {
  
  /** Receives a UsbConfigurationDescriptor object. */ var parsed: UsbConfigurationDescriptor = js.native
  
  /** True, if a UsbConfigurationDescriptor object was found in the specified UsbDescriptor object. Otherwise, false. */ var returnValue: Boolean = js.native
}
object Parsed {
  
  @scala.inline
  def apply(parsed: UsbConfigurationDescriptor, returnValue: Boolean): Parsed = {
    val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parsed]
  }
  
  @scala.inline
  implicit class ParsedMutableBuilder[Self <: Parsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParsed(value: UsbConfigurationDescriptor): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
