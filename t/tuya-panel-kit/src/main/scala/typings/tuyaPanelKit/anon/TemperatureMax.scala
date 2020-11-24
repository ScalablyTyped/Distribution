package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemperatureMax extends js.Object {
  
  var temperatureMax: js.UndefOr[Double] = js.native
  
  var temperatureMin: js.UndefOr[Double] = js.native
}
object TemperatureMax {
  
  @scala.inline
  def apply(): TemperatureMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemperatureMax]
  }
  
  @scala.inline
  implicit class TemperatureMaxOps[Self <: TemperatureMax] (val x: Self) extends AnyVal {
    
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
    def setTemperatureMax(value: Double): Self = this.set("temperatureMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemperatureMax: Self = this.set("temperatureMax", js.undefined)
    
    @scala.inline
    def setTemperatureMin(value: Double): Self = this.set("temperatureMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemperatureMin: Self = this.set("temperatureMin", js.undefined)
  }
}
