package typings.trezorConnect.libTypescriptAccountMod

import typings.trezorConnect.trezorConnectStrings.recv
import typings.trezorConnect.trezorConnectStrings.self
import typings.trezorConnect.trezorConnectStrings.sent
import typings.trezorConnect.trezorConnectStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenTransfer extends StObject {
  
  var address: String
  
  var amount: String
  
  var decimals: Double
  
  var from: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var symbol: String
  
  var to: js.UndefOr[String] = js.undefined
  
  var `type`: sent | recv | self | unknown
}
object TokenTransfer {
  
  inline def apply(
    address: String,
    amount: String,
    decimals: Double,
    name: String,
    symbol: String,
    `type`: sent | recv | self | unknown
  ): TokenTransfer = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], decimals = decimals.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenTransfer]
  }
  
  extension [Self <: TokenTransfer](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setType(value: sent | recv | self | unknown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
