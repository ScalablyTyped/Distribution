package typings.stripe.anon

import typings.stripe.mod.Stripe.File
import typings.stripe.mod.Stripe.Reporting.ReportRun.Parameters
import typings.stripe.stripeStrings.reportingDotreport_run
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Reporting.ReportRun> */
trait ResponseReportRun extends StObject {
  
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch.
    */
  var created: Double
  
  /**
    * If something should go wrong during the run, a message about the failure (populated when
    *  `status=failed`).
    */
  var error: String | Null
  
  /**
    * Unique identifier for the object.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * `true` if the report is run on live mode data and `false` if it is run on test mode data.
    */
  var livemode: Boolean
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: reportingDotreport_run
  
  var parameters: Parameters
  
  /**
    * The ID of the [report type](https://stripe.com/docs/reports/report-types) to run, such as `"balance.summary.1"`.
    */
  var report_type: String
  
  /**
    * The file object representing the result of the report run (populated when
    *  `status=succeeded`).
    */
  var result: File | Null
  
  /**
    * Status of this report run. This will be `pending` when the run is initially created.
    *  When the run finishes, this will be set to `succeeded` and the `result` field will be populated.
    *  Rarely, we may encounter an error, at which point this will be set to `failed` and the `error` field will be populated.
    */
  var status: String
  
  /**
    * Timestamp at which this run successfully finished (populated when
    *  `status=succeeded`). Measured in seconds since the Unix epoch.
    */
  var succeeded_at: Double | Null
}
object ResponseReportRun {
  
  inline def apply(
    created: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    parameters: Parameters,
    report_type: String,
    status: String
  ): ResponseReportRun = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], report_type = report_type.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], error = null, result = null, succeeded_at = null)
    __obj.updateDynamic("object")("reporting.report_run")
    __obj.asInstanceOf[ResponseReportRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseReportRun] (val x: Self) extends AnyVal {
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setObject(value: reportingDotreport_run): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setReport_type(value: String): Self = StObject.set(x, "report_type", value.asInstanceOf[js.Any])
    
    inline def setResult(value: File): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultNull: Self = StObject.set(x, "result", null)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSucceeded_at(value: Double): Self = StObject.set(x, "succeeded_at", value.asInstanceOf[js.Any])
    
    inline def setSucceeded_atNull: Self = StObject.set(x, "succeeded_at", null)
  }
}
