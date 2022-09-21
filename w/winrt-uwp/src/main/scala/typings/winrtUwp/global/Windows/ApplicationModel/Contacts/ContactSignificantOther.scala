package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the info about a significant other for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactSignificantOther")
@js.native
/** Initializes a new instance of a ContactSignificantOther class. */
open class ContactSignificantOther ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactSignificantOther {
  
  /** Gets and sets the description of a significant other for a contact. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Gets and sets the name of a significant other for a contact. The maximum string length for the name is 256 characters. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets or puts a value that indicates the nature of the relationship, such as spouse, partner, sibling, parent and so on. */
  /* CompleteClass */
  var relationship: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactRelationship = js.native
}
