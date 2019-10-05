package typings.winrtDashUwp.Windows.Devices.Bluetooth

import typings.winrtDashUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
import typings.winrtDashUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider
import typings.winrtDashUwp.Windows.Foundation.Collections.IMap
import typings.winrtDashUwp.Windows.Foundation.Collections.IMapView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Networking.HostName
import typings.winrtDashUwp.Windows.Networking.Sockets.SocketProtectionLevel
import typings.winrtDashUwp.Windows.Networking.Sockets.StreamSocketListener
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Windows.Devices.Bluetooth.Rfcomm namespace defines Windows Runtime classes that a Windows Store apps and desktop applications can use to communicate with Bluetooth devices. For more information, see Bluetooth */
@JSGlobal("Windows.Devices.Bluetooth.Rfcomm")
@js.native
object Rfcomm extends js.Object {
  /** Represents an instance of a service on a Bluetooth BR device. */
  @js.native
  abstract class RfcommDeviceService () extends js.Object {
    /** Gets the connection host name of the RFCOMM service instance, which is used to connect to the remote device. */
    var connectionHostName: HostName = js.native
    /** Gets the connection service name of the RFCOMM service instance, which is used to connect to the remote device. */
    var connectionServiceName: String = js.native
    /** Gets the BluetoothDevice object describing the device associated with the current RfcommDeviceService object. */
    var device: BluetoothDevice = js.native
    /** Gets the maximum SocketProtectionLevel supported by this RFCOMM service instance. */
    var maxProtectionLevel: SocketProtectionLevel = js.native
    /** Gets the current SocketProtectionLevel of the RFCOMM service instance. */
    var protectionLevel: SocketProtectionLevel = js.native
    /** Gets the RfcommServiceId of this RFCOMM service instance. */
    var serviceId: RfcommServiceId = js.native
    /** Closes the RFCOMM device. */
    def close(): Unit = js.native
    /**
      * Gets the cached SDP attributes of the RFCOMM service instance.
      * @return The SDP attributes of the RFCOMM service instance.
      */
    def getSdpRawAttributesAsync(): IPromiseWithIAsyncOperation[IMapView[_, _]] = js.native
    /**
      * Gets the SDP attributes of the RFCOMM service instance.
      * @param cacheMode Indicates whether SDP attributes should be retrieved from the cache or from the device.
      * @return The SDP attributes of the RFCOMM service instance.
      */
    def getSdpRawAttributesAsync(cacheMode: BluetoothCacheMode): IPromiseWithIAsyncOperation[IMapView[_, _]] = js.native
  }
  
  /** Represents an RFCOMM service ID. */
  @js.native
  abstract class RfcommServiceId () extends js.Object {
    /** Retrieves the 128-bit service id. */
    var uuid: String = js.native
    /**
      * Converts the RfcommServiceId to a 32-bit service id if possible.
      * @return Returns the 32-bit service id if the RfcommServiceId represents a standardized service.
      */
    def asShortId(): Double = js.native
    /**
      * Converts the RfcommServiceId to a string.
      * @return Returns the string representation of the 128-bit service id.
      */
    def asString(): String = js.native
  }
  
  /** Represents an instance of a local RFCOMM service. */
  @js.native
  abstract class RfcommServiceProvider () extends js.Object {
    /** Gets a collection of SDP attributes for advertising. */
    var sdpRawAttributes: IMap[Double, IBuffer] = js.native
    /** Gets the RfcommServiceId of this local RFCOMM service instance. */
    var serviceId: RfcommServiceId = js.native
    /**
      * Begins advertising the SDP attributes.
      * @param listener The StreamSocketListener that is listening for incoming connections.
      */
    def startAdvertising(listener: StreamSocketListener): Unit = js.native
    /**
      * Begins advertising the SDP attributes.
      * @param listener The StreamSocketListener that is listening for incoming connections.
      * @param radioDiscoverable Indicates whether the radio is discoverable (true) or not (false).
      */
    def startAdvertising(listener: StreamSocketListener, radioDiscoverable: Boolean): Unit = js.native
    /** Stops advertising the SDP attributes. */
    def stopAdvertising(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object RfcommDeviceService extends js.Object {
    /**
      * Gets an RfcommDeviceService object from a DeviceInformation Id for an RFCOMM service instance.
      * @param deviceId The DeviceInformation Id that identifies the RFCOMM service instance. This id can be retrieved from Windows.Devices.Enumeration .
      * @return The RfcommDeviceService object that represents the RFCOMM service instance.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[RfcommDeviceService] = js.native
    /**
      * Gets an Advanced Query Syntax (AQS) string for identifying instances of an RFCOMM service. This string is passed to the CreateWatcher method.
      * @param serviceId The service id for which to query.
      * @return An AQS string for identifying RFCOMM service instances.
      */
    def getDeviceSelector(serviceId: RfcommServiceId): String = js.native
  }
  
  /* static members */
  @js.native
  object RfcommServiceId extends js.Object {
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Generic File Transfer service (with short id 0x1202). */
    var genericFileTransfer: RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized OBEX File Transfer service (with short id 0x1106). */
    var obexFileTransfer: RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized OBEX Object Push service (with short id 0x1105). */
    var obexObjectPush: RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Phone Book Access (PCE) service (with short id 0x112E). */
    var phoneBookAccessPce: RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Phone Book Access (PSE) service (with short id 0x112F). */
    var phoneBookAccessPse: RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Serial Port service (with short id 0x1101). */
    var serialPort: RfcommServiceId = js.native
    /**
      * Creates a RfcommServiceId object from a 32-bit service id.
      * @param shortId The 32-bit service id.
      * @return The RfcommServiceId object.
      */
    def fromShortId(shortId: Double): RfcommServiceId = js.native
    /**
      * Creates a RfcommServiceId object from a 128-bit service id.
      * @param uuid The 128-bit service id.
      * @return The RfcommServiceId object.
      */
    def fromUuid(uuid: String): RfcommServiceId = js.native
  }
  
  /* static members */
  @js.native
  object RfcommServiceProvider extends js.Object {
    /**
      * Gets a RfcommServiceProvider object from a DeviceInformation Id for a RFCOMM service instance.
      * @param serviceId The RfcommServiceId to be hosted locally.
      * @return The RfcommServiceProvider object that represents the local RFCOMM service instance.
      */
    def createAsync(serviceId: RfcommServiceId): IPromiseWithIAsyncOperation[RfcommServiceProvider] = js.native
  }
  
}

