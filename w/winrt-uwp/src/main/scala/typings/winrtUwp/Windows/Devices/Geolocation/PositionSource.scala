package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PositionSource extends StObject
/** Indicates the source used to obtain a Geocoordinate . */
@JSGlobal("Windows.Devices.Geolocation.PositionSource")
@js.native
object PositionSource extends StObject {
  
  /** The position was obtained from cellular network data. */
  @js.native
  sealed trait cellular
    extends StObject
       with PositionSource
  
  /** (Starting with Windows 8.1.) The position was obtained from an IP address. */
  @js.native
  sealed trait ipAddress
    extends StObject
       with PositionSource
  
  /** The position was obtained from satellite data. */
  @js.native
  sealed trait satellite
    extends StObject
       with PositionSource
  
  /** (Starting with Windows 8.1.) The position was obtained from an unknown source. */
  @js.native
  sealed trait unknown
    extends StObject
       with PositionSource
  
  /** The position was obtained from Wi-Fi network data. */
  @js.native
  sealed trait wiFi
    extends StObject
       with PositionSource
}
