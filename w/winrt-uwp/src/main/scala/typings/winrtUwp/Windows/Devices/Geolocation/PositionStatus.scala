package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PositionStatus extends StObject
/** Indicates the ability of the Geolocator object to provide location data. */
@JSGlobal("Windows.Devices.Geolocation.PositionStatus")
@js.native
object PositionStatus extends StObject {
  
  /** Location settings are turned off. This status indicates that the user has not granted the application permission to access location. */
  @js.native
  sealed trait disabled extends PositionStatus
  
  /** Location services is initializing. This is the status if a GPS is the source of location data and the GPS receiver does not yet have the required number of satellites in view to obtain an accurate position. */
  @js.native
  sealed trait initializing extends PositionStatus
  
  /** No location data is available from any source. */
  @js.native
  sealed trait noData extends PositionStatus
  
  /** Location services is not available on this version of Windows. */
  @js.native
  sealed trait notAvailable extends PositionStatus
  
  /** An operation to retrieve location has not yet been initialized. LocationStatus will have this value if the application has not yet called GetGeopositionAsync or registered an event handler for the PositionChanged event. LocationStatus may also have this value if your app doesn’t have permission to access location. */
  @js.native
  sealed trait notInitialized extends PositionStatus
  
  /** Location data is available. */
  @js.native
  sealed trait ready extends PositionStatus
}
