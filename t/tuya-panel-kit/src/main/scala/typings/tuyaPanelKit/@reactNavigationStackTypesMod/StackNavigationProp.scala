package typings.tuyaPanelKit.`@reactNavigationStackTypesMod`

import typings.std.Extract
import typings.std.Partial
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.EventListenerCallback
import typings.tuyaPanelKit.`@reactNavigationCoreTypesMod`.EventMapCore
import typings.tuyaPanelKit.`@reactNavigationRoutersStackRouterMod`.StackNavigationState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationAction
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.PartialState
import typings.tuyaPanelKit.anon.A
import typings.tuyaPanelKit.anon.KeyParams
import typings.tuyaPanelKit.anon.NameRouteName
import typings.tuyaPanelKit.anon.PartialStackNavigationOpt
import typings.tuyaPanelKit.tuyaPanelKitStrings.beforeRemove
import typings.tuyaPanelKit.tuyaPanelKitStrings.blur
import typings.tuyaPanelKit.tuyaPanelKitStrings.focus
import typings.tuyaPanelKit.tuyaPanelKitStrings.gestureCancel
import typings.tuyaPanelKit.tuyaPanelKitStrings.gestureEnd
import typings.tuyaPanelKit.tuyaPanelKitStrings.gestureStart
import typings.tuyaPanelKit.tuyaPanelKitStrings.state
import typings.tuyaPanelKit.tuyaPanelKitStrings.transitionEnd
import typings.tuyaPanelKit.tuyaPanelKitStrings.transitionStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/native.NavigationProp<ParamList, RouteName, tuya-panel-kit.tuya-panel-kit/@react-navigation/native.StackNavigationState<ParamList>, tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationOptions, tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap> & tuya-panel-kit.tuya-panel-kit/@react-navigation/native.StackActionHelpers<ParamList> */
@js.native
trait StackNavigationProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  /**
    * UGLY HACK! DO NOT USE THE TYPE!!!
    *
    * TypeScript requires a type to be used to be able to infer it.
    * The type should exist as its own without any operations such as union.
    * So we need to figure out a way to store this type in a property.
    * The problem with a normal property is that it shows up in intelliSense.
    * Adding private keyword works, but the annotation is stripped away in declaration.
    * Turns out if we use an empty string, it doesn't show up in intelliSense.
    */
  /* protected */ @JSName("")
  var _empty: js.UndefOr[A[ParamList]] = js.native
  
  /**
    * Subscribe to events from the parent navigator.
    *
    * @param type Type of the event (e.g. `focus`, `blur`)
    * @param callback Callback listener which is executed upon receiving the event.
    */
  def addListener[EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/StackRouter.StackNavigationState<ParamList>> */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel | focus | blur | state | beforeRemove, 
    String
  ] */](
    `type`: EventName,
    callback: EventListenerCallback[StackNavigationEventMap & EventMapCore[StackNavigationState[ParamList]], EventName]
  ): js.Function0[Unit] = js.native
  
  /**
    * Check if dispatching back action will be handled by navigation.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def canGoBack(): Boolean = js.native
  
  /**
    * Returns the parent navigator, if any. Reason why the function is called
    * dangerouslyGetParent is to warn developers against overusing it to eg. get parent
    * of parent and other hard-to-follow patterns.
    */
  // tslint:disable-next-line no-unnecessary-generics
  def dangerouslyGetParent[T](): T = js.native
  
  /**
    * Returns the navigator's state. Reason why the function is called
    * dangerouslyGetState is to discourage developers to use internal navigation's state.
    * Note that this method doesn't re-render screen when the result changes. So don't use it in `render`.
    */
  def dangerouslyGetState(): StackNavigationState[ParamList] = js.native
  
  def dispatch(action: js.Function1[/* state */ StackNavigationState[ParamList], NavigationAction]): Unit = js.native
  /**
    * Dispatch an action or an update function to the router.
    * The update function will receive the current state,
    *
    * @param action Action object or update function.
    */
  def dispatch(action: NavigationAction): Unit = js.native
  
  /**
    * Go back to the previous route in history.
    */
  def goBack(): Unit = js.native
  
  /**
    * Check if the screen is focused. The method returns `true` if focused, `false` otherwise.
    * Note that this method doesn't re-render screen when the focus changes. So don't use it in `render`.
    * To get notified of focus changes, use `addListener('focus', cb)` and `addListener('blur', cb)`.
    * To conditionally render content based on focus state, use the `useIsFocused` hook.
    */
  def isFocused(): Boolean = js.native
  
  /**
    * Navigate to a route in current navigation tree.
    *
    * @param name Name of the route to navigate to.
    * @param [params] Params object for the route.
    */
  def navigate[RouteName /* <: /* keyof ParamList */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] */ js.Any
  ): Unit = js.native
  /**
    * Navigate to a route in current navigation tree.
    *
    * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
    */
  def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyParams[ParamList, RouteName]): Unit = js.native
  def navigate[RouteName /* <: /* keyof ParamList */ String */](route: NameRouteName[RouteName, ParamList]): Unit = js.native
  
  /**
    * Pop a screen from the stack.
    */
  def pop(): Unit = js.native
  def pop(count: Double): Unit = js.native
  
  /**
    * Pop to the first route in the stack, dismissing all other screens.
    */
  def popToTop(): Unit = js.native
  
  /**
    * Push a new screen onto the stack.
    *
    * @param name Name of the route for the tab.
    * @param [params] Params object for the route.
    */
  def push[RouteName /* <: /* keyof ParamList */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] */ js.Any
  ): Unit = js.native
  
  def removeListener[EventName /* <: Extract[
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/stack/types.StackNavigationEventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/StackRouter.StackNavigationState<ParamList>> */ transitionStart | transitionEnd | gestureStart | gestureEnd | gestureCancel | focus | blur | state | beforeRemove, 
    String
  ] */](
    `type`: EventName,
    callback: EventListenerCallback[StackNavigationEventMap & EventMapCore[StackNavigationState[ParamList]], EventName]
  ): Unit = js.native
  
  /**
    * Replace the current route with a new one.
    *
    * @param name Route name of the new route.
    * @param [params] Params object for the new route.
    */
  def replace[RouteName /* <: /* keyof ParamList */ String */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] */ js.Any
  ): Unit = js.native
  
  /**
    * Reset the navigation state to the provided state.
    *
    * @param state Navigation state object.
    */
  def reset(state: PartialState[StackNavigationState[ParamList]] | StackNavigationState[ParamList]): Unit = js.native
  
  /**
    * Update the options for the route.
    * The options object will be shallow merged with default options object.
    *
    * @param options Options object for the route.
    */
  def setOptions(options: PartialStackNavigationOpt): Unit = js.native
  
  /**
    * Update the param object for the route.
    * The new params will be shallow merged with the old one.
    *
    * @param params Params object for the current route.
    */
  def setParams(
    params: Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ]
  ): Unit = js.native
}
