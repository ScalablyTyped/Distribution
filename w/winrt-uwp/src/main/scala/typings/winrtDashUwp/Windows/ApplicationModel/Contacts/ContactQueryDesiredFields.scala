package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.emailAddress
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.none
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.phoneNumber
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.postalAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactQueryDesiredFields extends js.Object

/** Defines which fields must exist on a contact in order to match a search operation. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryDesiredFields")
@js.native
object ContactQueryDesiredFields extends js.Object {
  /** The contact must have an email address. */
  @js.native
  sealed trait emailAddress extends ContactQueryDesiredFields
  
  /** No required fields */
  @js.native
  sealed trait none extends ContactQueryDesiredFields
  
  /** The contact must have a phone number. */
  @js.native
  sealed trait phoneNumber extends ContactQueryDesiredFields
  
  /** The contact must have a postal address. */
  @js.native
  sealed trait postalAddress extends ContactQueryDesiredFields
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactQueryDesiredFields with Double] = js.native
  /* 2 */ @js.native
  object emailAddress extends TopLevel[emailAddress with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object phoneNumber extends TopLevel[phoneNumber with Double]
  
  /* 3 */ @js.native
  object postalAddress extends TopLevel[postalAddress with Double]
  
}

