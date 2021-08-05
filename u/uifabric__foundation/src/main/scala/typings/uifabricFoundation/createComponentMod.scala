package typings.uifabricFoundation

import typings.react.mod.FunctionComponent
import typings.uifabricFoundation.libIcomponentMod.IComponentOptions
import typings.uifabricFoundation.libIcomponentMod.IViewComponent
import typings.uifabricFoundation.libIslotsMod.ValidProps
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createComponentMod {
  
  @JSImport("@uifabric/foundation/lib/createComponent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](view: IViewComponent[TViewProps]): FunctionComponent[TComponentProps] & TStatics = ^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(view.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[TComponentProps] & TStatics]
  inline def createComponent[TComponentProps /* <: ValidProps */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TStatics](
    view: IViewComponent[TViewProps],
    options: IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TStatics]
  ): FunctionComponent[TComponentProps] & TStatics = (^.asInstanceOf[js.Dynamic].applyDynamic("createComponent")(view.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionComponent[TComponentProps] & TStatics]
}
