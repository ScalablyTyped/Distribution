package typings.winrtUwp.Windows.Devices.Geolocation.Geofencing

import typings.std.Date
import typings.winrtUwp.Windows.Devices.Geolocation.IGeoshape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information to define a geofence, an area of interest, to monitor. */
@js.native
trait Geofence extends js.Object {
  /** Gets the time window, beginning after the StartTime , during which the Geofence is monitored. */
  var duration: Double = js.native
  /** The minimum time that a position has to be inside or outside of the Geofence in order for the notification to be triggered. */
  var dwellTime: Double = js.native
  /** The shape of the geofence region. */
  var geoshape: IGeoshape = js.native
  /** The id of the Geofence . */
  var id: String = js.native
  /** Indicates the states that the Geofence is being monitored for. */
  var monitoredStates: MonitoredGeofenceStates = js.native
  /** Indicates whether the Geofence should be triggered once or multiple times. */
  var singleUse: Boolean = js.native
  /** The time to start monitoring the Geofence . */
  var startTime: Date = js.native
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
  @scala.inline
  implicit class GeofenceOps[Self <: Geofence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setDwellTime(value: Double): Self = this.set("dwellTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeoshape(value: IGeoshape): Self = this.set("geoshape", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonitoredStates(value: MonitoredGeofenceStates): Self = this.set("monitoredStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingleUse(value: Boolean): Self = this.set("singleUse", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
  }
  
}

