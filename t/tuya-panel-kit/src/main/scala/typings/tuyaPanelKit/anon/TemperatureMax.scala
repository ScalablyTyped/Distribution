package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemperatureMax extends StObject {
  
  var temperatureMax: js.UndefOr[Double] = js.undefined
  
  var temperatureMin: js.UndefOr[Double] = js.undefined
}
object TemperatureMax {
  
  inline def apply(): TemperatureMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemperatureMax]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemperatureMax] (val x: Self) extends AnyVal {
    
    inline def setTemperatureMax(value: Double): Self = StObject.set(x, "temperatureMax", value.asInstanceOf[js.Any])
    
    inline def setTemperatureMaxUndefined: Self = StObject.set(x, "temperatureMax", js.undefined)
    
    inline def setTemperatureMin(value: Double): Self = StObject.set(x, "temperatureMin", value.asInstanceOf[js.Any])
    
    inline def setTemperatureMinUndefined: Self = StObject.set(x, "temperatureMin", js.undefined)
  }
}
