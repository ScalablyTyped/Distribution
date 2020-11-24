package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The response generated from a call to a **metrics** method that evaluates tokens. */
@js.native
trait MetricTokenResponse extends js.Object {
  
  /** Array of metric token aggregations. */
  var aggregations: js.UndefOr[js.Array[MetricTokenAggregation]] = js.native
}
object MetricTokenResponse {
  
  @scala.inline
  def apply(): MetricTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricTokenResponse]
  }
  
  @scala.inline
  implicit class MetricTokenResponseOps[Self <: MetricTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setAggregationsVarargs(value: MetricTokenAggregation*): Self = this.set("aggregations", js.Array(value :_*))
    
    @scala.inline
    def setAggregations(value: js.Array[MetricTokenAggregation]): Self = this.set("aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregations: Self = this.set("aggregations", js.undefined)
  }
}
