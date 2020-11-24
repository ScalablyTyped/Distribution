package typings.winrtUwp.Windows.Perception

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerceptionTimestamp extends js.Object {
  
  var predictionAmount: js.Any = js.native
  
   /* unmapped type */ var targetTime: js.Any = js.native
}
object PerceptionTimestamp {
  
  @scala.inline
  def apply(predictionAmount: js.Any, targetTime: js.Any): PerceptionTimestamp = {
    val __obj = js.Dynamic.literal(predictionAmount = predictionAmount.asInstanceOf[js.Any], targetTime = targetTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionTimestamp]
  }
  
  @scala.inline
  implicit class PerceptionTimestampOps[Self <: PerceptionTimestamp] (val x: Self) extends AnyVal {
    
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
    def setPredictionAmount(value: js.Any): Self = this.set("predictionAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetTime(value: js.Any): Self = this.set("targetTime", value.asInstanceOf[js.Any])
  }
}
