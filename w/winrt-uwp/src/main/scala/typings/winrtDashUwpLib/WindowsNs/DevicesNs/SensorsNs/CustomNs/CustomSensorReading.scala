package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SensorsNs.CustomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a property set of key/value pairs that contain the custom data sent from the sensor’s driver to the app. */
@JSGlobal("Windows.Devices.Sensors.Custom.CustomSensorReading")
@js.native
abstract class CustomSensorReading () extends js.Object {
  /** Gets the property set for the sensor. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: stdLib.Date = js.native
}

