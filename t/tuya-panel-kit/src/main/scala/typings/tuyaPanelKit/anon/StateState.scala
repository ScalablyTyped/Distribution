package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateState[State /* <: NavigationState[ParamListBase] */] extends StObject {
  
  var state: State
}
object StateState {
  
  inline def apply[State /* <: NavigationState[ParamListBase] */](state: State): StateState[State] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateState[State]]
  }
  
  extension [Self <: StateState[?], State /* <: NavigationState[ParamListBase] */](x: Self & StateState[State]) {
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
