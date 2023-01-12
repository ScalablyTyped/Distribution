package typings.tuyaPanelKit

import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.PathConfigMap
import typings.tuyaPanelKit.`@reactNavigationRoutersCommonActionsMod`.Action
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typings.tuyaPanelKit.anon.Name
import typings.tuyaPanelKit.anon.PartialStateNavigationSta
import typings.tuyaPanelKit.tuyaPanelKitStrings.NAVIGATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationCoreGetActionFromStateMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/getActionFromState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  inline def default(state: PartialStateNavigationSta, options: Options): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  trait NavigateAction[State /* <: NavigationState[ParamListBase] */] extends StObject {
    
    var payload: Name[State]
    
    var `type`: NAVIGATE
  }
  object NavigateAction {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */](payload: Name[State]): NavigateAction[State] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NAVIGATE")
      __obj.asInstanceOf[NavigateAction[State]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavigateAction[?], State /* <: NavigationState[ParamListBase] */] (val x: Self & NavigateAction[State]) extends AnyVal {
      
      inline def setPayload(value: Name[State]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: NAVIGATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  trait Options extends StObject {
    
    var initialRouteName: js.UndefOr[String] = js.undefined
    
    var screens: PathConfigMap
  }
  object Options {
    
    inline def apply(screens: PathConfigMap): Options = {
      val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      inline def setScreens(value: PathConfigMap): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    }
  }
}
