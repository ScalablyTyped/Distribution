package typings.w3cGenericSensor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorOptions extends StObject {
  
  var frequency: js.UndefOr[Double] = js.undefined
}
object SensorOptions {
  
  inline def apply(): SensorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SensorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SensorOptions] (val x: Self) extends AnyVal {
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
