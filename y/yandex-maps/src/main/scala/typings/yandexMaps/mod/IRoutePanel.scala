package typings.yandexMaps.mod

import typings.yandexMaps.mod.multiRouter.MultiRoute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRoutePanel extends StObject {
  
  def getRoute(): MultiRoute
  
  def getRouteAsync(): js.Promise[MultiRoute]
  
  var options: IOptionManager
  
  var state: IDataManager
  
  def switchPoints(): Unit
}
object IRoutePanel {
  
  inline def apply(
    getRoute: () => MultiRoute,
    getRouteAsync: () => js.Promise[MultiRoute],
    options: IOptionManager,
    state: IDataManager,
    switchPoints: () => Unit
  ): IRoutePanel = {
    val __obj = js.Dynamic.literal(getRoute = js.Any.fromFunction0(getRoute), getRouteAsync = js.Any.fromFunction0(getRouteAsync), options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], switchPoints = js.Any.fromFunction0(switchPoints))
    __obj.asInstanceOf[IRoutePanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRoutePanel] (val x: Self) extends AnyVal {
    
    inline def setGetRoute(value: () => MultiRoute): Self = StObject.set(x, "getRoute", js.Any.fromFunction0(value))
    
    inline def setGetRouteAsync(value: () => js.Promise[MultiRoute]): Self = StObject.set(x, "getRouteAsync", js.Any.fromFunction0(value))
    
    inline def setOptions(value: IOptionManager): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setState(value: IDataManager): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSwitchPoints(value: () => Unit): Self = StObject.set(x, "switchPoints", js.Any.fromFunction0(value))
  }
}
