package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs

import typings.std.Array
import typings.winrtDashUwp.Anon_Index
import typings.winrtDashUwp.Anon_ItemsReturnValueDeviceInformation
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of DeviceInformation objects. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationCollection")
@js.native
abstract class DeviceInformationCollection () extends Array[DeviceInformation] {
  /** The number of DeviceInformation objects in the collection. */
  var size: Double = js.native
  /**
    * Gets an object that can iterate through the enumerated DeviceInformation objects, starting with the first.
    * @return An object that can iterate through the enumerated devices, starting with the first.
    */
  def first(): IIterator[DeviceInformation] = js.native
  /**
    * Gets the DeviceInformation object at the specified index.
    * @param index The index.
    * @return The DeviceInformation object at the specified index.
    */
  def getAt(index: Double): DeviceInformation = js.native
  /**
    * Gets a range of DeviceInformation objects.
    * @param startIndex The index at which to start retrieving DeviceInformation objects.
    */
  def getMany(startIndex: Double): Anon_ItemsReturnValueDeviceInformation = js.native
  def indexOf(value: DeviceInformation, extra: js.Any*): Anon_Index = js.native
  /**
    * Returns the index of the specified DeviceInformation object in the collection.
    * @param value The DeviceInformation object in the collection.
    */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: DeviceInformation): Anon_Index = js.native
}

