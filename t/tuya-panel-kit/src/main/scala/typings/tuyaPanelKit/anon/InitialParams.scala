package typings.tuyaPanelKit.anon

import typings.std.Partial
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.EventMapBase
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.ScreenListeners
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialParams[RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] extends StObject {
  
  /**
    * Initial params object for the route.
    */
  var initialParams: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * Event listeners for this screen.
    */
  var listeners: js.UndefOr[
    (ScreenListeners[State, EventMap]) | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenListeners[State, EventMap]])
  ] = js.undefined
  
  /**
    * Route name of this screen.
    */
  var name: RouteName
  
  /**
    * Navigator options for this screen.
    */
  var options: js.UndefOr[
    ScreenOptions | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenOptions])
  ] = js.undefined
}
object InitialParams {
  
  inline def apply[RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */](name: RouteName): InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialParams[?, ?, ?, ?, ?], RouteName /* <: /* keyof ParamList */ String */, ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] (val x: Self & (InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap])) extends AnyVal {
    
    inline def setInitialParams(
      value: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]
    ): Self = StObject.set(x, "initialParams", value.asInstanceOf[js.Any])
    
    inline def setInitialParamsUndefined: Self = StObject.set(x, "initialParams", js.undefined)
    
    inline def setListeners(
      value: (ScreenListeners[State, EventMap]) | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenListeners[State, EventMap]])
    ): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    inline def setListenersFunction1(value: /* props */ Route[ParamList, RouteName] => ScreenListeners[State, EventMap]): Self = StObject.set(x, "listeners", js.Any.fromFunction1(value))
    
    inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
    
    inline def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ScreenOptions | (js.Function1[/* props */ Route[ParamList, RouteName], ScreenOptions])): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction1(value: /* props */ Route[ParamList, RouteName] => ScreenOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
