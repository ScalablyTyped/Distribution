package typings.stripe.anon

import typings.stripe.mod.Stripe.Identity.VerificationReport
import typings.stripe.mod.Stripe.Identity.VerificationSession.LastError
import typings.stripe.mod.Stripe.Identity.VerificationSession.Options
import typings.stripe.mod.Stripe.Identity.VerificationSession.Redaction
import typings.stripe.mod.Stripe.Identity.VerificationSession.Status
import typings.stripe.mod.Stripe.Identity.VerificationSession.VerifiedOutputs
import typings.stripe.mod.Stripe.Metadata
import typings.stripe.stripeStrings.identityDotverification_session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Identity.VerificationSession> */
trait ResponseVerificationSessi extends StObject {
  
  /**
    * The short-lived client secret used by Stripe.js to [show a verification modal](https://stripe.com/docs/js/identity/modal) inside your app. This client secret expires after 24 hours and can only be used once. Don't store it, log it, embed it in a URL, or expose it to anyone other than the user. Make sure that you have TLS enabled on any page that includes the client secret. Refer to our docs on [passing the client secret to the frontend](https://stripe.com/docs/identity/verification-sessions#client-secret) to learn more.
    */
  var client_secret: String | Null
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * If present, this property tells you the last error encountered when processing the verification.
    */
  var last_error: LastError | Null
  
  /**
    * ID of the most recent VerificationReport. [Learn more about accessing detailed verification results.](https://stripe.com/docs/identity/verification-sessions#results)
    */
  var last_verification_report: String | VerificationReport | Null
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Set of [key-value pairs](https://stripe.com/docs/api/metadata) that you can attach to an object. This can be useful for storing additional information about the object in a structured format.
    */
  var metadata: Metadata
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: identityDotverification_session
  
  /**
    * A set of options for the session's verification checks.
    */
  var options: Options | Null
  
  /**
    * Redaction status of this VerificationSession. If the VerificationSession is not redacted, this field will be null.
    */
  var redaction: Redaction | Null
  
  /**
    * Status of this VerificationSession. [Learn more about the lifecycle of sessions](https://stripe.com/docs/identity/how-sessions-work).
    */
  var status: Status
  
  /**
    * The type of [verification check](https://stripe.com/docs/identity/verification-checks) to be performed.
    */
  var `type`: typings.stripe.mod.Stripe.Identity.VerificationSession.Type | Null
  
  /**
    * The short-lived URL that you use to redirect a user to Stripe to submit their identity information. This URL expires after 48 hours and can only be used once. Don't store it, log it, send it in emails or expose it to anyone other than the user. Refer to our docs on [verifying identity documents](https://stripe.com/docs/identity/verify-identity-documents?platform=web&type=redirect) to learn how to redirect users to Stripe.
    */
  var url: String | Null
  
  /**
    * The user's verified data.
    */
  var verified_outputs: VerifiedOutputs | Null
}
object ResponseVerificationSessi {
  
  inline def apply(
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    metadata: Metadata,
    status: Status
  ): ResponseVerificationSessi = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], client_secret = null, last_error = null, last_verification_report = null, options = null, redaction = null, url = null, verified_outputs = null)
    __obj.updateDynamic("object")("identity.verification_session")
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[ResponseVerificationSessi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseVerificationSessi] (val x: Self) extends AnyVal {
    
    inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
    
    inline def setClient_secretNull: Self = StObject.set(x, "client_secret", null)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLast_error(value: LastError): Self = StObject.set(x, "last_error", value.asInstanceOf[js.Any])
    
    inline def setLast_errorNull: Self = StObject.set(x, "last_error", null)
    
    inline def setLast_verification_report(value: String | VerificationReport): Self = StObject.set(x, "last_verification_report", value.asInstanceOf[js.Any])
    
    inline def setLast_verification_reportNull: Self = StObject.set(x, "last_verification_report", null)
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setObject(value: identityDotverification_session): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setRedaction(value: Redaction): Self = StObject.set(x, "redaction", value.asInstanceOf[js.Any])
    
    inline def setRedactionNull: Self = StObject.set(x, "redaction", null)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.stripe.mod.Stripe.Identity.VerificationSession.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setVerified_outputs(value: VerifiedOutputs): Self = StObject.set(x, "verified_outputs", value.asInstanceOf[js.Any])
    
    inline def setVerified_outputsNull: Self = StObject.set(x, "verified_outputs", null)
  }
}
