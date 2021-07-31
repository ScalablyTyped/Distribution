package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailMailboxSyncStatus extends StObject
/** Defines the sync status of the mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxSyncStatus")
@js.native
object EmailMailboxSyncStatus extends StObject {
  
  /** The mailbox has encountered an authentication error and cannot sync. */
  @js.native
  sealed trait authenticationError
    extends StObject
       with EmailMailboxSyncStatus
  
  /** The mailbox is idle. */
  @js.native
  sealed trait idle
    extends StObject
       with EmailMailboxSyncStatus
  
  /** The account must be manually removed. */
  @js.native
  sealed trait manualAccountRemovalRequired
    extends StObject
       with EmailMailboxSyncStatus
  
  /** The mailbox has encountered a policy error and cannot sync. */
  @js.native
  sealed trait policyError
    extends StObject
       with EmailMailboxSyncStatus
  
  /** The mailbox is currently syncing. */
  @js.native
  sealed trait syncing
    extends StObject
       with EmailMailboxSyncStatus
  
  /** The mailbox has encountered an unknown error and cannot sync. */
  @js.native
  sealed trait unknownError
    extends StObject
       with EmailMailboxSyncStatus
  
  /** The mailbox is up to date. */
  @js.native
  sealed trait upToDate
    extends StObject
       with EmailMailboxSyncStatus
}
