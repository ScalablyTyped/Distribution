package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connected service account for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactConnectedServiceAccount")
@js.native
/** Initializes a new instance of a ContactConnectedServiceAccount class. */
class ContactConnectedServiceAccount ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactConnectedServiceAccount {
  
  /** Gets and sets the identifier of a connected service account for a contact. The maximum string length for the identifier is 321 characters. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Gets and sets the service name of a connected service account for a contact. The maximum string length for the service name is 256 characters. */
  /* CompleteClass */
  var serviceName: String = js.native
}
