package typings.uifabricReactHooks

import typings.react.mod.FormEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/react-hooks/lib/useControllableValue", JSImport.Namespace)
@js.native
object useControllableValueMod extends js.Object {
  def useControllableValue[TValue, TElement /* <: HTMLElement */](): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TCallback /* <: js.UndefOr[ChangeCallback[TElement, TValue]] */](controlledValue: TValue, defaultUncontrolledValue: TValue, onChange: TCallback): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[/* newValue */ js.UndefOr[TValue], /* ev */ js.UndefOr[FormEvent[TElement]], Unit]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TCallback /* <: js.UndefOr[ChangeCallback[TElement, TValue]] */](controlledValue: TValue, defaultUncontrolledValue: js.UndefOr[scala.Nothing], onChange: TCallback): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[/* newValue */ js.UndefOr[TValue], /* ev */ js.UndefOr[FormEvent[TElement]], Unit]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TCallback /* <: js.UndefOr[ChangeCallback[TElement, TValue]] */](controlledValue: js.UndefOr[scala.Nothing], defaultUncontrolledValue: TValue, onChange: TCallback): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[/* newValue */ js.UndefOr[TValue], /* ev */ js.UndefOr[FormEvent[TElement]], Unit]
  ] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TCallback /* <: js.UndefOr[ChangeCallback[TElement, TValue]] */](
    controlledValue: js.UndefOr[scala.Nothing],
    defaultUncontrolledValue: js.UndefOr[scala.Nothing],
    onChange: TCallback
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[/* newValue */ js.UndefOr[TValue], /* ev */ js.UndefOr[FormEvent[TElement]], Unit]
  ] = js.native
  type ChangeCallback[TElement /* <: HTMLElement */, TValue] = js.Function2[/* ev */ js.UndefOr[FormEvent[TElement]], /* newValue */ js.UndefOr[TValue], Unit]
}

