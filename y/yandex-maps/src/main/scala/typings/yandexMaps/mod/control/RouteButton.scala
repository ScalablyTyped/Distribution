package typings.yandexMaps.mod.control

import typings.yandexMaps.mod.IChild
import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.IOptionManager
import typings.yandexMaps.mod.IRoutePanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.RouteButton")
@js.native
class RouteButton () extends IChild[IControlParent] {
  def this(parameters: IRouteButtonParameters) = this()
  var options: IOptionManager = js.native
  var routePanel: IRoutePanel = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

