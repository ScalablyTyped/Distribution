package typings.trezorConnect.libTypescriptNetworksStellarMod

import typings.trezorConnect.anon.D
import typings.trezorConnect.trezorConnectStrings.createPassiveSellOffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarPassiveSellOfferOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "selling_asset"
  var amount: String
  
  // Proto: "source_account"
  var buying: StellarAsset
  
  // Proto: ok
  var price: D
  
  // Proto: "buying_asset"
  var selling: StellarAsset
  
  // Proto: "StellarCreatePassiveSellOfferOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: createPassiveSellOffer
}
object StellarPassiveSellOfferOperation {
  
  inline def apply(amount: String, buying: StellarAsset, price: D, selling: StellarAsset): StellarPassiveSellOfferOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("createPassiveSellOffer")
    __obj.asInstanceOf[StellarPassiveSellOfferOperation]
  }
  
  extension [Self <: StellarPassiveSellOfferOperation](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBuying(value: StellarAsset): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: D): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setSelling(value: StellarAsset): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: createPassiveSellOffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
