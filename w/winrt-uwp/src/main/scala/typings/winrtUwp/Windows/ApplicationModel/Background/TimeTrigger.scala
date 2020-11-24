package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a time event that triggers a background task to run. */
@js.native
trait TimeTrigger extends js.Object {
  
  /** Gets the interval of a time event trigger. */
  var freshnessTime: Double = js.native
  
  /** Gets whether the time event trigger will be used only once or each time the FreshnessTime interval elapses. */
  var oneShot: Boolean = js.native
}
object TimeTrigger {
  
  @scala.inline
  def apply(freshnessTime: Double, oneShot: Boolean): TimeTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeTrigger]
  }
  
  @scala.inline
  implicit class TimeTriggerOps[Self <: TimeTrigger] (val x: Self) extends AnyVal {
    
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
    def setFreshnessTime(value: Double): Self = this.set("freshnessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneShot(value: Boolean): Self = this.set("oneShot", value.asInstanceOf[js.Any])
  }
}
