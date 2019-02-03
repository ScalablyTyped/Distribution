package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
@js.native
class PnpObject () extends IPnpObject {
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /* CompleteClass */
  override var properties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /* CompleteClass */
  override var `type`: PnpObjectType = js.native
  /* CompleteClass */
  override def update(updateInfo: PnpObjectUpdate): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
@js.native
object PnpObject extends js.Object {
  def createFromIdAsync(
    `type`: winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    id: java.lang.String,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObject] = js.native
  def createWatcher(
    `type`: winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectWatcher = js.native
  def createWatcher(
    `type`: winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    aqsFilter: java.lang.String
  ): winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectWatcher = js.native
  def findAllAsync(
    `type`: winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectCollection] = js.native
  def findAllAsync(
    `type`: winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectType,
    requestedProperties: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    aqsFilter: java.lang.String
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.DevicesNs.EnumerationNs.PnpNs.PnpObjectCollection] = js.native
}

