package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISimpleOrientationSensorStatics extends StObject {
  
  def getDefault(): SimpleOrientationSensor
}
object ISimpleOrientationSensorStatics {
  
  @scala.inline
  def apply(getDefault: () => SimpleOrientationSensor): ISimpleOrientationSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[ISimpleOrientationSensorStatics]
  }
  
  @scala.inline
  implicit class ISimpleOrientationSensorStaticsMutableBuilder[Self <: ISimpleOrientationSensorStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDefault(value: () => SimpleOrientationSensor): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
