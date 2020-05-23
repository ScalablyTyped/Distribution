package typings.winrtUwp.Windows.Devices.Geolocation.Geofencing

import typings.std.Date
import typings.winrtUwp.Windows.Devices.Geolocation.IGeoshape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information to define a geofence, an area of interest, to monitor. */
trait Geofence extends js.Object {
  /** Gets the time window, beginning after the StartTime , during which the Geofence is monitored. */
  var duration: Double
  /** The minimum time that a position has to be inside or outside of the Geofence in order for the notification to be triggered. */
  var dwellTime: Double
  /** The shape of the geofence region. */
  var geoshape: IGeoshape
  /** The id of the Geofence . */
  var id: String
  /** Indicates the states that the Geofence is being monitored for. */
  var monitoredStates: MonitoredGeofenceStates
  /** Indicates whether the Geofence should be triggered once or multiple times. */
  var singleUse: Boolean
  /** The time to start monitoring the Geofence . */
  var startTime: Date
}

object Geofence {
  @scala.inline
  def apply(
    duration: Double,
    dwellTime: Double,
    geoshape: IGeoshape,
    id: String,
    monitoredStates: MonitoredGeofenceStates,
    singleUse: Boolean,
    startTime: Date
  ): Geofence = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], dwellTime = dwellTime.asInstanceOf[js.Any], geoshape = geoshape.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], monitoredStates = monitoredStates.asInstanceOf[js.Any], singleUse = singleUse.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geofence]
  }
}

