package typings
package stripeLib.stripeMod.StripeNs.bitcoinReceiversNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Bitcoin receiver wraps a Bitcoin address so that a customer can push a payment to you. This guide describes how to use
  * receivers to create Bitcoin payments.
  */
trait IBitcoinReceiver
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * True when this bitcoin receiver has received a non-zero amount of bitcoin.
    */
  var active: scala.Boolean
  /**
    * The amount of currency that you are collecting as payment.
    */
  var amount: scala.Double
  /**
    * The amount of currency to which bitcoin_amount_received has been converted.
    */
  var amount_received: scala.Double
  /**
    * The amount of bitcoin that the customer should send to fill the receiver. The bitcoin_amount is denominated in Satoshi:
    * there are 10^8 Satoshi in one bitcoin.
    */
  var bitcoin_amount: scala.Double
  /**
    * The amount of bitcoin that has been sent by the customer to this receiver.
    */
  var bitcoin_amount_received: scala.Double
  /**
    * This URI can be displayed to the customer as a clickable link (to activate their bitcoin client) or as a QR code (for mobile wallets).
    */
  var bitcoin_uri: scala.Double
  var created: scala.Double
  /**
    * Three-letter ISO currency code representing the currency to which the bitcoin will be converted.
    */
  var currency: java.lang.String
  var customer: java.lang.String
  var description: java.lang.String
  /**
    * The customer's email address, set by the API call that creates the receiver.
    */
  var email: java.lang.String
  /**
    * This flag is initially false and updates to true when the customer sends the bitcoin_amount to this receiver.
    */
  var filled: scala.Boolean
  /**
    * A bitcoin address that is specific to this receiver. The customer can send bitcoin to this address to fill the receiver.
    */
  var inbound_address: java.lang.String
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
    * Value is "bitcoin_receiver"
    */
  @JSName("object")
  var object_IBitcoinReceiver: stripeLib.stripeLibStrings.bitcoin_receiver
  /**
    * The ID of the payment created from the receiver, if any. Hidden when viewing the receiver with a publishable key.
    */
  var payment: java.lang.String
  /**
    * The refund address for these bitcoin, if communicated by the customer.
    */
  var refund_address: java.lang.String
  /**
    * A list with one entry for each time that the customer sent bitcoin to the receiver. Hidden when viewing the
    * receiver with a publishable key.
    */
  var transactions: stripeLib.stripeMod.StripeNs.IList[IBitcoinTransaction]
  /**
    * This receiver contains uncaptured funds that can be used for a payment or refunded.
    */
  var uncaptured_funds: scala.Boolean
  var used_for_payment: scala.Boolean
}

object IBitcoinReceiver {
  @scala.inline
  def apply(
    active: scala.Boolean,
    amount: scala.Double,
    amount_received: scala.Double,
    bitcoin_amount: scala.Double,
    bitcoin_amount_received: scala.Double,
    bitcoin_uri: scala.Double,
    created: scala.Double,
    currency: java.lang.String,
    customer: java.lang.String,
    description: java.lang.String,
    email: java.lang.String,
    filled: scala.Boolean,
    id: java.lang.String,
    inbound_address: java.lang.String,
    livemode: scala.Boolean,
    metadata: stripeLib.stripeMod.StripeNs.IMetadata,
    `object`: stripeLib.stripeLibStrings.bitcoin_receiver,
    payment: java.lang.String,
    refund_address: java.lang.String,
    transactions: stripeLib.stripeMod.StripeNs.IList[IBitcoinTransaction],
    uncaptured_funds: scala.Boolean,
    used_for_payment: scala.Boolean
  ): IBitcoinReceiver = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("amount_received")(amount_received)
    __obj.updateDynamic("bitcoin_amount")(bitcoin_amount)
    __obj.updateDynamic("bitcoin_amount_received")(bitcoin_amount_received)
    __obj.updateDynamic("bitcoin_uri")(bitcoin_uri)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("customer")(customer)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("filled")(filled)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inbound_address")(inbound_address)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("payment")(payment)
    __obj.updateDynamic("refund_address")(refund_address)
    __obj.updateDynamic("transactions")(transactions)
    __obj.updateDynamic("uncaptured_funds")(uncaptured_funds)
    __obj.updateDynamic("used_for_payment")(used_for_payment)
    __obj.asInstanceOf[IBitcoinReceiver]
  }
}

