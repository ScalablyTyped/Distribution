package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITouchCapabilities extends StObject {
  
  var contacts: Double
  
  var touchPresent: Double
}
object ITouchCapabilities {
  
  inline def apply(contacts: Double, touchPresent: Double): ITouchCapabilities = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], touchPresent = touchPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITouchCapabilities]
  }
  
  extension [Self <: ITouchCapabilities](x: Self) {
    
    inline def setContacts(value: Double): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setTouchPresent(value: Double): Self = StObject.set(x, "touchPresent", value.asInstanceOf[js.Any])
  }
}
