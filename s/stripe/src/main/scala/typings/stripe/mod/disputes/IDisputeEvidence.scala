package typings.stripe.mod.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDisputeEvidence extends js.Object {
  
  /**
    * Any server or activity logs showing proof that the customer accessed or downloaded the purchased
    * digital product. This information should include IP addresses, corresponding timestamps, and any
    * detailed recorded activity.
    */
  var access_activity_log: js.UndefOr[String] = js.native
  
  /**
    * The billing address provided by the customer.
    */
  var billing_address: js.UndefOr[String] = js.native
  
  /**
    * (ID of a file) Your subscription cancellation policy, as shown to the customer. [Expandable]
    */
  var cancellation_policy: js.UndefOr[String] = js.native
  
  /**
    * An explanation of how and when the customer was shown your refund policy prior to purchase.
    */
  var cancellation_policy_disclosure: js.UndefOr[String] = js.native
  
  /**
    * A justification for why the customer's subscription was not canceled.
    */
  var cancellation_rebuttal: js.UndefOr[String] = js.native
  
  /**
    * (ID of a file) Any communication with the customer that you feel is relevant to your case (for
    * example emails proving that they received the product or service, or demonstrating their use of or
    * satisfaction with the product or service).
    */
  var customer_communication: js.UndefOr[String] = js.native
  
  /**
    * The email address of the customer.
    */
  var customer_email_address: js.UndefOr[String] = js.native
  
  /**
    * The name of the customer.
    */
  var customer_name: js.UndefOr[String] = js.native
  
  /**
    * The IP address that the customer used when making the purchase.
    */
  var customer_purchase_ip: js.UndefOr[String] = js.native
  
  /**
    * (ID of a file) A relevant document or contract showing the customer's signature. [Expandable]
    */
  var customer_signature: js.UndefOr[String] = js.native
  
  /**
    * (ID of a file) Documentation for the prior charge that can uniquely identify the charge,
    * such as a receipt, shipping label, work order, etc. This document should be paired with a similar
    * document from the disputed payment that proves the two payments are separate. [Expandable]
    */
  var duplicate_charge_documentation: js.UndefOr[String] = js.native
  
  /**
    * An explanation of the difference between the disputed charge and the prior charge that appears to be a duplicate.
    */
  var duplicate_charge_explanation: js.UndefOr[String] = js.native
  
  /**
    * The Stripe ID for the prior charge which appears to be a duplicate of the disputed charge.
    */
  var duplicate_charge_id: js.UndefOr[String] = js.native
  
  /**
    * A description of the product or service which was sold.
    */
  var product_description: js.UndefOr[String] = js.native
  
  /**
    * (ID of a file) Any receipt or message sent to the customer notifying them of the charge. [Expandable]
    */
  var receipt: js.UndefOr[String] = js.native
  
  /**
    * (ID of a file) Your refund policy, as shown to the customer. [Expandable]
    */
  var refund_policy: js.UndefOr[String] = js.native
  
  /**
    * Documentation demonstrating that the customer was shown your refund policy prior to purchase.
    */
  var refund_policy_disclosure: js.UndefOr[String] = js.native
  
  /**
    * A justification for why the customer is not entitled to a refund.
    */
  var refund_refusal_explanation: js.UndefOr[String] = js.native
  
  /**
    * The date on which the customer received or began receiving the purchased service, in a clear human-readable format.
    */
  var service_date: js.UndefOr[String] = js.native
  
  /**
    * (ID of a file) Documentation showing proof that a service was provided to the customer. This could
    * include a copy of a signed contract, work order, or other form of written agreement.
    */
  var service_documentation: js.UndefOr[String] = js.native
  
  /**
    * The address to which a physical product was shipped. You should try to include as much complete address information as possible.
    */
  var shipping_address: js.UndefOr[String] = js.native
  
  /**
    * The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. If multiple carriers were used
    * for this purchase, please separate them with commas.
    */
  var shipping_carrier: js.UndefOr[String] = js.native
  
  /**
    * The date on which a physical product began its route to the shipping address, in a clear human-readable format.
    */
  var shipping_date: js.UndefOr[String] = js.native
  
  /**
    * (ID of a file) Documentation showing proof that a product was shipped to the customer at the same address
    * the customer provided to you. This could include a copy of the shipment receipt, shipping label, etc, and should
    * show the full shipping address of the customer, if possible. [Expandable]
    */
  var shipping_documentation: js.UndefOr[String] = js.native
  
  /**
    * The tracking number for a physical product, obtained from the delivery service. If multiple tracking numbers
    * were generated for this purchase, please separate them with commas.
    */
  var shipping_tracking_number: js.UndefOr[String] = js.native
  
  /**
    * (ID of a file) Any additional evidence or statements. [Expandable]
    */
  var uncategorized_file: js.UndefOr[String] = js.native
  
  /**
    * Any additional evidence or statements.
    */
  var uncategorized_text: js.UndefOr[String] = js.native
}
object IDisputeEvidence {
  
