package typings.winrtUwp.global.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Windows.Devices.Bluetooth.Rfcomm namespace defines Windows Runtime classes that a Windows Store apps and desktop applications can use to communicate with Bluetooth devices. For more information, see Bluetooth */
@JSGlobal("Windows.Devices.Bluetooth.Rfcomm")
@js.native
object Rfcomm extends js.Object {
  /** Represents an instance of a service on a Bluetooth BR device. */
  @js.native
  abstract class RfcommDeviceService ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService
  
  /** Represents an RFCOMM service ID. */
  @js.native
  abstract class RfcommServiceId ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId
  
  /** Represents an instance of a local RFCOMM service. */
  @js.native
  abstract class RfcommServiceProvider ()
    extends typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider
  
  /* static members */
  @js.native
  object RfcommDeviceService extends js.Object {
    /**
      * Gets an RfcommDeviceService object from a DeviceInformation Id for an RFCOMM service instance.
      * @param deviceId The DeviceInformation Id that identifies the RFCOMM service instance. This id can be retrieved from Windows.Devices.Enumeration .
      * @return The RfcommDeviceService object that represents the RFCOMM service instance.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService] = js.native
    /**
      * Gets an Advanced Query Syntax (AQS) string for identifying instances of an RFCOMM service. This string is passed to the CreateWatcher method.
      * @param serviceId The service id for which to query.
      * @return An AQS string for identifying RFCOMM service instances.
      */
    def getDeviceSelector(serviceId: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): String = js.native
  }
  
  /* static members */
  @js.native
  object RfcommServiceId extends js.Object {
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Generic File Transfer service (with short id 0x1202). */
    var genericFileTransfer: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized OBEX File Transfer service (with short id 0x1106). */
    var obexFileTransfer: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized OBEX Object Push service (with short id 0x1105). */
    var obexObjectPush: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Phone Book Access (PCE) service (with short id 0x112E). */
    var phoneBookAccessPce: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Phone Book Access (PSE) service (with short id 0x112F). */
    var phoneBookAccessPse: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Serial Port service (with short id 0x1101). */
    var serialPort: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    /**
      * Creates a RfcommServiceId object from a 32-bit service id.
      * @param shortId The 32-bit service id.
      * @return The RfcommServiceId object.
      */
    def fromShortId(shortId: Double): typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    /**
      * Creates a RfcommServiceId object from a 128-bit service id.
      * @param uuid The 128-bit service id.
      * @return The RfcommServiceId object.
      */
    def fromUuid(uuid: String): typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
  }
  
  /* static members */
  @js.native
  object RfcommServiceProvider extends js.Object {
    /**
      * Gets a RfcommServiceProvider object from a DeviceInformation Id for a RFCOMM service instance.
      * @param serviceId The RfcommServiceId to be hosted locally.
      * @return The RfcommServiceProvider object that represents the local RFCOMM service instance.
      */
    def createAsync(serviceId: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider] = js.native
  }
  
}

