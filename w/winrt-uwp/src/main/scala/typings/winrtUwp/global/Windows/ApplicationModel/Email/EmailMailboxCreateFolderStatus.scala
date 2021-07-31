package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates the result of a call to TryCreateFolderAsync . */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus")
@js.native
object EmailMailboxCreateFolderStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus & Double
  ] = js.native
  
  /* 5 */ val nameCollision: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.nameCollision & Double = js.native
  
  /* 1 */ val networkError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.networkError & Double = js.native
  
  /* 2 */ val permissionsError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.permissionsError & Double = js.native
  
  /* 3 */ val serverError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.serverError & Double = js.native
  
  /* 6 */ val serverRejected: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.serverRejected & Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.success & Double = js.native
  
  /* 4 */ val unknownFailure: typings.winrtUwp.Windows.ApplicationModel.Email.EmailMailboxCreateFolderStatus.unknownFailure & Double = js.native
}
