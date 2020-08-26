package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexboxProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends AlignItemsProps[ThemeType]
     with AlignContentProps[ThemeType]
     with JustifyItemsProps[ThemeType]
     with JustifyContentProps[ThemeType]
     with FlexWrapProps[ThemeType]
     with FlexDirectionProps[ThemeType]
     with FlexProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexProperty<TLengthStyledSystem> */ js.Any
    ]
     with FlexGrowProps[ThemeType]
     with FlexShrinkProps[ThemeType]
     with FlexBasisProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexBasisProperty<TLengthStyledSystem> */ js.Any
    ]
     with JustifySelfProps[ThemeType]
     with AlignSelfProps[ThemeType]
     with OrderProps[ThemeType]

object FlexboxProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): FlexboxProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexboxProps[ThemeType]]
  }
}

