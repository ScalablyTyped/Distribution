package typings.winrtUwp.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Networking.HostName
import typings.winrtUwp.Windows.Networking.Sockets.SocketProtectionLevel
import typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListener
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Devices.Bluetooth.Rfcomm namespace defines Windows Runtime classes that a Windows Store apps and desktop applications can use to communicate with Bluetooth devices. For more information, see Bluetooth */
object Rfcomm {
  
  /** Represents an instance of a service on a Bluetooth BR device. */
  @js.native
  trait RfcommDeviceService extends StObject {
    
    /** Closes the RFCOMM device. */
    def close(): Unit = js.native
    
    /** Gets the connection host name of the RFCOMM service instance, which is used to connect to the remote device. */
    var connectionHostName: HostName = js.native
    
    /** Gets the connection service name of the RFCOMM service instance, which is used to connect to the remote device. */
    var connectionServiceName: String = js.native
    
    /** Gets the BluetoothDevice object describing the device associated with the current RfcommDeviceService object. */
    var device: BluetoothDevice = js.native
    
    /**
      * Gets the cached SDP attributes of the RFCOMM service instance.
      * @return The SDP attributes of the RFCOMM service instance.
      */
    def getSdpRawAttributesAsync(): IPromiseWithIAsyncOperation[IMapView[Any, Any]] = js.native
    /**
      * Gets the SDP attributes of the RFCOMM service instance.
      * @param cacheMode Indicates whether SDP attributes should be retrieved from the cache or from the device.
      * @return The SDP attributes of the RFCOMM service instance.
      */
    def getSdpRawAttributesAsync(cacheMode: BluetoothCacheMode): IPromiseWithIAsyncOperation[IMapView[Any, Any]] = js.native
    
    /** Gets the maximum SocketProtectionLevel supported by this RFCOMM service instance. */
    var maxProtectionLevel: SocketProtectionLevel = js.native
    
    /** Gets the current SocketProtectionLevel of the RFCOMM service instance. */
    var protectionLevel: SocketProtectionLevel = js.native
    
    /** Gets the RfcommServiceId of this RFCOMM service instance. */
    var serviceId: RfcommServiceId = js.native
  }
  
  /** Represents an RFCOMM service ID. */
  trait RfcommServiceId extends StObject {
    
    /**
      * Converts the RfcommServiceId to a 32-bit service id if possible.
      * @return Returns the 32-bit service id if the RfcommServiceId represents a standardized service.
      */
    def asShortId(): Double
    
    /**
      * Converts the RfcommServiceId to a string.
      * @return Returns the string representation of the 128-bit service id.
      */
    def asString(): String
    
    /** Retrieves the 128-bit service id. */
    var uuid: String
  }
  object RfcommServiceId {
    
    inline def apply(asShortId: () => Double, asString: () => String, uuid: String): RfcommServiceId = {
      val __obj = js.Dynamic.literal(asShortId = js.Any.fromFunction0(asShortId), asString = js.Any.fromFunction0(asString), uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[RfcommServiceId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RfcommServiceId] (val x: Self) extends AnyVal {
      
      inline def setAsShortId(value: () => Double): Self = StObject.set(x, "asShortId", js.Any.fromFunction0(value))
      
      inline def setAsString(value: () => String): Self = StObject.set(x, "asString", js.Any.fromFunction0(value))
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents an instance of a local RFCOMM service. */
  @js.native
  trait RfcommServiceProvider extends StObject {
    
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
}
