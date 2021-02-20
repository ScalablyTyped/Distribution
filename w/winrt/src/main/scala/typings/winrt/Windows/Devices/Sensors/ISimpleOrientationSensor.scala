package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimpleOrientationSensor extends StObject {
  
  def getCurrentOrientation(): SimpleOrientation = js.native
  
  var onorientationchanged: js.Any = js.native
}
object ISimpleOrientationSensor {
  
  @scala.inline
  def apply(getCurrentOrientation: () => SimpleOrientation, onorientationchanged: js.Any): ISimpleOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentOrientation = js.Any.fromFunction0(getCurrentOrientation), onorientationchanged = onorientationchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleOrientationSensor]
  }
  
  @scala.inline
  implicit class ISimpleOrientationSensorMutableBuilder[Self <: ISimpleOrientationSensor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentOrientation(value: () => SimpleOrientation): Self = StObject.set(x, "getCurrentOrientation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnorientationchanged(value: js.Any): Self = StObject.set(x, "onorientationchanged", value.asInstanceOf[js.Any])
  }
}
