package typings.tuyaPanelKit

import typings.tuyaPanelKit.anon.Readonlykeystringindexnum
import typings.tuyaPanelKit.routersTypesMod.CommonNavigationAction
import typings.tuyaPanelKit.routersTypesMod.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseRouterMod {
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object default {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers/BaseRouter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateForAction")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State | PartialState[State] | Null]
    
    inline def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldActionChangeFocus")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
