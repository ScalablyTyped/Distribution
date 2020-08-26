package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends GridGapProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridGapProperty<TLengthStyledSystem> */ js.Any
    ]
     with GridColumnGapProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridColumnGapProperty<TLengthStyledSystem> */ js.Any
    ]
     with GridRowGapProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridRowGapProperty<TLengthStyledSystem> */ js.Any
    ]
     with GridColumnProps[ThemeType]
     with GridRowProps[ThemeType]
     with GridAutoFlowProps[ThemeType]
     with GridAutoColumnsProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridAutoColumnsProperty<TLengthStyledSystem> */ js.Any
    ]
     with GridAutoRowsProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridAutoRowsProperty<TLengthStyledSystem> */ js.Any
    ]
     with GridTemplateColumnsProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridTemplateColumnsProperty<TLengthStyledSystem> */ js.Any
    ]
     with GridTemplateRowsProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.GridTemplateRowsProperty<TLengthStyledSystem> */ js.Any
    ]
     with GridTemplateAreasProps[ThemeType]
     with GridAreaProps[ThemeType]

object GridProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): GridProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps[ThemeType]]
  }
}

