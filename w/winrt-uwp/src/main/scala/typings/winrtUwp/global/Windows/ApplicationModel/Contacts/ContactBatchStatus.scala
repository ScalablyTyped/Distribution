package typings.winrtUwp.global.Windows.ApplicationModel.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies if the last batch access operation was successful or if there was a server error. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactBatchStatus")
@js.native
object ContactBatchStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus with Double
  ] = js.native
  
  /* 1 */ val serverSearchSyncManagerError: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus.serverSearchSyncManagerError with Double = js.native
  
  /* 2 */ val serverSearchUnknownError: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus.serverSearchUnknownError with Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus.success with Double = js.native
}
