package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchedContinuousIntegration extends js.Object {
  
  var all: scala.Double = js.native
  
  var batchedContinuousIntegration: scala.Double = js.native
  
  var batchedGatedCheckIn: scala.Double = js.native
  
  var continuousIntegration: scala.Double = js.native
  
  var gatedCheckIn: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var pullRequest: scala.Double = js.native
  
  var schedule: scala.Double = js.native
}
object BatchedContinuousIntegration {
  
  @scala.inline
  def apply(
    all: scala.Double,
    batchedContinuousIntegration: scala.Double,
    batchedGatedCheckIn: scala.Double,
    continuousIntegration: scala.Double,
    gatedCheckIn: scala.Double,
    none: scala.Double,
    pullRequest: scala.Double,
    schedule: scala.Double
  ): BatchedContinuousIntegration = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], batchedContinuousIntegration = batchedContinuousIntegration.asInstanceOf[js.Any], batchedGatedCheckIn = batchedGatedCheckIn.asInstanceOf[js.Any], continuousIntegration = continuousIntegration.asInstanceOf[js.Any], gatedCheckIn = gatedCheckIn.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], pullRequest = pullRequest.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchedContinuousIntegration]
  }
  
  @scala.inline
  implicit class BatchedContinuousIntegrationOps[Self <: BatchedContinuousIntegration] (val x: Self) extends AnyVal {
    
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchedContinuousIntegration(value: scala.Double): Self = this.set("batchedContinuousIntegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchedGatedCheckIn(value: scala.Double): Self = this.set("batchedGatedCheckIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousIntegration(value: scala.Double): Self = this.set("continuousIntegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatedCheckIn(value: scala.Double): Self = this.set("gatedCheckIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPullRequest(value: scala.Double): Self = this.set("pullRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: scala.Double): Self = this.set("schedule", value.asInstanceOf[js.Any])
  }
}
