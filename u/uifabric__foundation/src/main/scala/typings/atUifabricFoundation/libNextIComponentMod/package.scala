package typings.atUifabricFoundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libNextIComponentMod {
  import typings.atUifabricFoundation.libISlotsMod.ISlotDefinition
  import typings.atUifabricFoundation.libISlotsMod.ISlots
  import typings.atUifabricFoundation.libISlotsMod.ISlottableProps
  import typings.react.reactMod.FunctionComponent
  import typings.react.reactMod.PropsWithChildren
  import typings.std.Required
  import typings.std.ReturnType

  type IPartialSlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] = ISlotDefinition[TComponentSlots] | (js.Function1[/* props */ TComponentProps, ISlotDefinition[TComponentSlots]])
  type ISlotComponent[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots] = ISlotDefinition[Required[TComponentSlots]] | (js.Function1[/* props */ TComponentProps, ISlotDefinition[Required[TComponentSlots]]])
  type IViewComponent[TViewProps, TComponentSlots] = js.Function2[
    /* props */ PropsWithChildren[TViewProps], 
    /* slots */ ISlots[Required[TComponentSlots]], 
    ReturnType[FunctionComponent[js.Object]]
  ]
}
