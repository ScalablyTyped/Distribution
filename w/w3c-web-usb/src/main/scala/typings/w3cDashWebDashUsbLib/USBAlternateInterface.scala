package typings
package w3cDashWebDashUsbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("USBAlternateInterface")
@js.native
class USBAlternateInterface protected () extends js.Object {
  def this(deviceInterface: USBInterface, alternateSetting: scala.Double) = this()
  val alternateSetting: scala.Double = js.native
  val endpoints: js.Array[USBEndpoint] = js.native
  val interfaceClass: scala.Double = js.native
  val interfaceName: js.UndefOr[java.lang.String] = js.native
  val interfaceProtocol: scala.Double = js.native
  val interfaceSubclass: scala.Double = js.native
}

