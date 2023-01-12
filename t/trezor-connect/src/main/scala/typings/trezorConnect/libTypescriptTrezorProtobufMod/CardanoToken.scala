package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoToken extends StObject {
  
  var amount: js.UndefOr[UintType] = js.undefined
  
  var asset_name_bytes: String
  
  var mint_amount: js.UndefOr[UintType] = js.undefined
}
object CardanoToken {
  
  inline def apply(asset_name_bytes: String): CardanoToken = {
    val __obj = js.Dynamic.literal(asset_name_bytes = asset_name_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoToken] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setAsset_name_bytes(value: String): Self = StObject.set(x, "asset_name_bytes", value.asInstanceOf[js.Any])
    
    inline def setMint_amount(value: UintType): Self = StObject.set(x, "mint_amount", value.asInstanceOf[js.Any])
    
    inline def setMint_amountUndefined: Self = StObject.set(x, "mint_amount", js.undefined)
  }
}
