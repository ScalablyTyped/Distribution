package typings.uifabricFoundation

import typings.react.mod.FunctionComponent
import typings.uifabricFoundation.libIslotsMod.ISlottableProps
import typings.uifabricFoundation.libIslotsMod.ValidProps
import typings.uifabricFoundation.libNextIcomponentMod.IComponentOptions
import typings.uifabricMergeStyles.libIstylesetMod.IStyleSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNextIslotsMod {
  
  @js.native
  trait IFoundationComponent[TComponentProps /* <: ValidProps & ISlottableProps[TComponentSlots] */, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */, TViewProps /* <: TComponentProps */, TComponentSlots, TStatics]
    extends StObject
       with FunctionComponent[js.Object] {
    
    var __options: js.UndefOr[
        IComponentOptions[TComponentProps, TTokens, TStyleSet, TViewProps, TComponentSlots, TStatics]
      ] = js.native
  }
}
