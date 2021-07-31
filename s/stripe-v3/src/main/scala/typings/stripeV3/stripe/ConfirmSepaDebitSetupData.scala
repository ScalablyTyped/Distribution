package typings.stripeV3.stripe

import typings.stripeV3.anon.Sepadebit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmSepaDebitSetupData extends StObject {
  
  /**
    * Pass an object to confirm using data collected by an iban Element or
    * by passing data directly and to supply additional required billing
    * details:
    */
  var payment_method: js.UndefOr[String | Sepadebit] = js.undefined
}
object ConfirmSepaDebitSetupData {
  
  @scala.inline
  def apply(): ConfirmSepaDebitSetupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSepaDebitSetupData]
  }
  
  @scala.inline
  implicit class ConfirmSepaDebitSetupDataMutableBuilder[Self <: ConfirmSepaDebitSetupData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment_method(value: String | Sepadebit): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
  }
}
