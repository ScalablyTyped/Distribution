package typings.uifabricFoundation

import typings.react.mod.FunctionComponent
import typings.uifabricFoundation.icomponentMod.IComponentOptions
import typings.uifabricFoundation.libIslotsMod.ISlottableProps
import typings.uifabricFoundation.libIslotsMod.ValidProps
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/next/ISlots", JSImport.Namespace)
@js.native
object islotsMod extends js.Object {
  @js.native
  trait IFoundationComponent[TComponentProps /* <: ValidProps with ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics]
    extends FunctionComponent[js.Object] {
    var __options: js.UndefOr[
        IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
      ] = js.native
  }
  
}

