package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofPaymentMethodOptionAcssDebit extends StObject {
  
  val AcssDebit: TypeofAcssDebit
  
  val BacsDebit: Any
  
  val Boleto: Any
  
  val Card: Any
  
  val CustomerBalance: TypeofCustomerBalanceBankTransfer
  
  val Klarna: Any
  
  val Link: Any
  
  val SepaDebit: Any
  
  val UsBankAccount: TypeofUsBankAccount
}
object TypeofPaymentMethodOptionAcssDebit {
  
  inline def apply(
    AcssDebit: TypeofAcssDebit,
    BacsDebit: Any,
    Boleto: Any,
    Card: Any,
    CustomerBalance: TypeofCustomerBalanceBankTransfer,
    Klarna: Any,
    Link: Any,
    SepaDebit: Any,
    UsBankAccount: TypeofUsBankAccount
  ): TypeofPaymentMethodOptionAcssDebit = {
    val __obj = js.Dynamic.literal(AcssDebit = AcssDebit.asInstanceOf[js.Any], BacsDebit = BacsDebit.asInstanceOf[js.Any], Boleto = Boleto.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], CustomerBalance = CustomerBalance.asInstanceOf[js.Any], Klarna = Klarna.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], SepaDebit = SepaDebit.asInstanceOf[js.Any], UsBankAccount = UsBankAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofPaymentMethodOptionAcssDebit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofPaymentMethodOptionAcssDebit] (val x: Self) extends AnyVal {
    
    inline def setAcssDebit(value: TypeofAcssDebit): Self = StObject.set(x, "AcssDebit", value.asInstanceOf[js.Any])
    
    inline def setBacsDebit(value: Any): Self = StObject.set(x, "BacsDebit", value.asInstanceOf[js.Any])
    
    inline def setBoleto(value: Any): Self = StObject.set(x, "Boleto", value.asInstanceOf[js.Any])
    
    inline def setCard(value: Any): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCustomerBalance(value: TypeofCustomerBalanceBankTransfer): Self = StObject.set(x, "CustomerBalance", value.asInstanceOf[js.Any])
    
    inline def setKlarna(value: Any): Self = StObject.set(x, "Klarna", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Any): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
    
    inline def setSepaDebit(value: Any): Self = StObject.set(x, "SepaDebit", value.asInstanceOf[js.Any])
    
    inline def setUsBankAccount(value: TypeofUsBankAccount): Self = StObject.set(x, "UsBankAccount", value.asInstanceOf[js.Any])
  }
}
