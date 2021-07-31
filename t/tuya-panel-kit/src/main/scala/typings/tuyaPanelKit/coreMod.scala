package typings.tuyaPanelKit

import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Partial
import typings.std.Record
import typings.tuyaPanelKit.anon.Descriptors
import typings.tuyaPanelKit.anon.Key
import typings.tuyaPanelKit.anon.Options
import typings.tuyaPanelKit.anon.Params
import typings.tuyaPanelKit.anon.PartialStateNavigationSta
import typings.tuyaPanelKit.anon.Payload
import typings.tuyaPanelKit.anon.PayloadSource
import typings.tuyaPanelKit.anon.Readonlykeystringindexnum
import typings.tuyaPanelKit.anon.Source
import typings.tuyaPanelKit.anon.SourceTarget
import typings.tuyaPanelKit.anon.SourceTargetType
import typings.tuyaPanelKit.anon.State
import typings.tuyaPanelKit.anon.Target
import typings.tuyaPanelKit.anon.TargetType
import typings.tuyaPanelKit.anon.Type
import typings.tuyaPanelKit.commonActionsMod.Action
import typings.tuyaPanelKit.commonActionsMod.ResetState
import typings.tuyaPanelKit.drawerRouterMod.DrawerActionType
import typings.tuyaPanelKit.drawerRouterMod.DrawerNavigationState
import typings.tuyaPanelKit.drawerRouterMod.DrawerRouterOptions
import typings.tuyaPanelKit.getActionFromStateMod.NavigateAction
import typings.tuyaPanelKit.getStateFromPathMod.ResultState
import typings.tuyaPanelKit.routersTypesMod.CommonNavigationAction
import typings.tuyaPanelKit.routersTypesMod.DefaultRouterOptions
import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.routersTypesMod.PartialState
import typings.tuyaPanelKit.routersTypesMod.Route
import typings.tuyaPanelKit.routersTypesMod.Router
import typings.tuyaPanelKit.routersTypesMod.RouterFactory
import typings.tuyaPanelKit.stackRouterMod.StackActionType
import typings.tuyaPanelKit.stackRouterMod.StackNavigationState
import typings.tuyaPanelKit.stackRouterMod.StackRouterOptions
import typings.tuyaPanelKit.tabRouterMod.TabActionType
import typings.tuyaPanelKit.tabRouterMod.TabNavigationState
import typings.tuyaPanelKit.tabRouterMod.TabRouterOptions
import typings.tuyaPanelKit.typesMod.DefaultNavigatorOptions
import typings.tuyaPanelKit.typesMod.EventMapBase
import typings.tuyaPanelKit.typesMod.NavigationContainerProps
import typings.tuyaPanelKit.typesMod.NavigationContainerRef
import typings.tuyaPanelKit.typesMod.NavigationHelpers
import typings.tuyaPanelKit.typesMod.NavigationProp
import typings.tuyaPanelKit.typesMod.RouteProp
import typings.tuyaPanelKit.typesMod.TypedNavigator
import typings.tuyaPanelKit.useFocusEffectMod.EffectCallback
import typings.tuyaPanelKit.useNavigationStateMod.Selector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("tuya-panel-kit/@react-navigation/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Container component which holds the navigation state.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("tuya-panel-kit/@react-navigation/core", "BaseNavigationContainer")
  @js.native
  val BaseNavigationContainer: ForwardRefExoticComponent[NavigationContainerProps & RefAttributes[NavigationContainerRef]] = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "BaseRouter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateForAction")(state.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[State | PartialState[State] | Null]
    
    @scala.inline
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldActionChangeFocus")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  object CommonActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "CommonActions")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def goBack(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("goBack")().asInstanceOf[Action]
    
    @scala.inline
    def navigate(name: String): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any]).asInstanceOf[Action]
    @scala.inline
    def navigate(name: String, params: js.Object): Action = (^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[Action]
    @scala.inline
    def navigate(route: Key): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
    @scala.inline
    def navigate(route: Params): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("navigate")(route.asInstanceOf[js.Any]).asInstanceOf[Action]
    
    @scala.inline
    def reset(): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Action]
    @scala.inline
    def reset(state: ResetState): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(state.asInstanceOf[js.Any]).asInstanceOf[Action]
    
    @scala.inline
    def setParams(params: js.Object): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("setParams")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  }
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  @JSImport("tuya-panel-kit/@react-navigation/core", "CurrentRenderContext")
  @js.native
  val CurrentRenderContext: Context[js.UndefOr[Options]] = js.native
  
  object DrawerActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "DrawerActions")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def closeDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDrawer")().asInstanceOf[DrawerActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    @scala.inline
    def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    @scala.inline
    def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
    
    @scala.inline
    def openDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("openDrawer")().asInstanceOf[DrawerActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    @scala.inline
    def toggleDrawer(): DrawerActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleDrawer")().asInstanceOf[DrawerActionType]
  }
  
  @scala.inline
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawerRouter")(hasOpenByDefaultRest.asInstanceOf[js.Any]).asInstanceOf[Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction]]
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/core", "NavigationContext")
  @js.native
  val NavigationContext: Context[
    js.UndefOr[
      NavigationProp[Record[String, js.UndefOr[js.Object]], String, js.Any, js.Any, js.Object]
    ]
  ] = js.native
  
  /**
    * Context which holds the navigation helpers of the parent navigator.
    * Navigators should use this context in their view component.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/core", "NavigationHelpersContext")
  @js.native
  val NavigationHelpersContext: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  /**
    * Context which holds the route prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/core", "NavigationRouteContext")
  @js.native
  val NavigationRouteContext: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/core", "PrivateValueStore")
  @js.native
  class PrivateValueStore[A, B, C] ()
    extends typings.tuyaPanelKit.typesMod.PrivateValueStore[A, B, C]
  
  object StackActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "StackActions")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def pop(): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")().asInstanceOf[StackActionType]
    @scala.inline
    def pop(count: Double): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(count.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    
    @scala.inline
    def popToTop(): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("popToTop")().asInstanceOf[StackActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    @scala.inline
    def push(name: String): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(name.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    @scala.inline
    def push(name: String, params: js.Object): StackActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StackActionType]
    
    // tslint:disable-next-line no-redundant-undefined
    @scala.inline
    def replace(name: String): StackActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("replace")(name.asInstanceOf[js.Any]).asInstanceOf[StackActionType]
    @scala.inline
    def replace(name: String, params: js.Object): StackActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[StackActionType]
  }
  
  @scala.inline
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | PayloadSource | SourceTarget | TargetType | SourceTargetType
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("StackRouter")(options.asInstanceOf[js.Any]).asInstanceOf[Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | PayloadSource | SourceTarget | TargetType | SourceTargetType
  ]]
  
  object TabActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/core", "TabActions")
    @js.native
    val ^ : js.Any = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @scala.inline
    def jumpTo(name: String): TabActionType = ^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any]).asInstanceOf[TabActionType]
    @scala.inline
    def jumpTo(name: String, params: js.Object): TabActionType = (^.asInstanceOf[js.Dynamic].applyDynamic("jumpTo")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[TabActionType]
  }
  
  @scala.inline
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("TabRouter")(hasInitialRouteNameBackBehavior.asInstanceOf[js.Any]).asInstanceOf[Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ]]
  
  @scala.inline
  def createNavigatorFactory[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ComponentType[js.Any] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNavigatorFactory")(Navigator.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ]]
  
  @scala.inline
  def getActionFromState(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActionFromState")(state.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  @scala.inline
  def getActionFromState(state: PartialStateNavigationSta, options: typings.tuyaPanelKit.getActionFromStateMod.Options): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActionFromState")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action]]
  
  @scala.inline
  def getFocusedRouteNameFromRoute(route: (Partial[Route[String, js.UndefOr[js.Object]]]) & State): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedRouteNameFromRoute")(route.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  @scala.inline
  def getPathFromState(state: typings.tuyaPanelKit.getPathFromStateMod.State): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPathFromState")(state.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getPathFromState(
    state: typings.tuyaPanelKit.getPathFromStateMod.State,
    options: typings.tuyaPanelKit.getPathFromStateMod.Options
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPathFromState")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getStateFromPath(path: String): js.UndefOr[ResultState] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ResultState]]
  @scala.inline
  def getStateFromPath(path: String, options: typings.tuyaPanelKit.getStateFromPathMod.Options): js.UndefOr[ResultState] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStateFromPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ResultState]]
  
  @scala.inline
  def useFocusEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def useIsFocused(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFocused")().asInstanceOf[Boolean]
  
  @scala.inline
  def useNavigation[T /* <: NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object] */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigation")().asInstanceOf[T]
  
  @scala.inline
  def useNavigationBuilder[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, js.Any] */](
    createRouter: RouterFactory[State, js.Any, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) & RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = (^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationBuilder")(createRouter.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Descriptors[State, EventMap, ActionHelpers, ScreenOptions]]
  
  @scala.inline
  def useNavigationState[T](selector: Selector[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigationState")(selector.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def useRoute[T /* <: RouteProp[ParamListBase, String] */](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useRoute")().asInstanceOf[T]
}
