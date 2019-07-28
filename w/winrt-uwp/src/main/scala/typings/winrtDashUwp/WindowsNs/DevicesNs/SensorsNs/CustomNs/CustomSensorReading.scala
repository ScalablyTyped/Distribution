package typings.winrtDashUwp.WindowsNs.DevicesNs.SensorsNs.CustomNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a property set of key/value pairs that contain the custom data sent from the sensor’s driver to the app. */
@JSGlobal("Windows.Devices.Sensors.Custom.CustomSensorReading")
@js.native
abstract class CustomSensorReading () extends js.Object {
  /** Gets the property set for the sensor. */
  var properties: IMapView[String, _] = js.native
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date = js.native
}

