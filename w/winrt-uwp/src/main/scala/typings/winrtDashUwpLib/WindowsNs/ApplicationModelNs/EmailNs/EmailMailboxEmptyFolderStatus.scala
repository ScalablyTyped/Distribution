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
  
  val couldNotDeleteEverything: couldNotDeleteEverything with java.lang.String = js.native
  val networkError: networkError with java.lang.String = js.native
  val permissionsError: permissionsError with java.lang.String = js.native
  val serverError: serverError with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val unknownFailure: unknownFailure with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs.EmailMailboxEmptyFolderStatus with java.lang.String
  ] = js.native
}

