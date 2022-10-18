package typings.winrtUwp.global.Windows.Devices.Bluetooth

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Devices.Bluetooth.Rfcomm namespace defines Windows Runtime classes that a Windows Store apps and desktop applications can use to communicate with Bluetooth devices. For more information, see Bluetooth */
object Rfcomm {
  
  /** Represents an instance of a service on a Bluetooth BR device. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService")
  @js.native
  open class RfcommDeviceService ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService
  object RfcommDeviceService {
    
    @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets an RfcommDeviceService object from a DeviceInformation Id for an RFCOMM service instance.
      * @param deviceId The DeviceInformation Id that identifies the RFCOMM service instance. This id can be retrieved from Windows.Devices.Enumeration .
      * @return The RfcommDeviceService object that represents the RFCOMM service instance.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommDeviceService]]
    
    /**
      * Gets an Advanced Query Syntax (AQS) string for identifying instances of an RFCOMM service. This string is passed to the CreateWatcher method.
      * @param serviceId The service id for which to query.
      * @return An AQS string for identifying RFCOMM service instances.
      */
    /* static member */
    inline def getDeviceSelector(serviceId: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(serviceId.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  /** Represents an RFCOMM service ID. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId")
  @js.native
  open class RfcommServiceId ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId {
    
    /**
      * Converts the RfcommServiceId to a 32-bit service id if possible.
      * @return Returns the 32-bit service id if the RfcommServiceId represents a standardized service.
      */
    /* CompleteClass */
    override def asShortId(): Double = js.native
    
    /**
      * Converts the RfcommServiceId to a string.
      * @return Returns the string representation of the 128-bit service id.
      */
    /* CompleteClass */
    override def asString(): String = js.native
    
    /** Retrieves the 128-bit service id. */
    /* CompleteClass */
    var uuid: String = js.native
  }
  object RfcommServiceId {
    
    @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a RfcommServiceId object from a 32-bit service id.
      * @param shortId The 32-bit service id.
      * @return The RfcommServiceId object.
      */
    /* static member */
    inline def fromShortId(shortId: Double): typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = ^.asInstanceOf[js.Dynamic].applyDynamic("fromShortId")(shortId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId]
    
    /**
      * Creates a RfcommServiceId object from a 128-bit service id.
      * @param uuid The 128-bit service id.
      * @return The RfcommServiceId object.
      */
    /* static member */
    inline def fromUuid(uuid: String): typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUuid")(uuid.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId]
    
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Generic File Transfer service (with short id 0x1202). */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId.genericFileTransfer")
    @js.native
    def genericFileTransfer: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    inline def genericFileTransfer_=(x: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("genericFileTransfer")(x.asInstanceOf[js.Any])
    
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized OBEX File Transfer service (with short id 0x1106). */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId.obexFileTransfer")
    @js.native
    def obexFileTransfer: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    inline def obexFileTransfer_=(x: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("obexFileTransfer")(x.asInstanceOf[js.Any])
    
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized OBEX Object Push service (with short id 0x1105). */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId.obexObjectPush")
    @js.native
    def obexObjectPush: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    inline def obexObjectPush_=(x: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("obexObjectPush")(x.asInstanceOf[js.Any])
    
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Phone Book Access (PCE) service (with short id 0x112E). */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId.phoneBookAccessPce")
    @js.native
    def phoneBookAccessPce: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    inline def phoneBookAccessPce_=(x: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneBookAccessPce")(x.asInstanceOf[js.Any])
    
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Phone Book Access (PSE) service (with short id 0x112F). */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId.phoneBookAccessPse")
    @js.native
    def phoneBookAccessPse: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    inline def phoneBookAccessPse_=(x: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneBookAccessPse")(x.asInstanceOf[js.Any])
    
    /** Creates a RfcommServiceId object corresponding to the service id for the standardized Serial Port service (with short id 0x1101). */
    /* static member */
    @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId.serialPort")
    @js.native
    def serialPort: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId = js.native
    inline def serialPort_=(x: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialPort")(x.asInstanceOf[js.Any])
  }
  
  /** Represents an instance of a local RFCOMM service. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider")
  @js.native
  open class RfcommServiceProvider ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider
  object RfcommServiceProvider {
    
    @JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a RfcommServiceProvider object from a DeviceInformation Id for a RFCOMM service instance.
      * @param serviceId The RfcommServiceId to be hosted locally.
      * @return The RfcommServiceProvider object that represents the local RFCOMM service instance.
      */
    /* static member */
    inline def createAsync(serviceId: typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(serviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider]]
  }
}
