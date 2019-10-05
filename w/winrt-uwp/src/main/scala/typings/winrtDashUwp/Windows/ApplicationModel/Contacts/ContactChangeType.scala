package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

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
  sealed trait changeTrackingLost extends ContactChangeType
  
  /** A contact was created. */
  @js.native
  sealed trait created extends ContactChangeType
  
  /** A contact was deleted. */
  @js.native
  sealed trait deleted extends ContactChangeType
  
  /** A contact was modified. */
  @js.native
  sealed trait modified extends ContactChangeType
  
  /* 3 */ val changeTrackingLost: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactChangeType.changeTrackingLost with Double = js.native
  /* 0 */ val created: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactChangeType.created with Double = js.native
  /* 2 */ val deleted: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactChangeType.deleted with Double = js.native
  /* 1 */ val modified: typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactChangeType.modified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactChangeType with Double] = js.native
}

