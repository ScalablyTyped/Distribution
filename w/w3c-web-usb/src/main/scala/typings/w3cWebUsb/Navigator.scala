package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  val usb: USB
}
object Navigator {
  
  inline def apply(usb: USB): Navigator = {
    val __obj = js.Dynamic.literal(usb = usb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setUsb(value: USB): Self = StObject.set(x, "usb", value.asInstanceOf[js.Any])
  }
}
