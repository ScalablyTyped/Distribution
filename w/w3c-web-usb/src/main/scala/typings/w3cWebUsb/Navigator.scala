package typings.w3cWebUsb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  val usb: USB
}
object Navigator {
  
  @scala.inline
  def apply(usb: USB): Navigator = {
    val __obj = js.Dynamic.literal(usb = usb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsb(value: USB): Self = StObject.set(x, "usb", value.asInstanceOf[js.Any])
  }
}
