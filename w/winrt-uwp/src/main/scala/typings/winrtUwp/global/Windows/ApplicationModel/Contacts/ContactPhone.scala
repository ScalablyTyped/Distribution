package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents info about the phone for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactPhone")
@js.native
/** Initializes a new instance of a ContactPhone class. */
class ContactPhone ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactPhone {
  
  /** Gets and sets the description of the phone for a contact. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Gets and sets the kind of phone for a contact. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactPhoneKind = js.native
  
  /** Gets and sets the phone number of a phone for a contact. The maximum string length for the phone number is 50 characters. */
  /* CompleteClass */
  var number: String = js.native
}
