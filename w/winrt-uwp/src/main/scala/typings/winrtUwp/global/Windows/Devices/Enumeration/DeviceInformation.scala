package typings.winrtUwp.global.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a device. This class allows access to well-known device properties as well as additional properties specified during device enumeration. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
abstract class DeviceInformation ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
object DeviceInformation {
  
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID.
    * @param deviceId The device ID.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.createFromIdAsync")
  @js.native
  def createFromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation] = js.native
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID and a list of additional properties.
    * @param deviceId A string containing the DeviceInformation ID.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.createFromIdAsync")
  @js.native
  def createFromIdAsync(deviceId: String, additionalProperties: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation] = js.native
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID, a list of additional properties, and a DeviceInformationKind parameter.
    * @param deviceId A string containing the DeviceInformation ID.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The type of DeviceInformation object you want to create.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.createFromIdAsync")
  @js.native
  def createFromIdAsync(
    deviceId: String,
    additionalProperties: IIterable[String],
    kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation] = js.native
  
  /**
    * Creates a DeviceWatcher for all devices.
    * @return The created DeviceWatcher .
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.createWatcher")
  @js.native
  def createWatcher(): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @return The created DeviceWatcher .
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.createWatcher")
  @js.native
  def createWatcher(aqsFilter: String): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string and the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return The created DeviceWatcher .
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.createWatcher")
  @js.native
  def createWatcher(aqsFilter: String, additionalProperties: IIterable[String]): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string, the specified collection of properties, and the kind of devices.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The specific types of devices the DeviceWatcher is interested in.
    * @return The created DeviceWatcher .
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.createWatcher")
  @js.native
  def createWatcher(
    aqsFilter: String,
    additionalProperties: IIterable[String],
    kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind
  ): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified DeviceClass .
    * @param deviceClass The class of device to enumerate using the DeviceWatcher .
    * @return The created DeviceWatcher .
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.createWatcher")
  @js.native
  def createWatcher(deviceClass: typings.winrtUwp.Windows.Devices.Enumeration.DeviceClass): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = js.native
  
  /**
    * Enumerates all DeviceInformation objects.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.findAllAsync")
  @js.native
  def findAllAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.findAllAsync")
  @js.native
  def findAllAsync(aqsFilter: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string and including the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.findAllAsync")
  @js.native
  def findAllAsync(aqsFilter: String, additionalProperties: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string, the device kind, and including the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The specific type of device to find.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.findAllAsync")
  @js.native
  def findAllAsync(
    aqsFilter: String,
    additionalProperties: IIterable[String],
    kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects of the specified class.
    * @param deviceClass The class of devices to enumerate.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.findAllAsync")
  @js.native
  def findAllAsync(deviceClass: typings.winrtUwp.Windows.Devices.Enumeration.DeviceClass): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = js.native
  
  /**
    * Creates a filter to use to enumerate through a subset of device types.
    * @param deviceClass The type of devices that you want to create a filter for.
    * @return The Advanced Query Syntax (AQS) filter used to specifically enumerate through the device type specified by deviceClass.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation.getAqsFilterFromDeviceClass")
  @js.native
  def getAqsFilterFromDeviceClass(deviceClass: typings.winrtUwp.Windows.Devices.Enumeration.DeviceClass): String = js.native
}
