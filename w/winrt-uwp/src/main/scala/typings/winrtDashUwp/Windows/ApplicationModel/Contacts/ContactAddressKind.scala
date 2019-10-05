package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactAddressKind extends js.Object

/** Specifies the kinds of contact addresses. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactAddressKind")
@js.native
object ContactAddressKind extends js.Object {
  /** The home address of the contact. */
  @js.native
  sealed trait home extends ContactAddressKind
  
  /** An address of the contact other than home or work. */
  @js.native
  sealed trait other extends ContactAddressKind
  
  /** The work address of the contact. */
  @js.native
  sealed trait work extends ContactAddressKind
  
  /* 0 */ val home: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactAddressKind.home with Double = js.native
  /* 2 */ val other: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactAddressKind.other with Double = js.native
  /* 1 */ val work: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactAddressKind.work with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactAddressKind with Double] = js.native
}

