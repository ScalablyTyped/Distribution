package typings.w3cWebUsb

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait USBConnectionEvent extends Event {
  val device: USBDevice = js.native
}

