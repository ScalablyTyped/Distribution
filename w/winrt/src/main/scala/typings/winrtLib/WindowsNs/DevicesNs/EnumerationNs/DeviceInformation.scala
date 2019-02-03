package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
class DeviceInformation () extends IDeviceInformation {
  /* CompleteClass */
  override var enclosureLocation: EnclosureLocation = js.native
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var isDefault: scala.Boolean = js.native
  /* CompleteClass */
  override var isEnabled: scala.Boolean = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /* CompleteClass */
  override def getGlyphThumbnailAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceThumbnail] = js.native
  /* CompleteClass */
  override def getThumbnailAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceThumbnail] = js.native
  /* CompleteClass */
  override def update(updateInfo: DeviceInformationUpdate): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
object DeviceInformation extends js.Object {
  def createFromIdAsync(id: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation] = js.native
  def createFromIdAsync(
    id: java.lang.String,
    additionalProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformation] = js.native
  def createWatcher(): winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcher = js.native
  def createWatcher(aqsFilter: java.lang.String): winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcher = js.native
  def createWatcher(
    aqsFilter: java.lang.String,
    additionalProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcher = js.native
  def createWatcher(deviceClass: winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass): winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceWatcher = js.native
  def findAllAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationCollection] = js.native
  def findAllAsync(aqsFilter: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationCollection] = js.native
  def findAllAsync(
    aqsFilter: java.lang.String,
    additionalProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationCollection] = js.native
  def findAllAsync(deviceClass: winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceInformationCollection] = js.native
}

