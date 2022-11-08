package typings.yandexMaps.mod.control

import typings.yandexMaps.mod.IChild
import typings.yandexMaps.mod.IControlParent
import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IOptionManager
import typings.yandexMaps.mod.IRoutePanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.yandexMaps.mod.IEventEmitter because Already inherited
- typings.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.RoutePanel")
@js.native
open class RoutePanel ()
  extends StObject
     with IChild[IControlParent] {
  def this(parameters: IRoutePanelParameters) = this()
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  var options: IOptionManager = js.native
  
  var routePanel: IRoutePanel = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
}
