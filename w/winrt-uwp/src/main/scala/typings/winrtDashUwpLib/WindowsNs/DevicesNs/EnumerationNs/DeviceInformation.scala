package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a device. This class allows access to well-known device properties as well as additional properties specified during device enumeration. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
abstract class DeviceInformation () extends js.Object {
  /** The physical location of the device in its enclosure. For example, it may describe the location of a webcam inside a laptop. */
  var enclosureLocation: EnclosureLocation = js.native
  /** A string representing the identity of the device. */
  var id: java.lang.String = js.native
  /** Indicates whether this device is the default device for the class. */
  var isDefault: scala.Boolean = js.native
  /** Indicates whether this device is enabled. */
  var isEnabled: scala.Boolean = js.native
  /** Gets the type of DeviceInformation represented by this object. */
  var kind: DeviceInformationKind = js.native
  /** The name of the device. This name is in the best available language for the app. */
  var name: java.lang.String = js.native
  /** Gets the information about the capabilities for this device to pair. */
  var pairing: DeviceInformationPairing = js.native
  /** Property store containing well-known values as well as additional properties that can be specified during device enumeration. */
  var properties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /**
    * Gets a glyph for the device.
    * @return The object for managing the asynchronous operation that will return a DeviceThumbnail
    */
  def getGlyphThumbnailAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DeviceThumbnail] = js.native
  /**
    * Returns a thumbnail image for the device.
    * @return The object for managing the asynchronous operation that will return a DeviceThumbnail .
    */
  def getThumbnailAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[DeviceThumbnail] = js.native
  /**
    * Updates the properties of an existing DeviceInformation object.
    * @param updateInfo Indicates the properties to update.
    */
  def update(updateInfo: DeviceInformationUpdate): scala.Unit = js.native
}

/** Represents a device. This class allows access to well-known device properties as well as additional properties specified during device enumeration. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
object DeviceInformation extends js.Object {
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID.
    * @param deviceId The device ID.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  def createFromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation] = js.native
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID and a list of additional properties.
    * @param deviceId A string containing the DeviceInformation ID.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  def createFromIdAsync(
    deviceId: java.lang.String,
    additionalProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation] = js.native
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID, a list of additional properties, and a DeviceInformationKind parameter.
    * @param deviceId A string containing the DeviceInformation ID.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The type of DeviceInformation object you want to create.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  def createFromIdAsync(
    deviceId: java.lang.String,
    additionalProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    kind: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation] = js.native
  /**
    * Creates a DeviceWatcher for all devices.
    * @return The created DeviceWatcher .
    */
  def createWatcher(): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @return The created DeviceWatcher .
    */
  def createWatcher(aqsFilter: java.lang.String): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string and the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return The created DeviceWatcher .
    */
  def createWatcher(
    aqsFilter: java.lang.String,
    additionalProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string, the specified collection of properties, and the kind of devices.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The specific types of devices the DeviceWatcher is interested in.
    * @return The created DeviceWatcher .
    */
  def createWatcher(
    aqsFilter: java.lang.String,
    additionalProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    kind: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  ): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcher = js.native
  /**
    * Creates a DeviceWatcher for devices matching the specified DeviceClass .
    * @param deviceClass The class of device to enumerate using the DeviceWatcher .
    * @return The created DeviceWatcher .
    */
  def createWatcher(deviceClass: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass): winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcher = js.native
  /**
    * Enumerates all DeviceInformation objects.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(aqsFilter: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string and including the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(
    aqsFilter: java.lang.String,
    additionalProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string, the device kind, and including the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The specific type of device to find.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(
    aqsFilter: java.lang.String,
    additionalProperties: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    kind: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationKind
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationCollection] = js.native
  /**
    * Enumerates DeviceInformation objects of the specified class.
    * @param deviceClass The class of devices to enumerate.
    * @return The object for managing the asynchronous operation.
    */
  def findAllAsync(deviceClass: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationCollection] = js.native
  /**
    * Creates a filter to use to enumerate through a subset of device types.
    * @param deviceClass The type of devices that you want to create a filter for.
    * @return The Advanced Query Syntax (AQS) filter used to specifically enumerate through the device type specified by deviceClass.
    */
  def getAqsFilterFromDeviceClass(deviceClass: winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass): java.lang.String = js.native
}

