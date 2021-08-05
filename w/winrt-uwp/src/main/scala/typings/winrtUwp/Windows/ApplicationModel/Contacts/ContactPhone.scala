package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents info about the phone for a contact. */
trait ContactPhone extends StObject {
  
  /** Gets and sets the description of the phone for a contact. The maximum string length for the description is 512 characters. */
  var description: String
  
  /** Gets and sets the kind of phone for a contact. */
  var kind: ContactPhoneKind
  
  /** Gets and sets the phone number of a phone for a contact. The maximum string length for the phone number is 50 characters. */
  var number: String
}
object ContactPhone {
  
  inline def apply(description: String, kind: ContactPhoneKind, number: String): ContactPhone = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactPhone]
  }
  
  extension [Self <: ContactPhone](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setKind(value: ContactPhoneKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
