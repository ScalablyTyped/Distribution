package typings.trezorConnect.stellarMod

import typings.trezorConnect.trezorConnectStrings.pathPaymentStrictReceive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarPathPaymentStrictReceiveOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "destination_asset"
  var destAmount: String
  
  // Proto: "destination_account"
  var destAsset: StellarAsset
  
  // Proto: "send_max"
  var destination: String
  
  // Proto "destination_amount"
  var path: js.UndefOr[js.Array[StellarAsset]] = js.undefined
  
  // Proto: "source_account"
  var sendAsset: StellarAsset
  
  // Proto: "send_asset"
  var sendMax: String
  
  // Proto: "StellarPathPaymentStrictReceiveOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: pathPaymentStrictReceive
}
object StellarPathPaymentStrictReceiveOperation {
  
  inline def apply(
    destAmount: String,
    destAsset: StellarAsset,
    destination: String,
    sendAsset: StellarAsset,
    sendMax: String
  ): StellarPathPaymentStrictReceiveOperation = {
    val __obj = js.Dynamic.literal(destAmount = destAmount.asInstanceOf[js.Any], destAsset = destAsset.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], sendAsset = sendAsset.asInstanceOf[js.Any], sendMax = sendMax.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pathPaymentStrictReceive")
    __obj.asInstanceOf[StellarPathPaymentStrictReceiveOperation]
  }
  
  extension [Self <: StellarPathPaymentStrictReceiveOperation](x: Self) {
    
    inline def setDestAmount(value: String): Self = StObject.set(x, "destAmount", value.asInstanceOf[js.Any])
    
    inline def setDestAsset(value: StellarAsset): Self = StObject.set(x, "destAsset", value.asInstanceOf[js.Any])
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[StellarAsset]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: StellarAsset*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setSendAsset(value: StellarAsset): Self = StObject.set(x, "sendAsset", value.asInstanceOf[js.Any])
    
    inline def setSendMax(value: String): Self = StObject.set(x, "sendMax", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: pathPaymentStrictReceive): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
