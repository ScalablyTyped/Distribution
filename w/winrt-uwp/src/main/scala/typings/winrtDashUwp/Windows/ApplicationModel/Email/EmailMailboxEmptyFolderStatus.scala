package typings.winrtDashUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.couldNotDeleteEverything
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.networkError
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.permissionsError
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.serverError
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.success
import typings.winrtDashUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.unknownFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailMailboxEmptyFolderStatus extends js.Object

/** Indicates the result of a call to TryEmptyFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus")
@js.native
object EmailMailboxEmptyFolderStatus extends js.Object {
  /** An error occurred while deleting parts of the folder. */
  @js.native
  sealed trait couldNotDeleteEverything extends EmailMailboxEmptyFolderStatus
  
  /** There was a network error while trying to empty the folder. */
  @js.native
  sealed trait networkError extends EmailMailboxEmptyFolderStatus
  
  /** There was a permissions error while trying to empty the folder. */
  @js.native
  sealed trait permissionsError extends EmailMailboxEmptyFolderStatus
  
  /** There was a server error while trying to empty the folder. */
  @js.native
  sealed trait serverError extends EmailMailboxEmptyFolderStatus
  
  /** The folder was successfully emptied. */
  @js.native
  sealed trait success extends EmailMailboxEmptyFolderStatus
  
  /** There was an unknown error while trying to empty the folder. */
  @js.native
  sealed trait unknownFailure extends EmailMailboxEmptyFolderStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailMailboxEmptyFolderStatus with Double] = js.native
  /* 5 */ @js.native
  object couldNotDeleteEverything extends TopLevel[couldNotDeleteEverything with Double]
  
  /* 1 */ @js.native
  object networkError extends TopLevel[networkError with Double]
  
  /* 2 */ @js.native
  object permissionsError extends TopLevel[permissionsError with Double]
  
  /* 3 */ @js.native
  object serverError extends TopLevel[serverError with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 4 */ @js.native
  object unknownFailure extends TopLevel[unknownFailure with Double]
  
}

