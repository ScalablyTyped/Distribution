package typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

import typings.winrtDashUwp.WindowsNs.DevicesNs.GeolocationNs.Geoposition
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.geofencestatechanged
import typings.winrtDashUwp.winrtDashUwpStrings.statuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about the monitored Geofence objects. */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor")
@js.native
abstract class GeofenceMonitor () extends js.Object {
  /** Returns a vector of the app's Geofence objects currently registered with the system wide GeofenceMonitor . */
  var geofences: IVector[Geofence] = js.native
  /** Last reading of the device's location. */
  var lastKnownGeoposition: Geoposition = js.native
  /** Raised when the state of one or more Geofence objects in the Geofences collection of the GeofenceMonitor has changed */
  @JSName("ongeofencestatechanged")
  var ongeofencestatechanged_Original: TypedEventHandler[GeofenceMonitor, _] = js.native
  /** Raised when the status of the GeofenceMonitor has changed. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: TypedEventHandler[GeofenceMonitor, _] = js.native
  /** Indicates the current state of the GeofenceMonitor . */
  var status: GeofenceMonitorStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_geofencestatechanged(`type`: geofencestatechanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
  /** Raised when the state of one or more Geofence objects in the Geofences collection of the GeofenceMonitor has changed */
  def ongeofencestatechanged(ev: js.Any with WinRTEvent[GeofenceMonitor]): Unit = js.native
  /** Raised when the status of the GeofenceMonitor has changed. */
  def onstatuschanged(ev: js.Any with WinRTEvent[GeofenceMonitor]): Unit = js.native
  /**
    * Gets a collection of status changes to the Geofence objects in the Geofences collection of the GeofenceMonitor .
    * @return collection of status changes to the GeofenceMonitor .
    */
  def readReports(): IVectorView[GeofenceStateChangeReport] = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_geofencestatechanged(`type`: geofencestatechanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(`type`: statuschanged, listener: TypedEventHandler[GeofenceMonitor, _]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor")
@js.native
object GeofenceMonitor extends js.Object {
  /** Gets the GeofenceMonitor object which contains all of an app's Geofence information. */
  var current: GeofenceMonitor = js.native
}

