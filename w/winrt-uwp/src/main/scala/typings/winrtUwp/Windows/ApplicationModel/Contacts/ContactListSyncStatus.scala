package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactListSyncStatus extends StObject
/** Defines the ContactList sync status. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListSyncStatus")
@js.native
object ContactListSyncStatus extends StObject {
  
  /** There was an authentication error. */
  @js.native
  sealed trait authenticationError
    extends StObject
       with ContactListSyncStatus
  
  /** Idle. */
  @js.native
  sealed trait idle
    extends StObject
       with ContactListSyncStatus
  
  /** The account must be manually removed. */
  @js.native
  sealed trait manualAccountRemovalRequired
    extends StObject
       with ContactListSyncStatus
  
  /** There was a policy error. */
  @js.native
  sealed trait policyError
    extends StObject
       with ContactListSyncStatus
  
  /** Currently syncing. */
  @js.native
  sealed trait syncing
    extends StObject
       with ContactListSyncStatus
  
  /** An unknown error occurred. */
  @js.native
  sealed trait unknownError
    extends StObject
       with ContactListSyncStatus
  
  /** The contact list is up-to-date. */
  @js.native
  sealed trait upToDate
    extends StObject
       with ContactListSyncStatus
}
