package typings.stripe.mod

import typings.stripe.anon.Dueby
import typings.stripe.mod.balance.IBalanceTransaction
import typings.stripe.mod.charges.ICharge
import typings.stripe.stripeStrings.bank_cannot_process
import typings.stripe.stripeStrings.charge_refunded
import typings.stripe.stripeStrings.credit_not_processed
import typings.stripe.stripeStrings.debit_not_authorized
import typings.stripe.stripeStrings.dispute
import typings.stripe.stripeStrings.duplicate
import typings.stripe.stripeStrings.fraudulent
import typings.stripe.stripeStrings.general
import typings.stripe.stripeStrings.incorrect_account_details
import typings.stripe.stripeStrings.insufficient_funds
import typings.stripe.stripeStrings.lost
import typings.stripe.stripeStrings.needs_response
import typings.stripe.stripeStrings.product_not_received
import typings.stripe.stripeStrings.product_unacceptable
import typings.stripe.stripeStrings.response_disabled
import typings.stripe.stripeStrings.subscription_canceled
import typings.stripe.stripeStrings.under_review
import typings.stripe.stripeStrings.unrecognized
import typings.stripe.stripeStrings.warning_closed
import typings.stripe.stripeStrings.warning_needs_response
import typings.stripe.stripeStrings.warning_under_review
import typings.stripe.stripeStrings.won
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disputes {
  
  /**
    * A dispute occurs when a customer questions your charge with their bank or credit card company.
    * When a customer disputes your charge, you're given the opportunity to respond to the dispute with
    * evidence that shows the charge is legitimate. You can find more information about the dispute process
    * in our disputes FAQ: https://stripe.com/help/disputes
    */
  trait IDispute
    extends StObject
       with IResourceObject {
    
    /**
      * Disputed amount. Usually the amount of the charge, but can differ (usually because of currency
      * fluctuation or because only part of the order is disputed).
      */
    var amount: Double
    
    /**
      * List of zero, one, or two balance transactions that show funds withdrawn and reinstated to your
      * Stripe account as a result of this dispute.
      */
    var balance_transactions: js.Array[IBalanceTransaction]
    
    /**
      * ID of the charge that was disputed. [Expandable]
      */
    var charge: String | ICharge
    
    /**
      * Date dispute was opened
      */
    var created: Double
    
    /**
      * Three-letter ISO currency code representing the currency of the amount that was disputed.
      */
    var currency: String
    
    /**
      * Evidence provided to respond to a dispute. Updating any field in the hash will submit all fields in the hash for review.
      */
    var evidence: IDisputeEvidence
    
    /**
      * Information about the evidence submission.
      */
    var evidence_details: js.UndefOr[Dueby] = js.undefined
    
    /**
      * If true, it is still possible to refund the disputed payment. Once the payment has been fully
      * refunded, no further funds will be withdrawn from your Stripe account as a result of this dispute.
      */
    var is_charge_refundable: Boolean
    
    var livemode: Boolean
    
    var metadata: IMetadata
    
    /**
      * Value is 'dispute'
      */
    @JSName("object")
    var object_IDispute: dispute
    
    /**
      * Reason given by cardholder for dispute.
      * Possible values are duplicate, fraudulent, subscription_canceled, product_unacceptable,
      * product_not_received, unrecognized, credit_not_processed, incorrect_account_details,
      * insufficient_funds, bank_cannot_process, debit_not_authorized, general.
      * Read more about dispute reasons: https://stripe.com/help/disputes#reasons
      */
    var reason: duplicate | fraudulent | subscription_canceled | product_unacceptable | product_not_received | unrecognized | credit_not_processed | incorrect_account_details | insufficient_funds | bank_cannot_process | debit_not_authorized | general
    
    /**
      * Current status of dispute. Possible values are warning_needs_response, warning_under_review, warning_closed,
      * needs_response, response_disabled, under_review, charge_refunded, won, lost.
      */
    var status: warning_needs_response | warning_under_review | warning_closed | needs_response | response_disabled | under_review | charge_refunded | won | lost
  }
  object IDispute {
    
    @scala.inline
    def apply(
      amount: Double,
      balance_transactions: js.Array[IBalanceTransaction],
      charge: String | ICharge,
      created: Double,
      currency: String,
      evidence: IDisputeEvidence,
      id: String,
      is_charge_refundable: Boolean,
      livemode: Boolean,
      metadata: IMetadata,
      reason: duplicate | fraudulent | subscription_canceled | product_unacceptable | product_not_received | unrecognized | credit_not_processed | incorrect_account_details | insufficient_funds | bank_cannot_process | debit_not_authorized | general,
      status: warning_needs_response | warning_under_review | warning_closed | needs_response | response_disabled | under_review | charge_refunded | won | lost
    ): IDispute = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transactions = balance_transactions.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_charge_refundable = is_charge_refundable.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.updateDynamic("object")("dispute")
      __obj.asInstanceOf[IDispute]
    }
    
    @scala.inline
    implicit class IDisputeMutableBuilder[Self <: IDispute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transactions(value: js.Array[IBalanceTransaction]): Self = StObject.set(x, "balance_transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance_transactionsVarargs(value: IBalanceTransaction*): Self = StObject.set(x, "balance_transactions", js.Array(value :_*))
      
      @scala.inline
      def setCharge(value: String | ICharge): Self = StObject.set(x, "charge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvidence(value: IDisputeEvidence): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvidence_details(value: Dueby): Self = StObject.set(x, "evidence_details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvidence_detailsUndefined: Self = StObject.set(x, "evidence_details", js.undefined)
      
      @scala.inline
      def setIs_charge_refundable(value: Boolean): Self = StObject.set(x, "is_charge_refundable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: dispute): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(
        value: duplicate | fraudulent | subscription_canceled | product_unacceptable | product_not_received | unrecognized | credit_not_processed | incorrect_account_details | insufficient_funds | bank_cannot_process | debit_not_authorized | general
      ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(
        value: warning_needs_response | warning_under_review | warning_closed | needs_response | response_disabled | under_review | charge_refunded | won | lost
      ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDisputeEvidence extends StObject {
    
    /**
      * Any server or activity logs showing proof that the customer accessed or downloaded the purchased
      * digital product. This information should include IP addresses, corresponding timestamps, and any
      * detailed recorded activity.
      */
    var access_activity_log: js.UndefOr[String] = js.undefined
    
    /**
      * The billing address provided by the customer.
      */
    var billing_address: js.UndefOr[String] = js.undefined
    
    /**
      * (ID of a file) Your subscription cancellation policy, as shown to the customer. [Expandable]
      */
    var cancellation_policy: js.UndefOr[String] = js.undefined
    
    /**
      * An explanation of how and when the customer was shown your refund policy prior to purchase.
      */
    var cancellation_policy_disclosure: js.UndefOr[String] = js.undefined
    
    /**
      * A justification for why the customer's subscription was not canceled.
      */
    var cancellation_rebuttal: js.UndefOr[String] = js.undefined
    
    /**
      * (ID of a file) Any communication with the customer that you feel is relevant to your case (for
      * example emails proving that they received the product or service, or demonstrating their use of or
      * satisfaction with the product or service).
      */
    var customer_communication: js.UndefOr[String] = js.undefined
    
    /**
      * The email address of the customer.
      */
    var customer_email_address: js.UndefOr[String] = js.undefined
    
    /**
      * The name of the customer.
      */
    var customer_name: js.UndefOr[String] = js.undefined
    
    /**
      * The IP address that the customer used when making the purchase.
      */
    var customer_purchase_ip: js.UndefOr[String] = js.undefined
    
    /**
      * (ID of a file) A relevant document or contract showing the customer's signature. [Expandable]
      */
    var customer_signature: js.UndefOr[String] = js.undefined
    
    /**
      * (ID of a file) Documentation for the prior charge that can uniquely identify the charge,
      * such as a receipt, shipping label, work order, etc. This document should be paired with a similar
      * document from the disputed payment that proves the two payments are separate. [Expandable]
      */
    var duplicate_charge_documentation: js.UndefOr[String] = js.undefined
    
    /**
      * An explanation of the difference between the disputed charge and the prior charge that appears to be a duplicate.
      */
    var duplicate_charge_explanation: js.UndefOr[String] = js.undefined
    
    /**
      * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
      */
    var duplicate_charge_id: js.UndefOr[String] = js.undefined
    
    /**
      * A description of the product or service which was sold.
      */
    var product_description: js.UndefOr[String] = js.undefined
    
    /**
      * (ID of a file) Any receipt or message sent to the customer notifying them of the charge. [Expandable]
      */
    var receipt: js.UndefOr[String] = js.undefined
    
    /**
      * (ID of a file) Your refund policy, as shown to the customer. [Expandable]
      */
    var refund_policy: js.UndefOr[String] = js.undefined
    
    /**
      * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
      */
    var refund_policy_disclosure: js.UndefOr[String] = js.undefined
    
    /**
      * A justification for why the customer is not entitled to a refund.
      */
    var refund_refusal_explanation: js.UndefOr[String] = js.undefined
    
    /**
      * The date on which the customer received or began receiving the purchased service, in a clear human-readable format.
      */
    var service_date: js.UndefOr[String] = js.undefined
    
    /**
      * (ID of a file) Documentation showing proof that a service was provided to the customer. This could
      * include a copy of a signed contract, work order, or other form of written agreement.
      */
    var service_documentation: js.UndefOr[String] = js.undefined
    
    /**
      * The address to which a physical product was shipped. You should try to include as much complete address information as possible.
      */
    var shipping_address: js.UndefOr[String] = js.undefined
    
    /**
      * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If multiple carriers were used
      * for this purchase, please separate them with commas.
      */
    var shipping_carrier: js.UndefOr[String] = js.undefined
    
    /**
      * The date on which a physical product began its route to the shipping address, in a clear human-readable format.
      */
    var shipping_date: js.UndefOr[String] = js.undefined
    
    /**
      * (ID of a file) Documentation showing proof that a product was shipped to the customer at the same address
      * the customer provided to you. This could include a copy of the shipment receipt, shipping label, etc, and should
      * show the full shipping address of the customer, if possible. [Expandable]
      */
    var shipping_documentation: js.UndefOr[String] = js.undefined
    
    /**
      * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers
      * were generated for this purchase, please separate them with commas.
      */
    var shipping_tracking_number: js.UndefOr[String] = js.undefined
    
    /**
      * (ID of a file) Any additional evidence or statements. [Expandable]
      */
    var uncategorized_file: js.UndefOr[String] = js.undefined
    
    /**
      * Any additional evidence or statements.
      */
    var uncategorized_text: js.UndefOr[String] = js.undefined
  }
  object IDisputeEvidence {
    
    @scala.inline
    def apply(): IDisputeEvidence = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDisputeEvidence]
    }
    
    @scala.inline
    implicit class IDisputeEvidenceMutableBuilder[Self <: IDisputeEvidence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_activity_log(value: String): Self = StObject.set(x, "access_activity_log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_activity_logUndefined: Self = StObject.set(x, "access_activity_log", js.undefined)
      
      @scala.inline
      def setBilling_address(value: String): Self = StObject.set(x, "billing_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBilling_addressUndefined: Self = StObject.set(x, "billing_address", js.undefined)
      
      @scala.inline
      def setCancellation_policy(value: String): Self = StObject.set(x, "cancellation_policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancellation_policyUndefined: Self = StObject.set(x, "cancellation_policy", js.undefined)
      
      @scala.inline
      def setCancellation_policy_disclosure(value: String): Self = StObject.set(x, "cancellation_policy_disclosure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancellation_policy_disclosureUndefined: Self = StObject.set(x, "cancellation_policy_disclosure", js.undefined)
      
      @scala.inline
      def setCancellation_rebuttal(value: String): Self = StObject.set(x, "cancellation_rebuttal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancellation_rebuttalUndefined: Self = StObject.set(x, "cancellation_rebuttal", js.undefined)
      
      @scala.inline
      def setCustomer_communication(value: String): Self = StObject.set(x, "customer_communication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_communicationUndefined: Self = StObject.set(x, "customer_communication", js.undefined)
      
      @scala.inline
      def setCustomer_email_address(value: String): Self = StObject.set(x, "customer_email_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_email_addressUndefined: Self = StObject.set(x, "customer_email_address", js.undefined)
      
      @scala.inline
      def setCustomer_name(value: String): Self = StObject.set(x, "customer_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_nameUndefined: Self = StObject.set(x, "customer_name", js.undefined)
      
      @scala.inline
      def setCustomer_purchase_ip(value: String): Self = StObject.set(x, "customer_purchase_ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_purchase_ipUndefined: Self = StObject.set(x, "customer_purchase_ip", js.undefined)
      
      @scala.inline
      def setCustomer_signature(value: String): Self = StObject.set(x, "customer_signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomer_signatureUndefined: Self = StObject.set(x, "customer_signature", js.undefined)
      
      @scala.inline
      def setDuplicate_charge_documentation(value: String): Self = StObject.set(x, "duplicate_charge_documentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplicate_charge_documentationUndefined: Self = StObject.set(x, "duplicate_charge_documentation", js.undefined)
      
      @scala.inline
      def setDuplicate_charge_explanation(value: String): Self = StObject.set(x, "duplicate_charge_explanation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplicate_charge_explanationUndefined: Self = StObject.set(x, "duplicate_charge_explanation", js.undefined)
      
      @scala.inline
      def setDuplicate_charge_id(value: String): Self = StObject.set(x, "duplicate_charge_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuplicate_charge_idUndefined: Self = StObject.set(x, "duplicate_charge_id", js.undefined)
      
      @scala.inline
      def setProduct_description(value: String): Self = StObject.set(x, "product_description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProduct_descriptionUndefined: Self = StObject.set(x, "product_description", js.undefined)
      
      @scala.inline
      def setReceipt(value: String): Self = StObject.set(x, "receipt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptUndefined: Self = StObject.set(x, "receipt", js.undefined)
      
      @scala.inline
      def setRefund_policy(value: String): Self = StObject.set(x, "refund_policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefund_policyUndefined: Self = StObject.set(x, "refund_policy", js.undefined)
      
      @scala.inline
      def setRefund_policy_disclosure(value: String): Self = StObject.set(x, "refund_policy_disclosure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefund_policy_disclosureUndefined: Self = StObject.set(x, "refund_policy_disclosure", js.undefined)
      
      @scala.inline
      def setRefund_refusal_explanation(value: String): Self = StObject.set(x, "refund_refusal_explanation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefund_refusal_explanationUndefined: Self = StObject.set(x, "refund_refusal_explanation", js.undefined)
      
      @scala.inline
      def setService_date(value: String): Self = StObject.set(x, "service_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService_dateUndefined: Self = StObject.set(x, "service_date", js.undefined)
      
      @scala.inline
      def setService_documentation(value: String): Self = StObject.set(x, "service_documentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService_documentationUndefined: Self = StObject.set(x, "service_documentation", js.undefined)
      
      @scala.inline
      def setShipping_address(value: String): Self = StObject.set(x, "shipping_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_addressUndefined: Self = StObject.set(x, "shipping_address", js.undefined)
      
      @scala.inline
      def setShipping_carrier(value: String): Self = StObject.set(x, "shipping_carrier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_carrierUndefined: Self = StObject.set(x, "shipping_carrier", js.undefined)
      
      @scala.inline
      def setShipping_date(value: String): Self = StObject.set(x, "shipping_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_dateUndefined: Self = StObject.set(x, "shipping_date", js.undefined)
      
      @scala.inline
      def setShipping_documentation(value: String): Self = StObject.set(x, "shipping_documentation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_documentationUndefined: Self = StObject.set(x, "shipping_documentation", js.undefined)
      
      @scala.inline
      def setShipping_tracking_number(value: String): Self = StObject.set(x, "shipping_tracking_number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShipping_tracking_numberUndefined: Self = StObject.set(x, "shipping_tracking_number", js.undefined)
      
      @scala.inline
      def setUncategorized_file(value: String): Self = StObject.set(x, "uncategorized_file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncategorized_fileUndefined: Self = StObject.set(x, "uncategorized_file", js.undefined)
      
      @scala.inline
      def setUncategorized_text(value: String): Self = StObject.set(x, "uncategorized_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncategorized_textUndefined: Self = StObject.set(x, "uncategorized_text", js.undefined)
    }
  }
  
  trait IDisputeUpdateOptions
    extends StObject
       with IDataOptionsWithMetadata {
    
    /**
      * Evidence to upload to respond to a dispute. Updating any field in the hash will submit all fields in the hash for review.
      */
    var evidence: js.UndefOr[IDisputeEvidence] = js.undefined
  }
  object IDisputeUpdateOptions {
    
    @scala.inline
    def apply(): IDisputeUpdateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDisputeUpdateOptions]
    }
    
    @scala.inline
    implicit class IDisputeUpdateOptionsMutableBuilder[Self <: IDisputeUpdateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvidence(value: IDisputeEvidence): Self = StObject.set(x, "evidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvidenceUndefined: Self = StObject.set(x, "evidence", js.undefined)
    }
  }
}
