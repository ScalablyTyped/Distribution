package typings.w3cGenericSensor

import typings.std.Error
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SensorErrorEvent extends Event {
  val error: Error = js.native
}

