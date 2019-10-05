package typings.stripe.stripeMod.paymentIntents

import typings.stripe.stripeMod.accounts.IAccountCreationOptions
import typings.stripe.stripeMod.cards.ICardHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentTransferData extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: String | typings.stripe.stripeMod.bankAccounts.IBankAccount | ICardHash | IAccountCreationOptions
}

object IPaymentIntentTransferData {
  @scala.inline
  def apply(
    destination: String | typings.stripe.stripeMod.bankAccounts.IBankAccount | ICardHash | IAccountCreationOptions
  ): IPaymentIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPaymentIntentTransferData]
  }
}

