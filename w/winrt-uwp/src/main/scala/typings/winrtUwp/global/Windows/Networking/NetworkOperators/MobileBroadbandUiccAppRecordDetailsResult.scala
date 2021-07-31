package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details about results of a UICC application record read operation initiated with MobileBroadbandUiccAppClass.GetRecordDetailsAsync . */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppRecordDetailsResult")
@js.native
abstract class MobileBroadbandUiccAppRecordDetailsResult ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppRecordDetailsResult {
  
  /** Gets an enumeration value specifying what kind of record this is. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.Networking.NetworkOperators.UiccAppRecordKind = js.native
  
  /** Gets a value specifying how read access to this record is determined. */
  /* CompleteClass */
  var readAccessCondition: typings.winrtUwp.Windows.Networking.NetworkOperators.UiccAccessCondition = js.native
  
  /** Gets the count of this record in the list of records provided by this UICC application. */
  /* CompleteClass */
  var recordCount: Double = js.native
  
  /** Gets the size in bytes of this record. */
  /* CompleteClass */
  var recordSize: Double = js.native
  
  /** Gets the status of the operation to retrieve UICC application record details. If this value is not Success, then other properties might not contain valid values. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppOperationStatus = js.native
  
  /** Gets a value specifying how write access to this record is determined. */
  /* CompleteClass */
  var writeAccessCondition: typings.winrtUwp.Windows.Networking.NetworkOperators.UiccAccessCondition = js.native
}
