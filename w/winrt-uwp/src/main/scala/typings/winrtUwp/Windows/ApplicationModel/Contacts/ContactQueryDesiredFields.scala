package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactQueryDesiredFields extends StObject
/** Defines which fields must exist on a contact in order to match a search operation. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryDesiredFields")
@js.native
object ContactQueryDesiredFields extends StObject {
  
  /** The contact must have an email address. */
  @js.native
  sealed trait emailAddress
    extends StObject
       with ContactQueryDesiredFields
  
  /** No required fields */
  @js.native
  sealed trait none
    extends StObject
       with ContactQueryDesiredFields
  
  /** The contact must have a phone number. */
  @js.native
  sealed trait phoneNumber
    extends StObject
       with ContactQueryDesiredFields
  
  /** The contact must have a postal address. */
  @js.native
  sealed trait postalAddress
    extends StObject
       with ContactQueryDesiredFields
}
