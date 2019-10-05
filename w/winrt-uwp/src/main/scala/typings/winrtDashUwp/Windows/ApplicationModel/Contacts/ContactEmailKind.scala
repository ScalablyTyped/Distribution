package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactEmailKind extends js.Object

/** Specifies the kinds of email addresses for a contact. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactEmailKind")
@js.native
object ContactEmailKind extends js.Object {
  /** An email address of the contact other than personal or work. */
  @js.native
  sealed trait other extends ContactEmailKind
  
  /** The personal email address of the contact. */
  @js.native
  sealed trait personal extends ContactEmailKind
  
  /** The work email address of the contact. */
  @js.native
  sealed trait work extends ContactEmailKind
  
  /* 2 */ val other: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactEmailKind.other with Double = js.native
  /* 0 */ val personal: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactEmailKind.personal with Double = js.native
  /* 1 */ val work: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactEmailKind.work with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactEmailKind with Double] = js.native
}

