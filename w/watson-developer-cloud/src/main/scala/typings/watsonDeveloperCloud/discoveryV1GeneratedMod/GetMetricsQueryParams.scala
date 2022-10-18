package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import typings.watsonDeveloperCloud.discoveryV1GeneratedMod.GetMetricsQueryConstants.ResultType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getMetricsQuery` operation. */
trait GetMetricsQueryParams extends StObject {
  
  /** Metric is computed from data recorded before this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var end_time: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The type of result to consider when calculating the metric. */
  var result_type: js.UndefOr[ResultType | String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Metric is computed from data recorded after this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var start_time: js.UndefOr[String] = js.undefined
}
object GetMetricsQueryParams {
  
  inline def apply(): GetMetricsQueryParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricsQueryParams]
  }
  
  extension [Self <: GetMetricsQueryParams](x: Self) {
    
    inline def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    inline def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setResult_type(value: ResultType | String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setResult_typeUndefined: Self = StObject.set(x, "result_type", js.undefined)
    
    inline def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    inline def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
  }
}
