package typings.stripe.mod.applicationFees

import typings.stripe.mod.IResourceObject
import typings.stripe.mod.accounts.IAccount
import typings.stripe.mod.applications.IApplication
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.charges.ICharge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationFee extends IResourceObject {
  /**
    * ID of the Stripe account this fee was taken from. [Expandable]
    */
  var account: String | IAccount
  /**
    * Amount earned, in cents/pence.
    */
  var amount: Double
  /**
    * Positive integer or zero
    */
  var amount_refunded: Double
  /**
    * ID of the Connect Application that earned the fee. [Expandable]
    */
  var application: String | IApplication
  /**
    * Balance transaction that describes the impact of this collected application
    * fee on your account balance (not including refunds). [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction
  /**
    * ID of the charge that the application fee was taken from. [Expandable]
    */
  var charge: String | ICharge
  var created: Double
  /**
    * Three-letter ISO code representing the currency of the charge.
    */
  var currency: String
  var livemode: Boolean
  /**
    * ID of the corresponding charge on the platform account, if this fee was the
    * result of a charge using the destination parameter. [Expandable]
    */
  var originating_transaction: String
  /**
    * Whether or not the fee has been fully refunded. If the fee is only partially
    * refunded, this attribute will still be false.
    */
  var refunded: Boolean
  /**
    * A list of refunds that have been applied to the fee.
    */
  var refunds: IApplicationFeeRefunds
}

object IApplicationFee {
  @scala.inline
  def apply(
    account: String | IAccount,
    amount: Double,
    amount_refunded: Double,
    application: String | IApplication,
    balance_transaction: String | IBalanceTransaction,
    charge: String | ICharge,
    created: Double,
    currency: String,
    id: String,
    livemode: Boolean,
    `object`: String,
    originating_transaction: String,
    refunded: Boolean,
    refunds: IApplicationFeeRefunds
  ): IApplicationFee = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], amount_refunded = amount_refunded.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], originating_transaction = originating_transaction.asInstanceOf[js.Any], refunded = refunded.asInstanceOf[js.Any], refunds = refunds.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationFee]
  }
}

