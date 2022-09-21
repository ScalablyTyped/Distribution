package typings.trezorConnect.stellarMod

import typings.trezorConnect.trezorConnectStrings.payment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarPaymentOperation
  extends StObject
     with StellarOperation {
  
  // Proto: ok
  var amount: String
  
  // Proto: "destination_account"
  var asset: StellarAsset
  
  // Proto: "source_account"
  var destination: String
  
  // Proto: "StellarPaymentOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: payment
}
object StellarPaymentOperation {
  
  inline def apply(amount: String, asset: StellarAsset, destination: String): StellarPaymentOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("payment")
    __obj.asInstanceOf[StellarPaymentOperation]
  }
  
  extension [Self <: StellarPaymentOperation](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAsset(value: StellarAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: payment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
