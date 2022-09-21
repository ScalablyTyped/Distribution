package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarPathPaymentStrictReceiveOp extends StObject {
  
  var destination_account: String
  
  var destination_amount: UintType
  
  var destination_asset: StellarAsset
  
  var paths: js.UndefOr[js.Array[StellarAsset]] = js.undefined
  
  var send_asset: StellarAsset
  
  var send_max: UintType
  
  var source_account: js.UndefOr[String] = js.undefined
}
object StellarPathPaymentStrictReceiveOp {
  
  inline def apply(
    destination_account: String,
    destination_amount: UintType,
    destination_asset: StellarAsset,
    send_asset: StellarAsset,
    send_max: UintType
  ): StellarPathPaymentStrictReceiveOp = {
    val __obj = js.Dynamic.literal(destination_account = destination_account.asInstanceOf[js.Any], destination_amount = destination_amount.asInstanceOf[js.Any], destination_asset = destination_asset.asInstanceOf[js.Any], send_asset = send_asset.asInstanceOf[js.Any], send_max = send_max.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarPathPaymentStrictReceiveOp]
  }
  
  extension [Self <: StellarPathPaymentStrictReceiveOp](x: Self) {
    
    inline def setDestination_account(value: String): Self = StObject.set(x, "destination_account", value.asInstanceOf[js.Any])
    
    inline def setDestination_amount(value: UintType): Self = StObject.set(x, "destination_amount", value.asInstanceOf[js.Any])
    
    inline def setDestination_asset(value: StellarAsset): Self = StObject.set(x, "destination_asset", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[StellarAsset]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: StellarAsset*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setSend_asset(value: StellarAsset): Self = StObject.set(x, "send_asset", value.asInstanceOf[js.Any])
    
    inline def setSend_max(value: UintType): Self = StObject.set(x, "send_max", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
  }
}
