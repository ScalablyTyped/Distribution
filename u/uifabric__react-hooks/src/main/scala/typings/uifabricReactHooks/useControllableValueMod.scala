package typings.uifabricReactHooks

import typings.react.mod.FormEvent
import typings.react.mod.SetStateAction
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useControllableValueMod {
  
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
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
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
    controlledValue: TValue,
    defaultUncontrolledValue: js.UndefOr[scala.Nothing],
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
    controlledValue: js.UndefOr[scala.Nothing],
    defaultUncontrolledValue: TValue,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](
    controlledValue: js.UndefOr[scala.Nothing],
    defaultUncontrolledValue: js.UndefOr[scala.Nothing],
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = js.native
  
  type ChangeCallback[TElement /* <: HTMLElement */, TValue, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */] = js.Function2[/* ev */ TEvent, /* newValue */ js.UndefOr[TValue], Unit]
  
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = js.native
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", "useControllableValue")
  @js.native
  def `useControllableValue_TValueTElement_HTMLElementTEvent_UnionSyntheticEventTElementEvent<undefined>`[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[SyntheticEvent[TElement, Event]] */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[FormEvent[TElement]], 
      Unit
    ]
  ] = js.native
}
