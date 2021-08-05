package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a device. This class allows access to well-known device properties as well as additional properties specified during device enumeration. */
trait DeviceInformation extends StObject {
  
  /** The physical location of the device in its enclosure. For example, it may describe the location of a webcam inside a laptop. */
  var enclosureLocation: EnclosureLocation
  
  /**
    * Gets a glyph for the device.
    * @return The object for managing the asynchronous operation that will return a DeviceThumbnail
    */
  def getGlyphThumbnailAsync(): IPromiseWithIAsyncOperation[DeviceThumbnail]
  
  /**
    * Returns a thumbnail image for the device.
    * @return The object for managing the asynchronous operation that will return a DeviceThumbnail .
    */
  def getThumbnailAsync(): IPromiseWithIAsyncOperation[DeviceThumbnail]
  
  /** A string representing the identity of the device. */
  var id: String
  
  /** Indicates whether this device is the default device for the class. */
  var isDefault: Boolean
  
  /** Indicates whether this device is enabled. */
  var isEnabled: Boolean
  
  /** Gets the type of DeviceInformation represented by this object. */
  var kind: DeviceInformationKind
  
  /** The name of the device. This name is in the best available language for the app. */
  var name: String
  
  /** Gets the information about the capabilities for this device to pair. */
  var pairing: DeviceInformationPairing
  
  /** Property store containing well-known values as well as additional properties that can be specified during device enumeration. */
  var properties: IMapView[String, js.Any]
  
  /**
    * Updates the properties of an existing DeviceInformation object.
    * @param updateInfo Indicates the properties to update.
    */
  def update(updateInfo: DeviceInformationUpdate): Unit
}
object DeviceInformation {
  
  inline def apply(
    enclosureLocation: EnclosureLocation,
    getGlyphThumbnailAsync: () => IPromiseWithIAsyncOperation[DeviceThumbnail],
    getThumbnailAsync: () => IPromiseWithIAsyncOperation[DeviceThumbnail],
    id: String,
    isDefault: Boolean,
    isEnabled: Boolean,
    kind: DeviceInformationKind,
    name: String,
    pairing: DeviceInformationPairing,
    properties: IMapView[String, js.Any],
    update: DeviceInformationUpdate => Unit
  ): DeviceInformation = {
    val __obj = js.Dynamic.literal(enclosureLocation = enclosureLocation.asInstanceOf[js.Any], getGlyphThumbnailAsync = js.Any.fromFunction0(getGlyphThumbnailAsync), getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pairing = pairing.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DeviceInformation]
  }
  
  extension [Self <: DeviceInformation](x: Self) {
    
    inline def setEnclosureLocation(value: EnclosureLocation): Self = StObject.set(x, "enclosureLocation", value.asInstanceOf[js.Any])
    
    inline def setGetGlyphThumbnailAsync(value: () => IPromiseWithIAsyncOperation[DeviceThumbnail]): Self = StObject.set(x, "getGlyphThumbnailAsync", js.Any.fromFunction0(value))
    
    inline def setGetThumbnailAsync(value: () => IPromiseWithIAsyncOperation[DeviceThumbnail]): Self = StObject.set(x, "getThumbnailAsync", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setKind(value: DeviceInformationKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPairing(value: DeviceInformationPairing): Self = StObject.set(x, "pairing", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IMapView[String, js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: DeviceInformationUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
