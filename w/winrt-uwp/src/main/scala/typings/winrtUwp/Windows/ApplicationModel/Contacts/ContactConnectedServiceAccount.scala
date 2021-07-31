package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connected service account for a contact. */
trait ContactConnectedServiceAccount extends StObject {
  
  /** Gets and sets the identifier of a connected service account for a contact. The maximum string length for the identifier is 321 characters. */
  var id: String
  
  /** Gets and sets the service name of a connected service account for a contact. The maximum string length for the service name is 256 characters. */
  var serviceName: String
}
object ContactConnectedServiceAccount {
  
  @scala.inline
  def apply(id: String, serviceName: String): ContactConnectedServiceAccount = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactConnectedServiceAccount]
  }
  
  @scala.inline
  implicit class ContactConnectedServiceAccountMutableBuilder[Self <: ContactConnectedServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
  }
}
