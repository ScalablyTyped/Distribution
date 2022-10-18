package typings.tuyaPanelKit

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Extract
import typings.std.Omit
import typings.std.Partial
import typings.std.Record
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.DefaultRouterOptions
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.InitialState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationAction
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.NavigationState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.ParamListBase
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.PartialState
import typings.tuyaPanelKit.`@reactNavigationRoutersTypesMod`.Route
import typings.tuyaPanelKit.anon.A
import typings.tuyaPanelKit.anon.AB
import typings.tuyaPanelKit.anon.B
import typings.tuyaPanelKit.anon.C
import typings.tuyaPanelKit.anon.CanPreventDefault
import typings.tuyaPanelKit.anon.CanPreventDefaultData
import typings.tuyaPanelKit.anon.Children
import typings.tuyaPanelKit.anon.Component
import typings.tuyaPanelKit.anon.Data
import typings.tuyaPanelKit.anon.Data2
import typings.tuyaPanelKit.anon.DataNoop
import typings.tuyaPanelKit.anon.DataOptionsObject
import typings.tuyaPanelKit.anon.DataStateState
import typings.tuyaPanelKit.anon.GetComponent
import typings.tuyaPanelKit.anon.Initial
import typings.tuyaPanelKit.anon.InitialParams
import typings.tuyaPanelKit.anon.KeyNameRouteName
import typings.tuyaPanelKit.anon.KeyParams
import typings.tuyaPanelKit.anon.KeyString
import typings.tuyaPanelKit.anon.NameRouteName
import typings.tuyaPanelKit.anon.Navigation
import typings.tuyaPanelKit.anon.PartialStateNavigationSta
import typings.tuyaPanelKit.anon.TargetTypeEventName
import typings.tuyaPanelKit.anon.TypeEventName
import typings.tuyaPanelKit.anon.`3`
import typings.tuyaPanelKit.anon.`4`
import typings.tuyaPanelKit.tuyaPanelKitStrings.__unsafe_action__
import typings.tuyaPanelKit.tuyaPanelKitStrings._empty
import typings.tuyaPanelKit.tuyaPanelKitStrings.addListener
import typings.tuyaPanelKit.tuyaPanelKitStrings.beforeRemove
import typings.tuyaPanelKit.tuyaPanelKitStrings.blur
import typings.tuyaPanelKit.tuyaPanelKitStrings.canGoBack
import typings.tuyaPanelKit.tuyaPanelKitStrings.children
import typings.tuyaPanelKit.tuyaPanelKitStrings.dangerouslyGetParent
import typings.tuyaPanelKit.tuyaPanelKitStrings.dangerouslyGetState
import typings.tuyaPanelKit.tuyaPanelKitStrings.dispatch
import typings.tuyaPanelKit.tuyaPanelKitStrings.focus
import typings.tuyaPanelKit.tuyaPanelKitStrings.goBack
import typings.tuyaPanelKit.tuyaPanelKitStrings.initialRouteName
import typings.tuyaPanelKit.tuyaPanelKitStrings.isFocused
import typings.tuyaPanelKit.tuyaPanelKitStrings.navigate_
import typings.tuyaPanelKit.tuyaPanelKitStrings.options
import typings.tuyaPanelKit.tuyaPanelKitStrings.removeListener
import typings.tuyaPanelKit.tuyaPanelKitStrings.reset_
import typings.tuyaPanelKit.tuyaPanelKitStrings.screenOptions
import typings.tuyaPanelKit.tuyaPanelKitStrings.setOptions
import typings.tuyaPanelKit.tuyaPanelKitStrings.setParams
import typings.tuyaPanelKit.tuyaPanelKitStrings.state
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `@reactNavigationCoreTypesMod` {
  
  @JSImport("tuya-panel-kit/@react-navigation/core/types", "PrivateValueStore")
  @js.native
  open class PrivateValueStore[A, B, C] () extends StObject {
    
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
    var _empty: js.UndefOr[AB[A, B, C]] = js.native
  }
  
  type CompositeNavigationProp[A /* <: NavigationProp[ParamListBase, String, Any, Any, js.Object] */, B /* <: NavigationHelpersCommon[ParamListBase, Any] */] = (Omit[
    A & B, 
    /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationProp<any, string, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<any>, {}, {}> */ dispatch | navigate_ | reset_ | goBack | isFocused | canGoBack | dangerouslyGetParent | dangerouslyGetState | _empty | setParams | setOptions | addListener | removeListener
  ]) & (NavigationProp[
    /* import warning: importer.ImportType#apply Failed type conversion: A extends tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationHelpersCommon<infer T, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>> ? T : never */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: / **
    * The route name should refer to the route name specified in the first type
    * Ideally it should work for any of them, but it's not possible to infer that way
    * /
  A extends tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationProp<any, infer R, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<any>, {}, {}> ? R : string */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: / **
    * The type of state should refer to the state specified in the first type
    * /
  A extends tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationProp<any, any, infer S, {}, {}> ? S : tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase> */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: A extends tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationProp<any, any, any, infer O, {}> ? O : {} */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: / **
    * Event consumer config should refer to the config specified in the first type
    * This allows typechecking `addListener`/`removeListener`
    * /
  A extends tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationProp<any, any, any, any, infer E> ? E : {} */ js.Any
  ])
  
  trait DefaultNavigatorOptions[ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */]
    extends StObject
       with DefaultRouterOptions[Extract[/* keyof ParamList */ String, String]] {
    
    /**
      * Children React Elements to extract the route configuration from.
      * Only `Screen` components are supported as children.
      */
    var children: ReactNode
    
    /**
      * Default options for all screens under this navigator.
      */
    var screenOptions: js.UndefOr[ScreenOptions | (js.Function1[/* props */ Navigation[ParamList], ScreenOptions])] = js.undefined
  }
  object DefaultNavigatorOptions {
    
    inline def apply[ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */](): DefaultNavigatorOptions[ScreenOptions, ParamList] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultNavigatorOptions[ScreenOptions, ParamList]]
    }
    
    extension [Self <: DefaultNavigatorOptions[?, ?], ScreenOptions /* <: js.Object */, ParamList /* <: ParamListBase */](x: Self & (DefaultNavigatorOptions[ScreenOptions, ParamList])) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setScreenOptions(value: ScreenOptions | (js.Function1[/* props */ Navigation[ParamList], ScreenOptions])): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
      
      inline def setScreenOptionsFunction1(value: /* props */ Navigation[ParamList] => ScreenOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
      
      inline def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
    }
  }
  
  trait Descriptor[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    /**
      * Navigation object for the screen
      */
    var navigation: NavigationProp[ParamList, RouteName, State, ScreenOptions, EventMap]
    
    /**
      * Options for the route.
      */
    var options: ScreenOptions
    
    /**
      * Render the component associated with this route.
      */
    def render(): Element
  }
  object Descriptor {
    
    inline def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
      navigation: NavigationProp[ParamList, RouteName, State, ScreenOptions, EventMap],
      options: ScreenOptions,
      render: () => Element
    ): Descriptor[ParamList, RouteName, State, ScreenOptions, EventMap] = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], render = js.Any.fromFunction0(render))
      __obj.asInstanceOf[Descriptor[ParamList, RouteName, State, ScreenOptions, EventMap]]
    }
    
    extension [Self <: Descriptor[?, ?, ?, ?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](x: Self & (Descriptor[ParamList, RouteName, State, ScreenOptions, EventMap])) {
      
      inline def setNavigation(value: NavigationProp[ParamList, RouteName, State, ScreenOptions, EventMap]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ScreenOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRender(value: () => Element): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
    }
  }
  
  type EventArg[EventName /* <: String */, CanPreventDefault /* <: js.UndefOr[Boolean] */, Data] = TypeEventName[EventName] & (/* import warning: importer.ImportType#apply Failed type conversion: CanPreventDefault extends true ? { readonly defaultPrevented :boolean, preventDefault (): void} : {} */ js.Any)
  
  trait EventConsumer[EventMap /* <: EventMapBase */] extends StObject {
    
    /**
      * Subscribe to events from the parent navigator.
      *
      * @param type Type of the event (e.g. `focus`, `blur`)
      * @param callback Callback listener which is executed upon receiving the event.
      */
    def addListener[EventName /* <: Extract[/* keyof EventMap */ String, String] */](`type`: EventName, callback: EventListenerCallback[EventMap, EventName]): js.Function0[Unit]
    
    def removeListener[EventName /* <: Extract[/* keyof EventMap */ String, String] */](`type`: EventName, callback: EventListenerCallback[EventMap, EventName]): Unit
  }
  object EventConsumer {
    
    inline def apply[EventMap /* <: EventMapBase */](
      addListener: (Any, EventListenerCallback[EventMap, Any]) => js.Function0[Unit],
      removeListener: (Any, EventListenerCallback[EventMap, Any]) => Unit
    ): EventConsumer[EventMap] = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), removeListener = js.Any.fromFunction2(removeListener))
      __obj.asInstanceOf[EventConsumer[EventMap]]
    }
    
    extension [Self <: EventConsumer[?], EventMap /* <: EventMapBase */](x: Self & EventConsumer[EventMap]) {
      
      inline def setAddListener(value: (Any, EventListenerCallback[EventMap, Any]) => js.Function0[Unit]): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setRemoveListener(value: (Any, EventListenerCallback[EventMap, Any]) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    }
  }
  
  trait EventEmitter[EventMap /* <: EventMapBase */] extends StObject {
    
    /**
      * Emit an event to child screens.
      *
      * @param options.type Type of the event (e.g. `focus`, `blur`)
      * @param [options.data] Optional information regarding the event.
      * @param [options.target] Key of the target route which should receive the event.
      * If not specified, all routes receive the event.
      */
    def emit[EventName /* <: Extract[/* keyof EventMap */ String, String] */](
      options: (TargetTypeEventName[EventName, EventMap]) & (/* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any)
    ): EventArg[
        EventName, 
        /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
      ]
  }
  object EventEmitter {
    
    inline def apply[EventMap /* <: EventMapBase */](
      emit: (TargetTypeEventName[Any, EventMap]) & (/* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any) => EventArg[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
        ]
    ): EventEmitter[EventMap] = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit))
      __obj.asInstanceOf[EventEmitter[EventMap]]
    }
    
    extension [Self <: EventEmitter[?], EventMap /* <: EventMapBase */](x: Self & EventEmitter[EventMap]) {
      
      inline def setEmit(
        value: (TargetTypeEventName[Any, EventMap]) & (/* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any) => EventArg[
              Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
              /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
            ]
      ): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
    }
  }
  
  type EventListenerCallback[EventMap /* <: EventMapBase */, EventName /* <: /* keyof EventMap */ String */] = js.Function1[
    /* e */ EventArg[
      Extract[EventName, String], 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
    ], 
    Unit
  ]
  
  type EventMapBase = Record[String, CanPreventDefault]
  
  trait EventMapCore[State /* <: NavigationState[ParamListBase] */] extends StObject {
    
    var beforeRemove: CanPreventDefaultData
    
    var blur: Data
    
    var focus: Data
    
    var state: DataStateState[State]
  }
  object EventMapCore {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */](beforeRemove: CanPreventDefaultData, blur: Data, focus: Data, state: DataStateState[State]): EventMapCore[State] = {
      val __obj = js.Dynamic.literal(beforeRemove = beforeRemove.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMapCore[State]]
    }
    
    extension [Self <: EventMapCore[?], State /* <: NavigationState[ParamListBase] */](x: Self & EventMapCore[State]) {
      
      inline def setBeforeRemove(value: CanPreventDefaultData): Self = StObject.set(x, "beforeRemove", value.asInstanceOf[js.Any])
      
      inline def setBlur(value: Data): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: Data): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setState(value: DataStateState[State]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationContainerEventMap extends StObject {
    
    /**
      * Event which fires when an action is dispatched.
      * Only intended for debugging purposes, don't use it for app logic.
      * This event will be emitted before state changes have been applied.
      */
    var __unsafe_action__ : DataNoop
    
    /**
      * Event which fires when current options changes.
      */
    var options: DataOptionsObject
    
    /**
      * Event which fires when the navigation state changes.
      */
    var state: Data2
  }
  object NavigationContainerEventMap {
    
    inline def apply(__unsafe_action__ : DataNoop, options: DataOptionsObject, state: Data2): NavigationContainerEventMap = {
      val __obj = js.Dynamic.literal(__unsafe_action__ = __unsafe_action__.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationContainerEventMap]
    }
    
    extension [Self <: NavigationContainerEventMap](x: Self) {
      
      inline def setOptions(value: DataOptionsObject): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setState(value: Data2): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def set__unsafe_action__(value: DataNoop): Self = StObject.set(x, "__unsafe_action__", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationContainerProps extends StObject {
    
    /**
      * Children elements to render.
      */
    var children: ReactNode
    
    /**
      * Whether this navigation container should be independent of parent containers.
      * If this is not set to `true`, this container cannot be nested inside another container.
      * Setting it to `true` disconnects any children navigators from parent container.
      */
    var independent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial navigation state for the child navigators.
      */
    var initialState: js.UndefOr[InitialState] = js.undefined
    
    /**
      * Callback which is called with the latest navigation state when it changes.
      */
    var onStateChange: js.UndefOr[js.Function1[/* state */ js.UndefOr[NavigationState[ParamListBase]], Unit]] = js.undefined
    
    /**
      * Callback which is called when an action is not handled.
      */
    var onUnhandledAction: js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]] = js.undefined
  }
  object NavigationContainerProps {
    
    inline def apply(): NavigationContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationContainerProps]
    }
    
    extension [Self <: NavigationContainerProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
      
      inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
      
      inline def setInitialState(value: InitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
      
      inline def setOnStateChange(value: /* state */ js.UndefOr[NavigationState[ParamListBase]] => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction1(value))
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      inline def setOnUnhandledAction(value: /* action */ NavigationAction => Unit): Self = StObject.set(x, "onUnhandledAction", js.Any.fromFunction1(value))
      
      inline def setOnUnhandledActionUndefined: Self = StObject.set(x, "onUnhandledAction", js.undefined)
    }
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationHelpers<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.ParamListBase, {}> & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventConsumer<tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationContainerEventMap> & {resetRoot (state : tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.PartialState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>> | tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase> | undefined): void, getRootState (): tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>, getCurrentRoute (): tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.Route<string, object | undefined> | undefined, getCurrentOptions (): object | undefined} */
  @js.native
  trait NavigationContainerRef extends StObject {
    
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
    var _empty: js.UndefOr[A] = js.native
    
    /**
      * Subscribe to events from the parent navigator.
      *
      * @param type Type of the event (e.g. `focus`, `blur`)
      * @param callback Callback listener which is executed upon receiving the event.
      */
    def addListener[EventName /* <: Extract[
        /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationContainerEventMap */ state | options | __unsafe_action__, 
        String
      ] */](`type`: EventName, callback: EventListenerCallback[NavigationContainerEventMap, EventName]): js.Function0[Unit] = js.native
    
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
    def dangerouslyGetState(): NavigationState[ParamListBase] = js.native
    
    def dispatch(action: js.Function1[/* state */ NavigationState[ParamListBase], NavigationAction]): Unit = js.native
    /**
      * Dispatch an action or an update function to the router.
      * The update function will receive the current state,
      *
      * @param action Action object or update function.
      */
    def dispatch(action: NavigationAction): Unit = js.native
    
    /**
      * Emit an event to child screens.
      *
      * @param options.type Type of the event (e.g. `focus`, `blur`)
      * @param [options.data] Optional information regarding the event.
      * @param [options.target] Key of the target route which should receive the event.
      * If not specified, all routes receive the event.
      */
    def emit[EventName /* <: Extract[/* keyof {} */ String, String] */](
      options: `3`[EventName] & (/* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any)
    ): EventArg[
        EventName, 
        /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['canPreventDefault'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: {}[EventName]['data'] */ js.Any
      ] = js.native
    
    /**
      * Get the currently focused route's options.
      */
    def getCurrentOptions(): js.UndefOr[js.Object] = js.native
    
    /**
      * Get the currently focused navigation route.
      */
    def getCurrentRoute(): js.UndefOr[Route[String, js.UndefOr[js.Object]]] = js.native
    
    /**
      * Get the rehydrated navigation state of the navigation tree.
      */
    def getRootState(): NavigationState[ParamListBase] = js.native
    
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
    def navigate[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type undefined extends ParamList[RouteName] ? [RouteName] | [RouteName, ParamList[RouteName]] : [RouteName, ParamList[RouteName]] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: undefined extends tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] ? [RouteName] | [RouteName, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName]] : [RouteName, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName]] */ js.Any
    ): Unit = js.native
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
      */
    def navigate[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](route: KeyParams[RouteName]): Unit = js.native
    def navigate[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](route: NameRouteName[RouteName]): Unit = js.native
    
    def removeListener[EventName /* <: Extract[
        /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationContainerEventMap */ state | options | __unsafe_action__, 
        String
      ] */](`type`: EventName, callback: EventListenerCallback[NavigationContainerEventMap, EventName]): Unit = js.native
    
    def reset(state: NavigationState[ParamListBase]): Unit = js.native
    /**
      * Reset the navigation state to the provided state.
      *
      * @param state Navigation state object.
      */
    def reset(state: PartialStateNavigationSta): Unit = js.native
    
    /**
      * Reset the navigation state of the root navigator to the provided state.
      *
      * @param state Navigation state object.
      */
    def resetRoot(): Unit = js.native
    def resetRoot(state: NavigationState[ParamListBase]): Unit = js.native
    def resetRoot(state: PartialStateNavigationSta): Unit = js.native
    
    /**
      * Update the param object for the route.
      * The new params will be shallow merged with the old one.
      *
      * @param params Params object for the current route.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def setParams[RouteName /* <: /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase */ String */](
      params: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase[RouteName] */ js.Any
        ]
    ): Unit = js.native
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationHelpersCommon<ParamList, tuya-panel-kit.tuya-panel-kit/@react-navigation/routers.NavigationState<tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.ParamListBase>> & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventEmitter<EventMap> & {setParams <RouteName extends keyof ParamList>(params : std.Partial<ParamList[RouteName]>): void} */
  @js.native
  trait NavigationHelpers[ParamList /* <: ParamListBase */, EventMap /* <: EventMapBase */] extends StObject {
    
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
    var _empty: js.UndefOr[B[ParamList]] = js.native
    
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
    def dangerouslyGetState(): NavigationState[ParamListBase] = js.native
    
    def dispatch(action: js.Function1[/* state */ NavigationState[ParamListBase], NavigationAction]): Unit = js.native
    /**
      * Dispatch an action or an update function to the router.
      * The update function will receive the current state,
      *
      * @param action Action object or update function.
      */
    def dispatch(action: NavigationAction): Unit = js.native
    
    /**
      * Emit an event to child screens.
      *
      * @param options.type Type of the event (e.g. `focus`, `blur`)
      * @param [options.data] Optional information regarding the event.
      * @param [options.target] Key of the target route which should receive the event.
      * If not specified, all routes receive the event.
      */
    def emit[EventName /* <: Extract[/* keyof EventMap */ String, String] */](
      options: (`4`[EventName, EventMap]) & (/* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] extends true ? {  canPreventDefault :true} : {} */ js.Any)
    ): EventArg[
        EventName, 
        /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
        /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
      ] = js.native
    
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
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyNameRouteName[RouteName, ParamList]): Unit = js.native
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
      */
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyString[ParamList, RouteName]): Unit = js.native
    
    def reset(state: NavigationState[ParamListBase]): Unit = js.native
    /**
      * Reset the navigation state to the provided state.
      *
      * @param state Navigation state object.
      */
    def reset(state: PartialStateNavigationSta): Unit = js.native
    
    /**
      * Update the param object for the route.
      * The new params will be shallow merged with the old one.
      *
      * @param params Params object for the current route.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def setParams[RouteName /* <: /* keyof ParamList */ String */](
      params: Partial[
          /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
        ]
    ): Unit = js.native
  }
  
  // tslint:disable-next-line strict-export-declare-modifiers
  @js.native
  trait NavigationHelpersCommon[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */]
    extends PrivateValueStore[ParamList, /* keyof ParamList */ String, js.Object] {
    
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
    def dangerouslyGetState(): State = js.native
    
    def dispatch(action: js.Function1[/* state */ State, NavigationAction]): Unit = js.native
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
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyNameRouteName[RouteName, ParamList]): Unit = js.native
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
      */
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyString[ParamList, RouteName]): Unit = js.native
    
    /**
      * Reset the navigation state to the provided state.
      *
      * @param state Navigation state object.
      */
    def reset(state: PartialState[State] | State): Unit = js.native
  }
  
  /* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.NavigationHelpersCommon<ParamList, State> & {setParams (params : std.Partial<ParamList[RouteName]>): void, setOptions (options : std.Partial<ScreenOptions>): void} & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventConsumer<EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State>> & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.PrivateValueStore<ParamList, RouteName, EventMap> */
  @js.native
  trait NavigationProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
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
    var _empty: js.UndefOr[B[ParamList]] & (js.UndefOr[C[ParamList, RouteName, EventMap]]) = js.native
    
    /**
      * Subscribe to events from the parent navigator.
      *
      * @param type Type of the event (e.g. `focus`, `blur`)
      * @param callback Callback listener which is executed upon receiving the event.
      */
    def addListener[EventName /* <: Extract[
        /* keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> */ focus | blur | state | beforeRemove, 
        String
      ] */](`type`: EventName, callback: EventListenerCallback[EventMap & EventMapCore[State], EventName]): js.Function0[Unit] = js.native
    
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
    def dangerouslyGetState(): State = js.native
    
    def dispatch(action: js.Function1[/* state */ State, NavigationAction]): Unit = js.native
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
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyNameRouteName[RouteName, ParamList]): Unit = js.native
    /**
      * Navigate to a route in current navigation tree.
      *
      * @param route Object with `key` or `name` for the route to navigate to, and a `params` object.
      */
    def navigate[RouteName /* <: /* keyof ParamList */ String */](route: KeyString[ParamList, RouteName]): Unit = js.native
    
    def removeListener[EventName /* <: Extract[
        /* keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> */ focus | blur | state | beforeRemove, 
        String
      ] */](`type`: EventName, callback: EventListenerCallback[EventMap & EventMapCore[State], EventName]): Unit = js.native
    
    /**
      * Reset the navigation state to the provided state.
      *
      * @param state Navigation state object.
      */
    def reset(state: PartialState[State] | State): Unit = js.native
    
    /**
      * Update the options for the route.
      * The options object will be shallow merged with default options object.
      *
      * @param options Options object for the route.
      */
    def setOptions(options: Partial[ScreenOptions]): Unit = js.native
    
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
  
  type NavigatorScreenParams[ParamList, State /* <: NavigationState[ParamListBase] */] = Initial[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ RouteName in keyof ParamList ]: undefined extends ParamList[RouteName]? {  screen :RouteName,   params :ParamList[RouteName] | undefined,   initial :boolean | undefined,   state :never | undefined} : {  screen :RouteName,   params :ParamList[RouteName],   initial :boolean | undefined,   state :never | undefined}}[keyof ParamList] */ js.Any)
  
  trait PathConfig extends StObject {
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var initialRouteName: js.UndefOr[String] = js.undefined
    
    var parse: js.UndefOr[Record[String, js.Function1[/* value */ String, Any]]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var screens: js.UndefOr[PathConfigMap] = js.undefined
    
    var stringify: js.UndefOr[Record[String, js.Function1[/* value */ Any, String]]] = js.undefined
  }
  object PathConfig {
    
    inline def apply(): PathConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathConfig]
    }
    
    extension [Self <: PathConfig](x: Self) {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      inline def setParse(value: Record[String, js.Function1[/* value */ String, Any]]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setScreens(value: PathConfigMap): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
      
      inline def setScreensUndefined: Self = StObject.set(x, "screens", js.undefined)
      
      inline def setStringify(value: Record[String, js.Function1[/* value */ Any, String]]): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
      
      inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    }
  }
  
  type PathConfigMap = StringDictionary[String | PathConfig]
  
  type RouteConfig[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] = (Children & (InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap])) | (Component & (InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap])) | ((GetComponent[ParamList, RouteName]) & (InitialParams[RouteName, ScreenOptions, ParamList, State, EventMap]))
  
  type RouteProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] = Route[
    Extract[RouteName, String], 
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ]
  
  type ScreenListeners[State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] = Partial[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ EventName in keyof EventMap & tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventMapCore<State> ]: tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.EventListenerCallback<EventMap, EventName>} */ js.Any
  ]
  
  trait TypedNavigator[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ComponentType[Any] */] extends StObject {
    
    /**
      * Navigator component which manages the child screens.
      */
    var Navigator: ComponentType[
        (Omit[
          ComponentProps[Navigator], 
          /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.DefaultNavigatorOptions<any, any> */ children | screenOptions | initialRouteName
        ]) & (DefaultNavigatorOptions[ScreenOptions, ParamList])
      ]
    
    /**
      * Component used for specifying route configuration.
      */
    // tslint:disable-next-line no-unnecessary-generics
    def Screen[RouteName /* <: /* keyof ParamList */ String */](_underscore: RouteConfig[ParamList, RouteName, State, ScreenOptions, EventMap]): Null
  }
  object TypedNavigator {
    
    inline def apply[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ComponentType[Any] */](
      Navigator: ComponentType[
          (Omit[
            ComponentProps[Navigator], 
            /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.DefaultNavigatorOptions<any, any> */ children | screenOptions | initialRouteName
          ]) & (DefaultNavigatorOptions[ScreenOptions, ParamList])
        ],
      Screen: RouteConfig[ParamList, Any, State, ScreenOptions, EventMap] => Null
    ): TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator] = {
      val __obj = js.Dynamic.literal(Navigator = Navigator.asInstanceOf[js.Any], Screen = js.Any.fromFunction1(Screen))
      __obj.asInstanceOf[TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator]]
    }
    
    extension [Self <: TypedNavigator[?, ?, ?, ?, ?], ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ComponentType[Any] */](x: Self & (TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator])) {
      
      inline def setNavigator(
        value: ComponentType[
              (Omit[
                ComponentProps[Navigator], 
                /* keyof tuya-panel-kit.tuya-panel-kit/@react-navigation/core/types.DefaultNavigatorOptions<any, any> */ children | screenOptions | initialRouteName
              ]) & (DefaultNavigatorOptions[ScreenOptions, ParamList])
            ]
      ): Self = StObject.set(x, "Navigator", value.asInstanceOf[js.Any])
      
      inline def setScreen(value: RouteConfig[ParamList, Any, State, ScreenOptions, EventMap] => Null): Self = StObject.set(x, "Screen", js.Any.fromFunction1(value))
    }
  }
}
