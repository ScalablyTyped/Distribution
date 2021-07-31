package typings.winrt.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleOrientationSensor
  extends StObject
     with ISimpleOrientationSensor
object SimpleOrientationSensor {
  
  @scala.inline
  def apply(getCurrentOrientation: () => SimpleOrientation, onorientationchanged: js.Any): SimpleOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentOrientation = js.Any.fromFunction0(getCurrentOrientation), onorientationchanged = onorientationchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleOrientationSensor]
  }
}
