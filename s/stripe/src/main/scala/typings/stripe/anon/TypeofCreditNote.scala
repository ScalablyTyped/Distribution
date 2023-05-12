package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCreditNote extends StObject {
  
  val ShippingCost: TypeofShippingCost
  
  val TaxAmount: Any
}
object TypeofCreditNote {
  
  inline def apply(ShippingCost: TypeofShippingCost, TaxAmount: Any): TypeofCreditNote = {
    val __obj = js.Dynamic.literal(ShippingCost = ShippingCost.asInstanceOf[js.Any], TaxAmount = TaxAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCreditNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofCreditNote] (val x: Self) extends AnyVal {
    
    inline def setShippingCost(value: TypeofShippingCost): Self = StObject.set(x, "ShippingCost", value.asInstanceOf[js.Any])
    
    inline def setTaxAmount(value: Any): Self = StObject.set(x, "TaxAmount", value.asInstanceOf[js.Any])
  }
}
