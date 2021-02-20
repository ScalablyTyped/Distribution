package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information about access to a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation")
@js.native
abstract class DeviceAccessInformation ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation
object DeviceAccessInformation {
  
  /**
    * Initializes a DeviceAccessInformation object based on a given DeviceClass .
    * @param deviceClass Device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given DeviceClass .
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation.createFromDeviceClass")
  @js.native
  def createFromDeviceClass(deviceClass: typings.winrtUwp.Windows.Devices.Enumeration.DeviceClass): typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = js.native
  
  /**
    * Initializes a DeviceAccessInformation object based on a device class id.
    * @param deviceClassId Id of the device class to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device class id.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation.createFromDeviceClassId")
  @js.native
  def createFromDeviceClassId(deviceClassId: String): typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = js.native
  
  /**
    * Initializes a DeviceAccessInformation object based on a device id.
    * @param deviceId Id of the device to get DeviceAccessInformation about.
    * @return The DeviceAccessInformation object for the given device id.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceAccessInformation.createFromId")
  @js.native
  def createFromId(deviceId: String): typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessInformation = js.native
}
