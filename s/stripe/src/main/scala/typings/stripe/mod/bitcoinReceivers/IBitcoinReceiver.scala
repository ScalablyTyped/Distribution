package typings.stripe.mod.bitcoinReceivers

import typings.stripe.mod.IList
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.mod.IStripeSource
import typings.stripe.stripeStrings.bitcoin_receiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Bitcoin receiver wraps a Bitcoin address so that a customer can push a payment to you. This guide describes how to use
  * receivers to create Bitcoin payments.
  */
@js.native
trait IBitcoinReceiver
  extends IResourceObject
     with IStripeSource {
  /**
    * True when this bitcoin receiver has received a non-zero amount of bitcoin.
    */
  var active: Boolean = js.native
  /**
    * The amount of currency that you are collecting as payment.
    */
  var amount: Double = js.native
  /**
    * The amount of currency to which bitcoin_amount_received has been converted.
    */
  var amount_received: Double = js.native
  /**
    * The amount of bitcoin that the customer should send to fill the receiver. The bitcoin_amount is denominated in Satoshi:
    * there are 10^8 Satoshi in one bitcoin.
    */
  var bitcoin_amount: Double = js.native
  /**
    * The amount of bitcoin that has been sent by the customer to this receiver.
    */
  var bitcoin_amount_received: Double = js.native
  /**
    * This URI can be displayed to the customer as a clickable link (to activate their bitcoin client) or as a QR code (for mobile wallets).
    */
  var bitcoin_uri: Double = js.native
  var created: Double = js.native
  /**
    * Three-letter ISO currency code representing the currency to which the bitcoin will be converted.
    */
  var currency: String = js.native
  var customer: String = js.native
  var description: String = js.native
  /**
    * The customer's email address, set by the API call that creates the receiver.
    */
  var email: String = js.native
  /**
    * This flag is initially false and updates to true when the customer sends the bitcoin_amount to this receiver.
    */
  var filled: Boolean = js.native
  /**
    * A bitcoin address that is specific to this receiver. The customer can send bitcoin to this address to fill the receiver.
    */
  var inbound_address: String = js.native
  var livemode: Boolean = js.native
  var metadata: IMetadata = js.native
  /**
    * Value is "bitcoin_receiver"
    */
  @JSName("object")
  var object_IBitcoinReceiver: bitcoin_receiver = js.native
  /**
    * The ID of the payment created from the receiver, if any. Hidden when viewing the receiver with a publishable key.
    */
  var payment: String = js.native
  /**
    * The refund address for these bitcoin, if communicated by the customer.
    */
  var refund_address: String = js.native
  /**
    * A list with one entry for each time that the customer sent bitcoin to the receiver. Hidden when viewing the
    * receiver with a publishable key.
    */
  var transactions: IList[IBitcoinTransaction] = js.native
  /**
    * This receiver contains uncaptured funds that can be used for a payment or refunded.
    */
  var uncaptured_funds: Boolean = js.native
  var used_for_payment: Boolean = js.native
}

object IBitcoinReceiver {
  @scala.inline
  def apply(
    active: Boolean,
    amount: Double,
    amount_received: Double,
    bitcoin_amount: Double,
    bitcoin_amount_received: Double,
    bitcoin_uri: Double,
    created: Double,
    currency: String,
    customer: String,
    description: String,
    email: String,
    filled: Boolean,
    id: String,
    inbound_address: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: bitcoin_receiver,
    payment: String,
    refund_address: String,
    transactions: IList[IBitcoinTransaction],
    uncaptured_funds: Boolean,
    used_for_payment: Boolean
  ): IBitcoinReceiver = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], bitcoin_amount = bitcoin_amount.asInstanceOf[js.Any], bitcoin_amount_received = bitcoin_amount_received.asInstanceOf[js.Any], bitcoin_uri = bitcoin_uri.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inbound_address = inbound_address.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], refund_address = refund_address.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncaptured_funds = uncaptured_funds.asInstanceOf[js.Any], used_for_payment = used_for_payment.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBitcoinReceiver]
  }
  @scala.inline
  implicit class IBitcoinReceiverOps[Self <: IBitcoinReceiver] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount_received(value: Double): Self = this.set("amount_received", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitcoin_amount(value: Double): Self = this.set("bitcoin_amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitcoin_amount_received(value: Double): Self = this.set("bitcoin_amount_received", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitcoin_uri(value: Double): Self = this.set("bitcoin_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomer(value: String): Self = this.set("customer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilled(value: Boolean): Self = this.set("filled", value.asInstanceOf[js.Any])
    @scala.inline
    def setInbound_address(value: String): Self = this.set("inbound_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: bitcoin_receiver): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayment(value: String): Self = this.set("payment", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefund_address(value: String): Self = this.set("refund_address", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactions(value: IList[IBitcoinTransaction]): Self = this.set("transactions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUncaptured_funds(value: Boolean): Self = this.set("uncaptured_funds", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsed_for_payment(value: Boolean): Self = this.set("used_for_payment", value.asInstanceOf[js.Any])
  }
  
}

