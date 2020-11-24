package typings.timezonecomplete.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayPeriod extends js.Object {
  
  var am: String = js.native
  
  var midnight: String = js.native
  
  var noon: String = js.native
  
  var pm: String = js.native
}
object DayPeriod {
  
  @scala.inline
  def apply(am: String, midnight: String, noon: String, pm: String): DayPeriod = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], midnight = midnight.asInstanceOf[js.Any], noon = noon.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPeriod]
  }
  
  @scala.inline
  implicit class DayPeriodOps[Self <: DayPeriod] (val x: Self) extends AnyVal {
    
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
    def setAm(value: String): Self = this.set("am", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidnight(value: String): Self = this.set("midnight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoon(value: String): Self = this.set("noon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPm(value: String): Self = this.set("pm", value.asInstanceOf[js.Any])
  }
}
