package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

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
  sealed trait disabled extends GeofenceMonitorStatus
  
  /** The monitor is in the process of initializing. */
  @js.native
  sealed trait initializing extends GeofenceMonitorStatus
  
  /** There is no data on the status of the monitor. */
  @js.native
  sealed trait noData extends GeofenceMonitorStatus
  
  /** The geofence monitor is not available. */
  @js.native
  sealed trait notAvailable extends GeofenceMonitorStatus
  
  /** The geofence monitor has not been initialized. */
  @js.native
  sealed trait notInitialized extends GeofenceMonitorStatus
  
  /** The monitor is ready and active. */
  @js.native
  sealed trait ready extends GeofenceMonitorStatus
  
  /* 3 */ val disabled: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus.disabled with Double = js.native
  /* 1 */ val initializing: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus.initializing with Double = js.native
  /* 2 */ val noData: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus.noData with Double = js.native
  /* 5 */ val notAvailable: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus.notAvailable with Double = js.native
  /* 4 */ val notInitialized: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus.notInitialized with Double = js.native
  /* 0 */ val ready: typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitorStatus.ready with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofenceMonitorStatus with Double] = js.native
}

