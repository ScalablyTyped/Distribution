package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ILightSensor extends js.Object {
  var minimumReportInterval: scala.Double
  var onreadingchanged: js.Any
  var reportInterval: scala.Double
  def getCurrentReading(): LightSensorReading
}

