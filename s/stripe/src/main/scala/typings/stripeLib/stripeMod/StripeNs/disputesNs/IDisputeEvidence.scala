package typings
package stripeLib.stripeMod.StripeNs.disputesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisputeEvidence extends js.Object {
  /**
    * Any server or activity logs showing proof that the customer accessed or downloaded the purchased
    * digital product. This information should include IP addresses, corresponding timestamps, and any
    * detailed recorded activity.
    */
  var access_activity_log: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The billing addess provided by the customer.
    */
  var billing_address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (ID of a file upload) Your subscription cancellation policy, as shown to the customer. [Expandable]
    */
  var cancellation_policy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An explanation of how and when the customer was shown your refund policy prior to purchase.
    */
  var cancellation_policy_disclosure: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A justification for why the customer's subscription was not canceled.
    */
  var cancellation_rebuttal: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (ID of a file upload) Any communication with the customer that you feel is relevant to your case (for
    * example emails proving that they received the product or service, or demonstrating their use of or
    * satisfaction with the product or service).
    */
  var customer_communication: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The email address of the customer.
    */
  var customer_email_address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the customer.
    */
  var customer_name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The IP address that the customer used when making the purchase.
    */
  var customer_purchase_ip: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (ID of a file upload) A relevant document or contract showing the customer's signature. [Expandable]
    */
  var customer_signature: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (ID of a file upload) Documentation for the prior charge that can uniquely identify the charge,
    * such as a receipt, shipping label, work order, etc. This document should be paired with a similar
    * document from the disputed payment that proves the two payments are separate. [Expandable]
    */
  var duplicate_charge_documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An explanation of the difference between the disputed charge and the prior charge that appears to be a duplicate.
    */
  var duplicate_charge_explanation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
    */
  var duplicate_charge_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A description of the product or service which was sold.
    */
  var product_description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (ID of a file upload) Any receipt or message sent to the customer notifying them of the charge. [Expandable]
    */
  var receipt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (ID of a file upload) Your refund policy, as shown to the customer. [Expandable]
    */
  var refund_policy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
    */
  var refund_policy_disclosure: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A justification for why the customer is not entitled to a refund.
    */
  var refund_refusal_explanation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date on which the customer received or began receiving the purchased service, in a clear human-readable format.
    */
  var service_date: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (ID of a file upload) Documentation showing proof that a service was provided to the customer. This could
    * include a copy of a signed contract, work order, or other form of written agreement.
    */
  var service_documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The address to which a physical product was shipped. You should try to include as much complete address information as possible.
    */
  var shipping_address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If multiple carriers were used
    * for this purchase, please separate them with commas.
    */
  var shipping_carrier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The date on which a physical product began its route to the shipping address, in a clear human-readable format.
    */
  var shipping_date: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (ID of a file upload) Documentation showing proof that a product was shipped to the customer at the same address
    * the customer provided to you. This could include a copy of the shipment receipt, shipping label, etc, and should
    * show the full shipping address of the customer, if possible. [Expandable]
    */
  var shipping_documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers
    * were generated for this purchase, please separate them with commas.
    */
  var shipping_tracking_number: js.UndefOr[java.lang.String] = js.undefined
  /**
    * (ID of a file upload) Any additional evidence or statements. [Expandable]
    */
  var uncategorized_file: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Any additional evidence or statements.
    */
  var uncategorized_text: js.UndefOr[java.lang.String] = js.undefined
}

