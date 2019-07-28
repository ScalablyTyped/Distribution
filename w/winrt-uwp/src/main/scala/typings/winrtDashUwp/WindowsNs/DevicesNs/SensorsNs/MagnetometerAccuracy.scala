package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs

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
  sealed trait approximate extends MagnetometerAccuracy
  
  /** The actual and reported values are accurate. */
  @js.native
  sealed trait high extends MagnetometerAccuracy
  
  /** The accuracy is currently not available, typically because the driver can't report it. */
  @js.native
  sealed trait unknown extends MagnetometerAccuracy
  
  /** The actual and reported values have a high degree of inaccuracy. */
  @js.native
  sealed trait unreliable extends MagnetometerAccuracy
  
  /* 2 */ val approximate: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy.approximate with Double = js.native
  /* 3 */ val high: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy.high with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy.unknown with Double = js.native
  /* 1 */ val unreliable: typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.MagnetometerAccuracy.unreliable with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagnetometerAccuracy with Double] = js.native
}

