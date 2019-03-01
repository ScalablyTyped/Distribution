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
    getGlyphThumbnailAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceThumbnail]],
    getThumbnailAsync: js.Function0[winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceThumbnail]],
    id: java.lang.String,
    isDefault: scala.Boolean,
    isEnabled: scala.Boolean,
    name: java.lang.String,
    properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _],
    update: js.Function1[DeviceInformationUpdate, scala.Unit]
  ): IDeviceInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enclosureLocation")(enclosureLocation)
    __obj.updateDynamic("getGlyphThumbnailAsync")(getGlyphThumbnailAsync)
    __obj.updateDynamic("getThumbnailAsync")(getThumbnailAsync)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isDefault")(isDefault)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[IDeviceInformation]
  }
}

