package typings.stripe.anon

import typings.stripe.mod.Stripe.ApiList
import typings.stripe.mod.Stripe.CreditNote.DiscountAmount
import typings.stripe.mod.Stripe.CreditNote.Reason
import typings.stripe.mod.Stripe.CreditNote.ShippingCost
import typings.stripe.mod.Stripe.CreditNote.Status
import typings.stripe.mod.Stripe.CreditNote.TaxAmount
import typings.stripe.mod.Stripe.CreditNoteLineItem
import typings.stripe.mod.Stripe.Customer
import typings.stripe.mod.Stripe.CustomerBalanceTransaction
import typings.stripe.mod.Stripe.DeletedCustomer
import typings.stripe.mod.Stripe.Invoice
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.mod.Stripe.Refund
import typings.stripe.stripeStrings.credit_note
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.CreditNote> */
trait ResponseCreditNote extends StObject {
  
  /**
    * The integer amount in %s representing the total amount of the credit note, including tax.
    */
  var amount: Double
  
  /**
    * This is the sum of all the shipping amounts.
    */
  var amount_shipping: Double
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
    */
  var currency: String
  
  /**
    * ID of the customer.
    */
  var customer: String | Customer | DeletedCustomer
  
  /**
    * Customer balance transaction related to this credit note.
    */
  var customer_balance_transaction: String | CustomerBalanceTransaction | Null
  
  /**
    * The integer amount in %s representing the total amount of discount that was credited.
    */
  var discount_amount: Double
  
  /**
    * The aggregate amounts calculated per discount for all line items.
    */
  var discount_amounts: js.Array[DiscountAmount]
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * ID of the invoice.
    */
  var invoice: String | Invoice
  
  var lastResponse: ApiVersion
  
  /**
    * Line items that make up the credit note
    */
  var lines: ApiList[CreditNoteLineItem]
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Customer-facing text that appears on the credit note PDF.
    */
  var memo: String | Null
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * A unique number that identifies this particular credit note and appears on the PDF of the credit note and its associated invoice.
    */
  var number: String
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: credit_note
  
  /**
    * Amount that was credited outside of Stripe.
    */
  var out_of_band_amount: Double | Null
  
  /**
    * The link to download the PDF of the credit note.
    */
  var pdf: String
  
  /**
    * Reason for issuing this credit note, one of `duplicate`, `fraudulent`, `order_change`, or `product_unsatisfactory`
    */
  var reason: Reason | Null
  
  /**
    * Refund related to this credit note.
    */
  var refund: String | Refund | Null
  
  /**
    * The details of the cost of shipping, including the ShippingRate applied to the invoice.
    */
  var shipping_cost: ShippingCost | Null
  
  /**
    * Status of this credit note, one of `issued` or `void`. Learn more about [voiding credit notes](https://stripe.com/docs/billing/invoices/credit-notes#voiding).
    */
  var status: Status
  
  /**
    * The integer amount in %s representing the amount of the credit note, excluding exclusive tax and invoice level discounts.
    */
  var subtotal: Double
  
  /**
    * The integer amount in %s representing the amount of the credit note, excluding all tax and invoice level discounts.
    */
  var subtotal_excluding_tax: Double | Null
  
  /**
    * The aggregate amounts calculated per tax rate for all line items.
    */
  var tax_amounts: js.Array[TaxAmount]
  
  /**
    * The integer amount in %s representing the total amount of the credit note, including tax and all discount.
    */
  var total: Double
  
  /**
    * The integer amount in %s representing the total amount of the credit note, excluding tax, but including discounts.
    */
  var total_excluding_tax: Double | Null
  
  /**
    * Type of this credit note, one of `pre_payment` or `post_payment`. A `pre_payment` credit note means it was issued when the invoice was open. A `post_payment` credit note means it was issued when the invoice was paid.
    */
  var `type`: typings.stripe.mod.Stripe.CreditNote.Type
  
  /**
    * The time that the credit note was voided.
    */
  var voided_at: Double | Null
}
object ResponseCreditNote {
  
