package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the level of contact read access granted to other apps. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListOtherAppReadAccess")
@js.native
object ContactListOtherAppReadAccess extends js.Object {
  /* 2 */ val full: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListOtherAppReadAccess.full with Double = js.native
  /* 1 */ val limited: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListOtherAppReadAccess.limited with Double = js.native
  /* 0 */ val systemOnly: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListOtherAppReadAccess.systemOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListOtherAppReadAccess with Double
  ] = js.native
}

