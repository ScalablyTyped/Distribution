package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contactemail extends StObject {
  
  var contact_email: String = js.native
}
object Contactemail {
  
  @scala.inline
  def apply(contact_email: String): Contactemail = {
    val __obj = js.Dynamic.literal(contact_email = contact_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contactemail]
  }
  
  @scala.inline
  implicit class ContactemailMutableBuilder[Self <: Contactemail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact_email(value: String): Self = StObject.set(x, "contact_email", value.asInstanceOf[js.Any])
  }
}
