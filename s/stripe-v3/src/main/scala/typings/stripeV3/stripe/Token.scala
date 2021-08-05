package typings.stripeV3.stripe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  var bank_account: js.UndefOr[BankAccount] = js.undefined
  
  var card: js.UndefOr[Card] = js.undefined
  
  var client_ip: String
  
  var created: Double
  
  var id: String
  
  var livemode: Boolean
  
  var `object`: String
  
  var `type`: String
  
  var used: Boolean
}
object Token {
  
  inline def apply(
    client_ip: String,
    created: Double,
    id: String,
    livemode: Boolean,
    `object`: String,
    `type`: String,
    used: Boolean
  ): Token = {
    val __obj = js.Dynamic.literal(client_ip = client_ip.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  extension [Self <: Token](x: Self) {
    
    inline def setBank_account(value: BankAccount): Self = StObject.set(x, "bank_account", value.asInstanceOf[js.Any])
    
    inline def setBank_accountUndefined: Self = StObject.set(x, "bank_account", js.undefined)
    
    inline def setCard(value: Card): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: Boolean): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
  }
}
