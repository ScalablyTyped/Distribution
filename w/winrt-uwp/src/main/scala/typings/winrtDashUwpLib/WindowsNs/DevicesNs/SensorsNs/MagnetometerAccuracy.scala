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
  
  /* 2 */ val approximate: approximate with scala.Double = js.native
  /* 3 */ val high: high with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 1 */ val unreliable: unreliable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy with scala.Double
  ] = js.native
}

