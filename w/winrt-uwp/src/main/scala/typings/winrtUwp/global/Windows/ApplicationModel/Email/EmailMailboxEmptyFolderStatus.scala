package typings.winrtUwp.global.Windows.ApplicationModel.Email

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the result of a call to TryEmptyFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus")
@js.native
object EmailMailboxEmptyFolderStatus extends js.Object {
  /* 5 */ val couldNotDeleteEverything: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.couldNotDeleteEverything with Double = js.native
  /* 1 */ val networkError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.networkError with Double = js.native
  /* 2 */ val permissionsError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.permissionsError with Double = js.native
  /* 3 */ val serverError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.serverError with Double = js.native
  /* 0 */ val success: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.success with Double = js.native
  /* 4 */ val unknownFailure: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.unknownFailure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus with Double
  ] = js.native
}

