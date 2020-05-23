package typings.winrtUwp.global.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates if your app has permission to access location data. */
@JSGlobal("Windows.Devices.Geolocation.GeolocationAccessStatus")
@js.native
object GeolocationAccessStatus extends js.Object {
  /* 1 */ val allowed: typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.allowed with Double = js.native
  /* 2 */ val denied: typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.denied with Double = js.native
  /* 0 */ val unspecified: typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus.unspecified with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.GeolocationAccessStatus with Double] = js.native
}

