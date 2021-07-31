package typings.yandexMaps.mod.control

import typings.yandexMaps.mod.router.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yandex-maps", "control.RouteEditor")
@js.native
class RouteEditor () extends Button {
  def this(parameters: IRouteEditorParameters) = this()
  
  def getRoute(): Route = js.native
}
