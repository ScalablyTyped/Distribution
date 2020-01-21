package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionStatus extends js.Object

/** Indicates the ability of the Geolocator object to provide location data. */
@JSGlobal("Windows.Devices.Geolocation.PositionStatus")
@js.native
object PositionStatus extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionStatus with Double] = js.native
  /* 3 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 1 */ @js.native
  object initializing extends TopLevel[initializing with Double]
  
  /* 2 */ @js.native
  object noData extends TopLevel[noData with Double]
  
  /* 5 */ @js.native
  object notAvailable extends TopLevel[notAvailable with Double]
  
  /* 4 */ @js.native
  object notInitialized extends TopLevel[notInitialized with Double]
  
  /* 0 */ @js.native
  object ready extends TopLevel[ready with Double]
  
}

