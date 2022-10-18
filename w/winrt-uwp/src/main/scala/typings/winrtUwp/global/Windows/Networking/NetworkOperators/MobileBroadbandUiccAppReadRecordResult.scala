package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the results of a UICC application record read operation. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppReadRecordResult")
@js.native
open class MobileBroadbandUiccAppReadRecordResult ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppReadRecordResult {
  
  /** Gets the data returned by the application record read operation. Note that if Status is not Success, this value may be invalid or empty. */
  /* CompleteClass */
  var data: IBuffer = js.native
  
  /** Gets a value which indicates whether the record read completed successfully. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppOperationStatus = js.native
}
