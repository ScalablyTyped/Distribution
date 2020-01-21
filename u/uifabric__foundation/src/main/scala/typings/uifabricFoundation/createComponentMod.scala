package typings.uifabricFoundation

import typings.react.mod.FunctionComponent
import typings.uifabricFoundation.libIcomponentMod.IComponentOptions
import typings.uifabricFoundation.libIcomponentMod.IViewComponent
import typings.uifabricFoundation.libIslotsMod.ValidProps
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/foundation/lib/createComponent", JSImport.Namespace)
@js.native
object createComponentMod extends js.Object {
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): FunctionComponent[TComponentProps] with TStatics = js.native
  def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): FunctionComponent[TComponentProps] with TStatics = js.native
}

