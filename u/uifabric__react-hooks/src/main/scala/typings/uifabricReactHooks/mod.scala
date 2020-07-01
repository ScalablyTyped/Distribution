package typings.uifabricReactHooks

import typings.react.mod.FormEvent
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Window
import typings.uifabricReactHooks.useBooleanMod.IUseBooleanCallbacks
import typings.uifabricReactHooks.useControllableValueMod.ChangeCallback
import typings.uifabricUtilities.mod.Async
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/react-hooks", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def useAsync(): Async = js.native
  def useBoolean(initialState: Boolean): js.Tuple2[Boolean, IUseBooleanCallbacks] = js.native
  def useConst[T](initialValue: T): T = js.native
  def useConst[T](initialValue: js.Function0[T]): T = js.native
  def useConstCallback[T /* <: js.Function1[/* repeated */ js.Any, _] */](callback: T): T = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[js.UndefOr[TValue], js.Function1[/* newValue */ js.UndefOr[TValue], Unit]] = js.native
  def useControllableValue[TValue, TElement /* <: HTMLElement */, TCallback /* <: js.UndefOr[ChangeCallback[TElement, TValue]] */](
    controlledValue: js.UndefOr[TValue],
    defaultUncontrolledValue: js.UndefOr[TValue],
    onChange: TCallback
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[/* newValue */ js.UndefOr[TValue], /* ev */ js.UndefOr[FormEvent[TElement]], Unit]
  ] = js.native
  def useForceUpdate(): js.Function0[Unit] = js.native
  def useId(): String = js.native
  def useId(prefix: String): String = js.native
  def useId(prefix: String, providedId: String): String = js.native
  def useMergedRefs[T](refs: Ref[T]*): js.Function1[/* instance */ T, Unit] = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[Null | (RefObject[js.UndefOr[TElement | Null]]) | TElement | Window],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = js.native
  def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: js.UndefOr[Null | (RefObject[js.UndefOr[TElement | Null]]) | TElement | Window],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = js.native
  def usePrevious[T](value: T): js.UndefOr[T] = js.native
}

