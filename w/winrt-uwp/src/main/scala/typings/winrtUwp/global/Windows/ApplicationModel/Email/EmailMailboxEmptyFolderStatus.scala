package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the result of a call to TryEmptyFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus")
@js.native
object EmailMailboxEmptyFolderStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus & Double
  ] = js.native
  
  /* 5 */ val couldNotDeleteEverything: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.couldNotDeleteEverything & Double = js.native
  
  /* 1 */ val networkError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.networkError & Double = js.native
  
  /* 2 */ val permissionsError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.permissionsError & Double = js.native
  
  /* 3 */ val serverError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.serverError & Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.success & Double = js.native
  
  /* 4 */ val unknownFailure: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxEmptyFolderStatus.unknownFailure & Double = js.native
}
