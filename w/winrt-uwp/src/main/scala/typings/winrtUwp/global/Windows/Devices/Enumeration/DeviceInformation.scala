package typings.winrtUwp.global.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a device. This class allows access to well-known device properties as well as additional properties specified during device enumeration. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
open class DeviceInformation ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation {
  
  /** The physical location of the device in its enclosure. For example, it may describe the location of a webcam inside a laptop. */
  /* CompleteClass */
  var enclosureLocation: typings.winrtUwp.Windows.Devices.Enumeration.EnclosureLocation = js.native
  
  /**
    * Gets a glyph for the device.
    * @return The object for managing the asynchronous operation that will return a DeviceThumbnail
    */
  /* CompleteClass */
  override def getGlyphThumbnailAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceThumbnail] = js.native
  
  /**
    * Returns a thumbnail image for the device.
    * @return The object for managing the asynchronous operation that will return a DeviceThumbnail .
    */
  /* CompleteClass */
  override def getThumbnailAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceThumbnail] = js.native
  
  /** A string representing the identity of the device. */
  /* CompleteClass */
  var id: String = js.native
  
  /** Indicates whether this device is the default device for the class. */
  /* CompleteClass */
  var isDefault: Boolean = js.native
  
  /** Indicates whether this device is enabled. */
  /* CompleteClass */
  var isEnabled: Boolean = js.native
  
  /** Gets the type of DeviceInformation represented by this object. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind = js.native
  
  /** The name of the device. This name is in the best available language for the app. */
  /* CompleteClass */
  var name: String = js.native
  
  /** Gets the information about the capabilities for this device to pair. */
  /* CompleteClass */
  var pairing: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationPairing = js.native
  
  /** Property store containing well-known values as well as additional properties that can be specified during device enumeration. */
  /* CompleteClass */
  var properties: IMapView[String, Any] = js.native
  
  /**
    * Updates the properties of an existing DeviceInformation object.
    * @param updateInfo Indicates the properties to update.
    */
  /* CompleteClass */
  override def update(updateInfo: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationUpdate): Unit = js.native
}
object DeviceInformation {
  
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID.
    * @param deviceId The device ID.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  /* static member */
  inline def createFromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation]]
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID and a list of additional properties.
    * @param deviceId A string containing the DeviceInformation ID.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  /* static member */
  inline def createFromIdAsync(deviceId: String, additionalProperties: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromIdAsync")(deviceId.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation]]
  /**
    * Creates a DeviceInformation object from a DeviceInformation ID, a list of additional properties, and a DeviceInformationKind parameter.
    * @param deviceId A string containing the DeviceInformation ID.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The type of DeviceInformation object you want to create.
    * @return An object for starting and managing the asynchronous creation of the DeviceInformation object.
    */
  /* static member */
  inline def createFromIdAsync(
    deviceId: String,
    additionalProperties: IIterable[String],
    kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromIdAsync")(deviceId.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation]]
  
  /**
    * Creates a DeviceWatcher for all devices.
    * @return The created DeviceWatcher .
    */
  /* static member */
  inline def createWatcher(): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")().asInstanceOf[typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher]
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @return The created DeviceWatcher .
    */
  /* static member */
  inline def createWatcher(aqsFilter: String): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(aqsFilter.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher]
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string and the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return The created DeviceWatcher .
    */
  /* static member */
  inline def createWatcher(aqsFilter: String, additionalProperties: IIterable[String]): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(aqsFilter.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher]
  /**
    * Creates a DeviceWatcher for devices matching the specified Advanced Query Syntax (AQS) string, the specified collection of properties, and the kind of devices.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The specific types of devices the DeviceWatcher is interested in.
    * @return The created DeviceWatcher .
    */
  /* static member */
  inline def createWatcher(
    aqsFilter: String,
    additionalProperties: IIterable[String],
    kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind
  ): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(aqsFilter.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher]
  /**
    * Creates a DeviceWatcher for devices matching the specified DeviceClass .
    * @param deviceClass The class of device to enumerate using the DeviceWatcher .
    * @return The created DeviceWatcher .
    */
  /* static member */
  inline def createWatcher(deviceClass: typings.winrtUwp.Windows.Devices.Enumeration.DeviceClass): typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createWatcher")(deviceClass.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcher]
  
  /**
    * Enumerates all DeviceInformation objects.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  inline def findAllAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection]]
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  inline def findAllAsync(aqsFilter: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(aqsFilter.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection]]
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string and including the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  inline def findAllAsync(aqsFilter: String, additionalProperties: IIterable[String]): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(aqsFilter.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection]]
  /**
    * Enumerates DeviceInformation objects matching the specified Advanced Query Syntax (AQS) string, the device kind, and including the specified collection of properties.
    * @param aqsFilter An AQS string that filters the DeviceInformation objects to enumerate. Typically this string is retrieved from the GetDeviceSelector method of a class that interacts with devices. For example, GetDeviceSelector retrieves the string for the StorageDevice class.
    * @param additionalProperties An iterable list of additional properties to include in the Properties property of the DeviceInformation objects in the enumeration results. For more info on what the properties represent, see Device information properties.
    * @param kind The specific type of device to find.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  inline def findAllAsync(
    aqsFilter: String,
    additionalProperties: IIterable[String],
    kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationKind
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(aqsFilter.asInstanceOf[js.Any], additionalProperties.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection]]
  /**
    * Enumerates DeviceInformation objects of the specified class.
    * @param deviceClass The class of devices to enumerate.
    * @return The object for managing the asynchronous operation.
    */
  /* static member */
  inline def findAllAsync(deviceClass: typings.winrtUwp.Windows.Devices.Enumeration.DeviceClass): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAllAsync")(deviceClass.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationCollection]]
  
  /**
    * Creates a filter to use to enumerate through a subset of device types.
    * @param deviceClass The type of devices that you want to create a filter for.
    * @return The Advanced Query Syntax (AQS) filter used to specifically enumerate through the device type specified by deviceClass.
    */
  /* static member */
  inline def getAqsFilterFromDeviceClass(deviceClass: typings.winrtUwp.Windows.Devices.Enumeration.DeviceClass): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAqsFilterFromDeviceClass")(deviceClass.asInstanceOf[js.Any]).asInstanceOf[String]
}
