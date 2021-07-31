package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactBatchStatus extends StObject
/** Specifies if the last batch access operation was successful or if there was a server error. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactBatchStatus")
@js.native
object ContactBatchStatus extends StObject {
  
  /** There was a server error. */
  @js.native
  sealed trait serverSearchSyncManagerError
    extends StObject
       with ContactBatchStatus
  
  /** There was an unknown error. */
  @js.native
  sealed trait serverSearchUnknownError
    extends StObject
       with ContactBatchStatus
  
  /** Success */
  @js.native
  sealed trait success
    extends StObject
       with ContactBatchStatus
}
