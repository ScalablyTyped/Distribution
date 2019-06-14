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
  
  /* 3 */ val disabled: disabled with scala.Double = js.native
  /* 1 */ val initializing: initializing with scala.Double = js.native
  /* 2 */ val noData: noData with scala.Double = js.native
  /* 5 */ val notAvailable: notAvailable with scala.Double = js.native
  /* 4 */ val notInitialized: notInitialized with scala.Double = js.native
  /* 0 */ val ready: ready with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus with scala.Double
  ] = js.native
}

