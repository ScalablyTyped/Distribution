package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinanceCoin extends StObject {
  
  var amount: UintType
  
  var denom: String
}
object BinanceCoin {
  
  inline def apply(amount: UintType, denom: String): BinanceCoin = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], denom = denom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinanceCoin]
  }
  
  extension [Self <: BinanceCoin](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDenom(value: String): Self = StObject.set(x, "denom", value.asInstanceOf[js.Any])
  }
}
