package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an email address of a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactEmail")
@js.native
/** Initializes a new instance of a ContactEmail class. */
open class ContactEmail ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactEmail {
  
  /** Gets and sets the email address of a contact. The maximum string length for the description is 321 characters. */
  /* CompleteClass */
  var address: String = js.native
  
  /** Gets and sets the description of an email address of a contact. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Gets and sets the kind of email address of a contact. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactEmailKind = js.native
}
