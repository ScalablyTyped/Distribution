package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoAddressParameters extends StObject {
  
  var addressType: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoAddressType
  
  var certificatePointer: js.UndefOr[CardanoCertificatePointer] = js.undefined
  
  var path: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var paymentScriptHash: js.UndefOr[String] = js.undefined
  
  var stakingKeyHash: js.UndefOr[String] = js.undefined
  
  var stakingPath: js.UndefOr[String | js.Array[Double]] = js.undefined
  
  var stakingScriptHash: js.UndefOr[String] = js.undefined
}
object CardanoAddressParameters {
  
  inline def apply(addressType: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoAddressType): CardanoAddressParameters = {
    val __obj = js.Dynamic.literal(addressType = addressType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoAddressParameters]
  }
  
  extension [Self <: CardanoAddressParameters](x: Self) {
    
    inline def setAddressType(value: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoAddressType): Self = StObject.set(x, "addressType", value.asInstanceOf[js.Any])
    
    inline def setCertificatePointer(value: CardanoCertificatePointer): Self = StObject.set(x, "certificatePointer", value.asInstanceOf[js.Any])
    
    inline def setCertificatePointerUndefined: Self = StObject.set(x, "certificatePointer", js.undefined)
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setPaymentScriptHash(value: String): Self = StObject.set(x, "paymentScriptHash", value.asInstanceOf[js.Any])
    
    inline def setPaymentScriptHashUndefined: Self = StObject.set(x, "paymentScriptHash", js.undefined)
    
    inline def setStakingKeyHash(value: String): Self = StObject.set(x, "stakingKeyHash", value.asInstanceOf[js.Any])
    
    inline def setStakingKeyHashUndefined: Self = StObject.set(x, "stakingKeyHash", js.undefined)
    
    inline def setStakingPath(value: String | js.Array[Double]): Self = StObject.set(x, "stakingPath", value.asInstanceOf[js.Any])
    
    inline def setStakingPathUndefined: Self = StObject.set(x, "stakingPath", js.undefined)
    
    inline def setStakingPathVarargs(value: Double*): Self = StObject.set(x, "stakingPath", js.Array(value*))
    
    inline def setStakingScriptHash(value: String): Self = StObject.set(x, "stakingScriptHash", value.asInstanceOf[js.Any])
    
    inline def setStakingScriptHashUndefined: Self = StObject.set(x, "stakingScriptHash", js.undefined)
  }
}
