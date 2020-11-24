package typings.stripe.mod.payouts

import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.bankAccounts.IBankAccount
import typings.stripe.mod.cards.ICardHash
import typings.stripe.stripeStrings.alipay_account
import typings.stripe.stripeStrings.bank_account
import typings.stripe.stripeStrings.bitcoin_receiver
import typings.stripe.stripeStrings.canceled
import typings.stripe.stripeStrings.card
import typings.stripe.stripeStrings.failed
import typings.stripe.stripeStrings.in_transit
import typings.stripe.stripeStrings.paid
import typings.stripe.stripeStrings.payout
import typings.stripe.stripeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPayout extends IResourceObject {
  
  /**
    * Amount (in cents) to be transferred to your bank account or debit card
    */
  var amount: Double = js.native
  
  /**
    * Date the payout is expected to arrive in the bank. This factors in delays like weekends or bank holidays
    */
  var arrival_date: Double = js.native
  
  /**
    * Returns true if the payout was created by an automated payout schedule, and false if it was requested manually.
    */
  var automatic: Boolean = js.native
  
  /**
    * Balance transaction that describes the impact of this transfer on your account balance. [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction = js.native
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch
    */
  var created: Double = js.native
  
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    * https://stripe.com/docs/currencies
    */
  var currency: String = js.native
  
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users
    */
  var description: String = js.native
  
  /**
    * ID of the bank account or card the payout was sent to. [Expandable]
    */
  var destination: String | IBankAccount | ICardHash = js.native
  
  /**
    * If the payout failed or was canceled, this will be the ID of the balance
    * transaction that reversed the initial balance transaction, and puts the
    * funds from the failed payout back in your balance. [Expandable]
    */
  var failure_balance_transaction: String | IBalanceTransaction = js.native
  
  /**
    * Error code explaining reason for payout failure if available. See Types of payout failures for a
    * list of failure codes: https://stripe.com/docs/api#payout_failures
    */
  var failure_code: String = js.native
  
  /**
    * Message to user further explaining reason for the payout failure if available
    */
  var failure_message: String = js.native
  
  /**
    * Flag indicating whether the object exists in live mode or test mode
    */
  var livemode: Boolean = js.native
  
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional
    * information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  
  /**
    * The method used to send this payout, which can be standard or instant. instant is only supported
    * for payouts to debit cards.
    */
  var method: PayoutMethods = js.native
  
  /**
    * Value is "payout"
    */
  @JSName("object")
  var object_IPayout: payout = js.native
  
  /**
    * The source balance this payout came from.
    * One of card, bank_account, bitcoin_receiver, or alipay_account
    */
  var source_type: alipay_account | bank_account | bitcoin_receiver | card = js.native
  
  /**
    * Extra information about a payout to be displayed on the user's bank statement
    */
  var statement_descriptor: String = js.native
  
  /**
    * Current status of the payout (paid, pending, in_transit, canceled or failed).
    * A payout will be pending until it is submitted to the bank, at which point it
    * becomes in_transit. It will then change to paid if the transaction goes through.
    * If it does not go through successfully, its status will change to failed or canceled.
    */
  var status: canceled | failed | in_transit | paid | pending = js.native
  
  /**
    * Can be bank_account or card.
    */
  var `type`: PayoutTypes = js.native
}
object IPayout {
  
  @scala.inline
  def apply(
    amount: Double,
    arrival_date: Double,
    automatic: Boolean,
    balance_transaction: String | IBalanceTransaction,
    created: Double,
    currency: String,
    description: String,
    destination: String | IBankAccount | ICardHash,
    failure_balance_transaction: String | IBalanceTransaction,
    failure_code: String,
    failure_message: String,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    method: PayoutMethods,
    `object`: payout,
    source_type: alipay_account | bank_account | bitcoin_receiver | card,
    statement_descriptor: String,
    status: canceled | failed | in_transit | paid | pending,
    `type`: PayoutTypes
  ): IPayout = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], arrival_date = arrival_date.asInstanceOf[js.Any], automatic = automatic.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], failure_balance_transaction = failure_balance_transaction.asInstanceOf[js.Any], failure_code = failure_code.asInstanceOf[js.Any], failure_message = failure_message.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayout]
  }
  
  @scala.inline
  implicit class IPayoutOps[Self <: IPayout] (val x: Self) extends AnyVal {
    
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
    def setArrival_date(value: Double): Self = this.set("arrival_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatic(value: Boolean): Self = this.set("automatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBalance_transaction(value: String | IBalanceTransaction): Self = this.set("balance_transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination(value: String | IBankAccount | ICardHash): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure_balance_transaction(value: String | IBalanceTransaction): Self = this.set("failure_balance_transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure_code(value: String): Self = this.set("failure_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailure_message(value: String): Self = this.set("failure_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: PayoutMethods): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: payout): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource_type(value: alipay_account | bank_account | bitcoin_receiver | card): Self = this.set("source_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: canceled | failed | in_transit | paid | pending): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PayoutTypes): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
