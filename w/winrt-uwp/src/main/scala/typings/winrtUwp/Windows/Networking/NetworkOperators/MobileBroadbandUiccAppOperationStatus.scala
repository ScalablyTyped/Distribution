package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MobileBroadbandUiccAppOperationStatus extends StObject
/** Describes the status of an operation on a UICC application. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppOperationStatus")
@js.native
object MobileBroadbandUiccAppOperationStatus extends StObject {
  
  /** Operation failed due to an access condition not being met. */
  @js.native
  sealed trait accessConditionNotHeld
    extends StObject
       with MobileBroadbandUiccAppOperationStatus
  
  /** Operation failed due to an invalid UICC file path being specified. */
  @js.native
  sealed trait invalidUiccFilePath
    extends StObject
       with MobileBroadbandUiccAppOperationStatus
  
  /** Successful completion. */
  @js.native
  sealed trait success
    extends StObject
       with MobileBroadbandUiccAppOperationStatus
  
  /** Operation failed because the UICC was busy. */
  @js.native
  sealed trait uiccBusy
    extends StObject
       with MobileBroadbandUiccAppOperationStatus
}
