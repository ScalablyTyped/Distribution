package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an email recipient. */
@js.native
trait EmailRecipient extends StObject {
  
  /** Gets or sets the address of the email recipient. */
  var address: String = js.native
  
  /** Gets or sets the name of the email recipient. */
  var name: String = js.native
}
object EmailRecipient {
  
  @scala.inline
  def apply(address: String, name: String): EmailRecipient = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailRecipient]
  }
  
  @scala.inline
  implicit class EmailRecipientMutableBuilder[Self <: EmailRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
