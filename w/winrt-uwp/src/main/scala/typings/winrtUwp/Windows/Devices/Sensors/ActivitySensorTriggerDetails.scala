package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents details about the sensor triggering. */
@js.native
trait ActivitySensorTriggerDetails extends StObject {
  
  /**
    * Reads reports about the sensor triggering.
    * @return Returns a list of ActivitySensorReadingChangeReport objects that provides data for the sensor trigger.
    */
  def readReports(): IVectorView[ActivitySensorReadingChangeReport] = js.native
}
object ActivitySensorTriggerDetails {
  
  @scala.inline
  def apply(readReports: () => IVectorView[ActivitySensorReadingChangeReport]): ActivitySensorTriggerDetails = {
    val __obj = js.Dynamic.literal(readReports = js.Any.fromFunction0(readReports))
    __obj.asInstanceOf[ActivitySensorTriggerDetails]
  }
  
  @scala.inline
  implicit class ActivitySensorTriggerDetailsMutableBuilder[Self <: ActivitySensorTriggerDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadReports(value: () => IVectorView[ActivitySensorReadingChangeReport]): Self = StObject.set(x, "readReports", js.Any.fromFunction0(value))
  }
}
