package typings.stripe.mod.charges

import typings.stripe.anon.AmountDestination
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.cards.ICardSourceCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChargeCreationOptions
  extends StObject
     with IDataOptionsWithMetadata {
  
  /**
    * A positive integer in the smallest currency unit (e.g 100 cents to charge
    * $1.00, or 1 to charge ¥1, a 0-decimal currency) representing how much to
    * charge the card. The minimum amount is £0.50 (or equivalent in charge
    * currency).
    */
  var amount: Double
  
  /**
    * A fee in cents that will be applied to the charge and transferred
    * to the application owner’s Stripe account. The request must be
    * made with an OAuth key or the Stripe-Account header in order to
    * take an application fee. For more information, see the
    * application fees documentation.
    */
  var application_fee_amount: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether or not to immediately capture the charge. When false, the charge
    * issues an authorization (or pre-authorization), and will need to be
    * captured later. Uncaptured charges expire in 7 days. For more information,
    * see authorizing charges and settling later.
    */
  var capture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  
  /**
    * The ID of an existing customer that will be charged in this request.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * An arbitrary string which you can attach to a charge object. It is displayed
    * when in the web interface alongside the charge. Note that if you use Stripe
    * to send automatic email receipts to your customers, your receipt emails
    * will include the description of the charge(s) that they are describing.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The Stripe account ID that these funds are intended for.
    * Automatically set if you use the destination parameter.
    * See the Connect documentation for details.
    *
    * Connect only.
    */
  var on_behalf_of: js.UndefOr[String] = js.undefined
  
  /**
    * The email address to send this charge's receipt to. The receipt will not be
    * sent until the charge is paid. If this charge is for a customer, the email
    * address specified here will override the customer's email address.
    * Receipts will not be sent for test mode charges. If receipt_email is
    * specified for a charge in live mode, a receipt will be sent regardless of your
    * email settings.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  
  /**
    * Shipping information for the charge. Helps prevent fraud on charges for
    * physical goods. For more information, see the Charge object
    * documentation.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.undefined
  
  /**
    * A payment source to be charged, such as a credit card. If you also pass a
    * customer ID, the source must be the ID of a source belonging to the
    * customer. Otherwise, if you do not pass a customer ID, the source you
    * provide must either be a token, like the ones returned by Stripe.js, or a
    * object containing a user's credit card details, with the options described
    * below. Although not all information is required, the extra info helps
    * prevent fraud.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptions] = js.undefined
  
  /**
    * For card charges, use statement_descriptor_suffix instead. Otherwise, you
    * can use this value as the complete description of a charge on your customers’
    * statements. Must contain at least one letter, maximum 22 characters.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  
  /**
    * Provides information about the charge that customers see on their statements.
    * Concatenated with the prefix (shortened descriptor) or statement descriptor
    * that’s set on the account to form the complete statement descriptor. Maximum
    * 22 characters for the concatenated descriptor.
    */
  var statement_descriptor_suffix: js.UndefOr[String] = js.undefined
  
  /**
    * An optional dictionary including the account to automatically transfer
    * to as part of a destination charge. See the Connect documentation for details.
    */
  var transfer_data: js.UndefOr[AmountDestination] = js.undefined
  
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    *
    * Connect only.
    */
  var transfer_group: js.UndefOr[String] = js.undefined
}
object IChargeCreationOptions {
  
  @scala.inline
  def apply(amount: Double, currency: String): IChargeCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChargeCreationOptions]
  }
  
  @scala.inline
  implicit class IChargeCreationOptionsMutableBuilder[Self <: IChargeCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee_amount(value: Double): Self = StObject.set(x, "application_fee_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication_fee_amountUndefined: Self = StObject.set(x, "application_fee_amount", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_behalf_ofUndefined: Self = StObject.set(x, "on_behalf_of", js.undefined)
    
    @scala.inline
    def setReceipt_email(value: String): Self = StObject.set(x, "receipt_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceipt_emailUndefined: Self = StObject.set(x, "receipt_email", js.undefined)
    
    @scala.inline
    def setShipping(value: IShippingInformation): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    @scala.inline
    def setSource(value: String | ICardSourceCreationOptions): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = StObject.set(x, "statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptorUndefined: Self = StObject.set(x, "statement_descriptor", js.undefined)
    
    @scala.inline
    def setStatement_descriptor_suffix(value: String): Self = StObject.set(x, "statement_descriptor_suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptor_suffixUndefined: Self = StObject.set(x, "statement_descriptor_suffix", js.undefined)
    
    @scala.inline
    def setTransfer_data(value: AmountDestination): Self = StObject.set(x, "transfer_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_dataUndefined: Self = StObject.set(x, "transfer_data", js.undefined)
    
    @scala.inline
    def setTransfer_group(value: String): Self = StObject.set(x, "transfer_group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_groupUndefined: Self = StObject.set(x, "transfer_group", js.undefined)
  }
}
