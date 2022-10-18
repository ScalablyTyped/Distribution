package typings.winrtUwp.global.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents details about the sensor triggering. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Sensors.ActivitySensorTriggerDetails")
@js.native
open class ActivitySensorTriggerDetails ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Sensors.ActivitySensorTriggerDetails {
  
  /**
    * Reads reports about the sensor triggering.
    * @return Returns a list of ActivitySensorReadingChangeReport objects that provides data for the sensor trigger.
    */
  /* CompleteClass */
  override def readReports(): IVectorView[typings.winrtUwp.Windows.Devices.Sensors.ActivitySensorReadingChangeReport] = js.native
}
