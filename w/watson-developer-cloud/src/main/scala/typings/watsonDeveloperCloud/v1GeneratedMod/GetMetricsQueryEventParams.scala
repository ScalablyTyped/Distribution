package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryEventConstants.ResultType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `getMetricsQueryEvent` operation. */
@js.native
trait GetMetricsQueryEventParams extends StObject {
  
  /** Metric is computed from data recorded before this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var end_time: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** The type of result to consider when calculating the metric. */
  var result_type: js.UndefOr[ResultType | String] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Metric is computed from data recorded after this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var start_time: js.UndefOr[String] = js.native
}
object GetMetricsQueryEventParams {
  
  @scala.inline
  def apply(): GetMetricsQueryEventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMetricsQueryEventParams]
  }
  
  @scala.inline
  implicit class GetMetricsQueryEventParamsMutableBuilder[Self <: GetMetricsQueryEventParams] (val x: Self) extends AnyVal {
    
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
