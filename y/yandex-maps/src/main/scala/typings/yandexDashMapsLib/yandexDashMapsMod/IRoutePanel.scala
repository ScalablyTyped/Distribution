package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoutePanel extends js.Object {
  var options: IOptionManager
  var state: IDataManager
  def getRoute(): yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.MultiRoute
  def switchPoints(): scala.Unit
}

object IRoutePanel {
  @scala.inline
  def apply(
    getRoute: () => yandexDashMapsLib.yandexDashMapsMod.multiRouterNs.MultiRoute,
    options: IOptionManager,
    state: IDataManager,
    switchPoints: () => scala.Unit
  ): IRoutePanel = {
    val __obj = js.Dynamic.literal(getRoute = js.Any.fromFunction0(getRoute), options = options, state = state, switchPoints = js.Any.fromFunction0(switchPoints))
  
    __obj.asInstanceOf[IRoutePanel]
  }
}

