package typings.winrtUwp.Windows.Devices.Sensors.Custom

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a property set of key/value pairs that contain the custom data sent from the sensor’s driver to the app. */
trait CustomSensorReading extends js.Object {
  /** Gets the property set for the sensor. */
  var properties: IMapView[String, _]
  /** Gets the time at which the sensor reported the reading. */
  var timestamp: Date
}

object CustomSensorReading {
  @scala.inline
  def apply(properties: IMapView[String, _], timestamp: Date): CustomSensorReading = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomSensorReading]
  }
}

