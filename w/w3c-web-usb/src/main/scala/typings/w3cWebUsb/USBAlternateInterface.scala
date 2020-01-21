package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBAlternateInterface")
@js.native
class USBAlternateInterface protected () extends js.Object {
  def this(deviceInterface: USBInterface, alternateSetting: Double) = this()
  val alternateSetting: Double = js.native
  val endpoints: js.Array[USBEndpoint] = js.native
  val interfaceClass: Double = js.native
  val interfaceName: js.UndefOr[String] = js.native
  val interfaceProtocol: Double = js.native
  val interfaceSubclass: Double = js.native
}

