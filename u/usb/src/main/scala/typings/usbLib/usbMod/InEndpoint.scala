package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "InEndpoint")
@js.native
class InEndpoint protected () extends Endpoint {
  def this(device: Device, descriptor: EndpointDescriptor) = this()
  def startPoll(): scala.Unit = js.native
  def startPoll(nTransfers: scala.Double): scala.Unit = js.native
  def startPoll(nTransfers: scala.Double, transferSize: scala.Double): scala.Unit = js.native
  def stopPoll(): scala.Unit = js.native
  def stopPoll(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def transfer(
    length: scala.Double,
    callback: js.Function2[/* error */ LibUSBException, /* data */ nodeLib.Buffer, scala.Unit]
  ): InEndpoint = js.native
}

