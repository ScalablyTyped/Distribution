package typings.atUifabricFoundation.libISlotsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Context
import typings.react.reactMod.GetDerivedStateFromError
import typings.react.reactMod.GetDerivedStateFromProps
import typings.react.reactMod.PropsWithChildren
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ValidationMap
import typings.react.reactMod.WeakValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ComponentType<TProps> & @uifabric/foundation.@uifabric/foundation/lib/ISlots.ISlotCreator<TProps, TShorthandProp> */
@js.native
trait ISlottableComponentType[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */]
  extends Instantiable1[/* props */ TProps, Component[TProps, ComponentState, js.Any]]
     with Instantiable2[/* props */ TProps, /* context */ js.Any, Component[TProps, ComponentState, js.Any]] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var create: js.UndefOr[ISlotFactory[TProps, TShorthandProp]] = js.native
  var defaultProps: js.UndefOr[Partial[TProps]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[TProps, ComponentState]] = js.native
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[TProps, ComponentState]] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[TProps]] = js.native
  def apply(props: PropsWithChildren[TProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TProps], context: js.Any): ReactElement | Null = js.native
}

