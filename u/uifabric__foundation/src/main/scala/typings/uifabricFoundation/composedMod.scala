package typings.uifabricFoundation

import typings.react.mod.FunctionComponent
import typings.std.Required
import typings.uifabricFoundation.icomponentMod.IComponentOptions
import typings.uifabricFoundation.icomponentMod.IPartialSlotComponent
import typings.uifabricFoundation.icomponentMod.IRecompositionComponentOptions
import typings.uifabricFoundation.icomponentMod.ISlotComponent
import typings.uifabricFoundation.islotsMod.IFoundationComponent
import typings.uifabricFoundation.libIslotsMod.ISlotDefinition
import typings.uifabricFoundation.libIslotsMod.ISlottableProps
import typings.uifabricFoundation.libIslotsMod.ValidProps
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composedMod {
  
  @JSImport("@uifabric/foundation/lib/next/composed", "composed")
  @js.native
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    baseComponent: FunctionComponent[js.Object],
    options: IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  @JSImport("@uifabric/foundation/lib/next/composed", "composed")
  @js.native
  def composed[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) with TStatics = js.native
  
  @JSImport("@uifabric/foundation/lib/next/composed", "resolveSlots")
  @js.native
  def resolveSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](
    slots: js.UndefOr[
      (IPartialSlotComponent[TComponentProps, TComponentSlots]) | (ISlotComponent[TComponentProps, TComponentSlots])
    ],
    data: TComponentProps
  ): ISlotDefinition[Required[TComponentSlots]] = js.native
}
