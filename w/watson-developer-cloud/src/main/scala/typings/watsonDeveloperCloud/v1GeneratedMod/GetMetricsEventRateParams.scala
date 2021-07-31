package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsEventRateConstants.ResultType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getMetricsEventRate` operation. */
trait GetMetricsEventRateParams extends StObject {
  
  /** Metric is computed from data recorded before this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var end_time: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** The type of result to consider when calculating the metric. */
  var result_type: js.UndefOr[ResultType | String] = js.undefined
  
  var return_response: js.UndefOr[Boolean] = js.undefined
  
  /** Metric is computed from data recorded after this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var start_time: js.UndefOr[String] = js.undefined
}
object GetMetricsEventRateParams {
  
  @scala.inline
  def apply(): GetMetricsEventRateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricsEventRateParams]
  }
  
  @scala.inline
  implicit class GetMetricsEventRateParamsMutableBuilder[Self <: GetMetricsEventRateParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_timeUndefined: Self = StObject.set(x, "end_time", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setResult_type(value: ResultType | String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult_typeUndefined: Self = StObject.set(x, "result_type", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
  }
}
