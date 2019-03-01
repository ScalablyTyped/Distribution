package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoutePanel extends js.Object {
  var options: IOptionManager
  var state: IDataManager
  def getRoute(): yandexDashMapsLib.ymapsNs.multiRouterNs.MultiRoute
  def switchPoints(): scala.Unit
}

object IRoutePanel {
  @scala.inline
  def apply(
    getRoute: js.Function0[yandexDashMapsLib.ymapsNs.multiRouterNs.MultiRoute],
    options: IOptionManager,
    state: IDataManager,
    switchPoints: js.Function0[scala.Unit]
  ): IRoutePanel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRoute")(getRoute)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("switchPoints")(switchPoints)
    __obj.asInstanceOf[IRoutePanel]
  }
}

