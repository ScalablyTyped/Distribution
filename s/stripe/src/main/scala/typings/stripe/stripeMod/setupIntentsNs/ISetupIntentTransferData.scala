package typings.stripe.stripeMod.setupIntentsNs

import typings.stripe.stripeMod.accountsNs.IAccountCreationOptions
import typings.stripe.stripeMod.cardsNs.ICardHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentTransferData extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: String | typings.stripe.stripeMod.bankAccountsNs.IBankAccount | ICardHash | IAccountCreationOptions
}

object ISetupIntentTransferData {
  @scala.inline
  def apply(
    destination: String | typings.stripe.stripeMod.bankAccountsNs.IBankAccount | ICardHash | IAccountCreationOptions
  ): ISetupIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISetupIntentTransferData]
  }
}

