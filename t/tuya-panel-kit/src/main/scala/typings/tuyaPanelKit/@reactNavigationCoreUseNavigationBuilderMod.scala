package typings.tuyaPanelKit

import typings.std.Record
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.DefaultNavigatorOptions
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.DefaultRouterOptions
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.RouterFactory
import typings.tuyaPanelKit.anon.Descriptors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationCoreUseNavigationBuilderMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/useNavigationBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, Any] */](
    createRouter: RouterFactory[State, Any, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) & RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(createRouter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
}
