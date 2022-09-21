package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarChangeTrustOp extends StObject {
  
  var asset: StellarAsset
  
  var limit: UintType
  
  var source_account: js.UndefOr[String] = js.undefined
}
object StellarChangeTrustOp {
  
  inline def apply(asset: StellarAsset, limit: UintType): StellarChangeTrustOp = {
    val __obj = js.Dynamic.literal(asset = asset.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarChangeTrustOp]
  }
  
  extension [Self <: StellarChangeTrustOp](x: Self) {
    
    inline def setAsset(value: StellarAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: UintType): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
  }
}
