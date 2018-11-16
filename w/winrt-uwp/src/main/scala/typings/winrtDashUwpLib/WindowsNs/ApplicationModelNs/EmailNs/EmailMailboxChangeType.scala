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
  
  val changeTrackingLost: changeTrackingLost with java.lang.String = js.native
  val folderCreated: folderCreated with java.lang.String = js.native
  val folderDeleted: folderDeleted with java.lang.String = js.native
  val folderModified: folderModified with java.lang.String = js.native
  val messageCreated: messageCreated with java.lang.String = js.native
  val messageDeleted: messageDeleted with java.lang.String = js.native
  val messageModified: messageModified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType with java.lang.String
  ] = js.native
}

