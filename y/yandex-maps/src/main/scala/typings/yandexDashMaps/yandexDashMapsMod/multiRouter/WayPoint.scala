package typings.yandexDashMaps.yandexDashMapsMod.multiRouter

import typings.yandexDashMaps.yandexDashMapsMod.IEventManager
import typings.yandexDashMaps.yandexDashMapsMod.IGeoObject
import typings.yandexDashMaps.yandexDashMapsMod.Map
import typings.yandexDashMaps.yandexDashMapsMod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "multiRouter.WayPoint")
@js.native
class WayPoint () extends IGeoObject {
  /* CompleteClass */
  override var events: IEventManager = js.native
  var model: WayPointModel = js.native
  @JSName("properties")
  var properties_WayPoint: Manager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
}

