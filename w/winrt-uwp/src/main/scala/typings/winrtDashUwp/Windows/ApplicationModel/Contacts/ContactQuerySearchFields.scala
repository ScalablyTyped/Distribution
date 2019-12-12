package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.all
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.email
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.name
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.none
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactQuerySearchFields.phone
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactQuerySearchFields with Double] = js.native
  /* 4 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 2 */ @js.native
  object email extends TopLevel[email with Double]
  
  /* 1 */ @js.native
  object name extends TopLevel[name with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object phone extends TopLevel[phone with Double]
  
}