  inline def apply(
    amount: Double,
    amount_shipping: Double,
    created: Double,
    currency: String,
    customer: String | Customer | DeletedCustomer,
    discount_amount: Double,
    discount_amounts: js.Array[DiscountAmount],
    id: String,
    invoice: String | Invoice,
    lastResponse: ApiVersion,
    lines: ApiList[CreditNoteLineItem],
    livemode: Boolean,
    number: String,
    pdf: String,
    status: Status,
    subtotal: Double,
    tax_amounts: js.Array[TaxAmount],
    total: Double,
    `type`: typings.stripe.mod.Stripe.CreditNote.Type
  ): ResponseCreditNote = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_shipping = amount_shipping.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], discount_amount = discount_amount.asInstanceOf[js.Any], discount_amounts = discount_amounts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoice = invoice.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pdf = pdf.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subtotal = subtotal.asInstanceOf[js.Any], tax_amounts = tax_amounts.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], customer_balance_transaction = null, memo = null, metadata = null, out_of_band_amount = null, reason = null, refund = null, shipping_cost = null, subtotal_excluding_tax = null, total_excluding_tax = null, voided_at = null)
    __obj.updateDynamic("object")("credit_note")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCreditNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCreditNote] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmount_shipping(value: Double): Self = StObject.set(x, "amount_shipping", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String | Customer | DeletedCustomer): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomer_balance_transaction(value: String | CustomerBalanceTransaction): Self = StObject.set(x, "customer_balance_transaction", value.asInstanceOf[js.Any])
    
    inline def setCustomer_balance_transactionNull: Self = StObject.set(x, "customer_balance_transaction", null)
    
    inline def setDiscount_amount(value: Double): Self = StObject.set(x, "discount_amount", value.asInstanceOf[js.Any])
    
    inline def setDiscount_amounts(value: js.Array[DiscountAmount]): Self = StObject.set(x, "discount_amounts", value.asInstanceOf[js.Any])
    
    inline def setDiscount_amountsVarargs(value: DiscountAmount*): Self = StObject.set(x, "discount_amounts", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInvoice(value: String | Invoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLines(value: ApiList[CreditNoteLineItem]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    inline def setMemoNull: Self = StObject.set(x, "memo", null)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setObject(value: credit_note): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOut_of_band_amount(value: Double): Self = StObject.set(x, "out_of_band_amount", value.asInstanceOf[js.Any])
    
    inline def setOut_of_band_amountNull: Self = StObject.set(x, "out_of_band_amount", null)
    
    inline def setPdf(value: String): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Reason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setRefund(value: String | Refund): Self = StObject.set(x, "refund", value.asInstanceOf[js.Any])
    
    inline def setRefundNull: Self = StObject.set(x, "refund", null)
    
    inline def setShipping_cost(value: ShippingCost): Self = StObject.set(x, "shipping_cost", value.asInstanceOf[js.Any])
    
    inline def setShipping_costNull: Self = StObject.set(x, "shipping_cost", null)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubtotal(value: Double): Self = StObject.set(x, "subtotal", value.asInstanceOf[js.Any])
    
    inline def setSubtotal_excluding_tax(value: Double): Self = StObject.set(x, "subtotal_excluding_tax", value.asInstanceOf[js.Any])
    
    inline def setSubtotal_excluding_taxNull: Self = StObject.set(x, "subtotal_excluding_tax", null)
    
    inline def setTax_amounts(value: js.Array[TaxAmount]): Self = StObject.set(x, "tax_amounts", value.asInstanceOf[js.Any])
    
    inline def setTax_amountsVarargs(value: TaxAmount*): Self = StObject.set(x, "tax_amounts", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotal_excluding_tax(value: Double): Self = StObject.set(x, "total_excluding_tax", value.asInstanceOf[js.Any])
    
    inline def setTotal_excluding_taxNull: Self = StObject.set(x, "total_excluding_tax", null)
    
    inline def setType(value: typings.stripe.mod.Stripe.CreditNote.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVoided_at(value: Double): Self = StObject.set(x, "voided_at", value.asInstanceOf[js.Any])
    
    inline def setVoided_atNull: Self = StObject.set(x, "voided_at", null)
  }
}
