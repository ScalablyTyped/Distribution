package typings.stripe.mod.paymentIntents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentIntentDataTransferDataOptions extends StObject {
  
  /**
    * A positive integer representing how much to charge in the smallest currency unit.
    */
  var amount: js.UndefOr[Double] = js.undefined
  
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success.
    */
  var destination: js.UndefOr[String] = js.undefined
}
object IPaymentIntentDataTransferDataOptions {
  
  @scala.inline
  def apply(): IPaymentIntentDataTransferDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPaymentIntentDataTransferDataOptions]
  }
  
  @scala.inline
  implicit class IPaymentIntentDataTransferDataOptionsMutableBuilder[Self <: IPaymentIntentDataTransferDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
