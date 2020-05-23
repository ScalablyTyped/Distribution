package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines which fields must exist on a contact in order to match a search operation. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQueryDesiredFields")
@js.native
object ContactQueryDesiredFields extends js.Object {
  /* 2 */ val emailAddress: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.emailAddress with Double = js.native
  /* 0 */ val none: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.none with Double = js.native
  /* 1 */ val phoneNumber: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.phoneNumber with Double = js.native
  /* 3 */ val postalAddress: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields.postalAddress with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactQueryDesiredFields with Double
  ] = js.native
}

