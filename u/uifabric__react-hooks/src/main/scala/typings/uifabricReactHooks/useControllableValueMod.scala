package typings.uifabricReactHooks

import typings.react.mod.FormEvent
import typings.react.mod.SetStateAction
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useControllableValueMod {
  
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](): js.Tuple2[
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
  inline def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: TValue): js.Tuple2[
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
  inline def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
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
  inline def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: Unit, defaultUncontrolledValue: TValue): js.Tuple2[
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
  
  type ChangeCallback[TElement /* <: HTMLElement */, TValue, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */] = js.Function2[/* ev */ TEvent, /* newValue */ js.UndefOr[TValue], Unit]
}