  @scala.inline
  def apply(): IDisputeEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDisputeEvidence]
  }
  
  @scala.inline
  implicit class IDisputeEvidenceOps[Self <: IDisputeEvidence] (val x: Self) extends AnyVal {
    
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
    def setAccess_activity_log(value: String): Self = this.set("access_activity_log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_activity_log: Self = this.set("access_activity_log", js.undefined)
    
    @scala.inline
    def setBilling_address(value: String): Self = this.set("billing_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilling_address: Self = this.set("billing_address", js.undefined)
    
    @scala.inline
    def setCancellation_policy(value: String): Self = this.set("cancellation_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellation_policy: Self = this.set("cancellation_policy", js.undefined)
    
    @scala.inline
    def setCancellation_policy_disclosure(value: String): Self = this.set("cancellation_policy_disclosure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellation_policy_disclosure: Self = this.set("cancellation_policy_disclosure", js.undefined)
    
    @scala.inline
    def setCancellation_rebuttal(value: String): Self = this.set("cancellation_rebuttal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancellation_rebuttal: Self = this.set("cancellation_rebuttal", js.undefined)
    
    @scala.inline
    def setCustomer_communication(value: String): Self = this.set("customer_communication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer_communication: Self = this.set("customer_communication", js.undefined)
    
    @scala.inline
    def setCustomer_email_address(value: String): Self = this.set("customer_email_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer_email_address: Self = this.set("customer_email_address", js.undefined)
    
    @scala.inline
    def setCustomer_name(value: String): Self = this.set("customer_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer_name: Self = this.set("customer_name", js.undefined)
    
    @scala.inline
    def setCustomer_purchase_ip(value: String): Self = this.set("customer_purchase_ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer_purchase_ip: Self = this.set("customer_purchase_ip", js.undefined)
    
    @scala.inline
    def setCustomer_signature(value: String): Self = this.set("customer_signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomer_signature: Self = this.set("customer_signature", js.undefined)
    
    @scala.inline
    def setDuplicate_charge_documentation(value: String): Self = this.set("duplicate_charge_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicate_charge_documentation: Self = this.set("duplicate_charge_documentation", js.undefined)
    
    @scala.inline
    def setDuplicate_charge_explanation(value: String): Self = this.set("duplicate_charge_explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicate_charge_explanation: Self = this.set("duplicate_charge_explanation", js.undefined)
    
    @scala.inline
    def setDuplicate_charge_id(value: String): Self = this.set("duplicate_charge_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplicate_charge_id: Self = this.set("duplicate_charge_id", js.undefined)
    
    @scala.inline
    def setProduct_description(value: String): Self = this.set("product_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct_description: Self = this.set("product_description", js.undefined)
    
    @scala.inline
    def setReceipt(value: String): Self = this.set("receipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceipt: Self = this.set("receipt", js.undefined)
    
    @scala.inline
    def setRefund_policy(value: String): Self = this.set("refund_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefund_policy: Self = this.set("refund_policy", js.undefined)
    
    @scala.inline
    def setRefund_policy_disclosure(value: String): Self = this.set("refund_policy_disclosure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefund_policy_disclosure: Self = this.set("refund_policy_disclosure", js.undefined)
    
    @scala.inline
    def setRefund_refusal_explanation(value: String): Self = this.set("refund_refusal_explanation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefund_refusal_explanation: Self = this.set("refund_refusal_explanation", js.undefined)
    
    @scala.inline
    def setService_date(value: String): Self = this.set("service_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService_date: Self = this.set("service_date", js.undefined)
    
    @scala.inline
    def setService_documentation(value: String): Self = this.set("service_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService_documentation: Self = this.set("service_documentation", js.undefined)
    
    @scala.inline
    def setShipping_address(value: String): Self = this.set("shipping_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_address: Self = this.set("shipping_address", js.undefined)
    
    @scala.inline
    def setShipping_carrier(value: String): Self = this.set("shipping_carrier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_carrier: Self = this.set("shipping_carrier", js.undefined)
    
    @scala.inline
    def setShipping_date(value: String): Self = this.set("shipping_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_date: Self = this.set("shipping_date", js.undefined)
    
    @scala.inline
    def setShipping_documentation(value: String): Self = this.set("shipping_documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_documentation: Self = this.set("shipping_documentation", js.undefined)
    
    @scala.inline
    def setShipping_tracking_number(value: String): Self = this.set("shipping_tracking_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping_tracking_number: Self = this.set("shipping_tracking_number", js.undefined)
    
    @scala.inline
    def setUncategorized_file(value: String): Self = this.set("uncategorized_file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncategorized_file: Self = this.set("uncategorized_file", js.undefined)
    
    @scala.inline
    def setUncategorized_text(value: String): Self = this.set("uncategorized_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncategorized_text: Self = this.set("uncategorized_text", js.undefined)
  }
}
