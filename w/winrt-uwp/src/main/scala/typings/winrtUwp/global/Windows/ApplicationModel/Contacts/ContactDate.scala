package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an important date for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactDate")
@js.native
/** Initializes a new instance of a ContactDate class. */
class ContactDate ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactDate {
  
  /** Gets and sets the day for an important date for a contact. */
  /* CompleteClass */
  var day: Double = js.native
  
  /** Gets and sets the description for an important date for a contact. The maximum string length for the description is 512 characters. */
  /* CompleteClass */
  var description: String = js.native
  
  /** Gets and sets the kind of important date for a contact. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactDateKind = js.native
  
  /** Gets and sets the month for an important date for a contact. */
  /* CompleteClass */
  var month: Double = js.native
  
  /** Gets and sets the year for an important date for a contact. */
  /* CompleteClass */
  var year: Double = js.native
}
