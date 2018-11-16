package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

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
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  /** Location services is initializing. This is the status if a GPS is the source of location data and the GPS receiver does not yet have the required number of satellites in view to obtain an accurate position. */
  @js.native
  sealed trait initializing
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  /** No location data is available from any source. */
  @js.native
  sealed trait noData
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  /** Location services is not available on this version of Windows. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  /** An operation to retrieve location has not yet been initialized. LocationStatus will have this value if the application has not yet called GetGeopositionAsync or registered an event handler for the PositionChanged event. LocationStatus may also have this value if your app doesn’t have permission to access location. */
  @js.native
  sealed trait notInitialized
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  /** Location data is available. */
  @js.native
  sealed trait ready
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus
  
  val disabled: disabled with java.lang.String = js.native
  val initializing: initializing with java.lang.String = js.native
  val noData: noData with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val notInitialized: notInitialized with java.lang.String = js.native
  val ready: ready with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionStatus with java.lang.String
  ] = js.native
}

