package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarCreatePassiveSellOfferOp extends StObject {
  
  var amount: UintType
  
  var buying_asset: StellarAsset
  
  var price_d: Double
  
  var price_n: Double
  
  var selling_asset: StellarAsset
  
  var source_account: js.UndefOr[String] = js.undefined
}
object StellarCreatePassiveSellOfferOp {
  
  inline def apply(
    amount: UintType,
    buying_asset: StellarAsset,
    price_d: Double,
    price_n: Double,
    selling_asset: StellarAsset
  ): StellarCreatePassiveSellOfferOp = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying_asset = buying_asset.asInstanceOf[js.Any], price_d = price_d.asInstanceOf[js.Any], price_n = price_n.asInstanceOf[js.Any], selling_asset = selling_asset.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarCreatePassiveSellOfferOp]
  }
  
  extension [Self <: StellarCreatePassiveSellOfferOp](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBuying_asset(value: StellarAsset): Self = StObject.set(x, "buying_asset", value.asInstanceOf[js.Any])
    
    inline def setPrice_d(value: Double): Self = StObject.set(x, "price_d", value.asInstanceOf[js.Any])
    
    inline def setPrice_n(value: Double): Self = StObject.set(x, "price_n", value.asInstanceOf[js.Any])
    
    inline def setSelling_asset(value: StellarAsset): Self = StObject.set(x, "selling_asset", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setSource_accountUndefined: Self = StObject.set(x, "source_account", js.undefined)
  }
}
