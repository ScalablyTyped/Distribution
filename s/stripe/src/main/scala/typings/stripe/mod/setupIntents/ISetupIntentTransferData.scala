package typings.stripe.mod.setupIntents

import typings.stripe.mod.accounts.IAccountCreationOptions
import typings.stripe.mod.bankAccounts.IBankAccount
import typings.stripe.mod.cards.ICardHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentTransferData extends js.Object {
  /**
    * The account (if any) the payment will be attributed to for tax reporting, and where funds from the payment will be transferred to upon payment success. [Expandable]
    */
  var destination: String | IBankAccount | ICardHash | IAccountCreationOptions
}

object ISetupIntentTransferData {
  @scala.inline
  def apply(destination: String | IBankAccount | ICardHash | IAccountCreationOptions): ISetupIntentTransferData = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISetupIntentTransferData]
  }
}

