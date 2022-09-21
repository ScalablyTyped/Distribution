package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailRecipients extends StObject {
  
  var emailAddresses: js.Array[String]
  
  var tfsIds: js.Array[String]
}
object EmailRecipients {
  
  inline def apply(emailAddresses: js.Array[String], tfsIds: js.Array[String]): EmailRecipients = {
    val __obj = js.Dynamic.literal(emailAddresses = emailAddresses.asInstanceOf[js.Any], tfsIds = tfsIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRecipients]
  }
  
  extension [Self <: EmailRecipients](x: Self) {
    
    inline def setEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressesVarargs(value: String*): Self = StObject.set(x, "emailAddresses", js.Array(value*))
    
    inline def setTfsIds(value: js.Array[String]): Self = StObject.set(x, "tfsIds", value.asInstanceOf[js.Any])
    
    inline def setTfsIdsVarargs(value: String*): Self = StObject.set(x, "tfsIds", js.Array(value*))
  }
}
