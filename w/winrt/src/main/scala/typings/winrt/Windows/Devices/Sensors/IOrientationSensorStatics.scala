package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOrientationSensorStatics extends StObject {
  
  def getDefault(): OrientationSensor
}
object IOrientationSensorStatics {
  
  inline def apply(getDefault: () => OrientationSensor): IOrientationSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[IOrientationSensorStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOrientationSensorStatics] (val x: Self) extends AnyVal {
    
    inline def setGetDefault(value: () => OrientationSensor): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
