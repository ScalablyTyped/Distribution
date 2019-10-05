package typings.winrtDashUwp.Windows.Devices.Geolocation

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
  sealed trait allowed extends GeolocationAccessStatus
  
  /** Permission to access location was denied. */
  @js.native
  sealed trait denied extends GeolocationAccessStatus
  
  /** Permission to access location was not specified. */
  @js.native
  sealed trait unspecified extends GeolocationAccessStatus
  
  /* 1 */ val allowed: typings.winrtDashUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.allowed with Double = js.native
  /* 2 */ val denied: typings.winrtDashUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.denied with Double = js.native
  /* 0 */ val unspecified: typings.winrtDashUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeolocationAccessStatus with Double] = js.native
}

