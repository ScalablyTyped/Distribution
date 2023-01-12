package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoinPurchaseMemo extends StObject {
  
  var address: String
  
  var amount: UintType
  
  var coin_type: Double
  
  var mac: String
}
object CoinPurchaseMemo {
  
  inline def apply(address: String, amount: UintType, coin_type: Double, mac: String): CoinPurchaseMemo = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], coin_type = coin_type.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoinPurchaseMemo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoinPurchaseMemo] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCoin_type(value: Double): Self = StObject.set(x, "coin_type", value.asInstanceOf[js.Any])
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
  }
}
