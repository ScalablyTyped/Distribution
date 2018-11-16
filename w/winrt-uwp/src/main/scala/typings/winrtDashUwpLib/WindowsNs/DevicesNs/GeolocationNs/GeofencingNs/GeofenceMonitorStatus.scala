package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GeofenceMonitorStatus extends js.Object

/** Indicates the current state of a GeofenceMonitor . */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitorStatus")
@js.native
object GeofenceMonitorStatus extends js.Object {
  /** Access to location is denied. */
  @js.native
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus
  
  /** The monitor is in the process of initializing. */
  @js.native
  sealed trait initializing
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus
  
  /** There is no data on the status of the monitor. */
  @js.native
  sealed trait noData
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus
  
  /** The geofence monitor is not available. */
  @js.native
  sealed trait notAvailable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus
  
  /** The geofence monitor has not been initialized. */
  @js.native
  sealed trait notInitialized
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus
  
  /** The monitor is ready and active. */
  @js.native
  sealed trait ready
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus
  
  val disabled: disabled with java.lang.String = js.native
  val initializing: initializing with java.lang.String = js.native
  val noData: noData with java.lang.String = js.native
  val notAvailable: notAvailable with java.lang.String = js.native
  val notInitialized: notInitialized with java.lang.String = js.native
  val ready: ready with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus with java.lang.String
  ] = js.native
}

