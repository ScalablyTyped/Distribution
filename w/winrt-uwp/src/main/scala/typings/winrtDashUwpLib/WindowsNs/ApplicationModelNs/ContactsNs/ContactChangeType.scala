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
  
  val changeTrackingLost: changeTrackingLost with java.lang.String = js.native
  val created: created with java.lang.String = js.native
  val deleted: deleted with java.lang.String = js.native
  val modified: modified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactChangeType with java.lang.String
  ] = js.native
}

