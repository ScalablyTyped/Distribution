package typings.winrtDashUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionSource with Double] = js.native
  /* 0 */ @js.native
  object cellular extends TopLevel[cellular with Double]
  
  /* 3 */ @js.native
  object ipAddress extends TopLevel[ipAddress with Double]
  
  /* 1 */ @js.native
  object satellite extends TopLevel[satellite with Double]
  
  /* 4 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
  /* 2 */ @js.native
  object wiFi extends TopLevel[wiFi with Double]
  
}

