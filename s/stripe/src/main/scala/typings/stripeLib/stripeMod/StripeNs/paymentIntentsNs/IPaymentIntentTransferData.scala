package typings
package stripeLib.stripeMod.StripeNs.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentTransferData extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: java.lang.String | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount | stripeLib.stripeMod.StripeNs.cardsNs.ICardHash | stripeLib.stripeMod.StripeNs.accountsNs.IAccountCreationOptions
}

object IPaymentIntentTransferData {
  @scala.inline
  def apply(
    destination: java.lang.String | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount | stripeLib.stripeMod.StripeNs.cardsNs.ICardHash | stripeLib.stripeMod.StripeNs.accountsNs.IAccountCreationOptions
  ): IPaymentIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPaymentIntentTransferData]
  }
}

