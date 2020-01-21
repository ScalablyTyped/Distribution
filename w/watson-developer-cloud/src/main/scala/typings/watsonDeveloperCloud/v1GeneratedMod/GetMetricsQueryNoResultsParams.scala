package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryNoResultsConstants.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getMetricsQueryNoResults` operation. */
trait GetMetricsQueryNoResultsParams extends js.Object {
  /** Metric is computed from data recorded before this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var end_time: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  /** The type of result to consider when calculating the metric. */
  var result_type: js.UndefOr[ResultType | String] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
  /** Metric is computed from data recorded after this timestamp; must be in `YYYY-MM-DDThh:mm:ssZ` format. */
  var start_time: js.UndefOr[String] = js.undefined
}

object GetMetricsQueryNoResultsParams {
  @scala.inline
  def apply(
    end_time: String = null,
    headers: js.Object = null,
    result_type: ResultType | String = null,
    return_response: js.UndefOr[Boolean] = js.undefined,
    start_time: String = null
  ): GetMetricsQueryNoResultsParams = {
    val __obj = js.Dynamic.literal()
    if (end_time != null) __obj.updateDynamic("end_time")(end_time.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (result_type != null) __obj.updateDynamic("result_type")(result_type.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.asInstanceOf[js.Any])
    if (start_time != null) __obj.updateDynamic("start_time")(start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricsQueryNoResultsParams]
  }
}

