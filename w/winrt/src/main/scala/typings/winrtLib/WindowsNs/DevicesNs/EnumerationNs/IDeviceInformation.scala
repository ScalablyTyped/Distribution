package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceInformation extends js.Object {
  var enclosureLocation: EnclosureLocation
  var id: java.lang.String
  var isDefault: scala.Boolean
  var isEnabled: scala.Boolean
  var name: java.lang.String
  var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _]
  def getGlyphThumbnailAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceThumbnail]
  def getThumbnailAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceThumbnail]
  def update(updateInfo: DeviceInformationUpdate): scala.Unit
}

object IDeviceInformation {
  @scala.inline
  def apply(
    enclosureLocation: EnclosureLocation,
    getGlyphThumbnailAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceThumbnail],
    getThumbnailAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceThumbnail],
    id: java.lang.String,
    isDefault: scala.Boolean,
    isEnabled: scala.Boolean,
    name: java.lang.String,
    properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _],
    update: DeviceInformationUpdate => scala.Unit
  ): IDeviceInformation = {
    val __obj = js.Dynamic.literal(enclosureLocation = enclosureLocation, getGlyphThumbnailAsync = js.Any.fromFunction0(getGlyphThumbnailAsync), getThumbnailAsync = js.Any.fromFunction0(getThumbnailAsync), id = id, isDefault = isDefault, isEnabled = isEnabled, name = name, properties = properties, update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[IDeviceInformation]
  }
}

