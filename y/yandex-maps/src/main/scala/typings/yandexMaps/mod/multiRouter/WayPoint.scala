package typings.yandexMaps.mod.multiRouter

import typings.yandexMaps.mod.IGeoObject
import typings.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "multiRouter.WayPoint")
@js.native
class WayPoint () extends IGeoObject {
  var model: WayPointModel = js.native
  @JSName("properties")
  var properties_WayPoint: Manager = js.native
}

