package typings.stripe.mod.paymentIntents

import typings.stripe.mod.accounts.IAccountCreationOptions
import typings.stripe.mod.bankAccounts.IBankAccount
import typings.stripe.mod.cards.ICardHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPaymentIntentTransferData extends StObject {
  
  /**
    * The amount that will be transferred automatically when a charge succeeds. The amount is capped at the total transaction amount and if no amount is set, the full amount is transferred.
    * If you intend to collect a fee and you need a more robust reporting experience, using application_fee_amount might be a better fit for your integration.
    */
  var amount: js.UndefOr[Double] = js.native
  
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: String | IBankAccount | ICardHash | IAccountCreationOptions = js.native
}
object IPaymentIntentTransferData {
  
  @scala.inline
  def apply(destination: String | IBankAccount | ICardHash | IAccountCreationOptions): IPaymentIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentIntentTransferData]
  }
  
  @scala.inline
  implicit class IPaymentIntentTransferDataMutableBuilder[Self <: IPaymentIntentTransferData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setDestination(value: String | IBankAccount | ICardHash | IAccountCreationOptions): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
  }
}
