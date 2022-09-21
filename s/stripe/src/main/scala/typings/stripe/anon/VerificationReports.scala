package typings.stripe.anon

import typings.stripe.mod.Stripe.Identity.VerificationReportsResource
import typings.stripe.mod.Stripe.Identity.VerificationSessionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationReports extends StObject {
  
  var verificationReports: VerificationReportsResource
  
  var verificationSessions: VerificationSessionsResource
}
object VerificationReports {
  
  inline def apply(
    verificationReports: VerificationReportsResource,
    verificationSessions: VerificationSessionsResource
  ): VerificationReports = {
    val __obj = js.Dynamic.literal(verificationReports = verificationReports.asInstanceOf[js.Any], verificationSessions = verificationSessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationReports]
  }
  
  extension [Self <: VerificationReports](x: Self) {
    
    inline def setVerificationReports(value: VerificationReportsResource): Self = StObject.set(x, "verificationReports", value.asInstanceOf[js.Any])
    
    inline def setVerificationSessions(value: VerificationSessionsResource): Self = StObject.set(x, "verificationSessions", value.asInstanceOf[js.Any])
  }
}
