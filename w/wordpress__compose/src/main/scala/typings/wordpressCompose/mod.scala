package typings.wordpressCompose

import typings.mousetrap.mod.ExtendedKeyboardEvent
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.DependencyList
import typings.react.mod.EffectCallback
import typings.react.mod.FocusEvent
import typings.react.mod.FunctionComponent
import typings.react.mod.Provider
import typings.react.mod.Ref
import typings.react.mod.RefCallback
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLIFrameElement
import typings.std.Node
import typings.std.NodeListOf
import typings.wordpressCompose.anon.Call
import typings.wordpressCompose.anon.ContextType
import typings.wordpressCompose.anon.EndDrag
import typings.wordpressCompose.anon.Height
import typings.wordpressCompose.anon.Instantiable
import typings.wordpressCompose.anon.IsDisabled
import typings.wordpressCompose.anon.OnDragEnd
import typings.wordpressCompose.anon.OnDragEnter
import typings.wordpressCompose.anon.PartialDebounceOptions
import typings.wordpressCompose.anon.RecordkeyofGlobalEventHan
import typings.wordpressCompose.buildTypesHigherOrderWithInstanceIdMod.InstanceIdProps
import typings.wordpressCompose.buildTypesHigherOrderWithSafeTimeoutMod.TimeoutProps
import typings.wordpressCompose.buildTypesHooksUseAsyncListMod.AsyncListConfig
import typings.wordpressCompose.buildTypesHooksUseDialogMod.DialogOptions
import typings.wordpressCompose.buildTypesHooksUseDialogMod.useDialogReturn
import typings.wordpressCompose.buildTypesHooksUseFixedWindowListMod.WPFixedWindowList
import typings.wordpressCompose.buildTypesHooksUseFixedWindowListMod.WPFixedWindowListOptions
import typings.wordpressCompose.buildTypesHooksUseFocusOutsideMod.UseFocusOutsideReturn
import typings.wordpressCompose.buildTypesHooksUseKeyboardShortcutMod.WPKeyboardShortcutConfig
import typings.wordpressCompose.buildTypesHooksUseMergeRefsMod.TypeFromRef
import typings.wordpressCompose.buildTypesHooksUseViewportMatchMod.WPBreakpoint
import typings.wordpressCompose.buildTypesHooksUseViewportMatchMod.WPViewportOperator
import typings.wordpressCompose.buildTypesUtilsCreateHigherOrderComponentMod.WithoutInjectedProps
import typings.wordpressCompose.buildTypesUtilsDebounceMod.DebounceOptions
import typings.wordpressCompose.buildTypesUtilsDebounceMod.DebouncedFunc
import typings.wordpressCompose.buildTypesUtilsThrottleMod.ThrottleOptions
import typings.wordpressCompose.wordpressComposeStrings.firstElement
import typings.wordpressElement.buildTypesReactMod.WPElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/compose", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compose(funcs: js.Function*): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  inline def createHigherOrderComponent[TInner /* <: ComponentType[Any] */, TOuter /* <: ComponentType[Any] */](mapComponent: js.Function1[/* Inner */ TInner, TOuter], modifierName: String): js.Function1[/* Inner */ TInner, TOuter] = (^.asInstanceOf[js.Dynamic].applyDynamic("createHigherOrderComponent")(mapComponent.asInstanceOf[js.Any], modifierName.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* Inner */ TInner, TOuter]]
  
  inline def debounce[FunctionT /* <: js.Function1[/* repeated */ Any, Any] */](func: FunctionT, wait: Double): Call[FunctionT] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Call[FunctionT]]
  inline def debounce[FunctionT /* <: js.Function1[/* repeated */ Any, Any] */](func: FunctionT, wait: Double, options: PartialDebounceOptions): Call[FunctionT] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call[FunctionT]]
  
  /**
    * Returns a ref and props to apply to a dialog wrapper to enable the following behaviors:
    *  - constrained tabbing.
    *  - focus on mount.
    *  - return focus on unmount.
    *  - focus outside.
    *
    * @param options Dialog Options.
    */
  inline def experimentalUseDialog(options: DialogOptions): useDialogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("__experimentalUseDialog")(options.asInstanceOf[js.Any]).asInstanceOf[useDialogReturn]
  
  inline def experimentalUseDragging(param0: OnDragEnd): EndDrag = ^.asInstanceOf[js.Dynamic].applyDynamic("__experimentalUseDragging")(param0.asInstanceOf[js.Any]).asInstanceOf[EndDrag]
  
  inline def experimentalUseDropZone(param0: OnDragEnter): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("__experimentalUseDropZone")(param0.asInstanceOf[js.Any]).asInstanceOf[RefCallback[HTMLElement]]
  
  inline def experimentalUseFixedWindowList(elementRef: RefObject[HTMLElement], itemHeight: Double, totalItems: Double): js.Tuple2[WPFixedWindowList, js.Function1[/* nextWindow */ WPFixedWindowList, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("__experimentalUseFixedWindowList")(elementRef.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], totalItems.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[WPFixedWindowList, js.Function1[/* nextWindow */ WPFixedWindowList, Unit]]]
  inline def experimentalUseFixedWindowList(
    elementRef: RefObject[HTMLElement],
    itemHeight: Double,
    totalItems: Double,
    options: WPFixedWindowListOptions
  ): js.Tuple2[WPFixedWindowList, js.Function1[/* nextWindow */ WPFixedWindowList, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("__experimentalUseFixedWindowList")(elementRef.asInstanceOf[js.Any], itemHeight.asInstanceOf[js.Any], totalItems.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[WPFixedWindowList, js.Function1[/* nextWindow */ WPFixedWindowList, Unit]]]
  
  inline def experimentalUseFocusOutside(onFocusOutside: js.Function1[/* event */ FocusEvent[Element, Element], Unit]): UseFocusOutsideReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("__experimentalUseFocusOutside")(onFocusOutside.asInstanceOf[js.Any]).asInstanceOf[UseFocusOutsideReturn]
  
  /**
    * Higher-order component creator, creating a new component which renders if
    * the given condition is satisfied or with the given optional prop name.
    *
    * @example
    * ```ts
    * type Props = { foo: string };
    * const Component = ( props: Props ) => <div>{ props.foo }</div>;
    * const ConditionalComponent = ifCondition( ( props: Props ) => props.foo.length !== 0 )( Component );
    * <ConditionalComponent foo="" />; // => null
    * <ConditionalComponent foo="bar" />; // => <div>bar</div>;
    * ```
    *
    * @param predicate Function to test condition.
    *
    * @return Higher-order component.
    */
  inline def ifCondition[Props /* <: js.Object */](predicate: js.Function1[/* props */ Props, Boolean]): js.Function1[
    /* Inner */ ComponentType[Props], 
    js.Function1[/* props */ Props, typings.react.mod.global.JSX.Element | Null]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifCondition")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* Inner */ ComponentType[Props], 
    js.Function1[/* props */ Props, typings.react.mod.global.JSX.Element | Null]
  ]]
  
  /**
    * Composes multiple higher-order components into a single higher-order component. Performs left-to-right function
    * composition, where each successive invocation is supplied the return value of the previous.
    *
    * This is inspired by `lodash`'s `flow` function.
    *
    * @see https://docs-lodash.com/v4/flow/
    */
  inline def pipe(funcs: js.Function*): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pipe")(funcs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  
  /**
    * Given a component returns the enhanced component augmented with a component
    * only re-rendering when its props/state change
    */
  inline def pure[Props /* <: js.Object */](Inner: ComponentType[Props]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("pure")(Inner.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
  
  inline def throttle[FunctionT /* <: js.Function1[/* repeated */ Any, Any] */](func: FunctionT, wait: Double): Call[FunctionT] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[Call[FunctionT]]
  inline def throttle[FunctionT /* <: js.Function1[/* repeated */ Any, Any] */](func: FunctionT, wait: Double, options: ThrottleOptions): Call[FunctionT] = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Call[FunctionT]]
  
  /**
    * React hook returns an array which items get asynchronously appended from a source array.
    * This behavior is useful if we want to render a list of items asynchronously for performance reasons.
    *
    * @param list   Source array.
    * @param config Configuration object.
    *
    * @return Async array.
    */
  inline def useAsyncList[T](list: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncList")(list.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def useAsyncList[T](list: js.Array[T], config: AsyncListConfig): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAsyncList")(list.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  /**
    * In Dialogs/modals, the tabbing must be constrained to the content of
    * the wrapper element. This hook adds the behavior to the returned ref.
    *
    * @return {import('react').RefCallback<Element>} Element Ref.
    *
    * @example
    * ```js
    * import { useConstrainedTabbing } from '@wordpress/compose';
    *
    * const ConstrainedTabbingExample = () => {
    *     const constrainedTabbingRef = useConstrainedTabbing()
    *     return (
    *         <div ref={ constrainedTabbingRef }>
    *             <Button />
    *             <Button />
    *         </div>
    *     );
    * }
    * ```
    */
  inline def useConstrainedTabbing(): RefCallback[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("useConstrainedTabbing")().asInstanceOf[RefCallback[Element]]
  
  inline def useCopyOnClick(ref: RefObject[String | Element | NodeListOf[Element]], text: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useCopyOnClick")(ref.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useCopyOnClick(ref: RefObject[String | Element | NodeListOf[Element]], text: String, timeout: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useCopyOnClick")(ref.asInstanceOf[js.Any], text.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useCopyOnClick(ref: RefObject[String | Element | NodeListOf[Element]], text: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useCopyOnClick")(ref.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def useCopyOnClick(ref: RefObject[String | Element | NodeListOf[Element]], text: js.Function, timeout: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("useCopyOnClick")(ref.asInstanceOf[js.Any], text.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def useCopyToClipboard[TElementType /* <: HTMLElement */](text: String, onSuccess: js.Function): Ref[TElementType] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCopyToClipboard")(text.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[Ref[TElementType]]
  inline def useCopyToClipboard[TElementType /* <: HTMLElement */](text: js.Function0[String], onSuccess: js.Function): Ref[TElementType] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCopyToClipboard")(text.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[Ref[TElementType]]
  
  inline def useDebounce[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc): DebouncedFunc[TFunc] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(fn.asInstanceOf[js.Any]).asInstanceOf[DebouncedFunc[TFunc]]
  inline def useDebounce[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Double): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  inline def useDebounce[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Double, options: DebounceOptions): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  inline def useDebounce[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Unit, options: DebounceOptions): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDebounce")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  
  inline def useDisabled(): js.Function1[/* instance */ Node | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisabled")().asInstanceOf[js.Function1[/* instance */ Node | Null, Unit]]
  inline def useDisabled(param0: IsDisabled): js.Function1[/* instance */ Node | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDisabled")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* instance */ Node | Null, Unit]]
  
  inline def useFocusOnMount(): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")().asInstanceOf[RefCallback[HTMLElement]]
  inline def useFocusOnMount(focusOnMount: Boolean): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(focusOnMount.asInstanceOf[js.Any]).asInstanceOf[RefCallback[HTMLElement]]
  
  inline def useFocusOnMount_firstElement(focusOnMount: firstElement): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusOnMount")(focusOnMount.asInstanceOf[js.Any]).asInstanceOf[RefCallback[HTMLElement]]
  
  /**
    * When opening modals/sidebars/dialogs, the focus
    * must move to the opened area and return to the
    * previously focused element when closed.
    * The current hook implements the returning behavior.
    *
    * @param {() => void} [onFocusReturn] Overrides the default return behavior.
    * @return {import('react').RefCallback<HTMLElement>} Element Ref.
    *
    * @example
    * ```js
    * import { useFocusReturn } from '@wordpress/compose';
    *
    * const WithFocusReturn = () => {
    *     const ref = useFocusReturn()
    *     return (
    *         <div ref={ ref }>
    *             <Button />
    *             <Button />
    *         </div>
    *     );
    * }
    * ```
    */
  inline def useFocusReturn(): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusReturn")().asInstanceOf[RefCallback[HTMLElement]]
  inline def useFocusReturn(onFocusReturn: js.Function0[Unit]): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusReturn")(onFocusReturn.asInstanceOf[js.Any]).asInstanceOf[RefCallback[HTMLElement]]
  
  inline def useFocusableIframe(): RefCallback[HTMLIFrameElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFocusableIframe")().asInstanceOf[RefCallback[HTMLIFrameElement]]
  
  inline def useInstanceId(`object`: js.Object): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceId")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useInstanceId(`object`: js.Object, prefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceId")(`object`.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useInstanceId[T /* <: String | Double */](`object`: js.Object, prefix: String, preferredId: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceId")(`object`.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any], preferredId.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useInstanceId_T_T[T /* <: String | Double */](`object`: js.Object, prefix: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useInstanceId")(`object`.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * Accepts a function that contains imperative, possibly effectful code.
    *
    * @param effect Imperative function that can return a cleanup function
    * @param deps If present, effect will only activate if the values in the list change.
    *
    * @version 16.8.0
    * @see https://react.dev/reference/react/useEffect
    */
  /* was `typeof useEffect` */
  inline def useIsomorphicLayoutEffect(effect: EffectCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /* was `typeof useEffect` */
  inline def useIsomorphicLayoutEffect(effect: EffectCallback, deps: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsomorphicLayoutEffect")(effect.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useKeyboardShortcut(shortcuts: String, callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardShortcut")(shortcuts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useKeyboardShortcut(
    shortcuts: String,
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Unit],
    param2: WPKeyboardShortcutConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardShortcut")(shortcuts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * A block selection object.
    *
    * @typedef {Object} WPKeyboardShortcutConfig
    *
    * @property {boolean}                                [bindGlobal] Handle keyboard events anywhere including inside textarea/input fields.
    * @property {string}                                 [eventName]  Event name used to trigger the handler, defaults to keydown.
    * @property {boolean}                                [isDisabled] Disables the keyboard handler if the value is true.
    * @property {import('react').RefObject<HTMLElement>} [target]     React reference to the DOM element used to catch the keyboard event.
    */
  /**
    * Attach a keyboard shortcut handler.
    *
    * @see https://craig.is/killing/mice#api.bind for information about the `callback` parameter.
    *
    * @param {string[]|string}                                                       shortcuts Keyboard Shortcuts.
    * @param {(e: import('mousetrap').ExtendedKeyboardEvent, combo: string) => void} callback  Shortcut callback.
    * @param {WPKeyboardShortcutConfig}                                              options   Shortcut options.
    */
  inline def useKeyboardShortcut(
    shortcuts: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardShortcut")(shortcuts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useKeyboardShortcut(
    shortcuts: js.Array[String],
    callback: js.Function2[/* e */ ExtendedKeyboardEvent, /* combo */ String, Unit],
    param2: WPKeyboardShortcutConfig
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeyboardShortcut")(shortcuts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useMediaQuery(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")().asInstanceOf[Boolean]
  inline def useMediaQuery(query: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useMediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useMergeRefs[TRef /* <: Ref[Any] */](refs: js.Array[TRef]): js.Function1[/* instance */ TypeFromRef[TRef] | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergeRefs")(refs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* instance */ TypeFromRef[TRef] | Null, Unit]]
  
  inline def usePrevious[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  /**
    * Hook returning whether the user has a preference for reduced motion.
    *
    * @return {boolean} Reduced motion preference value.
    */
  inline def useReducedMotion(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useReducedMotion")().asInstanceOf[Boolean]
  
  inline def useRefEffect[TElement](
    callback: js.Function1[/* node */ TElement, js.Function0[Unit] | Unit],
    dependencies: DependencyList
  ): RefCallback[TElement | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefEffect")(callback.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[RefCallback[TElement | Null]]
  
  inline def useResizeObserver(): js.Tuple2[WPElement, Height] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizeObserver")().asInstanceOf[js.Tuple2[WPElement, Height]]
  
  inline def useThrottle[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc): DebouncedFunc[TFunc] = ^.asInstanceOf[js.Dynamic].applyDynamic("useThrottle")(fn.asInstanceOf[js.Any]).asInstanceOf[DebouncedFunc[TFunc]]
  inline def useThrottle[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Double): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottle")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  inline def useThrottle[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Double, options: ThrottleOptions): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottle")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  inline def useThrottle[TFunc /* <: js.Function1[/* repeated */ Any, Unit] */](fn: TFunc, wait: Unit, options: ThrottleOptions): DebouncedFunc[TFunc] = (^.asInstanceOf[js.Dynamic].applyDynamic("useThrottle")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DebouncedFunc[TFunc]]
  
  object useViewportMatch {
    
    /**
      * Returns true if the viewport matches the given query, or false otherwise.
      *
      * @param {WPBreakpoint}       breakpoint      Breakpoint size name.
      * @param {WPViewportOperator} [operator=">="] Viewport operator.
      *
      * @example
      *
      * ```js
      * useViewportMatch( 'huge', '<' );
      * useViewportMatch( 'medium' );
      * ```
      *
      * @return {boolean} Whether viewport matches query.
      */
    inline def apply(breakpoint: WPBreakpoint): Boolean = ^.asInstanceOf[js.Dynamic].apply(breakpoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def apply(breakpoint: WPBreakpoint, operator: WPViewportOperator): Boolean = (^.asInstanceOf[js.Dynamic].apply(breakpoint.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("@wordpress/compose", "useViewportMatch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/compose", "useViewportMatch.__experimentalWidthProvider")
    @js.native
    val experimentalWidthProvider: Provider[Double | Null] = js.native
  }
  
  /**
    * Hook that performs a shallow comparison between the preview value of an object
    * and the new one, if there's a difference, it prints it to the console.
    * this is useful in performance related work, to check why a component re-renders.
    *
    *  @example
    *
    * ```jsx
    * function MyComponent(props) {
    *    useWarnOnChange(props);
    *
    *    return "Something";
    * }
    * ```
    *
    * @param {object} object Object which changes to compare.
    * @param {string} prefix Just a prefix to show when console logging.
    */
  inline def useWarnOnChange(`object`: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWarnOnChange")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useWarnOnChange(`object`: js.Object, prefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useWarnOnChange")(`object`.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def withGlobalEvents(eventTypesToHandlers: RecordkeyofGlobalEventHan): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withGlobalEvents")(eventTypesToHandlers.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * A Higher Order Component used to be provide a unique instance ID by
    * component.
    */
  inline def withInstanceId(
    Inner: ComponentClass[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps, ComponentState]
  ): js.Function1[
    /* props */ WithoutInjectedProps[
      ComponentClass[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps, ComponentState], 
      InstanceIdProps
    ], 
    typings.react.mod.global.JSX.Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withInstanceId")(Inner.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* props */ WithoutInjectedProps[
      ComponentClass[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps, ComponentState], 
      InstanceIdProps
    ], 
    typings.react.mod.global.JSX.Element
  ]]
  inline def withInstanceId(Inner: FunctionComponent[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps]): js.Function1[
    /* props */ WithoutInjectedProps[
      FunctionComponent[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps], 
      InstanceIdProps
    ], 
    typings.react.mod.global.JSX.Element
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withInstanceId")(Inner.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* props */ WithoutInjectedProps[
      FunctionComponent[(WithoutInjectedProps[Any, InstanceIdProps]) & InstanceIdProps], 
      InstanceIdProps
    ], 
    typings.react.mod.global.JSX.Element
  ]]
  
  /**
    * A higher-order component used to provide and manage delayed function calls
    * that ought to be bound to a component's lifecycle.
    */
  inline def withSafeTimeout(Inner: ComponentClass[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps, ComponentState]): Instantiable = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeTimeout")(Inner.asInstanceOf[js.Any]).asInstanceOf[Instantiable]
  inline def withSafeTimeout(Inner: FunctionComponent[(WithoutInjectedProps[Any, TimeoutProps]) & TimeoutProps]): ContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("withSafeTimeout")(Inner.asInstanceOf[js.Any]).asInstanceOf[ContextType]
  
  inline def withState(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withState")().asInstanceOf[Any]
  inline def withState(initialState: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("withState")(initialState.asInstanceOf[js.Any]).asInstanceOf[Any]
}
