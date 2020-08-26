package typings.watsonDeveloperCloud.v1GeneratedMod

import typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryEventConstants.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Parameters for the `getMetricsQueryEvent` operation. */
@js.native
trait GetMetricsQueryEventParams extends js.Object {
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
  implicit class GetMetricsQueryEventParamsOps[Self <: GetMetricsQueryEventParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnd_time(value: String): Self = this.set("end_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd_time: Self = this.set("end_time", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setResult_type(value: ResultType | String): Self = this.set("result_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult_type: Self = this.set("result_type", js.undefined)
    @scala.inline
    def setReturn_response(value: Boolean): Self = this.set("return_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturn_response: Self = this.set("return_response", js.undefined)
    @scala.inline
    def setStart_time(value: String): Self = this.set("start_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart_time: Self = this.set("start_time", js.undefined)
  }
  
}

