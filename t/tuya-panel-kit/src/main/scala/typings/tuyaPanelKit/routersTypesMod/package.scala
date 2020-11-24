package typings.tuyaPanelKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object routersTypesMod {
  
  type ActionCreators[Action /* <: typings.tuyaPanelKit.routersTypesMod.NavigationAction */] = org.scalablytyped.runtime.StringDictionary[js.Function1[/* args */ js.Any, Action]]
  
  type CommonNavigationAction = typings.tuyaPanelKit.commonActionsMod.Action
  
  // tslint:disable-next-line strict-export-declare-modifiers
  type NavigationRoute[ParamList /* <: typings.tuyaPanelKit.routersTypesMod.ParamListBase */, RouteName /* <: /* keyof ParamList */ java.lang.String */] = (typings.tuyaPanelKit.routersTypesMod.Route[
    typings.std.Extract[RouteName, java.lang.String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]) with typings.tuyaPanelKit.anon.`15`
  
  type ParamListBase = typings.std.Record[java.lang.String, js.UndefOr[js.Object]]
  
  type PartialRoute[R /* <: typings.tuyaPanelKit.routersTypesMod.Route[java.lang.String, js.UndefOr[js.Object]] */] = (typings.std.Omit[R, typings.tuyaPanelKit.tuyaPanelKitStrings.key]) with typings.tuyaPanelKit.anon.KeyState
  
  type PartialState[State /* <: typings.tuyaPanelKit.routersTypesMod.NavigationState[typings.tuyaPanelKit.routersTypesMod.ParamListBase] */] = (typings.std.Partial[
    typings.std.Omit[
      State, 
      typings.tuyaPanelKit.tuyaPanelKitStrings.stale | typings.tuyaPanelKit.tuyaPanelKitStrings.routes
    ]
  ]) with typings.tuyaPanelKit.anon.Routes[State]
  
  type Route[RouteName /* <: java.lang.String */, Params /* <: js.UndefOr[js.Object] */] = typings.tuyaPanelKit.anon.KeyStringNameRouteName[RouteName] with (typings.tuyaPanelKit.anon.ParamsReadonly[Params] | typings.tuyaPanelKit.anon.`17`[Params])
  
  type RouterFactory[State /* <: typings.tuyaPanelKit.routersTypesMod.NavigationState[typings.tuyaPanelKit.routersTypesMod.ParamListBase] */, Action /* <: typings.tuyaPanelKit.routersTypesMod.NavigationAction */, RouterOptions /* <: typings.tuyaPanelKit.routersTypesMod.DefaultRouterOptions[java.lang.String] */] = js.Function1[
    /* options */ RouterOptions, 
    typings.tuyaPanelKit.routersTypesMod.Router[State, Action]
  ]
}
