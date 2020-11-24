package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThresholdAngle extends js.Object {
  
  var thresholdAngle: Double = js.native
}
object ThresholdAngle {
  
  @scala.inline
  def apply(thresholdAngle: Double): ThresholdAngle = {
    val __obj = js.Dynamic.literal(thresholdAngle = thresholdAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdAngle]
  }
  
  @scala.inline
  implicit class ThresholdAngleOps[Self <: ThresholdAngle] (val x: Self) extends AnyVal {
    
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
    def setThresholdAngle(value: Double): Self = this.set("thresholdAngle", value.asInstanceOf[js.Any])
  }
}
