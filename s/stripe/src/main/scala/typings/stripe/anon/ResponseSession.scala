package typings.stripe.anon

import typings.stripe.mod.Stripe.BillingPortal.Configuration
import typings.stripe.mod.Stripe.BillingPortal.Session.Flow
import typings.stripe.mod.Stripe.BillingPortal.Session.Locale
import typings.stripe.stripeStrings.billing_portalDotsession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.BillingPortal.Session> */
trait ResponseSession extends StObject {
  
  /**
    * The configuration used by this session, describing the features available.
    */
  var configuration: String | Configuration
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * The ID of the customer for this session.
    */
  var customer: String
  
  /**
    * Information about a specific flow for the customer to go through. See the [docs](https://stripe.com/docs/customer-management/portal-deep-links) to learn more about using customer portal deep links and flows.
    */
  var flow: Flow | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * The IETF language tag of the locale Customer Portal is displayed in. If blank or auto, the customer's `preferred_locales` or browser's locale is used.
    */
  var locale: Locale | Null
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: billing_portalDotsession
  
  /**
    * The account for which the session was created on behalf of. When specified, only subscriptions and invoices with this `on_behalf_of` account appear in the portal. For more information, see the [docs](https://stripe.com/docs/connect/charges-transfers#on-behalf-of). Use the [Accounts API](https://stripe.com/docs/api/accounts/object#account_object-settings-branding) to modify the `on_behalf_of` account's branding settings, which the portal displays.
    */
  var on_behalf_of: String | Null
  
  /**
    * The URL to redirect customers to when they click on the portal's link to return to your website.
    */
  var return_url: String | Null
  
  /**
    * The short-lived URL of the session that gives customers access to the customer portal.
    */
  var url: String
}
object ResponseSession {
  
  inline def apply(
    configuration: String | Configuration,
    created: Double,
    customer: String,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    url: String
  ): ResponseSession = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], flow = null, locale = null, on_behalf_of = null, return_url = null)
    __obj.updateDynamic("object")("billing_portal.session")
    __obj.asInstanceOf[ResponseSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseSession] (val x: Self) extends AnyVal {
    
    inline def setConfiguration(value: String | Configuration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: Flow): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowNull: Self = StObject.set(x, "flow", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleNull: Self = StObject.set(x, "locale", null)
    
    inline def setObject(value: billing_portalDotsession): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_of(value: String): Self = StObject.set(x, "on_behalf_of", value.asInstanceOf[js.Any])
    
    inline def setOn_behalf_ofNull: Self = StObject.set(x, "on_behalf_of", null)
    
    inline def setReturn_url(value: String): Self = StObject.set(x, "return_url", value.asInstanceOf[js.Any])
    
    inline def setReturn_urlNull: Self = StObject.set(x, "return_url", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
