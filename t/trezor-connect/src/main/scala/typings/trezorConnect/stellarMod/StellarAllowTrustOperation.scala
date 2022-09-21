package typings.trezorConnect.stellarMod

import typings.trezorConnect.protobufMod.StellarAssetType
import typings.trezorConnect.trezorConnectStrings.allowTrust
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarAllowTrustOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "trusted_account"
  var assetCode: String
  
  // Proto: "asset_code"
  var assetType: StellarAssetType
  
  // Proto: "asset_type"
  var authorize: js.UndefOr[Boolean] = js.undefined
  
  // Proto: "StellarAllowTrustOp"
  var source: js.UndefOr[String] = js.undefined
  
  // Proto: "source_account"
  var trustor: String
  
  var `type`: allowTrust
}
object StellarAllowTrustOperation {
  
  inline def apply(assetCode: String, assetType: StellarAssetType, trustor: String): StellarAllowTrustOperation = {
    val __obj = js.Dynamic.literal(assetCode = assetCode.asInstanceOf[js.Any], assetType = assetType.asInstanceOf[js.Any], trustor = trustor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("allowTrust")
    __obj.asInstanceOf[StellarAllowTrustOperation]
  }
  
  extension [Self <: StellarAllowTrustOperation](x: Self) {
    
    inline def setAssetCode(value: String): Self = StObject.set(x, "assetCode", value.asInstanceOf[js.Any])
    
    inline def setAssetType(value: StellarAssetType): Self = StObject.set(x, "assetType", value.asInstanceOf[js.Any])
    
    inline def setAuthorize(value: Boolean): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
    
    inline def setAuthorizeUndefined: Self = StObject.set(x, "authorize", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTrustor(value: String): Self = StObject.set(x, "trustor", value.asInstanceOf[js.Any])
    
    inline def setType(value: allowTrust): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
