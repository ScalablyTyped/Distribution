package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosAsset extends StObject {
  
  var amount: UintType
  
  var symbol: String
}
object EosAsset {
  
  inline def apply(amount: UintType, symbol: String): EosAsset = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosAsset]
  }
  
  extension [Self <: EosAsset](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
