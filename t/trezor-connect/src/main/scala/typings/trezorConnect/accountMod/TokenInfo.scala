package typings.trezorConnect.accountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenInfo extends StObject {
  
  // token type: ERC20...
  var address: String
  
  // token address
  var balance: js.UndefOr[String] = js.undefined
  
  // token symbol
  var decimals: Double
  
  // token balance
  var name: js.UndefOr[String] = js.undefined
  
  // token name
  var symbol: js.UndefOr[String] = js.undefined
  
  var `type`: String
}
object TokenInfo {
  
  inline def apply(address: String, decimals: Double, `type`: String): TokenInfo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfo]
  }
  
  extension [Self <: TokenInfo](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
    
    inline def setBalanceUndefined: Self = StObject.set(x, "balance", js.undefined)
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
