package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PortableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods for accessing the storage functionality of a portable device that supports WPD. */
@JSGlobal("Windows.Devices.Portable.StorageDevice")
@js.native
abstract class StorageDevice () extends js.Object

/** Provides methods for accessing the storage functionality of a portable device that supports WPD. */
@JSGlobal("Windows.Devices.Portable.StorageDevice")
@js.native
object StorageDevice extends js.Object {
  /**
    * Gets a StorageFolder object from a DeviceInformation Id for a removable storage device.
    * @param DeviceId The DeviceInformation ID that identifies the removable storage device. This id can be retrieved from Windows.Devices.Enumeration or the DeviceInformationId property of the AutoPlay device event arguments. For more information, see Quickstart: Register an app for an AutoPlay device. In order for FromId to succeed, the app must declare both the removableStorage capability as shown in the App capability declarations and file type associations for the files it wishes to access on the device as shown in How to handle file activation. For more information, see the Removable Storage sample.
    * @return The storage folder object that represents the removable storage device and provides access to content on the device.
    */
  def fromId(DeviceId: java.lang.String): winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /**
    * An Advanced Query Syntax (AQS) string for identifying removable storage devices. This string is passed to the FindAllAsync or CreateWatcher method.
    * @return An AQS string for identifying storage devices.
    */
  def getDeviceSelector(): java.lang.String = js.native
}

