package typings.yandexMaps.mod.multiRouter

import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.Map_
import typings.yandexMaps.mod.data.Manager
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
  override def getMap(): Map_ = js.native
}

