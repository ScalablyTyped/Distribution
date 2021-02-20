package typings.tuyaPanelKit

import typings.tuyaPanelKit.anon.OmitPartialStateNavigatio
import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.typesMod.PathConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPathFromStateMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/getPathFromState", JSImport.Default)
  @js.native
  def default(state: State): String = js.native
  @JSImport("tuya-panel-kit/@react-navigation/core/getPathFromState", JSImport.Default)
  @js.native
  def default(state: State, options: Options): String = js.native
  
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
  
  // tslint:disable-next-line strict-export-declare-modifiers
  type State = NavigationState[ParamListBase] | OmitPartialStateNavigatio
}
