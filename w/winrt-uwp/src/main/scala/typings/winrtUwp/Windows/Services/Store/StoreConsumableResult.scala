package typings.winrtUwp.Windows.Services.Store

import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides response data for a request that involves a consumable add-on for the current app. */
@js.native
trait StoreConsumableResult extends StObject {
  
  /** Gets the remaining balance for the consumable add-on. */
  var balanceRemaining: Double = js.native
  
  /** Gets the error code for the request, if the operation encountered an error. */
  var extendedError: WinRTError = js.native
  
  /** Gets the status of the request. */
  var status: StoreConsumableStatus = js.native
  
  /** Gets the tracking ID that was submitted with the ReportConsumableFulfillmentAsync request. */
  var trackingId: String = js.native
}
object StoreConsumableResult {
  
  @scala.inline
  def apply(
    balanceRemaining: Double,
    extendedError: WinRTError,
    status: StoreConsumableStatus,
    trackingId: String
  ): StoreConsumableResult = {
    val __obj = js.Dynamic.literal(balanceRemaining = balanceRemaining.asInstanceOf[js.Any], extendedError = extendedError.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], trackingId = trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConsumableResult]
  }
  
  @scala.inline
  implicit class StoreConsumableResultMutableBuilder[Self <: StoreConsumableResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBalanceRemaining(value: Double): Self = StObject.set(x, "balanceRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedError(value: WinRTError): Self = StObject.set(x, "extendedError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: StoreConsumableStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
  }
}
