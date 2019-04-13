package typings
package stripeLib.stripeMod.paymentIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentIntentTransferData extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: java.lang.String | stripeLib.stripeMod.bankAccountsNs.IBankAccount | stripeLib.stripeMod.cardsNs.ICardHash | stripeLib.stripeMod.accountsNs.IAccountCreationOptions
}

object IPaymentIntentTransferData {
  @scala.inline
  def apply(
    destination: java.lang.String | stripeLib.stripeMod.bankAccountsNs.IBankAccount | stripeLib.stripeMod.cardsNs.ICardHash | stripeLib.stripeMod.accountsNs.IAccountCreationOptions
  ): IPaymentIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPaymentIntentTransferData]
  }
}

