package typings.tuyaPanelKit.typesMod

import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.std.Omit
import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.tuyaPanelKitStrings.children
import typings.tuyaPanelKit.tuyaPanelKitStrings.initialRouteName
import typings.tuyaPanelKit.tuyaPanelKitStrings.screenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedNavigator[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ComponentType[_] */] extends js.Object {
  
  /**
    * Navigator component which manages the child screens.
    */
  var Navigator: ComponentType[
    (Omit[
      ComponentProps[Navigator], 
      /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.DefaultNavigatorOptions<any, any> */ initialRouteName | children | screenOptions
    ]) with (DefaultNavigatorOptions[ScreenOptions, ParamList])
  ] = js.native
  
  /**
    * Component used for specifying route configuration.
    */
  // tslint:disable-next-line no-unnecessary-generics
  def Screen[RouteName /* <: /* keyof ParamList */ String */](_underscore: RouteConfig[ParamList, RouteName, State, ScreenOptions, EventMap]): Null = js.native
}
object TypedNavigator {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ComponentType[_] */](
    Navigator: ComponentType[
      (Omit[
        ComponentProps[Navigator], 
        /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.DefaultNavigatorOptions<any, any> */ initialRouteName | children | screenOptions
      ]) with (DefaultNavigatorOptions[ScreenOptions, ParamList])
    ],
    Screen: RouteConfig[ParamList, js.Any, State, ScreenOptions, EventMap] => Null
  ): TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator] = {
    val __obj = js.Dynamic.literal(Navigator = Navigator.asInstanceOf[js.Any], Screen = js.Any.fromFunction1(Screen))
    __obj.asInstanceOf[TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator]]
  }
  
  @scala.inline
  implicit class TypedNavigatorOps[Self <: TypedNavigator[_, _, _, _, _], ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ComponentType[_] */] (val x: Self with (TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNavigator(
      value: ComponentType[
          (Omit[
            ComponentProps[Navigator], 
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.DefaultNavigatorOptions<any, any> */ initialRouteName | children | screenOptions
          ]) with (DefaultNavigatorOptions[ScreenOptions, ParamList])
        ]
    ): Self = this.set("Navigator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen(value: RouteConfig[ParamList, js.Any, State, ScreenOptions, EventMap] => Null): Self = this.set("Screen", js.Any.fromFunction1(value))
  }
}
