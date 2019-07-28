package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait changeTrackingLost extends EmailMailboxChangeType
  
  /** A folder was created. */
  @js.native
  sealed trait folderCreated extends EmailMailboxChangeType
  
  /** A folder was deleted. */
  @js.native
  sealed trait folderDeleted extends EmailMailboxChangeType
  
  /** A folder was modified. */
  @js.native
  sealed trait folderModified extends EmailMailboxChangeType
  
  /** A message was created. */
  @js.native
  sealed trait messageCreated extends EmailMailboxChangeType
  
  /** A message was deleted. */
  @js.native
  sealed trait messageDeleted extends EmailMailboxChangeType
  
  /** A message was modified. */
  @js.native
  sealed trait messageModified extends EmailMailboxChangeType
  
  /* 6 */ val changeTrackingLost: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType.changeTrackingLost with Double = js.native
  /* 3 */ val folderCreated: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType.folderCreated with Double = js.native
  /* 5 */ val folderDeleted: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType.folderDeleted with Double = js.native
  /* 4 */ val folderModified: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType.folderModified with Double = js.native
  /* 0 */ val messageCreated: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType.messageCreated with Double = js.native
  /* 2 */ val messageDeleted: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType.messageDeleted with Double = js.native
  /* 1 */ val messageModified: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxChangeType.messageModified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxChangeType with Double] = js.native
}

