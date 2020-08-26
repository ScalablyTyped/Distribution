package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends WidthProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.WidthProperty<TLengthStyledSystem> */ js.Any
    ]
     with HeightProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ js.Any
    ]
     with MinWidthProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinWidthProperty<TLengthStyledSystem> */ js.Any
    ]
     with MinHeightProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MinHeightProperty<TLengthStyledSystem> */ js.Any
    ]
     with MaxWidthProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxWidthProperty<TLengthStyledSystem> */ js.Any
    ]
     with MaxHeightProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MaxHeightProperty<TLengthStyledSystem> */ js.Any
    ]
     with DisplayProps[ThemeType]
     with VerticalAlignProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.VerticalAlignProperty<TLengthStyledSystem> */ js.Any
    ]
     with SizeProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.HeightProperty<TLengthStyledSystem> */ js.Any
    ]
     with OverflowProps[ThemeType]

object LayoutProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): LayoutProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutProps[ThemeType]]
  }
}

