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
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`false`
import typings.tuyaPanelKit.tuyaPanelKitStrings.GO_BACK
import typings.tuyaPanelKit.tuyaPanelKitStrings.NAVIGATE
import typings.tuyaPanelKit.tuyaPanelKitStrings.RESET
import typings.tuyaPanelKit.tuyaPanelKitStrings.SET_PARAMS
import typings.tuyaPanelKit.tuyaPanelKitStrings.key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonActionsMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "goBack")
  @js.native
  def goBack(): Action = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "navigate")
  @js.native
  def navigate(name: String): Action = js.native
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "navigate")
  @js.native
  def navigate(name: String, params: js.Object): Action = js.native
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "navigate")
  @js.native
  def navigate(route: Key): Action = js.native
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "navigate")
  @js.native
  def navigate(route: Params): Action = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "reset")
  @js.native
  def reset(): Action = js.native
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "reset")
  @js.native
  def reset(state: ResetState): Action = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/routers/CommonActions", "setParams")
  @js.native
  def setParams(params: js.Object): Action = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.tuyaPanelKit.anon.Source
    - typings.tuyaPanelKit.anon.Payload
    - typings.tuyaPanelKit.anon.PayloadSourceTarget
    - typings.tuyaPanelKit.anon.Type
  */
  trait Action extends StObject
  object Action {
    
    @scala.inline
    def Payload(payload: Merge | KeyMerge, `type`: NAVIGATE): typings.tuyaPanelKit.anon.Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.Payload]
    }
    
    @scala.inline
    def PayloadSourceTarget(`type`: RESET): typings.tuyaPanelKit.anon.PayloadSourceTarget = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.PayloadSourceTarget]
    }
    
    @scala.inline
    def Source(`type`: GO_BACK): typings.tuyaPanelKit.anon.Source = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.Source]
    }
    
    @scala.inline
    def Type(payload: `0`, `type`: SET_PARAMS): typings.tuyaPanelKit.anon.Type = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    
    @scala.inline
    def OmitNavigationStateParamL(
      index: Double,
      key: String,
      routeNames: js.Array[
          Extract[
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String, 
            String
          ]
        ],
      routes: js.Array[Omit[Route[String, js.UndefOr[js.Object]], key]],
      stale: `false`,
      `type`: String
    ): typings.tuyaPanelKit.anon.OmitNavigationStateParamL = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routeNames = routeNames.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], stale = stale.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.tuyaPanelKit.anon.OmitNavigationStateParamL]
    }
    
    @scala.inline
    def PartialStateNavigationSta(
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
