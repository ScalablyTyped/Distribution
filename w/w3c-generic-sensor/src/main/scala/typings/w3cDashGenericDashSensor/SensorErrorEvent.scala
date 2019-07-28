package typings.w3cDashGenericDashSensor

import typings.std.Error
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SensorErrorEvent")
@js.native
class SensorErrorEvent protected () extends Event {
  def this(`type`: String, errorEventInitDict: SensorErrorEventInit) = this()
  val error: Error = js.native
}

