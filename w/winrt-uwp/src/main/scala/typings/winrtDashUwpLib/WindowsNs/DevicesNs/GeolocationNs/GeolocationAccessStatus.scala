package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeolocationAccessStatus extends js.Object

/** Indicates if your app has permission to access location data. */
@JSGlobal("Windows.Devices.Geolocation.GeolocationAccessStatus")
@js.native
object GeolocationAccessStatus extends js.Object {
  /** Permission to access location was granted. */
  @js.native
  sealed trait allowed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeolocationAccessStatus
  
  /** Permission to access location was denied. */
  @js.native
  sealed trait denied
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeolocationAccessStatus
  
  /** Permission to access location was not specified. */
  @js.native
  sealed trait unspecified
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeolocationAccessStatus
  
  val allowed: allowed with java.lang.String = js.native
  val denied: denied with java.lang.String = js.native
  val unspecified: unspecified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeolocationAccessStatus with java.lang.String
  ] = js.native
}

