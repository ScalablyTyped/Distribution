package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITouchCapabilities extends StObject {
  
  var contacts: Double = js.native
  
  var touchPresent: Double = js.native
}
object ITouchCapabilities {
  
  @scala.inline
  def apply(contacts: Double, touchPresent: Double): ITouchCapabilities = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], touchPresent = touchPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITouchCapabilities]
  }
  
  @scala.inline
  implicit class ITouchCapabilitiesMutableBuilder[Self <: ITouchCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContacts(value: Double): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchPresent(value: Double): Self = StObject.set(x, "touchPresent", value.asInstanceOf[js.Any])
  }
}
