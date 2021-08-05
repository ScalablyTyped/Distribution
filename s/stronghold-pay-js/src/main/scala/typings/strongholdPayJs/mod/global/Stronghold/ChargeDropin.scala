package typings.strongholdPayJs.mod.global.Stronghold

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChargeDropin extends StObject {
  
  /**
    * The amount to charge, specified in the smallest divisible currency unit. For example, number of cents of United States dollar.
    */
  var amount: Double
  
  var externalId: js.UndefOr[String] = js.undefined
  
  var paymentSourceId: String
}
object ChargeDropin {
  
  inline def apply(amount: Double, paymentSourceId: String): ChargeDropin = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], paymentSourceId = paymentSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChargeDropin]
  }
  
  extension [Self <: ChargeDropin](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setPaymentSourceId(value: String): Self = StObject.set(x, "paymentSourceId", value.asInstanceOf[js.Any])
  }
}
