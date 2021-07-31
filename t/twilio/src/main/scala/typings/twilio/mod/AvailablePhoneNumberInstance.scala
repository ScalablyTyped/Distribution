package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailablePhoneNumberInstance extends StObject {
  
  var local: AvailablePhoneNumberResourceGroup
  
  var mobile: AvailablePhoneNumberResourceGroup
  
  var tollFree: AvailablePhoneNumberResourceGroup
}
object AvailablePhoneNumberInstance {
  
  @scala.inline
  def apply(
    local: AvailablePhoneNumberResourceGroup,
    mobile: AvailablePhoneNumberResourceGroup,
    tollFree: AvailablePhoneNumberResourceGroup
  ): AvailablePhoneNumberInstance = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], tollFree = tollFree.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailablePhoneNumberInstance]
  }
  
  @scala.inline
  implicit class AvailablePhoneNumberInstanceMutableBuilder[Self <: AvailablePhoneNumberInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocal(value: AvailablePhoneNumberResourceGroup): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobile(value: AvailablePhoneNumberResourceGroup): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTollFree(value: AvailablePhoneNumberResourceGroup): Self = StObject.set(x, "tollFree", value.asInstanceOf[js.Any])
  }
}
