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
  
  val cellular: cellular with java.lang.String = js.native
  val ipAddress: ipAddress with java.lang.String = js.native
  val satellite: satellite with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val wiFi: wiFi with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionSource with java.lang.String
  ] = js.native
}

