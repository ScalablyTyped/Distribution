package typings.winrtUwp.global.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the states of an email batch operation. */
@JSGlobal("Windows.ApplicationModel.Email.EmailBatchStatus")
@js.native
object EmailBatchStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.ApplicationModel.Email.EmailBatchStatus with Double] = js.native
  
  /* 1 */ val serverSearchSyncManagerError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailBatchStatus.serverSearchSyncManagerError with Double = js.native
  
  /* 2 */ val serverSearchUnknownError: typings.winrtUwp.Windows.ApplicationModel.Email.EmailBatchStatus.serverSearchUnknownError with Double = js.native
  
  /* 0 */ val success: typings.winrtUwp.Windows.ApplicationModel.Email.EmailBatchStatus.success with Double = js.native
}
