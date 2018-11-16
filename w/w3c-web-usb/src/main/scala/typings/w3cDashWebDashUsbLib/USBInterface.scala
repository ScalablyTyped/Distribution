package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBInterface")
@js.native
class USBInterface protected () extends js.Object {
  def this(configuration: USBConfiguration, interfaceNumber: scala.Double) = this()
  val alternate: USBAlternateInterface = js.native
  val alternates: js.Array[USBAlternateInterface] = js.native
  val claimed: scala.Boolean = js.native
  val interfaceNumber: scala.Double = js.native
}

