package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceInformation extends StObject {
  
  var enclosureLocation: EnclosureLocation
  
  def getGlyphThumbnailAsync(): IAsyncOperation[DeviceThumbnail]
  
  def getThumbnailAsync(): IAsyncOperation[DeviceThumbnail]
  
  var id: String
  
  var isDefault: Boolean
  
  var isEnabled: Boolean
  
  var name: String
  
  var properties: IMapView[String, js.Any]
  
  def update(updateInfo: DeviceInformationUpdate): Unit
}
object IDeviceInformation {
  
  @scala.inline
  def apply(
    enclosureLocation: EnclosureLocation,
    getGlyphThumbnailAsync: () => IAsyncOperation[DeviceThumbnail],
    getThumbnailAsync: () => IAsyncOperation[DeviceThumbnail],
    id: String,
    isDefault: Boolean,
    isEnabled: Boolean,
    name: String,
    properties: IMapView[String, js.Any],
    update: DeviceInformationUpdate => Unit
  ): IDeviceInformation = {
    val __obj = js.Dynamic.literal(enclosureLocation = enclosureLocation.asInstanceOf[js.Any], getGlyphThumbnailAsync = js.Any.fromFunction0(getGlyphThumbnailAsync), getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[IDeviceInformation]
  }
  
  @scala.inline
  implicit class IDeviceInformationMutableBuilder[Self <: IDeviceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnclosureLocation(value: EnclosureLocation): Self = StObject.set(x, "enclosureLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGlyphThumbnailAsync(value: () => IAsyncOperation[DeviceThumbnail]): Self = StObject.set(x, "getGlyphThumbnailAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetThumbnailAsync(value: () => IAsyncOperation[DeviceThumbnail]): Self = StObject.set(x, "getThumbnailAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: IMapView[String, js.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: DeviceInformationUpdate => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
