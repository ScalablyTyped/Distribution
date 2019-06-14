package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxChangeType extends js.Object

/** Defines the type of change made to the mailbox item. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxChangeType")
@js.native
object EmailMailboxChangeType extends js.Object {
  /** Change unknown because change tracking was lost. */
  @js.native
  sealed trait changeTrackingLost
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType
  
  /** A folder was created. */
  @js.native
  sealed trait folderCreated
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType
  
  /** A folder was deleted. */
  @js.native
  sealed trait folderDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType
  
  /** A folder was modified. */
  @js.native
  sealed trait folderModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType
  
  /** A message was created. */
  @js.native
  sealed trait messageCreated
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType
  
  /** A message was deleted. */
  @js.native
  sealed trait messageDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType
  
  /** A message was modified. */
  @js.native
  sealed trait messageModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType
  
  /* 6 */ val changeTrackingLost: changeTrackingLost with scala.Double = js.native
  /* 3 */ val folderCreated: folderCreated with scala.Double = js.native
  /* 5 */ val folderDeleted: folderDeleted with scala.Double = js.native
  /* 4 */ val folderModified: folderModified with scala.Double = js.native
  /* 0 */ val messageCreated: messageCreated with scala.Double = js.native
  /* 2 */ val messageDeleted: messageDeleted with scala.Double = js.native
  /* 1 */ val messageModified: messageModified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType with scala.Double
  ] = js.native
}

