package typings.w3cDashWebDashUsb

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBConnectionEvent")
@js.native
class USBConnectionEvent protected () extends Event {
  def this(`type`: String, eventInitDict: USBConnectionEventInit) = this()
  val device: USBDevice = js.native
}

