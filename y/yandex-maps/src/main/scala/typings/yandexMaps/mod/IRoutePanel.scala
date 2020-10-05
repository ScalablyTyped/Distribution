package typings.yandexMaps.mod

import typings.yandexMaps.mod.multiRouter.MultiRoute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRoutePanel extends js.Object {
  var options: IOptionManager = js.native
  var state: IDataManager = js.native
  def getRoute(): MultiRoute = js.native
  def switchPoints(): Unit = js.native
}

object IRoutePanel {
  @scala.inline
  def apply(getRoute: () => MultiRoute, options: IOptionManager, state: IDataManager, switchPoints: () => Unit): IRoutePanel = {
    val __obj = js.Dynamic.literal(getRoute = js.Any.fromFunction0(getRoute), options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], switchPoints = js.Any.fromFunction0(switchPoints))
    __obj.asInstanceOf[IRoutePanel]
  }
  @scala.inline
  implicit class IRoutePanelOps[Self <: IRoutePanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetRoute(value: () => MultiRoute): Self = this.set("getRoute", js.Any.fromFunction0(value))
    @scala.inline
    def setOptions(value: IOptionManager): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: IDataManager): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitchPoints(value: () => Unit): Self = this.set("switchPoints", js.Any.fromFunction0(value))
  }
  
}

