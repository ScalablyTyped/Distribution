package typings.winrtUwp.Windows.ApplicationModel.Email

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
  
}

