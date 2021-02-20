package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.Custom.DeviceAccessMode
import typings.winrtUwp.Windows.Devices.Custom.DeviceSharingMode
import typings.winrtUwp.Windows.Devices.Custom.IOControlAccessMode
import typings.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Opens a custom device asynchronously, and with the object returned from the open operation send asynchronous IOCTLs to the device. */
object Custom {
  
  /** Represents a custom device. */
  @JSGlobal("Windows.Devices.Custom.CustomDevice")
  @js.native
  abstract class CustomDevice ()
    extends typings.winrtUwp.Windows.Devices.Custom.CustomDevice
  object CustomDevice {
    
    /**
      * Creates a CustomDevice object asynchronously for the specified DeviceInformation.Id .
      * @param deviceId The DeviceInformation.Id of the device .
      * @param desiredAccess The desired access.
      * @param sharingMode The sharing mode.
      * @return Returns a custom device.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Custom.CustomDevice.fromIdAsync")
    @js.native
    def fromIdAsync(deviceId: String, desiredAccess: DeviceAccessMode, sharingMode: DeviceSharingMode): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Custom.CustomDevice] = js.native
    
    /**
      * Gets a device selector.
      * @param classGuid The Device Interface Class GUID of the device interface to create a device selector for.
      * @return The device selector.
      */
    /* static member */
    @JSGlobal("Windows.Devices.Custom.CustomDevice.getDeviceSelector")
    @js.native
    def getDeviceSelector(classGuid: String): String = js.native
  }
  
  /** The device access mode. */
  @JSGlobal("Windows.Devices.Custom.DeviceAccessMode")
  @js.native
  object DeviceAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Custom.DeviceAccessMode with Double] = js.native
    
    /* 0 */ val read: typings.winrtUwp.Windows.Devices.Custom.DeviceAccessMode.read with Double = js.native
    
    /* 2 */ val readWrite: typings.winrtUwp.Windows.Devices.Custom.DeviceAccessMode.readWrite with Double = js.native
    
    /* 1 */ val write: typings.winrtUwp.Windows.Devices.Custom.DeviceAccessMode.write with Double = js.native
  }
  
  /** The device sharing mode. */
  @JSGlobal("Windows.Devices.Custom.DeviceSharingMode")
  @js.native
  object DeviceSharingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Custom.DeviceSharingMode with Double] = js.native
    
    /* 1 */ val exclusive: typings.winrtUwp.Windows.Devices.Custom.DeviceSharingMode.exclusive with Double = js.native
    
    /* 0 */ val shared: typings.winrtUwp.Windows.Devices.Custom.DeviceSharingMode.shared with Double = js.native
  }
  
  /** Identifies the access mode. */
  @JSGlobal("Windows.Devices.Custom.IOControlAccessMode")
  @js.native
  object IOControlAccessMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Custom.IOControlAccessMode with Double] = js.native
    
    /* 0 */ val any: typings.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.any with Double = js.native
    
    /* 1 */ val read: typings.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.read with Double = js.native
    
    /* 3 */ val readWrite: typings.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.readWrite with Double = js.native
    
    /* 2 */ val write: typings.winrtUwp.Windows.Devices.Custom.IOControlAccessMode.write with Double = js.native
  }
  
  /** Identifies the buffering method. */
  @JSGlobal("Windows.Devices.Custom.IOControlBufferingMethod")
  @js.native
  object IOControlBufferingMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod with Double] = js.native
    
    /* 0 */ val buffered: typings.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.buffered with Double = js.native
    
    /* 1 */ val directInput: typings.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.directInput with Double = js.native
    
    /* 2 */ val directOutput: typings.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.directOutput with Double = js.native
    
    /* 3 */ val neither: typings.winrtUwp.Windows.Devices.Custom.IOControlBufferingMethod.neither with Double = js.native
  }
  
  /** Represents the control code. */
  @JSGlobal("Windows.Devices.Custom.IOControlCode")
  @js.native
  class IOControlCode protected ()
    extends typings.winrtUwp.Windows.Devices.Custom.IOControlCode {
    /**
      * The control code.
      * @param deviceType The device type.
      * @param function The device function.
      * @param accessMode The access mode.
      * @param bufferingMethod The buffering method.
      */
    def this(
      deviceType: Double,
      func: Double,
      accessMode: IOControlAccessMode,
      bufferingMethod: IOControlBufferingMethod
    ) = this()
  }
  
  /** Represents know device types. */
  @JSGlobal("Windows.Devices.Custom.KnownDeviceTypes")
  @js.native
  abstract class KnownDeviceTypes ()
    extends typings.winrtUwp.Windows.Devices.Custom.KnownDeviceTypes
  object KnownDeviceTypes {
    
    @JSGlobal("Windows.Devices.Custom.KnownDeviceTypes")
    @js.native
    val ^ : js.Any = js.native
    
    /** Defined by the device vendor. */
    /* static member */
    @JSGlobal("Windows.Devices.Custom.KnownDeviceTypes.unknown")
    @js.native
    def unknown: Double = js.native
    @scala.inline
    def unknown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unknown")(x.asInstanceOf[js.Any])
  }
}
