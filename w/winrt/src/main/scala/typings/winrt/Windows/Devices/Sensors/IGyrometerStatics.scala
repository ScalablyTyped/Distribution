package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGyrometerStatics extends StObject {
  
  def getDefault(): Gyrometer
}
object IGyrometerStatics {
  
  inline def apply(getDefault: () => Gyrometer): IGyrometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[IGyrometerStatics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGyrometerStatics] (val x: Self) extends AnyVal {
    
    inline def setGetDefault(value: () => Gyrometer): Self = StObject.set(x, "getDefault", js.Any.fromFunction0(value))
  }
}
