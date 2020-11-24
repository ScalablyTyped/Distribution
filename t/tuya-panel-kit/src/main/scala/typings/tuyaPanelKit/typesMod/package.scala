package typings.tuyaPanelKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type CompositeNavigationProp[A /* <: typings.tuyaPanelKit.typesMod.NavigationProp[typings.tuyaPanelKit.routersTypesMod.ParamListBase, java.lang.String, _, _, js.Object] */, B /* <: typings.tuyaPanelKit.typesMod.NavigationHelpersCommon[typings.tuyaPanelKit.routersTypesMod.ParamListBase, _] */] = (typings.std.Omit[
    A with B, 
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationProp<any, string, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<any>, {}, {}> */ typings.tuyaPanelKit.tuyaPanelKitStrings.dispatch | typings.tuyaPanelKit.tuyaPanelKitStrings.navigate_ | typings.tuyaPanelKit.tuyaPanelKitStrings.reset_ | typings.tuyaPanelKit.tuyaPanelKitStrings.goBack | typings.tuyaPanelKit.tuyaPanelKitStrings.isFocused | typings.tuyaPanelKit.tuyaPanelKitStrings.canGoBack | typings.tuyaPanelKit.tuyaPanelKitStrings.dangerouslyGetParent | typings.tuyaPanelKit.tuyaPanelKitStrings.dangerouslyGetState | typings.tuyaPanelKit.tuyaPanelKitStrings._empty | typings.tuyaPanelKit.tuyaPanelKitStrings.setParams | typings.tuyaPanelKit.tuyaPanelKitStrings.setOptions | typings.tuyaPanelKit.tuyaPanelKitStrings.addListener | typings.tuyaPanelKit.tuyaPanelKitStrings.removeListener
  ]) with (typings.tuyaPanelKit.typesMod.NavigationProp[
    js.Any, 
    java.lang.String, 
    typings.tuyaPanelKit.routersTypesMod.NavigationState[typings.tuyaPanelKit.routersTypesMod.ParamListBase], 
    js.Object, 
    js.Object
  ])
  
  type EventArg[EventName /* <: java.lang.String */, CanPreventDefault /* <: js.UndefOr[scala.Boolean] */, Data] = typings.tuyaPanelKit.anon.TypeEventName[EventName] with (js.Object | typings.tuyaPanelKit.anon.DefaultPrevented) with (typings.tuyaPanelKit.anon.DataReadonly[Data] | typings.tuyaPanelKit.anon.`2`[Data])
  
  type EventListenerCallback[EventMap /* <: typings.tuyaPanelKit.typesMod.EventMapBase */, EventName /* <: /* keyof EventMap */ java.lang.String */] = js.Function1[
    /* e */ typings.tuyaPanelKit.typesMod.EventArg[
      typings.std.Extract[EventName, java.lang.String], 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ], 
    scala.Unit
  ]
  
  type EventMapBase = typings.std.Record[java.lang.String, typings.tuyaPanelKit.anon.CanPreventDefault]
  
  type NavigatorScreenParams[ParamList, State /* <: typings.tuyaPanelKit.routersTypesMod.NavigationState[typings.tuyaPanelKit.routersTypesMod.ParamListBase] */] = typings.tuyaPanelKit.anon.Initial[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ RouteName in keyof ParamList ]: undefined extends ParamList[RouteName]? {  screen :RouteName,   params :ParamList[RouteName] | undefined,   initial :boolean | undefined,   state :never | undefined} : {  screen :RouteName,   params :ParamList[RouteName],   initial :boolean | undefined,   state :never | undefined}}[keyof ParamList] */ js.Any)
  
  type RouteConfig[ParamList /* <: typings.tuyaPanelKit.routersTypesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */, State /* <: typings.tuyaPanelKit.routersTypesMod.NavigationState[typings.tuyaPanelKit.routersTypesMod.ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: typings.tuyaPanelKit.typesMod.EventMapBase */] = (typings.tuyaPanelKit.anon.InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap]) with (typings.tuyaPanelKit.anon.Children | typings.tuyaPanelKit.anon.Component | (typings.tuyaPanelKit.anon.GetComponent[ParamList, RouteName]))
  
  type RouteProp[ParamList /* <: typings.tuyaPanelKit.routersTypesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */] = typings.tuyaPanelKit.routersTypesMod.Route[
    typings.std.Extract[RouteName, java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]
  
  type ScreenListeners[State /* <: typings.tuyaPanelKit.routersTypesMod.NavigationState[typings.tuyaPanelKit.routersTypesMod.ParamListBase] */, EventMap /* <: typings.tuyaPanelKit.typesMod.EventMapBase */] = typings.std.Partial[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ EventName in keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> ]: tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventListenerCallback<EventMap, EventName>}
    */ typings.tuyaPanelKit.tuyaPanelKitStrings.ScreenListeners with org.scalablytyped.runtime.TopLevel[js.Any]
  ]
}
