package typings.stripe.stripeMod.paymentIntentsNs

import typings.stripe.stripeMod.accountsNs.IAccountCreationOptions
import typings.stripe.stripeMod.cardsNs.ICardHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentTransferData extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: String | typings.stripe.stripeMod.bankAccountsNs.IBankAccount | ICardHash | IAccountCreationOptions
}

object IPaymentIntentTransferData {
  @scala.inline
  def apply(
    destination: String | typings.stripe.stripeMod.bankAccountsNs.IBankAccount | ICardHash | IAccountCreationOptions
  ): IPaymentIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPaymentIntentTransferData]
  }
}

