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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composedMod {
  
  @JSImport("@uifabric/foundation/lib/next/composed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def composed[TComponentProps /* <: ValidProps & ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    baseComponent: FunctionComponent[js.Object],
    options: IRecompositionComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) & TStatics = (^.asInstanceOf[js.Dynamic].applyDynamic("composed")(baseComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) & TStatics]
  inline def composed[TComponentProps /* <: ValidProps & ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics](
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
  ): (IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) & TStatics = ^.asInstanceOf[js.Dynamic].applyDynamic("composed")(options.asInstanceOf[js.Any]).asInstanceOf[(IFoundationComponent[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]) & TStatics]
  
  inline def resolveSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](
    slots: (IPartialSlotComponent[TComponentProps, TComponentSlots]) | (ISlotComponent[TComponentProps, TComponentSlots]),
    data: TComponentProps
  ): ISlotDefinition[Required[TComponentSlots]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSlots")(slots.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ISlotDefinition[Required[TComponentSlots]]]
  inline def resolveSlots[TComponentProps /* <: ISlottableProps[TComponentSlots] */, TComponentSlots](slots: Unit, data: TComponentProps): ISlotDefinition[Required[TComponentSlots]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSlots")(slots.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[ISlotDefinition[Required[TComponentSlots]]]
}
