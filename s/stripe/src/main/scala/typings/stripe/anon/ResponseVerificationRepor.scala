package typings.stripe.anon

import typings.stripe.mod.Stripe.Identity.VerificationReport.Document
import typings.stripe.mod.Stripe.Identity.VerificationReport.IdNumber
import typings.stripe.mod.Stripe.Identity.VerificationReport.Options
import typings.stripe.mod.Stripe.Identity.VerificationReport.Selfie
import typings.stripe.stripeStrings.identityDotverification_report
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Identity.VerificationReport> */
trait ResponseVerificationRepor extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * Result from a document check
    */
  var document: js.UndefOr[Document] = js.undefined
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  /**
    * Result from an id_number check
    */
  var id_number: js.UndefOr[IdNumber] = js.undefined
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: identityDotverification_report
  
  var options: js.UndefOr[Options] = js.undefined
  
  /**
    * Result from a selfie check
    */
  var selfie: js.UndefOr[Selfie] = js.undefined
  
  /**
    * Type of report.
    */
  var `type`: js.UndefOr[typings.stripe.mod.Stripe.Identity.VerificationReport.Type] = js.undefined
  
  /**
    * ID of the VerificationSession that created this report.
    */
  var verification_session: String | Null
}
object ResponseVerificationRepor {
  
  inline def apply(created: Double, id: String, lastResponse: ApiVersion, livemode: Boolean): ResponseVerificationRepor = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], verification_session = null)
    __obj.updateDynamic("object")("identity.verification_report")
    __obj.asInstanceOf[ResponseVerificationRepor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseVerificationRepor] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setId_number(value: IdNumber): Self = StObject.set(x, "id_number", value.asInstanceOf[js.Any])
    
    inline def setId_numberUndefined: Self = StObject.set(x, "id_number", js.undefined)
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: identityDotverification_report): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSelfie(value: Selfie): Self = StObject.set(x, "selfie", value.asInstanceOf[js.Any])
    
    inline def setSelfieUndefined: Self = StObject.set(x, "selfie", js.undefined)
    
    inline def setType(value: typings.stripe.mod.Stripe.Identity.VerificationReport.Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVerification_session(value: String): Self = StObject.set(x, "verification_session", value.asInstanceOf[js.Any])
    
    inline def setVerification_sessionNull: Self = StObject.set(x, "verification_session", null)
  }
}
