package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request to purchase an app or product that is offered by the app. */
trait StorePurchaseResult extends StObject {
  
  /** Gets the error code for the purchase request, if the operation encountered an error. */
  var extendedError: WinRTError
  
  /** Gets the status of the purchase request. */
  var status: StorePurchaseStatus
}
object StorePurchaseResult {
  
  inline def apply(extendedError: WinRTError, status: StorePurchaseStatus): StorePurchaseResult = {
    val __obj = js.Dynamic.literal(extendedError = extendedError.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePurchaseResult]
  }
  
  extension [Self <: StorePurchaseResult](x: Self) {
    
    inline def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StorePurchaseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
