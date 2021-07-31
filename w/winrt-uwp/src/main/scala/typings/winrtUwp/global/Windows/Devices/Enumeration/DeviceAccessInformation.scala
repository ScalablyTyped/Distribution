package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information about access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
@js.native
abstract class DeviceAccessInformation ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation
object DeviceAccessInformation {
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Initializes a DeviceAccessInformation object based on a given DeviceClass .
    * @param deviceClass Device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given DeviceClass .
    */
  /* static member */
  @scala.inline
  def createFromDeviceClass(deviceClass: typings.winrtUwp.Windows.Devices.Enumeration.DeviceClass): typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromDeviceClass")(deviceClass.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation]
  
  /**
    * Initializes a DeviceAccessInformation object based on a device class id.
    * @param deviceClassId Id of the device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device class id.
    */
  /* static member */
  @scala.inline
  def createFromDeviceClassId(deviceClassId: String): typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromDeviceClassId")(deviceClassId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation]
  
  /**
    * Initializes a DeviceAccessInformation object based on a device id.
    * @param deviceId Id of the device to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device id.
    */
  /* static member */
  @scala.inline
  def createFromId(deviceId: String): typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromId")(deviceId.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation]
}
