package typings.trezorConnect.libTypescriptNetworksStellarMod

import typings.trezorConnect.anon.D
import typings.trezorConnect.trezorConnectStrings.manageBuyOffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarManageBuyOfferOperation
  extends StObject
     with StellarOperation {
  
  // Proto: "selling_asset"
  var amount: String
  
  // Proto: "source_account"
  var buying: StellarAsset
  
  // Proto: ok
  var offerId: js.UndefOr[String] = js.undefined
  
  // Proto: "offer_id" // not found in stellar-sdk
  var price: D
  
  // Proto: "buying_asset"
  var selling: StellarAsset
  
  // Proto: "StellarManageBuyOfferOp"
  var source: js.UndefOr[String] = js.undefined
  
  var `type`: manageBuyOffer
}
object StellarManageBuyOfferOperation {
  
  inline def apply(amount: String, buying: StellarAsset, price: D, selling: StellarAsset): StellarManageBuyOfferOperation = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("manageBuyOffer")
    __obj.asInstanceOf[StellarManageBuyOfferOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StellarManageBuyOfferOperation] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setBuying(value: StellarAsset): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setPrice(value: D): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setSelling(value: StellarAsset): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: manageBuyOffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
