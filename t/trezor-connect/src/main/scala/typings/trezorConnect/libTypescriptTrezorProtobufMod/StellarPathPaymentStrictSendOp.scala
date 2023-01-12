package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarPathPaymentStrictSendOp extends StObject {
  
  var destination_account: String
  
  var destination_asset: StellarAsset
  
  var destination_min: UintType
  
  var paths: js.UndefOr[js.Array[StellarAsset]] = js.undefined
  
  var send_amount: UintType
  
  var send_asset: StellarAsset
  
  var source_account: js.UndefOr[String] = js.undefined
}
object StellarPathPaymentStrictSendOp {
  
  inline def apply(
    destination_account: String,
    destination_asset: StellarAsset,
    destination_min: UintType,
    send_amount: UintType,
    send_asset: StellarAsset
  ): StellarPathPaymentStrictSendOp = {
    val __obj = js.Dynamic.literal(destination_account = destination_account.asInstanceOf[js.Any], destination_asset = destination_asset.asInstanceOf[js.Any], destination_min = destination_min.asInstanceOf[js.Any], send_amount = send_amount.asInstanceOf[js.Any], send_asset = send_asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarPathPaymentStrictSendOp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StellarPathPaymentStrictSendOp] (val x: Self) extends AnyVal {
    
    inline def setDestination_account(value: String): Self = StObject.set(x, "destination_account", value.asInstanceOf[js.Any])
    
    inline def setDestination_asset(value: StellarAsset): Self = StObject.set(x, "destination_asset", value.asInstanceOf[js.Any])
    
    inline def setDestination_min(value: UintType): Self = StObject.set(x, "destination_min", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[StellarAsset]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: StellarAsset*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setSend_amount(value: UintType): Self = StObject.set(x, "send_amount", value.asInstanceOf[js.Any])
    
    inline def setSend_asset(value: StellarAsset): Self = StObject.set(x, "send_asset", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
  }
}
