package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodDetailAcssDebit extends StObject {
  
  val AcssDebit: Any
  
  val BacsDebit: Any
  
  val Blik: TypeofBlik
}
object TypeofPaymentMethodDetailAcssDebit {
  
  inline def apply(AcssDebit: Any, BacsDebit: Any, Blik: TypeofBlik): TypeofPaymentMethodDetailAcssDebit = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], BacsDebit = BacsDebit.asInstanceOf[js.Any], Blik = Blik.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodDetailAcssDebit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodDetailAcssDebit] (val x: Self) extends AnyVal {
    
    inline def setAcssDebit(value: Any): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setBacsDebit(value: Any): Self = StObject.set(x, "BacsDebit", value.asInstanceOf[js.Any])
    
    inline def setBlik(value: TypeofBlik): Self = StObject.set(x, "Blik", value.asInstanceOf[js.Any])
  }
}
