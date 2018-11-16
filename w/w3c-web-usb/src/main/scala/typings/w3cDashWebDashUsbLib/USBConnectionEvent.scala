package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBConnectionEvent")
@js.native
class USBConnectionEvent protected ()
  extends stdLib.Event {
  def this(`type`: java.lang.String, eventInitDict: USBConnectionEventInit) = this()
  val device: USBDevice = js.native
}

