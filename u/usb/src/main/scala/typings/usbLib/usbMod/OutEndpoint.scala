package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "OutEndpoint")
@js.native
class OutEndpoint protected () extends Endpoint {
  def this(device: Device, descriptor: EndpointDescriptor) = this()
  /**
    * Perform a transfer to write `data` to the endpoint.
    *
    * If length is greater than maxPacketSize, libusb will automatically split the transfer in multiple packets, and you will receive one callback once all packets are complete.
    *
    * `this` in the callback is the OutEndpoint object.
    *
    * The device must be open to use this method.
    * @param buffer
    * @param cb
    */
  def transfer(buffer: nodeLib.Buffer, cb: js.Function1[/* err */ js.UndefOr[LibUSBException], scala.Unit]): OutEndpoint = js.native
  def transferWithZLP(buf: nodeLib.Buffer, cb: js.Function1[/* err */ js.UndefOr[LibUSBException], scala.Unit]): scala.Unit = js.native
}

