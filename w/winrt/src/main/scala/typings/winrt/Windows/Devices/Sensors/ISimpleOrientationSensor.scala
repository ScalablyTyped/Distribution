package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISimpleOrientationSensor extends StObject {
  
  def getCurrentOrientation(): SimpleOrientation
  
  var onorientationchanged: Any
}
object ISimpleOrientationSensor {
  
  inline def apply(getCurrentOrientation: () => SimpleOrientation, onorientationchanged: Any): ISimpleOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentOrientation = js.Any.fromFunction0(getCurrentOrientation), onorientationchanged = onorientationchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleOrientationSensor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISimpleOrientationSensor] (val x: Self) extends AnyVal {
    
    inline def setGetCurrentOrientation(value: () => SimpleOrientation): Self = StObject.set(x, "getCurrentOrientation", js.Any.fromFunction0(value))
    
    inline def setOnorientationchanged(value: Any): Self = StObject.set(x, "onorientationchanged", value.asInstanceOf[js.Any])
  }
}
