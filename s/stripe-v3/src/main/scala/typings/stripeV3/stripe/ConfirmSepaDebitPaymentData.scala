package typings.stripeV3.stripe

import typings.stripeV3.anon.Sepadebit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmSepaDebitPaymentData extends StObject {
  
  /**
    * Pass an object to confirm using data collected by an iban Element or
    * by passing data directly and to supply additional required billing
    * details:
    */
  var payment_method: js.UndefOr[String | Sepadebit] = js.native
}
object ConfirmSepaDebitPaymentData {
  
  @scala.inline
  def apply(): ConfirmSepaDebitPaymentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmSepaDebitPaymentData]
  }
  
  @scala.inline
  implicit class ConfirmSepaDebitPaymentDataMutableBuilder[Self <: ConfirmSepaDebitPaymentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment_method(value: String | Sepadebit): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
  }
}
