package typings.stripe.mod

import typings.stripe.stripeStrings.bitcoin_receiver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitcoinReceivers {
  
  /**
    * A Bitcoin receiver wraps a Bitcoin address so that a customer can push a payment to you. This guide describes how to use
    * receivers to create Bitcoin payments.
    */
  trait IBitcoinReceiver
    extends StObject
       with IResourceObject
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
    
    inline def apply(
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
      payment: String,
      refund_address: String,
      transactions: IList[IBitcoinTransaction],
      uncaptured_funds: Boolean,
      used_for_payment: Boolean
    ): IBitcoinReceiver = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], bitcoin_amount = bitcoin_amount.asInstanceOf[js.Any], bitcoin_amount_received = bitcoin_amount_received.asInstanceOf[js.Any], bitcoin_uri = bitcoin_uri.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inbound_address = inbound_address.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], refund_address = refund_address.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncaptured_funds = uncaptured_funds.asInstanceOf[js.Any], used_for_payment = used_for_payment.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("bitcoin_receiver")
      __obj.asInstanceOf[IBitcoinReceiver]
    }
    
    extension [Self <: IBitcoinReceiver](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmount_received(value: Double): Self = StObject.set(x, "amount_received", value.asInstanceOf[js.Any])
      
      inline def setBitcoin_amount(value: Double): Self = StObject.set(x, "bitcoin_amount", value.asInstanceOf[js.Any])
      
      inline def setBitcoin_amount_received(value: Double): Self = StObject.set(x, "bitcoin_amount_received", value.asInstanceOf[js.Any])
      
      inline def setBitcoin_uri(value: Double): Self = StObject.set(x, "bitcoin_uri", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setInbound_address(value: String): Self = StObject.set(x, "inbound_address", value.asInstanceOf[js.Any])
      
      inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setObject(value: bitcoin_receiver): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setPayment(value: String): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
      
      inline def setRefund_address(value: String): Self = StObject.set(x, "refund_address", value.asInstanceOf[js.Any])
      
      inline def setTransactions(value: IList[IBitcoinTransaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      inline def setUncaptured_funds(value: Boolean): Self = StObject.set(x, "uncaptured_funds", value.asInstanceOf[js.Any])
      
      inline def setUsed_for_payment(value: Boolean): Self = StObject.set(x, "used_for_payment", value.asInstanceOf[js.Any])
    }
  }
  
  trait IBitcoinReceiverCreationOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * The amount of currency that you will be paid.
      */
    var amount: Double
    
    /**
      * The currency to which the bitcoin will be converted. You will be paid out in this currency. Only USD is currently supported.
      */
    var currency: String
    
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The email address of the customer.
      */
    var email: String
    
    /**
      * A flag that indicates whether you would like Stripe to automatically handle refunds for any mispayments to the receiver.
      */
    var refund_mispayments: js.UndefOr[Boolean] = js.undefined
  }
  object IBitcoinReceiverCreationOptions {
    
    inline def apply(amount: Double, currency: String, email: String): IBitcoinReceiverCreationOptions = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitcoinReceiverCreationOptions]
    }
    
    extension [Self <: IBitcoinReceiverCreationOptions](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setRefund_mispayments(value: Boolean): Self = StObject.set(x, "refund_mispayments", value.asInstanceOf[js.Any])
      
      inline def setRefund_mispaymentsUndefined: Self = StObject.set(x, "refund_mispayments", js.undefined)
    }
  }
  
  trait IBitcoinReceiverListOptions
    extends StObject
       with IListOptions {
    
    /**
      * Filter for active receivers.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Filter for filled receivers.
      */
    var filled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Filter for receivers with uncaptured funds.
      */
    var uncaptured_funds: js.UndefOr[Boolean] = js.undefined
  }
  object IBitcoinReceiverListOptions {
    
    inline def apply(): IBitcoinReceiverListOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBitcoinReceiverListOptions]
    }
    
    extension [Self <: IBitcoinReceiverListOptions](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
      
      inline def setUncaptured_funds(value: Boolean): Self = StObject.set(x, "uncaptured_funds", value.asInstanceOf[js.Any])
      
      inline def setUncaptured_fundsUndefined: Self = StObject.set(x, "uncaptured_funds", js.undefined)
    }
  }
  
  trait IBitcoinTransaction
    extends StObject
       with IResourceObject {
    
    /**
      * The amount of currency that the transaction was converted to in real-time.
      */
    var amount: Double
    
    /**
      * The amount of bitcoin contained in the transaction.
      */
    var bitcoin_amount: Double
    
    var created: Double
    
    /**
      * The currency to which this transaction was converted.
      */
    var currency: String
    
    /**
      * The receiver to which this transaction was sent.
      */
    var receiver: String
  }
  object IBitcoinTransaction {
    
    inline def apply(
      amount: Double,
      bitcoin_amount: Double,
      created: Double,
      currency: String,
      id: String,
      `object`: String,
      receiver: String
    ): IBitcoinTransaction = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], bitcoin_amount = bitcoin_amount.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], receiver = receiver.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBitcoinTransaction]
    }
    
    extension [Self <: IBitcoinTransaction](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBitcoin_amount(value: Double): Self = StObject.set(x, "bitcoin_amount", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setReceiver(value: String): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    }
  }
}
