package typings.usb.usbMod

import typings.node.Buffer
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
  def startPoll(): Unit = js.native
  def startPoll(nTransfers: Double): Unit = js.native
  def startPoll(nTransfers: Double, transferSize: Double): Unit = js.native
  /**
    * Stop polling.
    *
    * Further data may still be received. The `end` event is emitted and the callback is called once all transfers have completed or canceled.
    *
    * The device must be open to use this method.
    * @param cb
    */
  def stopPoll(): Unit = js.native
  def stopPoll(cb: js.Function0[Unit]): Unit = js.native
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
  def transfer(length: Double, callback: js.Function2[/* error */ LibUSBException, /* data */ Buffer, Unit]): InEndpoint = js.native
}

