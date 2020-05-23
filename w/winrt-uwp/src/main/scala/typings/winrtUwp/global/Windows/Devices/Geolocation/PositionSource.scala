package typings.winrtUwp.global.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Indicates the source used to obtain a Geocoordinate . */
@JSGlobal("Windows.Devices.Geolocation.PositionSource")
@js.native
object PositionSource extends js.Object {
  /* 0 */ val cellular: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.cellular with Double = js.native
  /* 3 */ val ipAddress: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.ipAddress with Double = js.native
  /* 1 */ val satellite: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.satellite with Double = js.native
  /* 4 */ val unknown: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.unknown with Double = js.native
  /* 2 */ val wiFi: typings.winrtUwp.Windows.Devices.Geolocation.PositionSource.wiFi with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Geolocation.PositionSource with Double] = js.native
}

