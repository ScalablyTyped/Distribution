package typings.winrtUwp.global.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for what sensor triggered the data threshold monitoring task. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.SensorDataThresholdTriggerDetails")
@js.native
open class SensorDataThresholdTriggerDetails ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.SensorDataThresholdTriggerDetails {
  
  /** Gets the device identifier for the device that activated the threshold trigger. */
  /* CompleteClass */
  var deviceId: String = js.native
  
  /** Gets the type of sensor associated with the threshold trigger. */
  /* CompleteClass */
  var sensorType: typings.winrtUwp.Windows.Devices.Sensors.SensorType = js.native
}
