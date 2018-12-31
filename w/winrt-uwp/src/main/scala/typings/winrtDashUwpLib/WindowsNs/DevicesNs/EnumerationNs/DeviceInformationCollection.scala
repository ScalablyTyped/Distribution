package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of DeviceInformation objects. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationCollection")
@js.native
abstract class DeviceInformationCollection ()
  extends stdLib.Array[DeviceInformation] {
  /** The number of DeviceInformation objects in the collection. */
  var size: scala.Double = js.native
  /**
    * Gets an object that can iterate through the enumerated DeviceInformation objects, starting with the first.
    * @return An object that can iterate through the enumerated devices, starting with the first.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[DeviceInformation] = js.native
  /**
    * Gets the DeviceInformation object at the specified index.
    * @param index The index.
    * @return The DeviceInformation object at the specified index.
    */
  def getAt(index: scala.Double): DeviceInformation = js.native
  /**
    * Gets a range of DeviceInformation objects.
    * @param startIndex The index at which to start retrieving DeviceInformation objects.
    */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_ItemsReturnValueDeviceInformation = js.native
  def indexOf(value: DeviceInformation, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
    * Returns the index of the specified DeviceInformation object in the collection.
    * @param value The DeviceInformation object in the collection.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: DeviceInformation): winrtDashUwpLib.Anon_Index = js.native
}

