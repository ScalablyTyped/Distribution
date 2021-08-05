package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccelerometerStatics extends StObject {
  
  def getDefault(): Accelerometer
}
object IAccelerometerStatics {
  
  inline def apply(getDefault: () => Accelerometer): IAccelerometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[IAccelerometerStatics]
  }
  
  extension [Self <: IAccelerometerStatics](x: Self) {
    
    inline def setGetDefault(value: () => Accelerometer): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
