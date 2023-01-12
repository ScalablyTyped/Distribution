package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILightSensorStatics extends StObject {
  
  def getDefault(): LightSensor
}
object ILightSensorStatics {
  
  inline def apply(getDefault: () => LightSensor): ILightSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[ILightSensorStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ILightSensorStatics] (val x: Self) extends AnyVal {
    
    inline def setGetDefault(value: () => LightSensor): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
