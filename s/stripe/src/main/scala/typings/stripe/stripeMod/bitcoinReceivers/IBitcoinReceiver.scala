package typings.stripe.stripeMod.bitcoinReceivers

import typings.stripe.stripeMod.IList
import typings.stripe.stripeMod.IMetadata
import typings.stripe.stripeMod.IResourceObject
import typings.stripe.stripeMod.IStripeSource
import typings.stripe.stripeStrings.bitcoin_receiver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Bitcoin receiver wraps a Bitcoin address so that a customer can push a payment to you. This guide describes how to use
  * receivers to create Bitcoin payments.
  */
trait IBitcoinReceiver
  extends IResourceObject
     with IStripeSource {
  /**
    * True when this bitcoin receiver has received a non-zero amount of bitcoin.
    */
  var active: Boolean
  /**
    * The amount of currency that you are collecting as payment.
    */
  var amount: Double
  /**
    * The amount of currency to which bitcoin_amount_received has been converted.
    */
  var amount_received: Double
  /**
    * The amount of bitcoin that the customer should send to fill the receiver. The bitcoin_amount is denominated in Satoshi:
    * there are 10^8 Satoshi in one bitcoin.
    */
  var bitcoin_amount: Double
  /**
    * The amount of bitcoin that has been sent by the customer to this receiver.
    */
  var bitcoin_amount_received: Double
  /**
    * This URI can be displayed to the customer as a clickable link (to activate their bitcoin client) or as a QR code (for mobile wallets).
    */
  var bitcoin_uri: Double
  var created: Double
  /**
    * Three-letter ISO currency code representing the currency to which the bitcoin will be converted.
    */
  var currency: String
  var customer: String
  var description: String
  /**
    * The customer's email address, set by the API call that creates the receiver.
    */
  var email: String
  /**
    * This flag is initially false and updates to true when the customer sends the bitcoin_amount to this receiver.
    */
  var filled: Boolean
  /**
    * A bitcoin address that is specific to this receiver. The customer can send bitcoin to this address to fill the receiver.
    */
  var inbound_address: String
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * Value is "bitcoin_receiver"
    */
  @JSName("object")
  var object_IBitcoinReceiver: bitcoin_receiver
  /**
    * The ID of the payment created from the receiver, if any. Hidden when viewing the receiver with a publishable key.
    */
  var payment: String
  /**
    * The refund address for these bitcoin, if communicated by the customer.
    */
  var refund_address: String
  /**
    * A list with one entry for each time that the customer sent bitcoin to the receiver. Hidden when viewing the
    * receiver with a publishable key.
    */
  var transactions: IList[IBitcoinTransaction]
  /**
    * This receiver contains uncaptured funds that can be used for a payment or refunded.
    */
  var uncaptured_funds: Boolean
  var used_for_payment: Boolean
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
}

