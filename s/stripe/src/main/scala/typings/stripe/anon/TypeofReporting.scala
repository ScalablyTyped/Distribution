package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.stripe.mod.Stripe.Reporting.ReportRunsResource
import typings.stripe.mod.Stripe.Reporting.ReportTypesResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofReporting extends StObject {
  
  val ReportRun: Any
  
  val ReportRunCreateParams: TypeofReportRunCreatePara
  
  var ReportRunsResource: Instantiable0[typings.stripe.mod.Stripe.Reporting.ReportRunsResource]
  
  var ReportTypesResource: Instantiable0[typings.stripe.mod.Stripe.Reporting.ReportTypesResource]
}
object TypeofReporting {
  
  inline def apply(
    ReportRun: Any,
    ReportRunCreateParams: TypeofReportRunCreatePara,
    ReportRunsResource: Instantiable0[ReportRunsResource],
    ReportTypesResource: Instantiable0[ReportTypesResource]
  ): TypeofReporting = {
    val __obj = js.Dynamic.literal(ReportRun = ReportRun.asInstanceOf[js.Any], ReportRunCreateParams = ReportRunCreateParams.asInstanceOf[js.Any], ReportRunsResource = ReportRunsResource.asInstanceOf[js.Any], ReportTypesResource = ReportTypesResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofReporting]
  }
  
  extension [Self <: TypeofReporting](x: Self) {
    
    inline def setReportRun(value: Any): Self = StObject.set(x, "ReportRun", value.asInstanceOf[js.Any])
    
    inline def setReportRunCreateParams(value: TypeofReportRunCreatePara): Self = StObject.set(x, "ReportRunCreateParams", value.asInstanceOf[js.Any])
    
    inline def setReportRunsResource(value: Instantiable0[ReportRunsResource]): Self = StObject.set(x, "ReportRunsResource", value.asInstanceOf[js.Any])
    
    inline def setReportTypesResource(value: Instantiable0[ReportTypesResource]): Self = StObject.set(x, "ReportTypesResource", value.asInstanceOf[js.Any])
  }
}
