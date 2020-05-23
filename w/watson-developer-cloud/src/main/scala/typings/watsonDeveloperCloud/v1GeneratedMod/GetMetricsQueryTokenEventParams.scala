package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getMetricsQueryTokenEvent` operation. */
trait GetMetricsQueryTokenEventParams extends js.Object {
  /** Number of results to return. The maximum for the **count** and **offset** values together in any one query is **10000**. */
  var count: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var return_response: js.UndefOr[Boolean] = js.undefined
}

object GetMetricsQueryTokenEventParams {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    headers: js.Object = null,
    return_response: js.UndefOr[Boolean] = js.undefined
  ): GetMetricsQueryTokenEventParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(return_response)) __obj.updateDynamic("return_response")(return_response.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricsQueryTokenEventParams]
  }
}

