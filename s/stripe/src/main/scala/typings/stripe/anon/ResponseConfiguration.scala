package typings.stripe.anon

import typings.stripe.mod.Stripe.Application
import typings.stripe.mod.Stripe.BillingPortal.Configuration.BusinessProfile
import typings.stripe.mod.Stripe.BillingPortal.Configuration.Features
import typings.stripe.mod.Stripe.BillingPortal.Configuration.LoginPage
import typings.stripe.mod.Stripe.DeletedApplication
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.billing_portalDotconfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.BillingPortal.Configuration> */
trait ResponseConfiguration extends StObject {
  
  /**
    * Whether the configuration is active and can be used to create portal sessions.
    */
  var active: Boolean
  
  /**
    * ID of the Connect Application that created the configuration.
    */
  var application: String | Application | DeletedApplication | Null
  
  var business_profile: BusinessProfile
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The default URL to redirect customers to when they click on the portal's link to return to your website. This can be [overriden](https://stripe.com/docs/api/customer_portal/sessions/create#create_portal_session-return_url) when creating the session.
    */
  var default_return_url: String | Null
  
  var features: Features
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * Whether the configuration is the default. If `true`, this configuration can be managed in the Dashboard and portal sessions will use this configuration unless it is overriden when creating the session.
    */
  var is_default: Boolean
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  var login_page: LoginPage
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: billing_portalDotconfiguration
  
  /**
    * Time at which the object was last updated. Measured in seconds since the Unix epoch.
    */
  var updated: Double
}
object ResponseConfiguration {
  
  inline def apply(
    active: Boolean,
    business_profile: BusinessProfile,
    created: Double,
    features: Features,
    id: String,
    is_default: Boolean,
    lastResponse: ApiVersion,
    livemode: Boolean,
    login_page: LoginPage,
    updated: Double
  ): ResponseConfiguration = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], business_profile = business_profile.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_default = is_default.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], login_page = login_page.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], application = null, default_return_url = null, metadata = null)
    __obj.updateDynamic("object")("billing_portal.configuration")
    __obj.asInstanceOf[ResponseConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseConfiguration] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: String | Application | DeletedApplication): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationNull: Self = StObject.set(x, "application", null)
    
    inline def setBusiness_profile(value: BusinessProfile): Self = StObject.set(x, "business_profile", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDefault_return_url(value: String): Self = StObject.set(x, "default_return_url", value.asInstanceOf[js.Any])
    
    inline def setDefault_return_urlNull: Self = StObject.set(x, "default_return_url", null)
    
    inline def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIs_default(value: Boolean): Self = StObject.set(x, "is_default", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setLogin_page(value: LoginPage): Self = StObject.set(x, "login_page", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setObject(value: billing_portalDotconfiguration): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
