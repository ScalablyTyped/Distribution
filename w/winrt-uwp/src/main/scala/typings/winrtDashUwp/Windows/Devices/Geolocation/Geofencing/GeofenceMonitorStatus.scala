package typings.winrtDashUwp.Windows.Devices.Geolocation.Geofencing

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GeofenceMonitorStatus with Double] = js.native
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

