package typings.winrtDashUwp.Windows.Devices.Geolocation

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
  sealed trait cellular extends PositionSource
  
  /** (Starting with Windows 8.1.) The position was obtained from an IP address. */
  @js.native
  sealed trait ipAddress extends PositionSource
  
  /** The position was obtained from satellite data. */
  @js.native
  sealed trait satellite extends PositionSource
  
  /** (Starting with Windows 8.1.) The position was obtained from an unknown source. */
  @js.native
  sealed trait unknown extends PositionSource
  
  /** The position was obtained from Wi-Fi network data. */
  @js.native
  sealed trait wiFi extends PositionSource
  
  /* 0 */ val cellular: typings.winrtDashUwp.Windows.Devices.Geolocation.PositionSource.cellular with Double = js.native
  /* 3 */ val ipAddress: typings.winrtDashUwp.Windows.Devices.Geolocation.PositionSource.ipAddress with Double = js.native
  /* 1 */ val satellite: typings.winrtDashUwp.Windows.Devices.Geolocation.PositionSource.satellite with Double = js.native
  /* 4 */ val unknown: typings.winrtDashUwp.Windows.Devices.Geolocation.PositionSource.unknown with Double = js.native
  /* 2 */ val wiFi: typings.winrtDashUwp.Windows.Devices.Geolocation.PositionSource.wiFi with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionSource with Double] = js.native
}

