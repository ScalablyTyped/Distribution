package typings.tuyaPanelKit

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationContainerProps
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.NavigationContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationCoreBaseNavigationContainerMod` extends Shortcut {
  
  /**
    * Container component which holds the navigation state.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("tuya-panel-kit/@react-navigation/core/BaseNavigationContainer", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[NavigationContainerProps & RefAttributes[NavigationContainerRef]] = js.native
  
  type _To = ForwardRefExoticComponent[NavigationContainerProps & RefAttributes[NavigationContainerRef]]
  
  /* This means you don't have to write `default`, but can instead just say ``@reactNavigationCoreBaseNavigationContainerMod`.foo` */
  override def _to: ForwardRefExoticComponent[NavigationContainerProps & RefAttributes[NavigationContainerRef]] = default
}
