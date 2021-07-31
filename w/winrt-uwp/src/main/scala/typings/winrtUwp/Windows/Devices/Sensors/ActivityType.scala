package typings.winrtUwp.Windows.Devices.Sensors

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActivityType extends StObject
/** Specifies activity types of a sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivityType")
@js.native
object ActivityType extends StObject {
  
  /** The sensor indicates the user is riding a bicycle on the ground. */
  @js.native
  sealed trait biking
    extends StObject
       with ActivityType
  
  /** The sensor indicates that it making minor movements while the user is stationary. */
  @js.native
  sealed trait fidgeting
    extends StObject
       with ActivityType
  
  /** The sensor indicates it is active but in an idle state. It is not with the user and remaining still such as resting on a table. */
  @js.native
  sealed trait idle
    extends StObject
       with ActivityType
  
  /** The sensor indicates the user is traveling in a motor vehicle on the ground. */
  @js.native
  sealed trait inVehicle
    extends StObject
       with ActivityType
  
  /** The sensor indicates the user is traveling at a faster rate than walking and both feet are off the ground between steps. */
  @js.native
  sealed trait running
    extends StObject
       with ActivityType
  
  /** The sensor indicates that it's not moving. */
  @js.native
  sealed trait stationary
    extends StObject
       with ActivityType
  
  /** The sensor indicates an unknown activity. */
  @js.native
  sealed trait unknown
    extends StObject
       with ActivityType
  
  /** The sensor indicates the user is walking. The user travels at a moderate pace with one foot on the ground at all times. */
  @js.native
  sealed trait walking
    extends StObject
       with ActivityType
}
