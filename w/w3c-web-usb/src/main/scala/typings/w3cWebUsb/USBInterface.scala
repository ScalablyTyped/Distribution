package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBInterface")
@js.native
class USBInterface protected () extends js.Object {
  def this(configuration: USBConfiguration, interfaceNumber: Double) = this()
  val alternate: USBAlternateInterface = js.native
  val alternates: js.Array[USBAlternateInterface] = js.native
  val claimed: Boolean = js.native
  val interfaceNumber: Double = js.native
}

