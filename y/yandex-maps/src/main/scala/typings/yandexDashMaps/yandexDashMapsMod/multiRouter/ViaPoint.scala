package typings.yandexDashMaps.yandexDashMapsMod.multiRouter

import typings.yandexDashMaps.yandexDashMapsMod.IEventManager
import typings.yandexDashMaps.yandexDashMapsMod.IGeoObject
import typings.yandexDashMaps.yandexDashMapsMod.Map
import typings.yandexDashMaps.yandexDashMapsMod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.ViaPoint")
@js.native
class ViaPoint () extends IGeoObject {
  /* CompleteClass */
  override var events: IEventManager = js.native
  @JSName("properties")
  var properties_ViaPoint: Manager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
}

