package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActivityType extends js.Object

/** Specifies activity types of a sensor. */
@JSGlobal("Windows.Devices.Sensors.ActivityType")
@js.native
object ActivityType extends js.Object {
  /** The sensor indicates the user is riding a bicycle on the ground. */
  @js.native
  sealed trait biking
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivityType
  
  /** The sensor indicates that it making minor movements while the user is stationary. */
  @js.native
  sealed trait fidgeting
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivityType
  
  /** The sensor indicates it is active but in an idle state. It is not with the user and remaining still such as resting on a table. */
  @js.native
  sealed trait idle
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivityType
  
  /** The sensor indicates the user is traveling in a motor vehicle on the ground. */
  @js.native
  sealed trait inVehicle
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivityType
  
  /** The sensor indicates the user is traveling at a faster rate than walking and both feet are off the ground between steps. */
  @js.native
  sealed trait running
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivityType
  
  /** The sensor indicates that it's not moving. */
  @js.native
  sealed trait stationary
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivityType
  
  /** The sensor indicates an unknown activity. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivityType
  
  /** The sensor indicates the user is walking. The user travels at a moderate pace with one foot on the ground at all times. */
  @js.native
  sealed trait walking
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivityType
  
  val biking: biking with java.lang.String = js.native
  val fidgeting: fidgeting with java.lang.String = js.native
  val idle: idle with java.lang.String = js.native
  val inVehicle: inVehicle with java.lang.String = js.native
  val running: running with java.lang.String = js.native
  val stationary: stationary with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val walking: walking with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.ActivityType with java.lang.String] = js.native
}

