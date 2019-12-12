package typings.winrtDashUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus.serverSearchSyncManagerError
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus.serverSearchUnknownError
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactBatchStatus.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContactBatchStatus extends js.Object

/** Specifies if the last batch access operation was successful or if there was a server error. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactBatchStatus")
@js.native
object ContactBatchStatus extends js.Object {
  /** There was a server error. */
  @js.native
  sealed trait serverSearchSyncManagerError extends ContactBatchStatus
  
  /** There was an unknown error. */
  @js.native
  sealed trait serverSearchUnknownError extends ContactBatchStatus
  
  /** Success */
  @js.native
  sealed trait success extends ContactBatchStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactBatchStatus with Double] = js.native
  /* 1 */ @js.native
  object serverSearchSyncManagerError extends TopLevel[serverSearchSyncManagerError with Double]
  
  /* 2 */ @js.native
  object serverSearchUnknownError extends TopLevel[serverSearchUnknownError with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
}

