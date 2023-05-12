package typings.stripe.anon

import typings.stripe.stripeStrings.reportingDotreport_type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined stripe.stripe.Stripe.Response<stripe.stripe.Stripe.Reporting.ReportType> */
trait ResponseReportType extends StObject {
  
  /**
    * Most recent time for which this Report Type is available. Measured in seconds since the Unix epoch.
    */
  var data_available_end: Double
  
  /**
    * Earliest time for which this Report Type is available. Measured in seconds since the Unix epoch.
    */
  var data_available_start: Double
  
  /**
    * List of column names that are included by default when this Report Type gets run. (If the Report Type doesn't support the `columns` parameter, this will be null.)
    */
  var default_columns: js.Array[String] | Null
  
  /**
    * The [ID of the Report Type](https://stripe.com/docs/reporting/statements/api#available-report-types), such as `balance.summary.1`.
    */
  var id: String
  
  var lastResponse: ApiVersion
  
  /**
    * Has the value `true` if the object exists in live mode or the value `false` if the object exists in test mode.
    */
  var livemode: Boolean
  
  /**
    * Human-readable name of the Report Type
    */
  var name: String
  
  /**
    * String representing the object's type. Objects of the same type share the same value.
    */
  var `object`: reportingDotreport_type
  
  /**
    * When this Report Type was latest updated. Measured in seconds since the Unix epoch.
    */
  var updated: Double
  
  /**
    * Version of the Report Type. Different versions report with the same ID will have the same purpose, but may take different run parameters or have different result schemas.
    */
  var version: Double
}
object ResponseReportType {
  
  inline def apply(
    data_available_end: Double,
    data_available_start: Double,
    id: String,
    lastResponse: ApiVersion,
    livemode: Boolean,
    name: String,
    updated: Double,
    version: Double
  ): ResponseReportType = {
    val __obj = js.Dynamic.literal(data_available_end = data_available_end.asInstanceOf[js.Any], data_available_start = data_available_start.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastResponse = lastResponse.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], default_columns = null)
    __obj.updateDynamic("object")("reporting.report_type")
    __obj.asInstanceOf[ResponseReportType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseReportType] (val x: Self) extends AnyVal {
    
    inline def setData_available_end(value: Double): Self = StObject.set(x, "data_available_end", value.asInstanceOf[js.Any])
    
    inline def setData_available_start(value: Double): Self = StObject.set(x, "data_available_start", value.asInstanceOf[js.Any])
    
    inline def setDefault_columns(value: js.Array[String]): Self = StObject.set(x, "default_columns", value.asInstanceOf[js.Any])
    
    inline def setDefault_columnsNull: Self = StObject.set(x, "default_columns", null)
    
    inline def setDefault_columnsVarargs(value: String*): Self = StObject.set(x, "default_columns", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastResponse(value: ApiVersion): Self = StObject.set(x, "lastResponse", value.asInstanceOf[js.Any])
    
    inline def setLivemode(value: Boolean): Self = StObject.set(x, "livemode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObject(value: reportingDotreport_type): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
