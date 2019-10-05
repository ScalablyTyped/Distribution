package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactQuerySearchFields extends js.Object

/** Defines which contact fields to search for a text match. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQuerySearchFields")
@js.native
object ContactQuerySearchFields extends js.Object {
  /** All */
  @js.native
  sealed trait all extends ContactQuerySearchFields
  
  /** Email address */
  @js.native
  sealed trait email extends ContactQuerySearchFields
  
  /** Name */
  @js.native
  sealed trait name extends ContactQuerySearchFields
  
  /** None */
  @js.native
  sealed trait none extends ContactQuerySearchFields
  
  /** Phone number */
  @js.native
  sealed trait phone extends ContactQuerySearchFields
  
  /* 4 */ val all: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.all with Double = js.native
  /* 2 */ val email: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.email with Double = js.native
  /* 1 */ val name: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.name with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.none with Double = js.native
  /* 3 */ val phone: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.phone with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactQuerySearchFields with Double] = js.native
}

