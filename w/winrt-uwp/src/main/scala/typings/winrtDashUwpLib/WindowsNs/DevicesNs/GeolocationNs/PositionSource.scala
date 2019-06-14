package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionSource extends js.Object

/** Indicates the source used to obtain a Geocoordinate . */
@JSGlobal("Windows.Devices.Geolocation.PositionSource")
@js.native
object PositionSource extends js.Object {
  /** The position was obtained from cellular network data. */
  @js.native
  sealed trait cellular
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionSource
  
  /** (Starting with Windows 8.1.) The position was obtained from an IP address. */
  @js.native
  sealed trait ipAddress
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionSource
  
  /** The position was obtained from satellite data. */
  @js.native
  sealed trait satellite
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionSource
  
  /** (Starting with Windows 8.1.) The position was obtained from an unknown source. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionSource
  
  /** The position was obtained from Wi-Fi network data. */
  @js.native
  sealed trait wiFi
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionSource
  
  /* 0 */ val cellular: cellular with scala.Double = js.native
  /* 3 */ val ipAddress: ipAddress with scala.Double = js.native
  /* 1 */ val satellite: satellite with scala.Double = js.native
  /* 4 */ val unknown: unknown with scala.Double = js.native
  /* 2 */ val wiFi: wiFi with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionSource with scala.Double
  ] = js.native
}

