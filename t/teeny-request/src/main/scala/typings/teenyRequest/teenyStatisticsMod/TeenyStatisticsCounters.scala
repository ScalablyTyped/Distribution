package typings.teenyRequest.teenyStatisticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeenyStatisticsCounters extends js.Object {
  
  var concurrentRequests: Double = js.native
}
object TeenyStatisticsCounters {
  
  @scala.inline
  def apply(concurrentRequests: Double): TeenyStatisticsCounters = {
    val __obj = js.Dynamic.literal(concurrentRequests = concurrentRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeenyStatisticsCounters]
  }
  
  @scala.inline
  implicit class TeenyStatisticsCountersOps[Self <: TeenyStatisticsCounters] (val x: Self) extends AnyVal {
    
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
  }
}
