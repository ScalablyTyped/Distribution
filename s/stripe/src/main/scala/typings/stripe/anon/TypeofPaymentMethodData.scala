package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodData extends StObject {
  
  val Eps: Any
  
  val Fpx: Any
  
  val Ideal: Any
  
  val Klarna: Any
  
  val P24: Any
  
  val Sofort: Any
  
  val UsBankAccount: Any
}
object TypeofPaymentMethodData {
  
  inline def apply(Eps: Any, Fpx: Any, Ideal: Any, Klarna: Any, P24: Any, Sofort: Any, UsBankAccount: Any): TypeofPaymentMethodData = {
    val __obj = js.Dynamic.literal(Eps = Eps.asInstanceOf[js.Any], Fpx = Fpx.asInstanceOf[js.Any], Ideal = Ideal.asInstanceOf[js.Any], Klarna = Klarna.asInstanceOf[js.Any], P24 = P24.asInstanceOf[js.Any], Sofort = Sofort.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodData] (val x: Self) extends AnyVal {
    
    inline def setEps(value: Any): Self = StObject.set(x, "Eps", value.asInstanceOf[js.Any])
    
    inline def setFpx(value: Any): Self = StObject.set(x, "Fpx", value.asInstanceOf[js.Any])
    
    inline def setIdeal(value: Any): Self = StObject.set(x, "Ideal", value.asInstanceOf[js.Any])
    
    inline def setKlarna(value: Any): Self = StObject.set(x, "Klarna", value.asInstanceOf[js.Any])
    
    inline def setP24(value: Any): Self = StObject.set(x, "P24", value.asInstanceOf[js.Any])
    
    inline def setSofort(value: Any): Self = StObject.set(x, "Sofort", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: Any): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
