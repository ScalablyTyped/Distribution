package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailRecipients extends StObject {
  
  var emailAddresses: js.Array[String] = js.native
  
  var tfsIds: js.Array[String] = js.native
}
object EmailRecipients {
  
  @scala.inline
  def apply(emailAddresses: js.Array[String], tfsIds: js.Array[String]): EmailRecipients = {
    val __obj = js.Dynamic.literal(emailAddresses = emailAddresses.asInstanceOf[js.Any], tfsIds = tfsIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRecipients]
  }
  
  @scala.inline
  implicit class EmailRecipientsMutableBuilder[Self <: EmailRecipients] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "emailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressesVarargs(value: String*): Self = StObject.set(x, "emailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setTfsIds(value: js.Array[String]): Self = StObject.set(x, "tfsIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfsIdsVarargs(value: String*): Self = StObject.set(x, "tfsIds", js.Array(value :_*))
  }
}
