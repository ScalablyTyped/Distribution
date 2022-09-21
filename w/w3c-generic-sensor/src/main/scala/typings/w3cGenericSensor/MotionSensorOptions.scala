package typings.w3cGenericSensor

import typings.w3cGenericSensor.w3cGenericSensorStrings.device
import typings.w3cGenericSensor.w3cGenericSensorStrings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionSensorOptions
  extends StObject
     with SensorOptions {
  
  var referenceFrame: js.UndefOr[device | screen] = js.undefined
}
object MotionSensorOptions {
  
  inline def apply(): MotionSensorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionSensorOptions]
  }
  
  extension [Self <: MotionSensorOptions](x: Self) {
    
    inline def setReferenceFrame(value: device | screen): Self = StObject.set(x, "referenceFrame", value.asInstanceOf[js.Any])
    
    inline def setReferenceFrameUndefined: Self = StObject.set(x, "referenceFrame", js.undefined)
  }
}
