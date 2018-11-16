package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "OutEndpoint")
@js.native
class OutEndpoint protected () extends Endpoint {
  def this(device: Device, descriptor: EndpointDescriptor) = this()
  def transfer(buffer: nodeLib.Buffer, cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): OutEndpoint = js.native
  def transferWithZLP(buf: nodeLib.Buffer, cb: js.Function1[/* err */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
}

