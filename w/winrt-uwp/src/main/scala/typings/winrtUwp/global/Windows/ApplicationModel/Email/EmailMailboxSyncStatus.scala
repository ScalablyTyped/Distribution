package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the sync status of the mailbox. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxSyncStatus")
@js.native
object EmailMailboxSyncStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus & Double] = js.native
  
  /* 3 */ val authenticationError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.authenticationError & Double = js.native
  
  /* 0 */ val idle: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.idle & Double = js.native
  
  /* 6 */ val manualAccountRemovalRequired: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.manualAccountRemovalRequired & Double = js.native
  
  /* 4 */ val policyError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.policyError & Double = js.native
  
  /* 1 */ val syncing: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.syncing & Double = js.native
  
  /* 5 */ val unknownError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.unknownError & Double = js.native
  
  /* 2 */ val upToDate: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxSyncStatus.upToDate & Double = js.native
}
