package typings.stripe.anon

import typings.stripe.mod.Stripe.Account
import typings.stripe.mod.Stripe.Capability.FutureRequirements
import typings.stripe.mod.Stripe.Capability.Requirements
import typings.stripe.mod.Stripe.Capability.Status
import typings.stripe.stripeStrings.capability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Capability> */
trait ResponseCapability extends StObject {
  
  /**
    * The account for which the capability enables functionality.
    */
  var account: String | Account
  
  var future_requirements: js.UndefOr[FutureRequirements] = js.undefined
  
  /**
    * The identifier for the capability.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: capability
  
  /**
    * Whether the capability has been requested.
    */
  var requested: Boolean
  
  /**
    * Time at which the capability was requested. Measured in seconds since the Unix epoch.
    */
  var requested_at: Double | Null
  
  var requirements: js.UndefOr[Requirements] = js.undefined
  
  /**
    * The status of the capability. Can be `active`, `inactive`, `pending`, or `unrequested`.
    */
  var status: Status
}
object ResponseCapability {
  
  inline def apply(
    account: String | Account,
    id: String,
    lastResponse: ApiVersion,
    requested: Boolean,
    status: Status
  ): ResponseCapability = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], requested = requested.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], requested_at = null)
    __obj.updateDynamic("object")("capability")
    __obj.asInstanceOf[ResponseCapability]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseCapability] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: String | Account): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setFuture_requirements(value: FutureRequirements): Self = StObject.set(x, "future_requirements", value.asInstanceOf[js.Any])
    
    inline def setFuture_requirementsUndefined: Self = StObject.set(x, "future_requirements", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setObject(value: capability): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setRequested(value: Boolean): Self = StObject.set(x, "requested", value.asInstanceOf[js.Any])
    
    inline def setRequested_at(value: Double): Self = StObject.set(x, "requested_at", value.asInstanceOf[js.Any])
    
    inline def setRequested_atNull: Self = StObject.set(x, "requested_at", null)
    
    inline def setRequirements(value: Requirements): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    inline def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
