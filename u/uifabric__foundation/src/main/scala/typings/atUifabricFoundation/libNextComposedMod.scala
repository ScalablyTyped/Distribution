package typings.atUifabricFoundation

import typings.atUifabricFoundation.libISlotsMod.ISlotDefinition
import typings.atUifabricFoundation.libISlotsMod.ISlottableProps
import typings.atUifabricFoundation.libISlotsMod.ValidProps
import typings.atUifabricFoundation.libNextIComponentMod.IComponentOptions
import typings.atUifabricFoundation.libNextIComponentMod.IPartialSlotComponent
import typings.atUifabricFoundation.libNextIComponentMod.IRecompositionComponentOptions
import typings.atUifabricFoundation.libNextIComponentMod.ISlotComponent
import typings.atUifabricFoundation.libNextISlotsMod.IFoundationComponent
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typings.react.reactMod.FunctionComponent
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/next/composed", JSImport.Namespace)
@js.native
object libNextComposedMod extends js.Object {
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    baseComponent: FunctionComponent[js.Object],
    options: IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  def resolveSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](
    slots: js.UndefOr[
      (IPartialSlotComponent[TComponentProps, TComponentSlots]) | (ISlotComponent[TComponentProps, TComponentSlots])
    ],
    data: TComponentProps
  ): ISlotDefinition[Required[TComponentSlots]] = js.native
}

