package typings.stripe.anon

import typings.stripe.mod.Stripe.Issuing.Cardholder.Billing
import typings.stripe.mod.Stripe.Issuing.Cardholder.Company
import typings.stripe.mod.Stripe.Issuing.Cardholder.Individual
import typings.stripe.mod.Stripe.Issuing.Cardholder.Requirements
import typings.stripe.mod.Stripe.Issuing.Cardholder.SpendingControls
import typings.stripe.mod.Stripe.Issuing.Cardholder.Status
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.issuingDotcardholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Issuing.Cardholder> */
trait ResponseCardholder extends StObject {
  
  var billing: Billing
  
  /**
    * Additional information about a `company` cardholder.
    */
  var company: Company | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The cardholder's email address.
    */
  var email: String | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * Additional information about an `individual` cardholder.
    */
  var individual: Individual | Null
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * The cardholder's name. This will be printed on cards issued to them.
    */
  var name: String
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: issuingDotcardholder
  
  /**
    * The cardholder's phone number. This is required for all cardholders who will be creating EU cards. See the [3D Secure documentation](https://stripe.com/docs/issuing/3d-secure#when-is-3d-secure-applied) for more details.
    */
  var phone_number: String | Null
  
  var requirements: Requirements
  
  /**
    * Rules that control spending across this cardholder's cards. Refer to our [documentation](https://stripe.com/docs/issuing/controls/spending-controls) for more details.
    */
  var spending_controls: SpendingControls | Null
  
  /**
    * Specifies whether to permit authorizations on this cardholder's cards.
    */
  var status: Status
  
  /**
    * One of `individual` or `company`. See [Choose a cardholder type](https://stripe.com/docs/issuing/other/choose-cardholder) for more details.
    */
  var `type`: typings.stripe.mod.Stripe.Issuing.Cardholder.Type
}
object ResponseCardholder {
  
  inline def apply(
    billing: Billing,
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    name: String,
    requirements: Requirements,
    status: Status,
    `type`: typings.stripe.mod.Stripe.Issuing.Cardholder.Type
  ): ResponseCardholder = {
    val __obj = js.Dynamic.literal(billing = billing.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requirements = requirements.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], company = null, email = null, individual = null, phone_number = null, spending_controls = null)
    __obj.updateDynamic("object")("issuing.cardholder")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseCardholder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCardholder] (val x: Self) extends AnyVal {
    
    inline def setBilling(value: Billing): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    inline def setCompany(value: Company): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
    
    inline def setCompanyNull: Self = StObject.set(x, "company", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndividual(value: Individual): Self = StObject.set(x, "individual", value.asInstanceOf[js.Any])
    
    inline def setIndividualNull: Self = StObject.set(x, "individual", null)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: issuingDotcardholder): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPhone_number(value: String): Self = StObject.set(x, "phone_number", value.asInstanceOf[js.Any])
    
    inline def setPhone_numberNull: Self = StObject.set(x, "phone_number", null)
    
    inline def setRequirements(value: Requirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setSpending_controls(value: SpendingControls): Self = StObject.set(x, "spending_controls", value.asInstanceOf[js.Any])
    
    inline def setSpending_controlsNull: Self = StObject.set(x, "spending_controls", null)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.stripe.mod.Stripe.Issuing.Cardholder.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
