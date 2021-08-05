package typings.tuyaPanelKit

import typings.std.Extract
import typings.std.Omit
import typings.tuyaPanelKit.anon.Key
import typings.tuyaPanelKit.anon.KeyMerge
import typings.tuyaPanelKit.anon.Merge
import typings.tuyaPanelKit.anon.Params
import typings.tuyaPanelKit.anon.`0`
import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.PartialRoute
import typings.tuyaPanelKit.routersTypesMod.Route
import typings.tuyaPanelKit.tuyaPanelKitStrings.key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonActionsMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def goBack(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[Action]
  
  inline def navigate(name: String): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any]).asInstanceOf[Action]
  inline def navigate(name: String, params: js.Object): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Action]
  inline def navigate(route: Key): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
  inline def navigate(route: Params): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def reset(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Action]
  inline def reset(state: ResetState): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(state.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def setParams(params: js.Object): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("setParams")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.anon.Source
    - typings.tuyaPanelKit.anon.Payload
    - typings.tuyaPanelKit.anon.PayloadSourceTarget
    - typings.tuyaPanelKit.anon.Type
  */
  trait Action extends StObject
  object Action {
    
    inline def Payload(payload: Merge | KeyMerge): typings.tuyaPanelKit.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("NAVIGATE")
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.Payload]
    }
    
    inline def PayloadSourceTarget(): typings.tuyaPanelKit.anon.PayloadSourceTarget = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("RESET")
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.PayloadSourceTarget]
    }
    
    inline def Source(): typings.tuyaPanelKit.anon.Source = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("GO_BACK")
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.Source]
    }
    
    inline def Type(payload: `0`): typings.tuyaPanelKit.anon.Type = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("SET_PARAMS")
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.Type]
    }
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.anon.PartialStateNavigationSta
    - typings.tuyaPanelKit.routersTypesMod.NavigationState[typings.tuyaPanelKit.routersTypesMod.ParamListBase]
    - typings.tuyaPanelKit.anon.OmitNavigationStateParamL
  */
  type ResetState = _ResetState | NavigationState[ParamListBase]
  
  trait _ResetState extends StObject
  object _ResetState {
    
    inline def OmitNavigationStateParamL(
      index: Double,
      key: String,
      routeNames: js.Array[
          Extract[
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
            String
          ]
        ],
      routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]],
      `type`: String
    ): typings.tuyaPanelKit.anon.OmitNavigationStateParamL = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = false)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.OmitNavigationStateParamL]
    }
    
    inline def PartialStateNavigationSta(
      routes: js.Array[
          PartialRoute[
            Route[
              /* import warning: importer.ImportType#apply Failed type conversion: std.Array<std.Extract<keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase, string>>[number] */ js.Any, 
              js.UndefOr[js.Object]
            ]
          ]
        ]
    ): typings.tuyaPanelKit.anon.PartialStateNavigationSta = {
      val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.PartialStateNavigationSta]
    }
  }
}
