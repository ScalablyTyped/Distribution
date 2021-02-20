package typings.tuyaPanelKit

import typings.tuyaPanelKit.anon.Name
import typings.tuyaPanelKit.anon.PartialStateNavigationSta
import typings.tuyaPanelKit.commonActionsMod.Action
import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.tuyaPanelKitStrings.NAVIGATE
import typings.tuyaPanelKit.typesMod.PathConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getActionFromStateMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/getActionFromState", JSImport.Default)
  @js.native
  def default(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  @JSImport("tuya-panel-kit/@react-navigation/core/getActionFromState", JSImport.Default)
  @js.native
  def default(state: PartialStateNavigationSta, options: Options): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  @js.native
  trait NavigateAction[State /* <: NavigationState[ParamListBase] */] extends StObject {
    
    var payload: Name[State] = js.native
    
    var `type`: NAVIGATE = js.native
  }
  object NavigateAction {
    
    @scala.inline
    def apply[State /* <: NavigationState[ParamListBase] */](payload: Name[State], `type`: NAVIGATE): NavigateAction[State] = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigateAction[State]]
    }
    
    @scala.inline
    implicit class NavigateActionMutableBuilder[Self <: NavigateAction[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with NavigateAction[State]) extends AnyVal {
      
      @scala.inline
      def setPayload(value: Name[State]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: NAVIGATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers interface-over-type-literal
  @js.native
  trait Options extends StObject {
    
    var initialRouteName: js.UndefOr[String] = js.native
    
    var screens: PathConfigMap = js.native
  }
  object Options {
    
    @scala.inline
    def apply(screens: PathConfigMap): Options = {
      val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      @scala.inline
      def setScreens(value: PathConfigMap): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    }
  }
}
