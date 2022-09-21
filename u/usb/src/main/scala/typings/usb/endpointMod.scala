package typings.usb

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import typings.usb.bindingsMod.Device
import typings.usb.bindingsMod.LibUSBException
import typings.usb.bindingsMod.Transfer
import typings.usb.descriptorsMod.EndpointDescriptor
import typings.usb.usbStrings.in
import typings.usb.usbStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointMod {
  
  @JSImport("usb/dist/usb/endpoint", "Endpoint")
  @js.native
  abstract class Endpoint protected () extends EventEmitter {
    def this(device: Device, descriptor: EndpointDescriptor) = this()
    
    var address: Double = js.native
    
    /** Clear the halt/stall condition for this endpoint. */
    def clearHalt(callback: js.Function1[/* error */ js.UndefOr[LibUSBException], Unit]): Unit = js.native
    
    /** Object with fields from the endpoint descriptor -- see libusb documentation or USB spec. */
    var descriptor: EndpointDescriptor = js.native
    
    /* protected */ var device: Device = js.native
    
    /** Endpoint direction: `"in"` or `"out"`. */
    var direction: in | out = js.native
    
    /**
      * Create a new `Transfer` object for this endpoint.
      *
      * The passed callback will be called when the transfer is submitted and finishes. Its arguments are the error (if any), the submitted buffer, and the amount of data actually written (for
      * OUT transfers) or read (for IN transfers).
      *
      * @param timeout Timeout for the transfer (0 means unlimited).
      * @param callback Transfer completion callback.
      */
    def makeTransfer(
      timeout: Double,
      callback: js.Function3[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ Buffer, 
          /* actualLength */ Double, 
          Unit
        ]
    ): Transfer = js.native
    
    /** Sets the timeout in milliseconds for transfers on this endpoint. The default, `0`, is infinite timeout. */
    var timeout: Double = js.native
    
    /** Endpoint type: `usb.LIBUSB_TRANSFER_TYPE_BULK`, `usb.LIBUSB_TRANSFER_TYPE_INTERRUPT`, or `usb.LIBUSB_TRANSFER_TYPE_ISOCHRONOUS`. */
    var transferType: Double = js.native
  }
  
  @JSImport("usb/dist/usb/endpoint", "InEndpoint")
  @js.native
  open class InEndpoint protected () extends Endpoint {
    def this(device: Device, descriptor: EndpointDescriptor) = this()
    
    var pollActive: Boolean = js.native
    
    /* protected */ var pollPending: Double = js.native
    
    /* protected */ var pollTransferSize: Double = js.native
    
    /* protected */ var pollTransfers: js.Array[Transfer] = js.native
    
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
    def startPoll(): js.Array[Transfer] = js.native
    def startPoll(nTransfers: Double): js.Array[Transfer] = js.native
    def startPoll(nTransfers: Double, transferSize: Double): js.Array[Transfer] = js.native
    def startPoll(
      nTransfers: Double,
      transferSize: Double,
      _callback: js.Function3[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ Buffer, 
          /* actualLength */ Double, 
          Unit
        ]
    ): js.Array[Transfer] = js.native
    def startPoll(
      nTransfers: Double,
      transferSize: Unit,
      _callback: js.Function3[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ Buffer, 
          /* actualLength */ Double, 
          Unit
        ]
    ): js.Array[Transfer] = js.native
    def startPoll(nTransfers: Unit, transferSize: Double): js.Array[Transfer] = js.native
    def startPoll(
      nTransfers: Unit,
      transferSize: Double,
      _callback: js.Function3[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ Buffer, 
          /* actualLength */ Double, 
          Unit
        ]
    ): js.Array[Transfer] = js.native
    def startPoll(
      nTransfers: Unit,
      transferSize: Unit,
      _callback: js.Function3[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ Buffer, 
          /* actualLength */ Double, 
          Unit
        ]
    ): js.Array[Transfer] = js.native
    
    /* protected */ def startPollTransfers(
      nTransfers: Double,
      transferSize: Double,
      callback: js.Function3[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ Buffer, 
          /* actualLength */ Double, 
          Unit
        ]
    ): js.Array[Transfer] = js.native
    /* protected */ def startPollTransfers(
      nTransfers: Double,
      transferSize: Unit,
      callback: js.Function3[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ Buffer, 
          /* actualLength */ Double, 
          Unit
        ]
    ): js.Array[Transfer] = js.native
    /* protected */ def startPollTransfers(
      nTransfers: Unit,
      transferSize: Double,
      callback: js.Function3[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ Buffer, 
          /* actualLength */ Double, 
          Unit
        ]
    ): js.Array[Transfer] = js.native
    /* protected */ def startPollTransfers(
      nTransfers: Unit,
      transferSize: Unit,
      callback: js.Function3[
          /* error */ js.UndefOr[LibUSBException], 
          /* buffer */ Buffer, 
          /* actualLength */ Double, 
          Unit
        ]
    ): js.Array[Transfer] = js.native
    
    /**
      * Stop polling.
      *
      * Further data may still be received. The `end` event is emitted and the callback is called once all transfers have completed or canceled.
      *
      * The device must be open to use this method.
      * @param callback
      */
    def stopPoll(): Unit = js.native
    def stopPoll(callback: js.Function0[Unit]): Unit = js.native
    
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
      length: Double,
      callback: js.Function2[/* error */ js.UndefOr[LibUSBException], /* data */ js.UndefOr[Buffer], Unit]
    ): InEndpoint = js.native
  }
  
  @JSImport("usb/dist/usb/endpoint", "OutEndpoint")
  @js.native
  open class OutEndpoint protected () extends Endpoint {
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
      * @param callback
      */
    def transfer(buffer: Buffer): OutEndpoint = js.native
    def transfer(
      buffer: Buffer,
      callback: js.Function2[/* error */ js.UndefOr[LibUSBException], /* actual */ Double, Unit]
    ): OutEndpoint = js.native
    
    def transferWithZLP(buffer: Buffer, callback: js.Function1[/* error */ js.UndefOr[LibUSBException], Unit]): Unit = js.native
  }
}
