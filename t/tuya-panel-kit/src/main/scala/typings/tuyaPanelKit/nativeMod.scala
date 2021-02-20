package typings.tuyaPanelKit

import typings.react.mod.CElement
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.Text
import typings.reactNative.mod.TextProps
import typings.std.Partial
import typings.std.Record
import typings.tuyaPanelKit.anon.AccessibilityRole
import typings.tuyaPanelKit.anon.Descriptors
import typings.tuyaPanelKit.anon.GetInitialState
import typings.tuyaPanelKit.anon.Key
import typings.tuyaPanelKit.anon.NavigationContainerPropst
import typings.tuyaPanelKit.anon.Options
import typings.tuyaPanelKit.anon.Params
import typings.tuyaPanelKit.anon.PartialStateNavigationSta
import typings.tuyaPanelKit.anon.Payload
import typings.tuyaPanelKit.anon.PayloadSource
import typings.tuyaPanelKit.anon.Readonlykeystringindexnum
import typings.tuyaPanelKit.anon.ServerContextTypechildren
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
import typings.tuyaPanelKit.linkMod.Props
import typings.tuyaPanelKit.nativeTypesMod.LinkingOptions
import typings.tuyaPanelKit.nativeTypesMod.Theme
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
import typings.tuyaPanelKit.useScrollToTopMod.ScrollableWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeMod {
  
  /**
    * Container component which holds the navigation state.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("tuya-panel-kit/@react-navigation/native", "BaseNavigationContainer")
  @js.native
  val BaseNavigationContainer: ForwardRefExoticComponent[NavigationContainerProps with RefAttributes[NavigationContainerRef]] = js.native
  
  /**
    * Base router object that can be used when writing custom routers.
    * This provides few helper methods to handle common actions such as `RESET`.
    */
  object BaseRouter {
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "BaseRouter.getStateForAction")
    @js.native
    def getStateForAction[State /* <: Readonlykeystringindexnum */](state: State, action: CommonNavigationAction): State | PartialState[State] | Null = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "BaseRouter.shouldActionChangeFocus")
    @js.native
    def shouldActionChangeFocus(action: CommonNavigationAction): Boolean = js.native
  }
  
  object CommonActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "CommonActions.goBack")
    @js.native
    def goBack(): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(name: String): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(name: String, params: js.Object): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(route: Key): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/native", "CommonActions.navigate")
    @js.native
    def navigate(route: Params): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "CommonActions.reset")
    @js.native
    def reset(): Action = js.native
    @JSImport("tuya-panel-kit/@react-navigation/native", "CommonActions.reset")
    @js.native
    def reset(state: ResetState): Action = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "CommonActions.setParams")
    @js.native
    def setParams(params: js.Object): Action = js.native
  }
  
  /**
    * Context which holds the values for the current navigation tree.
    * Intended for use in SSR. This is not safe to use on the client.
    */
  @JSImport("tuya-panel-kit/@react-navigation/native", "CurrentRenderContext")
  @js.native
  val CurrentRenderContext: Context[js.UndefOr[Options]] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "DarkTheme")
  @js.native
  val DarkTheme: Theme = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "DefaultTheme")
  @js.native
  val DefaultTheme: Theme = js.native
  
  object DrawerActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "DrawerActions.closeDrawer")
    @js.native
    def closeDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/native", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/native", "DrawerActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "DrawerActions.openDrawer")
    @js.native
    def openDrawer(): DrawerActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/native", "DrawerActions.toggleDrawer")
    @js.native
    def toggleDrawer(): DrawerActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "DrawerRouter")
  @js.native
  def DrawerRouter(hasOpenByDefaultRest: DrawerRouterOptions): Router[DrawerNavigationState[ParamListBase], DrawerActionType | CommonNavigationAction] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "Link")
  @js.native
  def Link(hasToActionRest: Props): CElement[TextProps, Text] = js.native
  
  /**
    * Container component which holds the navigation state designed for React Native apps.
    * This should be rendered at the root wrapping the whole app.
    *
    * @param props.initialState Initial state object for the navigation tree.
    * When deep link handling is enabled, this will override deep links when specified.
    * Make sure that you don't specify an `initialState` when there's a deep link (`Linking.getInitialURL()`).
    * @param props.onReady Callback which is called after the navigation tree mounts.
    * @param props.onStateChange Callback which is called with the latest navigation state when it changes.
    * @param props.theme Theme object for the navigators.
    * @param props.linking Options for deep linking. Deep link handling is enabled when this prop is provided, unless `linking.enabled` is `false`.
    * @param props.fallback Fallback component to render until we have finished getting initial state when linking is enabled. Defaults to `null`.
    * @param props.documentTitle Options to configure the document title on Web. Updating document title is handled by default unless `documentTitle.enabled` is `false`.
    * @param props.children Child elements to render the content.
    * @param props.ref Ref object which refers to the navigation object containing helper methods.
    */
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationContainer")
  @js.native
  val NavigationContainer: ForwardRefExoticComponent[NavigationContainerPropst] = js.native
  
  /**
    * Context which holds the navigation prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationContext")
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
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationHelpersContext")
  @js.native
  val NavigationHelpersContext: Context[js.UndefOr[NavigationHelpers[Record[String, js.UndefOr[js.Object]], js.Object]]] = js.native
  
  /**
    * Context which holds the route prop for a screen.
    */
  // tslint:disable-next-line use-default-type-parameter
  @JSImport("tuya-panel-kit/@react-navigation/native", "NavigationRouteContext")
  @js.native
  val NavigationRouteContext: Context[js.UndefOr[Route[String, js.UndefOr[js.Object]]]] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "PrivateValueStore")
  @js.native
  class PrivateValueStore[A, B, C] ()
    extends typings.tuyaPanelKit.coreMod.PrivateValueStore[A, B, C]
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "ServerContainer")
  @js.native
  val ServerContainer: ForwardRefExoticComponent[ServerContextTypechildren] = js.native
  
  object StackActions {
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "StackActions.pop")
    @js.native
    def pop(): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/native", "StackActions.pop")
    @js.native
    def pop(count: Double): StackActionType = js.native
    
    @JSImport("tuya-panel-kit/@react-navigation/native", "StackActions.popToTop")
    @js.native
    def popToTop(): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/native", "StackActions.push")
    @js.native
    def push(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/native", "StackActions.push")
    @js.native
    def push(name: String, params: js.Object): StackActionType = js.native
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/native", "StackActions.replace")
    @js.native
    def replace(name: String): StackActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/native", "StackActions.replace")
    @js.native
    def replace(name: String, params: js.Object): StackActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "StackRouter")
  @js.native
  def StackRouter(options: StackRouterOptions): Router[
    StackNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | PayloadSource | SourceTarget | TargetType | SourceTargetType
  ] = js.native
  
  object TabActions {
    
    // tslint:disable-next-line no-redundant-undefined
    @JSImport("tuya-panel-kit/@react-navigation/native", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String): TabActionType = js.native
    @JSImport("tuya-panel-kit/@react-navigation/native", "TabActions.jumpTo")
    @js.native
    def jumpTo(name: String, params: js.Object): TabActionType = js.native
  }
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "TabRouter")
  @js.native
  def TabRouter(hasInitialRouteNameBackBehavior: TabRouterOptions): Router[
    TabNavigationState[Record[String, js.UndefOr[js.Object]]], 
    Source | Payload | Target | Type | TabActionType
  ] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "ThemeProvider")
  @js.native
  def ThemeProvider(hasValueChildren: typings.tuyaPanelKit.themeProviderMod.Props): Element = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "createNavigatorFactory")
  @js.native
  def createNavigatorFactory[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, NavigatorComponent /* <: ComponentType[_] */](Navigator: NavigatorComponent): js.Function0[
    TypedNavigator[
      Record[String, js.UndefOr[js.Object]], 
      State, 
      ScreenOptions, 
      EventMap, 
      NavigatorComponent
    ]
  ] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "getActionFromState")
  @js.native
  def getActionFromState(state: PartialStateNavigationSta): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  @JSImport("tuya-panel-kit/@react-navigation/native", "getActionFromState")
  @js.native
  def getActionFromState(state: PartialStateNavigationSta, options: typings.tuyaPanelKit.getActionFromStateMod.Options): js.UndefOr[NavigateAction[NavigationState[ParamListBase]] | Action] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "getFocusedRouteNameFromRoute")
  @js.native
  def getFocusedRouteNameFromRoute(route: (Partial[Route[String, js.UndefOr[js.Object]]]) with State): js.UndefOr[String] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "getPathFromState")
  @js.native
  def getPathFromState(state: typings.tuyaPanelKit.getPathFromStateMod.State): String = js.native
  @JSImport("tuya-panel-kit/@react-navigation/native", "getPathFromState")
  @js.native
  def getPathFromState(
    state: typings.tuyaPanelKit.getPathFromStateMod.State,
    options: typings.tuyaPanelKit.getPathFromStateMod.Options
  ): String = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String): js.UndefOr[ResultState] = js.native
  @JSImport("tuya-panel-kit/@react-navigation/native", "getStateFromPath")
  @js.native
  def getStateFromPath(path: String, options: typings.tuyaPanelKit.getStateFromPathMod.Options): js.UndefOr[ResultState] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useBackButton")
  @js.native
  def useBackButton(ref: RefObject[NavigationContainerRef]): Unit = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useFocusEffect")
  @js.native
  def useFocusEffect(effect: EffectCallback): Unit = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useIsFocused")
  @js.native
  def useIsFocused(): Boolean = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useLinkBuilder")
  @js.native
  def useLinkBuilder(): js.Function2[/* name */ String, /* params */ js.UndefOr[js.Object], js.UndefOr[String]] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useLinkProps")
  @js.native
  def useLinkProps(hasToAction: typings.tuyaPanelKit.useLinkPropsMod.Props): AccessibilityRole = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useLinkTo")
  @js.native
  def useLinkTo(): js.Function1[/* path */ String, Unit] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useLinking")
  @js.native
  def useLinking(
    ref: RefObject[NavigationContainerRef],
    hasEnabledConfigGetStateFromPathGetPathFromState: LinkingOptions
  ): GetInitialState = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useNavigation")
  @js.native
  def useNavigation[T /* <: NavigationProp[ParamListBase, String, NavigationState[ParamListBase], js.Object, js.Object] */](): T = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useNavigationBuilder")
  @js.native
  def useNavigationBuilder[State /* <: NavigationState[ParamListBase] */, RouterOptions /* <: DefaultRouterOptions[String] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, _] */](
    createRouter: RouterFactory[State, _, RouterOptions],
    options: (DefaultNavigatorOptions[ScreenOptions, ParamListBase]) with RouterOptions
  ): Descriptors[State, EventMap, ActionHelpers, ScreenOptions] = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useNavigationState")
  @js.native
  def useNavigationState[T](selector: Selector[T]): T = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useRoute")
  @js.native
  def useRoute[T /* <: RouteProp[ParamListBase, String] */](): T = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useScrollToTop")
  @js.native
  def useScrollToTop(ref: RefObject[ScrollableWrapper]): Unit = js.native
  
  @JSImport("tuya-panel-kit/@react-navigation/native", "useTheme")
  @js.native
  def useTheme(): Theme = js.native
}
