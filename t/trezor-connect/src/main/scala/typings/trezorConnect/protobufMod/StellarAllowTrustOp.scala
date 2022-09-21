package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarAllowTrustOp extends StObject {
  
  var asset_code: js.UndefOr[String] = js.undefined
  
  var asset_type: StellarAssetType
  
  var is_authorized: Boolean
  
  var source_account: js.UndefOr[String] = js.undefined
  
  var trusted_account: String
}
object StellarAllowTrustOp {
  
  inline def apply(asset_type: StellarAssetType, is_authorized: Boolean, trusted_account: String): StellarAllowTrustOp = {
    val __obj = js.Dynamic.literal(asset_type = asset_type.asInstanceOf[js.Any], is_authorized = is_authorized.asInstanceOf[js.Any], trusted_account = trusted_account.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarAllowTrustOp]
  }
  
  extension [Self <: StellarAllowTrustOp](x: Self) {
    
    inline def setAsset_code(value: String): Self = StObject.set(x, "asset_code", value.asInstanceOf[js.Any])
    
    inline def setAsset_codeUndefined: Self = StObject.set(x, "asset_code", js.undefined)
    
    inline def setAsset_type(value: StellarAssetType): Self = StObject.set(x, "asset_type", value.asInstanceOf[js.Any])
    
    inline def setIs_authorized(value: Boolean): Self = StObject.set(x, "is_authorized", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
    
    inline def setTrusted_account(value: String): Self = StObject.set(x, "trusted_account", value.asInstanceOf[js.Any])
  }
}
