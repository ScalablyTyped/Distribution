package typings.uifabricReactHooks

import typings.react.mod.FormEvent
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.react.mod.SetStateAction
import typings.react.mod.SyntheticEvent
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.Window
import typings.uifabricReactHooks.libUseBooleanMod.IUseBooleanCallbacks
import typings.uifabricReactHooks.libUseControllableValueMod.ChangeCallback
import typings.uifabricReactHooks.libUseMergedRefsMod.RefObjectFunction
import typings.uifabricReactHooks.libUseRefEffectMod.RefCallback
import typings.uifabricReactHooks.libUseSetIntervalMod.UseSetIntervalReturnType
import typings.uifabricReactHooks.libUseSetTimeoutMod.UseSetTimeoutReturnType
import typings.uifabricReactHooks.libUseTargetMod.Target
import typings.uifabricReactHooks.libUseWarningsMod.IWarningOptions
import typings.uifabricUtilities.libPointMod.Point
import typings.uifabricUtilities.mod.Async
import typings.uifabricUtilities.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@uifabric/react-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAsync(): Async = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")().asInstanceOf[Async]
  
  inline def useBoolean(initialState: Boolean): js.Tuple2[Boolean, IUseBooleanCallbacks] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBoolean")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, IUseBooleanCallbacks]]
  
  inline def useConst[T](initialValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConst")(initialValue.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useConst[T](initialValue: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConst")(initialValue.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useConstCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConstCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")().asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: Unit, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
    controlledValue: TValue,
    defaultUncontrolledValue: TValue,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
    controlledValue: TValue,
    defaultUncontrolledValue: Unit,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
    controlledValue: Unit,
    defaultUncontrolledValue: TValue,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
    controlledValue: Unit,
    defaultUncontrolledValue: Unit,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ]]
  
  inline def useControllableValue_TValueTElementTEvent[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")().asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ]]
  inline def useControllableValue_TValueTElementTEvent[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ]]
  inline def useControllableValue_TValueTElementTEvent[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ]]
  inline def useControllableValue_TValueTElementTEvent[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: Unit, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ]]
  
  inline def useEventCallback[Args /* <: js.Array[Any] */, Return](fn: js.Function1[/* args */ Args, Return]): js.Function1[/* args */ Args, Return] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Return]]
  
  inline def useForceUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Function0[Unit]]
  
  inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
  inline def useId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useId(prefix: String, providedId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any], providedId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useId(prefix: Unit, providedId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any], providedId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useMergedRefs[T](refs: js.UndefOr[Ref[T]]*): RefObjectFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RefObjectFunction[T]]
  
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: TElement, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: TElement,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Null, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Null,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Unit, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Unit,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: RefObject[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: RefObject[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Document, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Document,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Window, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Window,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def usePrevious[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  inline def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit], initial: T): RefCallback[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefEffect")(callback.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[RefCallback[T]]
  
  inline def useSetInterval(): UseSetIntervalReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetInterval")().asInstanceOf[UseSetIntervalReturnType]
  
  inline def useSetTimeout(): UseSetTimeoutReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetTimeout")().asInstanceOf[UseSetTimeoutReturnType]
  
  inline def useTarget[TElement /* <: HTMLElement */](): js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")().asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Unit, hostElement: RefObject[TElement | Null]): js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Target): js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Target, hostElement: RefObject[TElement | Null]): js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  
  inline def useWarnings[P](options: IWarningOptions[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWarnings")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
