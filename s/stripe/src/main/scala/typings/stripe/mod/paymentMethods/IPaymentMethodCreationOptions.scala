package typings.stripe.mod.paymentMethods

import typings.stripe.anon.Address
import typings.stripe.anon.Cvc
import typings.stripe.anon.Token
import typings.stripe.mod.IMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentMethodCreationOptions extends StObject {
  
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: js.UndefOr[Address] = js.undefined
  
  /**
    * If this is a card PaymentMethod, this hash contains the user’s card details. For backwards compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay,
    * Amex Express Checkout, or legacy Checkout) into the card hash with format card: {token: "tok_visa"}. When creating with a card number, you must meet the requirements for
    * PCI compliance. We strongly recommend using Stripe.js instead of interacting with this API directly.
    */
  var card: js.UndefOr[Cvc | Token] = js.undefined
  
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: js.UndefOr[IMetadata] = js.undefined
  
  /**
    * The type of the PaymentMethod, one of: card and card_present. An additional hash is included on the PaymentMethod with a name matching this value.
    * It contains additional information specific to the PaymentMethod type.
    */
  var `type`: IPaymentMethodType
}
object IPaymentMethodCreationOptions {
  
  @scala.inline
  def apply(`type`: IPaymentMethodType): IPaymentMethodCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodCreationOptions]
  }
  
  @scala.inline
  implicit class IPaymentMethodCreationOptionsMutableBuilder[Self <: IPaymentMethodCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBilling_details(value: Address): Self = StObject.set(x, "billing_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBilling_detailsUndefined: Self = StObject.set(x, "billing_details", js.undefined)
    
    @scala.inline
    def setCard(value: Cvc | Token): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setType(value: IPaymentMethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
