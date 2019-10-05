package typings.stripe.stripeMod.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisputeEvidence extends js.Object {
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
    * (ID of a file upload) Your subscription cancellation policy, as shown to the customer. [Expandable]
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
    * (ID of a file upload) Any communication with the customer that you feel is relevant to your case (for
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
    * (ID of a file upload) A relevant document or contract showing the customer's signature. [Expandable]
    */
  var customer_signature: js.UndefOr[String] = js.undefined
  /**
    * (ID of a file upload) Documentation for the prior charge that can uniquely identify the charge,
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
    * (ID of a file upload) Any receipt or message sent to the customer notifying them of the charge. [Expandable]
    */
  var receipt: js.UndefOr[String] = js.undefined
  /**
    * (ID of a file upload) Your refund policy, as shown to the customer. [Expandable]
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
    * (ID of a file upload) Documentation showing proof that a service was provided to the customer. This could
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
    * (ID of a file upload) Documentation showing proof that a product was shipped to the customer at the same address
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
    * (ID of a file upload) Any additional evidence or statements. [Expandable]
    */
  var uncategorized_file: js.UndefOr[String] = js.undefined
  /**
    * Any additional evidence or statements.
    */
  var uncategorized_text: js.UndefOr[String] = js.undefined
}

object IDisputeEvidence {
  @scala.inline
  def apply(
    access_activity_log: String = null,
    billing_address: String = null,
    cancellation_policy: String = null,
    cancellation_policy_disclosure: String = null,
    cancellation_rebuttal: String = null,
    customer_communication: String = null,
    customer_email_address: String = null,
    customer_name: String = null,
    customer_purchase_ip: String = null,
    customer_signature: String = null,
    duplicate_charge_documentation: String = null,
    duplicate_charge_explanation: String = null,
    duplicate_charge_id: String = null,
    product_description: String = null,
    receipt: String = null,
    refund_policy: String = null,
    refund_policy_disclosure: String = null,
    refund_refusal_explanation: String = null,
    service_date: String = null,
    service_documentation: String = null,
    shipping_address: String = null,
    shipping_carrier: String = null,
    shipping_date: String = null,
    shipping_documentation: String = null,
    shipping_tracking_number: String = null,
    uncategorized_file: String = null,
    uncategorized_text: String = null
  ): IDisputeEvidence = {
    val __obj = js.Dynamic.literal()
    if (access_activity_log != null) __obj.updateDynamic("access_activity_log")(access_activity_log)
    if (billing_address != null) __obj.updateDynamic("billing_address")(billing_address)
    if (cancellation_policy != null) __obj.updateDynamic("cancellation_policy")(cancellation_policy)
    if (cancellation_policy_disclosure != null) __obj.updateDynamic("cancellation_policy_disclosure")(cancellation_policy_disclosure)
    if (cancellation_rebuttal != null) __obj.updateDynamic("cancellation_rebuttal")(cancellation_rebuttal)
    if (customer_communication != null) __obj.updateDynamic("customer_communication")(customer_communication)
    if (customer_email_address != null) __obj.updateDynamic("customer_email_address")(customer_email_address)
    if (customer_name != null) __obj.updateDynamic("customer_name")(customer_name)
    if (customer_purchase_ip != null) __obj.updateDynamic("customer_purchase_ip")(customer_purchase_ip)
    if (customer_signature != null) __obj.updateDynamic("customer_signature")(customer_signature)
    if (duplicate_charge_documentation != null) __obj.updateDynamic("duplicate_charge_documentation")(duplicate_charge_documentation)
    if (duplicate_charge_explanation != null) __obj.updateDynamic("duplicate_charge_explanation")(duplicate_charge_explanation)
    if (duplicate_charge_id != null) __obj.updateDynamic("duplicate_charge_id")(duplicate_charge_id)
    if (product_description != null) __obj.updateDynamic("product_description")(product_description)
    if (receipt != null) __obj.updateDynamic("receipt")(receipt)
    if (refund_policy != null) __obj.updateDynamic("refund_policy")(refund_policy)
    if (refund_policy_disclosure != null) __obj.updateDynamic("refund_policy_disclosure")(refund_policy_disclosure)
    if (refund_refusal_explanation != null) __obj.updateDynamic("refund_refusal_explanation")(refund_refusal_explanation)
    if (service_date != null) __obj.updateDynamic("service_date")(service_date)
    if (service_documentation != null) __obj.updateDynamic("service_documentation")(service_documentation)
    if (shipping_address != null) __obj.updateDynamic("shipping_address")(shipping_address)
    if (shipping_carrier != null) __obj.updateDynamic("shipping_carrier")(shipping_carrier)
    if (shipping_date != null) __obj.updateDynamic("shipping_date")(shipping_date)
    if (shipping_documentation != null) __obj.updateDynamic("shipping_documentation")(shipping_documentation)
    if (shipping_tracking_number != null) __obj.updateDynamic("shipping_tracking_number")(shipping_tracking_number)
    if (uncategorized_file != null) __obj.updateDynamic("uncategorized_file")(uncategorized_file)
    if (uncategorized_text != null) __obj.updateDynamic("uncategorized_text")(uncategorized_text)
    __obj.asInstanceOf[IDisputeEvidence]
  }
}

