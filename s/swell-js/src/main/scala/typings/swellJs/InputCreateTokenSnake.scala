package typings.swellJs

import typings.swellJs.typesBillingMod.Billing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputCreateTokenSnake extends StObject {
  
  var account_id: js.UndefOr[String] = js.undefined
  
  var billing: js.UndefOr[Billing] = js.undefined
  
  var cvc: js.UndefOr[Double] = js.undefined
  
  var exp_month: js.UndefOr[Double] = js.undefined
  
  var exp_year: js.UndefOr[Double] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
}
object InputCreateTokenSnake {
  
  inline def apply(): InputCreateTokenSnake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputCreateTokenSnake]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputCreateTokenSnake] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: String): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
    
    inline def setAccount_idUndefined: Self = StObject.set(x, "account_id", js.undefined)
    
    inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    inline def setCvc(value: Double): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
    
    inline def setCvcUndefined: Self = StObject.set(x, "cvc", js.undefined)
    
    inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    inline def setExp_monthUndefined: Self = StObject.set(x, "exp_month", js.undefined)
    
    inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    inline def setExp_yearUndefined: Self = StObject.set(x, "exp_year", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
