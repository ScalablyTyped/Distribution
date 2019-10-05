package typings.winrtDashUwp.Windows.Devices.Geolocation.Geofencing

import typings.std.Date
import typings.winrtDashUwp.Windows.Devices.Geolocation.IGeoshape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information to define a geofence, an area of interest, to monitor. */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.Geofence")
@js.native
class Geofence protected () extends js.Object {
  /**
    * Initializes a new Geofence object given the id and the shape of the geofence.
    * @param id The Id of the geofence.
    * @param geoshape The area that defines the geofence to monitor.
    */
  def this(id: String, geoshape: IGeoshape) = this()
  /**
    * Initializes a new Geofence object given the id, the shape of the geofence, the states to monitor the geofence for, and the singleUse flag.
    * @param id The Id of the geofence.
    * @param geoshape The area that defines the geofence to monitor.
    * @param monitoredStates The states to monitor the geofence for.
    * @param singleUse True indicates the geofence should be monitored only for one use. False indicates the geofence should be monitored for multiple uses.
    */
  def this(id: String, geoshape: IGeoshape, monitoredStates: MonitoredGeofenceStates, singleUse: Boolean) = this()
  /**
    * Initializes a new Geofence object given the id, the shape of the geofence, the states to monitor the geofence for, the singleUse flag, and the dwellTime for the geofence.
    * @param id The Id of the geofence.
    * @param geoshape The area that defines the geofence to monitor.
    * @param monitoredStates The states to monitor the geofence for.
    * @param singleUse True indicates the geofence should be monitored only for one use. False indicates the geofence should be monitored for multiple uses.
    * @param dwellTime The time that a position has to be in or out of the geofence in order for the notification to be triggered.
    */
  def this(
    id: String,
    geoshape: IGeoshape,
    monitoredStates: MonitoredGeofenceStates,
    singleUse: Boolean,
    dwellTime: Double
  ) = this()
  /**
    * Initializes a new Geofence object given the id, the shape of the geofence, the states to monitor the geofence for, the singleUse flag, the dwellTime for the geofence, the time to start monitoring the geofence, and the duration of the geofence.
    * @param id The Id of the geofence.
    * @param geoshape The area that defines the geofence to monitor.
    * @param monitoredStates The states to monitor the geofence for.
    * @param singleUse True indicates the geofence should be monitored only for one use. False indicates the geofence should be monitored for multiple uses.
    * @param dwellTime The time that a position has to be in or out of the geofence in order for the notification to be triggered.
    * @param startTime The time to start monitoring the geofence.
    * @param duration The duration of time to monitor the geofence for. The duration begins at the startTime.
    */
  def this(
    id: String,
    geoshape: IGeoshape,
    monitoredStates: MonitoredGeofenceStates,
    singleUse: Boolean,
    dwellTime: Double,
    startTime: Date,
    duration: Double
  ) = this()
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

