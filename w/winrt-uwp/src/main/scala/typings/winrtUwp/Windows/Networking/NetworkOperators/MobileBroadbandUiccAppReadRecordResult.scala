package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates the results of a UICC application record read operation. */
@js.native
trait MobileBroadbandUiccAppReadRecordResult extends StObject {
  
  /** Gets the data returned by the application record read operation. Note that if Status is not Success, this value may be invalid or empty. */
  var data: IBuffer = js.native
  
  /** Gets a value which indicates whether the record read completed successfully. */
  var status: MobileBroadbandUiccAppOperationStatus = js.native
}
object MobileBroadbandUiccAppReadRecordResult {
  
  @scala.inline
  def apply(data: IBuffer, status: MobileBroadbandUiccAppOperationStatus): MobileBroadbandUiccAppReadRecordResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUiccAppReadRecordResult]
  }
  
  @scala.inline
  implicit class MobileBroadbandUiccAppReadRecordResultMutableBuilder[Self <: MobileBroadbandUiccAppReadRecordResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: IBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: MobileBroadbandUiccAppOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
