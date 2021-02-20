package typings.yandexMaps.mod

import typings.yandexMaps.mod.multiRouter.MultiRoute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRoutePanel extends StObject {
  
  def getRoute(): MultiRoute = js.native
  
  var options: IOptionManager = js.native
  
  var state: IDataManager = js.native
  
  def switchPoints(): Unit = js.native
}
object IRoutePanel {
  
  @scala.inline
  def apply(getRoute: () => MultiRoute, options: IOptionManager, state: IDataManager, switchPoints: () => Unit): IRoutePanel = {
    val __obj = js.Dynamic.literal(getRoute = js.Any.fromFunction0(getRoute), options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], switchPoints = js.Any.fromFunction0(switchPoints))
    __obj.asInstanceOf[IRoutePanel]
  }
  
  @scala.inline
  implicit class IRoutePanelMutableBuilder[Self <: IRoutePanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRoute(value: () => MultiRoute): Self = StObject.set(x, "getRoute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: IOptionManager): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: IDataManager): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchPoints(value: () => Unit): Self = StObject.set(x, "switchPoints", js.Any.fromFunction0(value))
  }
}
