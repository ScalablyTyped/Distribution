package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.Identity.VerificationReportsResource
import typings.stripe.mod.Stripe.Identity.VerificationSessionsResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofIdentity extends StObject {
  
  val VerificationReport: TypeofVerificationReport
  
  val VerificationReportListParams: Any
  
  var VerificationReportsResource: Instantiable0[typings.stripe.mod.Stripe.Identity.VerificationReportsResource]
  
  val VerificationSession: TypeofVerificationSession
  
  val VerificationSessionCreateParams: TypeofVerificationSessionOptions
  
  val VerificationSessionListParams: Any
  
  val VerificationSessionUpdateParams: TypeofVerificationSessionOptions
  
  var VerificationSessionsResource: Instantiable0[typings.stripe.mod.Stripe.Identity.VerificationSessionsResource]
}
object TypeofIdentity {
  
  inline def apply(
    VerificationReport: TypeofVerificationReport,
    VerificationReportListParams: Any,
    VerificationReportsResource: Instantiable0[VerificationReportsResource],
    VerificationSession: TypeofVerificationSession,
    VerificationSessionCreateParams: TypeofVerificationSessionOptions,
    VerificationSessionListParams: Any,
    VerificationSessionUpdateParams: TypeofVerificationSessionOptions,
    VerificationSessionsResource: Instantiable0[VerificationSessionsResource]
  ): TypeofIdentity = {
    val __obj = js.Dynamic.literal(VerificationReport = VerificationReport.asInstanceOf[js.Any], VerificationReportListParams = VerificationReportListParams.asInstanceOf[js.Any], VerificationReportsResource = VerificationReportsResource.asInstanceOf[js.Any], VerificationSession = VerificationSession.asInstanceOf[js.Any], VerificationSessionCreateParams = VerificationSessionCreateParams.asInstanceOf[js.Any], VerificationSessionListParams = VerificationSessionListParams.asInstanceOf[js.Any], VerificationSessionUpdateParams = VerificationSessionUpdateParams.asInstanceOf[js.Any], VerificationSessionsResource = VerificationSessionsResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofIdentity]
  }
  
  extension [Self <: TypeofIdentity](x: Self) {
    
    inline def setVerificationReport(value: TypeofVerificationReport): Self = StObject.set(x, "VerificationReport", value.asInstanceOf[js.Any])
    
    inline def setVerificationReportListParams(value: Any): Self = StObject.set(x, "VerificationReportListParams", value.asInstanceOf[js.Any])
    
    inline def setVerificationReportsResource(value: Instantiable0[VerificationReportsResource]): Self = StObject.set(x, "VerificationReportsResource", value.asInstanceOf[js.Any])
    
    inline def setVerificationSession(value: TypeofVerificationSession): Self = StObject.set(x, "VerificationSession", value.asInstanceOf[js.Any])
    
    inline def setVerificationSessionCreateParams(value: TypeofVerificationSessionOptions): Self = StObject.set(x, "VerificationSessionCreateParams", value.asInstanceOf[js.Any])
    
    inline def setVerificationSessionListParams(value: Any): Self = StObject.set(x, "VerificationSessionListParams", value.asInstanceOf[js.Any])
    
    inline def setVerificationSessionUpdateParams(value: TypeofVerificationSessionOptions): Self = StObject.set(x, "VerificationSessionUpdateParams", value.asInstanceOf[js.Any])
    
    inline def setVerificationSessionsResource(value: Instantiable0[VerificationSessionsResource]): Self = StObject.set(x, "VerificationSessionsResource", value.asInstanceOf[js.Any])
  }
}
