package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs

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
  
  /* 3 */ val disabled: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.PositionStatus.disabled with Double = js.native
  /* 1 */ val initializing: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.PositionStatus.initializing with Double = js.native
  /* 2 */ val noData: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.PositionStatus.noData with Double = js.native
  /* 5 */ val notAvailable: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.PositionStatus.notAvailable with Double = js.native
  /* 4 */ val notInitialized: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.PositionStatus.notInitialized with Double = js.native
  /* 0 */ val ready: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.PositionStatus.ready with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionStatus with Double] = js.native
}

