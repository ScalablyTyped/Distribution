package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

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
  sealed trait couldNotDeleteEverything
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxEmptyFolderStatus
  
  /** There was a network error while trying to empty the folder. */
  @js.native
  sealed trait networkError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxEmptyFolderStatus
  
  /** There was a permissions error while trying to empty the folder. */
  @js.native
  sealed trait permissionsError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxEmptyFolderStatus
  
  /** There was a server error while trying to empty the folder. */
  @js.native
  sealed trait serverError
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxEmptyFolderStatus
  
  /** The folder was successfully emptied. */
  @js.native
  sealed trait success
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxEmptyFolderStatus
  
  /** There was an unknown error while trying to empty the folder. */
  @js.native
  sealed trait unknownFailure
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxEmptyFolderStatus
  
  /* 5 */ val couldNotDeleteEverything: couldNotDeleteEverything with scala.Double = js.native
  /* 1 */ val networkError: networkError with scala.Double = js.native
  /* 2 */ val permissionsError: permissionsError with scala.Double = js.native
  /* 3 */ val serverError: serverError with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 4 */ val unknownFailure: unknownFailure with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxEmptyFolderStatus with scala.Double
  ] = js.native
}

