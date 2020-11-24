package typings.stripe.mod.issuing.cardholders

import typings.stripe.anon.AddressName
import typings.stripe.anon.Pastdue
import typings.stripe.mod.IMetadata
import typings.stripe.mod.IResourceObject
import typings.stripe.stripeStrings.issuingDotcardholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Issuing Cardholder object represents an individual or business entity who is issued cards.
  */
@js.native
trait ICardholder extends IResourceObject {
  
  var authorization_controls: ICardholderAuthorizationControls = js.native
  
  /**
    * The cardholder’s billing address.
    */
  var billing: AddressName = js.native
  
  /**
    * Additional information about a business_entity cardholder.
    */
  var company: ICardholderBusinessEntity = js.native
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double = js.native
  
  /**
    * The cardholder’s email address.
    */
  var email: String = js.native
  
  /**
    * Additional information about an individual cardholder.
    */
  var individual: ICardholderIndividual = js.native
  
  /**
    * Whether or not this cardholder is the default cardholder.
    */
  var is_default: Boolean = js.native
  
  /**
    * Has the value true if the object exists in live mode or the value false if the object exists in test mode.
    */
  var livemode: Boolean = js.native
  
  /**
    * Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: IMetadata = js.native
  
  /**
    * The cardholder’s name. This will be printed on cards issued to them.
    */
  var name: String = js.native
  
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_ICardholder: issuingDotcardholder = js.native
  
  /**
    * The cardholder’s phone number.
    */
  var phone_number: String = js.native
  
  /**
    * Information about verification requirements for the cardholder, including what information needs to be collected.
    */
  var requirements: Pastdue = js.native
  
  /**
    * One of active, inactive, or blocked.
    */
  var status: CardholderStatus = js.native
  
  /**
    * One of individual or business_entity.
    */
  var `type`: CardholderType = js.native
}
object ICardholder {
  
  @scala.inline
  def apply(
    authorization_controls: ICardholderAuthorizationControls,
    billing: AddressName,
    company: ICardholderBusinessEntity,
    created: Double,
    email: String,
    id: String,
    individual: ICardholderIndividual,
    is_default: Boolean,
    livemode: Boolean,
    metadata: IMetadata,
    name: String,
    `object`: issuingDotcardholder,
    phone_number: String,
    requirements: Pastdue,
    status: CardholderStatus,
    `type`: CardholderType
  ): ICardholder = {
    val __obj = js.Dynamic.literal(authorization_controls = authorization_controls.asInstanceOf[js.Any], billing = billing.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], is_default = is_default.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone_number = phone_number.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardholder]
  }
  
  @scala.inline
  implicit class ICardholderOps[Self <: ICardholder] (val x: Self) extends AnyVal {
    
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
    def setBilling(value: AddressName): Self = this.set("billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompany(value: ICardholderBusinessEntity): Self = this.set("company", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividual(value: ICardholderIndividual): Self = this.set("individual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_default(value: Boolean): Self = this.set("is_default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: issuingDotcardholder): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirements(value: Pastdue): Self = this.set("requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: CardholderStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CardholderType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
