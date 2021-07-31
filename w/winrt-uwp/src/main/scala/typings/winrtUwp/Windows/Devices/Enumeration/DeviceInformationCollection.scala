package typings.winrtUwp.Windows.Devices.Enumeration

import typings.std.Array
import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.anon.Index
import typings.winrtUwp.anon.ItemsDeviceInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of DeviceInformation objects. */
@js.native
trait DeviceInformationCollection
  extends StObject
     with Array[DeviceInformation] {
  
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
  def getMany(startIndex: Double): ItemsDeviceInformation = js.native
  
  def indexOf(value: DeviceInformation, extra: js.Any*): Index = js.native
  /* hack */
  @JSName("indexOf")
  def indexOf_Double(searchElement: DeviceInformation): Double = js.native
  
  /** The number of DeviceInformation objects in the collection. */
  var size: Double = js.native
}
