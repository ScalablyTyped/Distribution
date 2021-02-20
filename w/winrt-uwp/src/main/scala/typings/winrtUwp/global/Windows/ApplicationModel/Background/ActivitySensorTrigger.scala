package typings.winrtUwp.global.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a trigger that is activated when the ActivitySensor receives input. This is used when your application needs to respond to the activity sensor. */
@JSGlobal("Windows.ApplicationModel.Background.ActivitySensorTrigger")
@js.native
class ActivitySensorTrigger protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.ActivitySensorTrigger {
  /**
    * Creates an instance of the ActivitySensorTrigger class with an initial MinimumReportInterval .
    * @param reportIntervalInMilliseconds The initial report interval to use for MinimumReportInterval .
    */
  def this(reportIntervalInMilliseconds: Double) = this()
}
