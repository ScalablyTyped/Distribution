package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an email address of a contact. */
trait ContactEmail extends StObject {
  
  /** Gets and sets the email address of a contact. The maximum string length for the description is 321 characters. */
  var address: String
  
  /** Gets and sets the description of an email address of a contact. The maximum string length for the description is 512 characters. */
  var description: String
  
  /** Gets and sets the kind of email address of a contact. */
  var kind: ContactEmailKind
}
object ContactEmail {
  
  inline def apply(address: String, description: String, kind: ContactEmailKind): ContactEmail = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactEmail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactEmail] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ContactEmailKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
