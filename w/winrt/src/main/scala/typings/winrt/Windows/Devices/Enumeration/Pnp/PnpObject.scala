package typings.winrt.Windows.Devices.Enumeration.Pnp

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
@js.native
class PnpObject () extends IPnpObject {
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var properties: IMapView[String, _] = js.native
  /* CompleteClass */
  override var `type`: PnpObjectType = js.native
  /* CompleteClass */
  override def update(updateInfo: PnpObjectUpdate): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Enumeration.Pnp.PnpObject")
@js.native
object PnpObject extends js.Object {
  def createFromIdAsync(`type`: PnpObjectType, id: String, requestedProperties: IIterable[String]): IAsyncOperation[PnpObject] = js.native
  def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String]): PnpObjectWatcher = js.native
  def createWatcher(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): PnpObjectWatcher = js.native
  def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String]): IAsyncOperation[PnpObjectCollection] = js.native
  def findAllAsync(`type`: PnpObjectType, requestedProperties: IIterable[String], aqsFilter: String): IAsyncOperation[PnpObjectCollection] = js.native
}

