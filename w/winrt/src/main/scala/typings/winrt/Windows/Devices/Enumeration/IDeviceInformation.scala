package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceInformation extends js.Object {
  var enclosureLocation: EnclosureLocation
  var id: String
  var isDefault: Boolean
  var isEnabled: Boolean
  var name: String
  var properties: IMapView[String, _]
  def getGlyphThumbnailAsync(): IAsyncOperation[DeviceThumbnail]
  def getThumbnailAsync(): IAsyncOperation[DeviceThumbnail]
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
    properties: IMapView[String, _],
    update: DeviceInformationUpdate => Unit
  ): IDeviceInformation = {
    val __obj = js.Dynamic.literal(enclosureLocation = enclosureLocation.asInstanceOf[js.Any], getGlyphThumbnailAsync = js.Any.fromFunction0(getGlyphThumbnailAsync), getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), id = id.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[IDeviceInformation]
  }
}

