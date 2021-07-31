package typings.winrtUwp.Windows.ApplicationModel.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailBatchStatus extends StObject
/** Defines the states of an email batch operation. */
@JSGlobal("Windows.ApplicationModel.Email.EmailBatchStatus")
@js.native
object EmailBatchStatus extends StObject {
  
  /** The batch operation has failed due to a sync manager error. */
  @js.native
  sealed trait serverSearchSyncManagerError
    extends StObject
       with EmailBatchStatus
  
  /** The batch operation has failed due to an unknown error. */
  @js.native
  sealed trait serverSearchUnknownError
    extends StObject
       with EmailBatchStatus
  
  /** The batch operation has completed successfully. */
  @js.native
  sealed trait success
    extends StObject
       with EmailBatchStatus
}
