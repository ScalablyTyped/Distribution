package typings.winrtUwp.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AlarmAccessStatus extends StObject
/** Indicates whether the user has given permission for the app to set alarms. */
@JSGlobal("Windows.ApplicationModel.Background.AlarmAccessStatus")
@js.native
object AlarmAccessStatus extends StObject {
  
  /** The user has given permission for the app to set alarms, and alarms can wake up the computer from standby. */
  @js.native
  sealed trait allowedWithWakeupCapability
    extends StObject
       with AlarmAccessStatus
  
  /** The user has given permission for the app to set alarms, but the alarms cannot wake up the computer from standby. */
  @js.native
  sealed trait allowedWithoutWakeupCapability
    extends StObject
       with AlarmAccessStatus
  
  /** The user has denied permission for the app to set alarms. */
  @js.native
  sealed trait denied
    extends StObject
       with AlarmAccessStatus
  
  /** The user has not responded to a permission request for the app to set alarms. */
  @js.native
  sealed trait unspecified
    extends StObject
       with AlarmAccessStatus
}
