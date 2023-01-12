package typings.w3cWebUsb

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBConnectionEventInit
  extends StObject
     with EventInit {
  
  var device: USBDevice
}
object USBConnectionEventInit {
  
  inline def apply(device: USBDevice): USBConnectionEventInit = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBConnectionEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USBConnectionEventInit] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: USBDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
  }
}
