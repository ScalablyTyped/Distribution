package typings.stripe.mod.transfers

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.accounts.IAccount
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.bankAccounts.IBankAccount
import typings.stripe.mod.cards.ICardHash
import typings.stripe.mod.charges.ICharge
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.stripe_account
import typings.stripe.stripeStrings.transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransfer extends IResourceObject {
  
  /**
    * Amount (in cents) to be transferred to your bank account
    */
  var amount: Double = js.native
  
  /**
    * Amount in cents reversed (can be less than the amount attribute on the transfer if a partial reversal was issued).
    */
  var amount_reversed: Double = js.native
  
  var application_fee: String = js.native
  
  /**
    * Balance transaction that describes the impact of this transfer on your account balance. [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  
  /**
    * Time that this record of the transfer was first created.
    */
  var created: Double = js.native
  
  /**
    * Three-letter ISO currency code representing the currency.
    */
  var currency: String = js.native
  
  /**
    * Date the transfer is scheduled to arrive in the bank. This factors in delays like weekends or bank holidays.
    */
  var date: Double = js.native
  
  /**
    * Internal-only description of the transfer
    */
  var description: String = js.native
  
  /**
    * ID of the bank account, card, or Stripe account the transfer was sent to. [Expandable]
    */
  var destination: String | IBankAccount | ICardHash | IAccount = js.native
  
  /**
    * If the destination is a Stripe account, this will be the ID of the
    * payment that the destination account received for the transfer. [Expandable]
    */
  var destination_payment: String = js.native
  
  /**
    * Error code explaining reason for transfer failure if available. See Types of transfer failures for a
    * list of failure codes: https://stripe.com/docs/api#transfer_failures
    */
  var failure_code: String = js.native
  
  /**
    * Message to user further explaining reason for transfer failure if available.
    */
  var failure_message: String = js.native
  
  var livemode: Boolean = js.native
  
  var metadata: IMetadata = js.native
  
  /**
    * Value is "transfer"
    */
  @JSName("object")
  var object_ITransfer: transfer = js.native
  
  /**
    * A list of reversals that have been applied to the transfer.
    */
  var reversals: ITransferReversals = js.native
  
  /**
    * Whether or not the transfer has been fully reversed. If the transfer is only partially reversed, this attribute
    * will still be false.
    */
  var reversed: Boolean = js.native
  
  /**
    * ID of the charge (or other transaction) that was used to fund the
    * transfer. If null, the transfer was funded from the available
    * balance. [Expandable]
    */
  var source_transaction: String | ICharge = js.native
  
  /**
    * The source balance this transfer came from.
    * One of card, bank_account, bitcoin_receiver, or alipay_account
    */
  var source_type: SourceTypes = js.native
  
  /**
    * Extra information about a transfer to be displayed on the user's bank statement.
    */
  var statement_descriptor: String = js.native
  
  /**
    * Current status of the transfer (paid, pending, in_transit, canceled or failed).
    * A transfer will be pending until it is submitted to the bank, at which point
    * it becomes in_transit. It will then change to paid if the transaction goes
    * through. If it does not go through successfully, its status will change to
    * failed or canceled.
    */
  var status: Statuses = js.native
  
  /**
    * A string that identifies this transaction as part of a group.
    */
  var transfer_group: String | Null = js.native
  
  /**
    *  Can be card, bank_account, or stripe_account.
    */
  var `type`: card | bank_account | stripe_account = js.native
}
object ITransfer {
  
  @scala.inline
  def apply(
    amount: Double,
    amount_reversed: Double,
    application_fee: String,
    balance_transaction: String | IBalanceTransaction,
    created: Double,
    currency: String,
    date: Double,
    description: String,
    destination: String | IBankAccount | ICardHash | IAccount,
    destination_payment: String,
    failure_code: String,
    failure_message: String,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: transfer,
    reversals: ITransferReversals,
    reversed: Boolean,
    source_transaction: String | ICharge,
    source_type: SourceTypes,
    statement_descriptor: String,
    status: Statuses,
    `type`: card | bank_account | stripe_account
  ): ITransfer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_reversed = amount_reversed.asInstanceOf[js.Any], application_fee = application_fee.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], destination_payment = destination_payment.asInstanceOf[js.Any], failure_code = failure_code.asInstanceOf[js.Any], failure_message = failure_message.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reversals = reversals.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], source_transaction = source_transaction.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransfer]
  }
  
  @scala.inline
  implicit class ITransferOps[Self <: ITransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount_reversed(value: Double): Self = this.set("amount_reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee(value: String): Self = this.set("application_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance_transaction(value: String | IBalanceTransaction): Self = this.set("balance_transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String | IBankAccount | ICardHash | IAccount): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_payment(value: String): Self = this.set("destination_payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure_code(value: String): Self = this.set("failure_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure_message(value: String): Self = this.set("failure_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: transfer): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversals(value: ITransferReversals): Self = this.set("reversals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_transaction(value: String | ICharge): Self = this.set("source_transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_type(value: SourceTypes): Self = this.set("source_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Statuses): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: card | bank_account | stripe_account): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_group(value: String): Self = this.set("transfer_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_groupNull: Self = this.set("transfer_group", null)
  }
}
