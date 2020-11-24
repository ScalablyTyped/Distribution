package typings.teenyRequest.teenyStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeenyStatisticsOptions extends js.Object {
  
  /**
    * A positive number representing when to issue a warning about the number
    * of concurrent requests using teeny-request.
    * Set to 0 to disable this warning.
    * Corresponds to the TEENY_REQUEST_WARN_CONCURRENT_REQUESTS environment
    * variable.
    */
  var concurrentRequests: js.UndefOr[Double] = js.native
}
object TeenyStatisticsOptions {
  
  @scala.inline
  def apply(): TeenyStatisticsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeenyStatisticsOptions]
  }
  
  @scala.inline
  implicit class TeenyStatisticsOptionsOps[Self <: TeenyStatisticsOptions] (val x: Self) extends AnyVal {
    
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
    def setConcurrentRequests(value: Double): Self = this.set("concurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrentRequests: Self = this.set("concurrentRequests", js.undefined)
  }
}
