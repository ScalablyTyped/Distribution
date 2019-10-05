package typings.winrt.Windows.Devices.Enumeration

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
class DeviceInformation () extends IDeviceInformation {
  /* CompleteClass */
  override var enclosureLocation: EnclosureLocation = js.native
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var isDefault: Boolean = js.native
  /* CompleteClass */
  override var isEnabled: Boolean = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var properties: IMapView[String, _] = js.native
  /* CompleteClass */
  override def getGlyphThumbnailAsync(): IAsyncOperation[DeviceThumbnail] = js.native
  /* CompleteClass */
  override def getThumbnailAsync(): IAsyncOperation[DeviceThumbnail] = js.native
  /* CompleteClass */
  override def update(updateInfo: DeviceInformationUpdate): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformation")
@js.native
object DeviceInformation extends js.Object {
  def createFromIdAsync(id: String): IAsyncOperation[DeviceInformation] = js.native
  def createFromIdAsync(id: String, additionalProperties: IIterable[String]): IAsyncOperation[DeviceInformation] = js.native
  def createWatcher(): DeviceWatcher = js.native
  def createWatcher(aqsFilter: String): DeviceWatcher = js.native
  def createWatcher(aqsFilter: String, additionalProperties: IIterable[String]): DeviceWatcher = js.native
  def createWatcher(deviceClass: DeviceClass): DeviceWatcher = js.native
  def findAllAsync(): IAsyncOperation[DeviceInformationCollection] = js.native
  def findAllAsync(aqsFilter: String): IAsyncOperation[DeviceInformationCollection] = js.native
  def findAllAsync(aqsFilter: String, additionalProperties: IIterable[String]): IAsyncOperation[DeviceInformationCollection] = js.native
  def findAllAsync(deviceClass: DeviceClass): IAsyncOperation[DeviceInformationCollection] = js.native
}

