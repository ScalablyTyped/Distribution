package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MagnetometerAccuracy extends js.Object

/** The sensor's accuracy. */
@JSGlobal("Windows.Devices.Sensors.MagnetometerAccuracy")
@js.native
object MagnetometerAccuracy extends js.Object {
  /** The actual and reported values differ but may be accurate enough for some application. */
  @js.native
  sealed trait approximate
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy
  
  /** The actual and reported values are accurate. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy
  
  /** The accuracy is currently not available, typically because the driver can't report it. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy
  
  /** The actual and reported values have a high degree of inaccuracy. */
  @js.native
  sealed trait unreliable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy
  
  val approximate: approximate with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val unreliable: unreliable with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy with java.lang.String
  ] = js.native
}

