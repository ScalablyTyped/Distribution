package typings.w3cWebSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/serial/#dom-serialportfilter */
trait SerialPortFilter extends StObject {
  
  var usbProductId: js.UndefOr[Double] = js.undefined
  
  var usbVendorId: js.UndefOr[Double] = js.undefined
}
object SerialPortFilter {
  
  inline def apply(): SerialPortFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerialPortFilter]
  }
  
  extension [Self <: SerialPortFilter](x: Self) {
    
    inline def setUsbProductId(value: Double): Self = StObject.set(x, "usbProductId", value.asInstanceOf[js.Any])
    
    inline def setUsbProductIdUndefined: Self = StObject.set(x, "usbProductId", js.undefined)
    
    inline def setUsbVendorId(value: Double): Self = StObject.set(x, "usbVendorId", value.asInstanceOf[js.Any])
    
    inline def setUsbVendorIdUndefined: Self = StObject.set(x, "usbVendorId", js.undefined)
  }
}
