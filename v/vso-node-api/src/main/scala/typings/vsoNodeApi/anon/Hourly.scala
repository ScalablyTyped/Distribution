package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hourly extends js.Object {
  
  var daily: scala.Double = js.native
  
  var hourly: scala.Double = js.native
}
object Hourly {
  
  @scala.inline
  def apply(daily: scala.Double, hourly: scala.Double): Hourly = {
    val __obj = js.Dynamic.literal(daily = daily.asInstanceOf[js.Any], hourly = hourly.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hourly]
  }
  
  @scala.inline
  implicit class HourlyOps[Self <: Hourly] (val x: Self) extends AnyVal {
    
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
    def setDaily(value: scala.Double): Self = this.set("daily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourly(value: scala.Double): Self = this.set("hourly", value.asInstanceOf[js.Any])
  }
}
