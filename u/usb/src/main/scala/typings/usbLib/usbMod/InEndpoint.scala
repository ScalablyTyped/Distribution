package typings
package usbLib.usbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usb", "InEndpoint")
@js.native
class InEndpoint protected () extends Endpoint {
  def this(device: Device, descriptor: EndpointDescriptor) = this()
  /**
    * Start polling the endpoint.
    *
    * The library will keep `nTransfers` transfers of size `transferSize` pending in the kernel at all times to ensure continuous data flow.
    * This is handled by the libusb event thread, so it continues even if the Node v8 thread is busy. The `data` and `error` events are emitted as transfers complete.
    *
    * The device must be open to use this method.
    * @param nTransfers
    * @param transferSize
    */
  def startPoll(): scala.Unit = js.native
  def startPoll(nTransfers: scala.Double): scala.Unit = js.native
  def startPoll(nTransfers: scala.Double, transferSize: scala.Double): scala.Unit = js.native
  /**
    * Stop polling.
    *
    * Further data may still be received. The `end` event is emitted and the callback is called once all transfers have completed or canceled.
    *
    * The device must be open to use this method.
    * @param cb
    */
  def stopPoll(): scala.Unit = js.native
  def stopPoll(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Perform a transfer to read data from the endpoint.
    *
    * If length is greater than maxPacketSize, libusb will automatically split the transfer in multiple packets, and you will receive one callback with all data once all packets are complete.
    *
    * `this` in the callback is the InEndpoint object.
    *
    * The device must be open to use this method.
    * @param length
    * @param callback
    */
  def transfer(
    length: scala.Double,
    callback: js.Function2[/* error */ LibUSBException, /* data */ nodeLib.Buffer, scala.Unit]
  ): InEndpoint = js.native
}

