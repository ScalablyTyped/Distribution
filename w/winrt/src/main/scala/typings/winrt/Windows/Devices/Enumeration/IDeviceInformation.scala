package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceInformation extends js.Object {
  var enclosureLocation: EnclosureLocation = js.native
  var id: String = js.native
  var isDefault: Boolean = js.native
  var isEnabled: Boolean = js.native
  var name: String = js.native
  var properties: IMapView[String, _] = js.native
  def getGlyphThumbnailAsync(): IAsyncOperation[DeviceThumbnail] = js.native
  def getThumbnailAsync(): IAsyncOperation[DeviceThumbnail] = js.native
  def update(updateInfo: DeviceInformationUpdate): Unit = js.native
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
  @scala.inline
  implicit class IDeviceInformationOps[Self <: IDeviceInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnclosureLocation(value: EnclosureLocation): Self = this.set("enclosureLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetGlyphThumbnailAsync(value: () => IAsyncOperation[DeviceThumbnail]): Self = this.set("getGlyphThumbnailAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setGetThumbnailAsync(value: () => IAsyncOperation[DeviceThumbnail]): Self = this.set("getThumbnailAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: IMapView[String, _]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: DeviceInformationUpdate => Unit): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

