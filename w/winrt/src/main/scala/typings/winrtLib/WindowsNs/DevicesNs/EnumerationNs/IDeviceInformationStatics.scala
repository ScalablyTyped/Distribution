package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceInformationStatics extends js.Object {
  def createFromIdAsync(id: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceInformation] = js.native
  def createFromIdAsync(
    id: java.lang.String,
    additionalProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceInformation] = js.native
  def createWatcher(): DeviceWatcher = js.native
  def createWatcher(aqsFilter: java.lang.String): DeviceWatcher = js.native
  def createWatcher(
    aqsFilter: java.lang.String,
    additionalProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): DeviceWatcher = js.native
  def createWatcher(deviceClass: DeviceClass): DeviceWatcher = js.native
  def findAllAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceInformationCollection] = js.native
  def findAllAsync(aqsFilter: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceInformationCollection] = js.native
  def findAllAsync(
    aqsFilter: java.lang.String,
    additionalProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceInformationCollection] = js.native
  def findAllAsync(deviceClass: DeviceClass): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DeviceInformationCollection] = js.native
}

