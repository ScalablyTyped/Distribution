package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the information about the monitored Geofence objects. */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor")
@js.native
abstract class GeofenceMonitor () extends js.Object {
  /** Returns a vector of the app's Geofence objects currently registered with the system wide GeofenceMonitor . */
  var geofences: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[Geofence] = js.native
  /** Last reading of the device's location. */
  var lastKnownGeoposition: winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.Geoposition = js.native
  /** Raised when the state of one or more Geofence objects in the Geofences collection of the GeofenceMonitor has changed */
  @JSName("ongeofencestatechanged")
  var ongeofencestatechanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GeofenceMonitor, _] = js.native
  /** Raised when the status of the GeofenceMonitor has changed. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GeofenceMonitor, _] = js.native
  /** Indicates the current state of the GeofenceMonitor . */
  var status: GeofenceMonitorStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_geofencestatechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.geofencestatechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GeofenceMonitor, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GeofenceMonitor, _]
  ): scala.Unit = js.native
  /** Raised when the state of one or more Geofence objects in the Geofences collection of the GeofenceMonitor has changed */
  def ongeofencestatechanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[GeofenceMonitor]): scala.Unit = js.native
  /** Raised when the status of the GeofenceMonitor has changed. */
  def onstatuschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[GeofenceMonitor]): scala.Unit = js.native
  /**
                       * Gets a collection of status changes to the Geofence objects in the Geofences collection of the GeofenceMonitor .
                       * @return collection of status changes to the GeofenceMonitor .
                       */
  def readReports(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[GeofenceStateChangeReport] = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_geofencestatechanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.geofencestatechanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GeofenceMonitor, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[GeofenceMonitor, _]
  ): scala.Unit = js.native
}

/** Contains the information about the monitored Geofence objects. */
@JSGlobal("Windows.Devices.Geolocation.Geofencing.GeofenceMonitor")
@js.native
object GeofenceMonitor extends js.Object {
  /** Gets the GeofenceMonitor object which contains all of an app's Geofence information. */
  var current: winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.GeofencingNs.GeofenceMonitor = js.native
}

