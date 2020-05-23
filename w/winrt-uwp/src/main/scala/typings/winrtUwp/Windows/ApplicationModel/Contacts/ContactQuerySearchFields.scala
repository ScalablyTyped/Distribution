package typings.winrtUwp.Windows.ApplicationModel.Contacts

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
  
}

