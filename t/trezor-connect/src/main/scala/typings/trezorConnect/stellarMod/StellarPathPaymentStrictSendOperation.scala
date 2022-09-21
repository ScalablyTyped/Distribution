package typings.trezorConnect.stellarMod

import typings.trezorConnect.trezorConnectStrings.pathPaymentStrictSend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarPathPaymentStrictSendOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "destination_account"
  var destAsset: StellarAsset
  
  // Proto: "destination_asset"
  var destMin: String
  
  // Proto: "send_amount"
  var destination: String
  
  // Proto "destination_min"
  var path: js.UndefOr[js.Array[StellarAsset]] = js.undefined
  
  // Proto: "send_asset"
  var sendAmount: String
  
  // Proto: "source_account"
  var sendAsset: StellarAsset
  
  // Proto: "StellarPathPaymentStrictSendOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: pathPaymentStrictSend
}
object StellarPathPaymentStrictSendOperation {
  
  inline def apply(
    destAsset: StellarAsset,
    destMin: String,
    destination: String,
    sendAmount: String,
    sendAsset: StellarAsset
  ): StellarPathPaymentStrictSendOperation = {
    val __obj = js.Dynamic.literal(destAsset = destAsset.asInstanceOf[js.Any], destMin = destMin.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAmount = sendAmount.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pathPaymentStrictSend")
    __obj.asInstanceOf[StellarPathPaymentStrictSendOperation]
  }
  
  extension [Self <: StellarPathPaymentStrictSendOperation](x: Self) {
    
    inline def setDestAsset(value: StellarAsset): Self = StObject.set(x, "destAsset", value.asInstanceOf[js.Any])
    
    inline def setDestMin(value: String): Self = StObject.set(x, "destMin", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[StellarAsset]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: StellarAsset*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setSendAmount(value: String): Self = StObject.set(x, "sendAmount", value.asInstanceOf[js.Any])
    
    inline def setSendAsset(value: StellarAsset): Self = StObject.set(x, "sendAsset", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: pathPaymentStrictSend): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
