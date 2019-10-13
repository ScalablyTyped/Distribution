package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.yandexDashMapsMod.IChild
import typings.yandexDashMaps.yandexDashMapsMod.IControlParent
import typings.yandexDashMaps.yandexDashMapsMod.IEventManager
import typings.yandexDashMaps.yandexDashMapsMod.IOptionManager
import typings.yandexDashMaps.yandexDashMapsMod.IRoutePanel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.RouteButton")
@js.native
class RouteButton () extends IChild[IControlParent] {
  def this(parameters: IRouteButtonParameters) = this()
  /* CompleteClass */
  override var events: IEventManager = js.native
  var options: IOptionManager = js.native
  var routePanel: IRoutePanel = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

