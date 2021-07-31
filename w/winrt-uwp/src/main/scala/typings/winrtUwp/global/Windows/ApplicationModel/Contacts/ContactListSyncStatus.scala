package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the ContactList sync status. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactListSyncStatus")
@js.native
object ContactListSyncStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus & Double
  ] = js.native
  
  /* 3 */ val authenticationError: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.authenticationError & Double = js.native
  
  /* 0 */ val idle: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.idle & Double = js.native
  
  /* 6 */ val manualAccountRemovalRequired: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.manualAccountRemovalRequired & Double = js.native
  
  /* 4 */ val policyError: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.policyError & Double = js.native
  
  /* 1 */ val syncing: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.syncing & Double = js.native
  
  /* 5 */ val unknownError: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.unknownError & Double = js.native
  
  /* 2 */ val upToDate: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactListSyncStatus.upToDate & Double = js.native
}
