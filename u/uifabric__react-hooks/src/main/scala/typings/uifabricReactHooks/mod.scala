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
import typings.uifabricReactHooks.useBooleanMod.IUseBooleanCallbacks
import typings.uifabricReactHooks.useControllableValueMod.ChangeCallback
import typings.uifabricReactHooks.useMergedRefsMod.RefObjectFunction
import typings.uifabricReactHooks.useRefEffectMod.RefCallback
import typings.uifabricReactHooks.useSetIntervalMod.UseSetIntervalReturnType
import typings.uifabricReactHooks.useSetTimeoutMod.UseSetTimeoutReturnType
import typings.uifabricReactHooks.useTargetMod.Target
import typings.uifabricReactHooks.useWarningsMod.IWarningOptions
import typings.uifabricUtilities.mod.Async
import typings.uifabricUtilities.pointMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@uifabric/react-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useAsync(): Async = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")().asInstanceOf[Async]
  
  @scala.inline
  def useBoolean(initialState: Boolean): js.Tuple2[Boolean, IUseBooleanCallbacks] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBoolean")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, IUseBooleanCallbacks]]
  
  @scala.inline
  def useConst[T](initialValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConst")(initialValue.asInstanceOf[js.Any]).asInstanceOf[T]
  @scala.inline
  def useConst[T](initialValue: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConst")(initialValue.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def useConstCallback[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConstCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def useControllableValue[TValue, TElement /* <: HTMLElement */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")().asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  @scala.inline
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  @scala.inline
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  @scala.inline
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: Unit, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  @scala.inline
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
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
  @scala.inline
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
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
  @scala.inline
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
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
  @scala.inline
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
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
  
  @scala.inline
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](): js.Tuple2[
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
  @scala.inline
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: TValue): js.Tuple2[
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
  @scala.inline
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
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
  @scala.inline
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: Unit, defaultUncontrolledValue: TValue): js.Tuple2[
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
  
  @scala.inline
  def useForceUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Function0[Unit]]
  
  @scala.inline
  def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
  @scala.inline
  def useId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def useId(prefix: String, providedId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any], providedId.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def useId(prefix: Unit, providedId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any], providedId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def useMergedRefs[T](refs: js.UndefOr[Ref[T]]*): RefObjectFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedRefs")(refs.asInstanceOf[js.Any]).asInstanceOf[RefObjectFunction[T]]
  
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: TElement, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: TElement,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Null, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Null,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Unit, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Unit,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: RefObject[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: RefObject[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Document, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Document,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Window, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Window,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def usePrevious[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  @scala.inline
  def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  @scala.inline
  def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit], initial: T): RefCallback[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefEffect")(callback.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[RefCallback[T]]
  
  @scala.inline
  def useSetInterval(): UseSetIntervalReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetInterval")().asInstanceOf[UseSetIntervalReturnType]
  
  @scala.inline
  def useSetTimeout(): UseSetTimeoutReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetTimeout")().asInstanceOf[UseSetTimeoutReturnType]
  
  @scala.inline
  def useTarget[TElement /* <: HTMLElement */](): js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")().asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]]]
  @scala.inline
  def useTarget[TElement /* <: HTMLElement */](target: Unit, hostElement: RefObject[TElement | Null]): js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]]]
  @scala.inline
  def useTarget[TElement /* <: HTMLElement */](target: Target): js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]]]
  @scala.inline
  def useTarget[TElement /* <: HTMLElement */](target: Target, hostElement: RefObject[TElement | Null]): js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefObject[Element | MouseEvent | Point | Null], js.UndefOr[Window]]]
  
  @scala.inline
  def useWarnings[P](options: IWarningOptions[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWarnings")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
