package typings.yandexMaps.mod

import typings.yandexMaps.mod.multiRouter.MultiRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoutePanel extends js.Object {
  var options: IOptionManager
  var state: IDataManager
  def getRoute(): MultiRoute
  def switchPoints(): Unit
}

object IRoutePanel {
  @scala.inline
  def apply(getRoute: () => MultiRoute, options: IOptionManager, state: IDataManager, switchPoints: () => Unit): IRoutePanel = {
    val __obj = js.Dynamic.literal(getRoute = js.Any.fromFunction0(getRoute), options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], switchPoints = js.Any.fromFunction0(switchPoints))
    __obj.asInstanceOf[IRoutePanel]
  }
}

