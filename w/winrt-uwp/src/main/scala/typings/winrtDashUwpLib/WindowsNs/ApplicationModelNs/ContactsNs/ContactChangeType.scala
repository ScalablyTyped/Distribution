package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactChangeType extends js.Object

/** Specifies the type of change that occurred for a ContactChanged event. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactChangeType")
@js.native
object ContactChangeType extends js.Object {
  /** Change tracking was lost. Call Reset to reestablish continuity with the ContactStore . */
  @js.native
  sealed trait changeTrackingLost
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactChangeType
  
  /** A contact was created. */
  @js.native
  sealed trait created
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactChangeType
  
  /** A contact was deleted. */
  @js.native
  sealed trait deleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactChangeType
  
  /** A contact was modified. */
  @js.native
  sealed trait modified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactChangeType
  
  /* 3 */ val changeTrackingLost: changeTrackingLost with scala.Double = js.native
  /* 0 */ val created: created with scala.Double = js.native
  /* 2 */ val deleted: deleted with scala.Double = js.native
  /* 1 */ val modified: modified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactChangeType with scala.Double
  ] = js.native
}

