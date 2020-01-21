package typings.w3cGenericSensor

import typings.std.Error
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SensorErrorEvent")
@js.native
class SensorErrorEvent protected () extends Event_ {
  def this(`type`: String, errorEventInitDict: SensorErrorEventInit) = this()
  val error: Error = js.native
}

