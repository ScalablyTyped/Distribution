package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarPaymentOp extends StObject {
  
  var amount: UintType
  
  var asset: StellarAsset
  
  var destination_account: String
  
  var source_account: js.UndefOr[String] = js.undefined
}
object StellarPaymentOp {
  
  inline def apply(amount: UintType, asset: StellarAsset, destination_account: String): StellarPaymentOp = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset = asset.asInstanceOf[js.Any], destination_account = destination_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarPaymentOp]
  }
  
  extension [Self <: StellarPaymentOp](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAsset(value: StellarAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setDestination_account(value: String): Self = StObject.set(x, "destination_account", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
  }
}
