package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTokenType extends StObject {
  
  var amount: UintType
  
  var asset_name_bytes: String
}
object CardanoTokenType {
  
  inline def apply(amount: UintType, asset_name_bytes: String): CardanoTokenType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset_name_bytes = asset_name_bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTokenType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoTokenType] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAsset_name_bytes(value: String): Self = StObject.set(x, "asset_name_bytes", value.asInstanceOf[js.Any])
  }
}
