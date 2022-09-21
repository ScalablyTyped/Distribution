package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Counterparty extends StObject {
  
  var counterparty: String
  
  var currency: String
  
  var value: String
}
object Counterparty {
  
  inline def apply(counterparty: String, currency: String, value: String): Counterparty = {
    val __obj = js.Dynamic.literal(counterparty = counterparty.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counterparty]
  }
  
  extension [Self <: Counterparty](x: Self) {
    
    inline def setCounterparty(value: String): Self = StObject.set(x, "counterparty", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
