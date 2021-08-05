package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ErrorOccurred event. */
trait BarcodeScannerErrorOccurredEventArgs extends StObject {
  
  /** Gets the data associated with the ErrorOccurred event. */
  var errorData: UnifiedPosErrorData
  
  /** Indicates whether it is worthwhile to make another attempt at the operation. */
  var isRetriable: Boolean
  
  /** Gets any data that was successfully read. */
  var partialInputData: BarcodeScannerReport
}
object BarcodeScannerErrorOccurredEventArgs {
  
  inline def apply(errorData: UnifiedPosErrorData, isRetriable: Boolean, partialInputData: BarcodeScannerReport): BarcodeScannerErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], isRetriable = isRetriable.asInstanceOf[js.Any], partialInputData = partialInputData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerErrorOccurredEventArgs]
  }
  
  extension [Self <: BarcodeScannerErrorOccurredEventArgs](x: Self) {
    
    inline def setErrorData(value: UnifiedPosErrorData): Self = StObject.set(x, "errorData", value.asInstanceOf[js.Any])
    
    inline def setIsRetriable(value: Boolean): Self = StObject.set(x, "isRetriable", value.asInstanceOf[js.Any])
    
    inline def setPartialInputData(value: BarcodeScannerReport): Self = StObject.set(x, "partialInputData", value.asInstanceOf[js.Any])
  }
}
