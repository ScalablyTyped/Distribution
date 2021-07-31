package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexboxProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends StObject
     with AlignItemsProps[ThemeType]
     with AlignContentProps[ThemeType]
     with JustifyItemsProps[ThemeType]
     with JustifyContentProps[ThemeType]
     with FlexWrapProps[ThemeType]
     with FlexDirectionProps[ThemeType]
     with FlexProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Flex<TLengthStyledSystem> */ js.Any
    ]
     with FlexGrowProps[ThemeType]
     with FlexShrinkProps[ThemeType]
     with FlexBasisProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.FlexBasis<TLengthStyledSystem> */ js.Any
    ]
     with JustifySelfProps[ThemeType]
     with AlignSelfProps[ThemeType]
     with OrderProps[ThemeType]
object FlexboxProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): FlexboxProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexboxProps[ThemeType]]
  }
}
