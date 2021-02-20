package typings.tuyaPanelKit

import typings.std.Record
import typings.tuyaPanelKit.anon.Key
import typings.tuyaPanelKit.anon.Params
import typings.tuyaPanelKit.anon.Payload
import typings.tuyaPanelKit.anon.PayloadSource
import typings.tuyaPanelKit.anon.Readonlykeystringindexnum
import typings.tuyaPanelKit.anon.Source
import typings.tuyaPanelKit.anon.SourceTarget
import typings.tuyaPanelKit.anon.SourceTargetType
import typings.tuyaPanelKit.anon.Target
import typings.tuyaPanelKit.anon.TargetType
import typings.tuyaPanelKit.anon.Type
import typings.tuyaPanelKit.commonActionsMod.Action
import typings.tuyaPanelKit.commonActionsMod.ResetState
import typings.tuyaPanelKit.drawerRouterMod.DrawerActionType
import typings.tuyaPanelKit.drawerRouterMod.DrawerNavigationState
import typings.tuyaPanelKit.drawerRouterMod.DrawerRouterOptions
import typings.tuyaPanelKit.routersTypesMod.CommonNavigationAction
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.PartialState
import typings.tuyaPanelKit.routersTypesMod.Router
import typings.tuyaPanelKit.stackRouterMod.StackActionType
import typings.tuyaPanelKit.stackRouterMod.StackNavigationState
import typings.tuyaPanelKit.stackRouterMod.StackRouterOptions
import typings.tuyaPanelKit.tabRouterMod.TabActionType
import typings.tuyaPanelKit.tabRouterMod.TabNavigationState
import typings.tuyaPanelKit.tabRouterMod.TabRouterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routersMod {
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "BaseRouter.getStateForAction")
    @js.native
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "BaseRouter.shouldActionChangeFocus")
    @js.native
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  object CommonActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.goBack")
    @js.native
    def goBack(): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(name: String): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(name: String, params: js.Object): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(route: Key): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.navigate")
    @js.native
    def navigate(route: Params): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.reset")
    @js.native
    def reset(): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.reset")
    @js.native
    def reset(state: ResetState): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "CommonActions.setParams")
    @js.native
    def setParams(params: js.Object): Action = js.native
  }
  
  object DrawerActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/routers", "DrawerRouter")
  @js.native
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  object StackActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/routers", "StackRouter")
  @js.native
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | PayloadSource | SourceTarget | TargetType | SourceTargetType
  ] = js.native
  
  object TabActions {
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/routers", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/routers", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/routers", "TabRouter")
  @js.native
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = js.native
}
