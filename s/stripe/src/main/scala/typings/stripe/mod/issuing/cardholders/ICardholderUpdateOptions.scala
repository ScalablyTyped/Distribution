package typings.stripe.mod.issuing.cardholders

import typings.std.Exclude
import typings.stripe.anon.AddressICardholderBillingAddress
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.stripeStrings.blocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICardholderUpdateOptions extends js.Object {
  
  /**
    * Spending rules that give you some control over how your cards can be used. Refer to our authorizations documentation for more details.
    */
  var authorization_controls: js.UndefOr[ICardholderAuthorizationControls] = js.native
  
  /**
    * The cardholder’s billing address.
    */
  var billing: js.UndefOr[AddressICardholderBillingAddress] = js.native
  
  /**
    * Additional information about a business_entity cardholder.
    */
  var company: js.UndefOr[ICardholderBusinessEntity] = js.native
  
  /**
    * The cardholder’s email address.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Additional information about an individual cardholder.
    */
  var individual: js.UndefOr[ICardholderIndividual] = js.native
  
  /**
    * Specifies whether to set this as the default cardholder.
    */
  var is_default: js.UndefOr[Boolean] = js.native
  
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. Individual keys can be unset by posting an empty value to them. All keys can be unset by posting an empty value to metadata.
    */
  var metadata: js.UndefOr[IOptionsMetadata] = js.native
  
  /**
    * The cardholder’s phone number.
    */
  var phone_number: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether to permit authorizations on this cardholder’s cards. Possible values are active or inactive.
    */
  var status: js.UndefOr[Exclude[CardholderStatus, blocked]] = js.native
}
object ICardholderUpdateOptions {
  
  @scala.inline
  def apply(): ICardholderUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICardholderUpdateOptions]
  }
  
  @scala.inline
  implicit class ICardholderUpdateOptionsOps[Self <: ICardholderUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthorization_controls(value: ICardholderAuthorizationControls): Self = this.set("authorization_controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorization_controls: Self = this.set("authorization_controls", js.undefined)
    
    @scala.inline
    def setBilling(value: AddressICardholderBillingAddress): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBilling: Self = this.set("billing", js.undefined)
    
    @scala.inline
    def setCompany(value: ICardholderBusinessEntity): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setIndividual(value: ICardholderIndividual): Self = this.set("individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividual: Self = this.set("individual", js.undefined)
    
    @scala.inline
    def setIs_default(value: Boolean): Self = this.set("is_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs_default: Self = this.set("is_default", js.undefined)
    
    @scala.inline
    def setMetadata(value: IOptionsMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone_number: Self = this.set("phone_number", js.undefined)
    
    @scala.inline
    def setStatus(value: Exclude[CardholderStatus, blocked]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
