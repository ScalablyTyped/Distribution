package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSettingsCardIssuing extends StObject {
  
  val CardIssuing: Any
  
  val CardPayments: Any
  
  val Payouts: Any
  
  val Treasury: Any
}
object TypeofSettingsCardIssuing {
  
  inline def apply(CardIssuing: Any, CardPayments: Any, Payouts: Any, Treasury: Any): TypeofSettingsCardIssuing = {
    val __obj = js.Dynamic.literal(CardIssuing = CardIssuing.asInstanceOf[js.Any], CardPayments = CardPayments.asInstanceOf[js.Any], Payouts = Payouts.asInstanceOf[js.Any], Treasury = Treasury.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofSettingsCardIssuing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofSettingsCardIssuing] (val x: Self) extends AnyVal {
    
    inline def setCardIssuing(value: Any): Self = StObject.set(x, "CardIssuing", value.asInstanceOf[js.Any])
    
    inline def setCardPayments(value: Any): Self = StObject.set(x, "CardPayments", value.asInstanceOf[js.Any])
    
    inline def setPayouts(value: Any): Self = StObject.set(x, "Payouts", value.asInstanceOf[js.Any])
    
    inline def setTreasury(value: Any): Self = StObject.set(x, "Treasury", value.asInstanceOf[js.Any])
  }
}
