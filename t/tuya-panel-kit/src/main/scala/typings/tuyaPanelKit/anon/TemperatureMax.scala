package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemperatureMax extends StObject {
  
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
  implicit class TemperatureMaxMutableBuilder[Self <: TemperatureMax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTemperatureMax(value: Double): Self = StObject.set(x, "temperatureMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperatureMaxUndefined: Self = StObject.set(x, "temperatureMax", js.undefined)
    
    @scala.inline
    def setTemperatureMin(value: Double): Self = StObject.set(x, "temperatureMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperatureMinUndefined: Self = StObject.set(x, "temperatureMin", js.undefined)
  }
}
