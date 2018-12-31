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

