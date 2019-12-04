package typings.atUifabricFoundation

import typings.atUifabricFoundation.libISlotsMod.ISlottableProps
import typings.atUifabricFoundation.libISlotsMod.ValidProps
import typings.atUifabricFoundation.libNextIComponentMod.IComponentOptions
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typings.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/next/ISlots", JSImport.Namespace)
@js.native
object libNextISlotsMod extends js.Object {
  @js.native
  trait IFoundationComponent[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics]
    extends FunctionComponent[js.Object] {
    var __options: js.UndefOr[
        IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
      ] = js.native
  }
  
}

