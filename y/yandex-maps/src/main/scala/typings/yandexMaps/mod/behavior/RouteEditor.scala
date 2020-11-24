package typings.yandexMaps.mod.behavior

import typings.yandexMaps.mod.IBehavior
import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.router.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "behavior.RouteEditor")
@js.native
class RouteEditor () extends IBehavior {
  
  def getRoute(): Route = js.native
  
  def getState(): String = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
  
  def setState(): Unit = js.native
  def setState(state: String): Unit = js.native
}
