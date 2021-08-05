package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvc extends StObject {
  
  var cvc: js.UndefOr[String] = js.undefined
  
  var exp_month: Double
  
  var exp_year: Double
  
  var number: String
}
object Cvc {
  
  inline def apply(exp_month: Double, exp_year: Double, number: String): Cvc = {
    val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cvc]
  }
  
  extension [Self <: Cvc](x: Self) {
    
    inline def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
    
    inline def setCvcUndefined: Self = StObject.set(x, "cvc", js.undefined)
    
    inline def setExp_month(value: Double): Self = StObject.set(x, "exp_month", value.asInstanceOf[js.Any])
    
    inline def setExp_year(value: Double): Self = StObject.set(x, "exp_year", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
