package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends StObject
     with GridGapProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLengthStyledSystem> */ js.Any
    ]
     with GridColumnGapProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridColumnGap<TLengthStyledSystem> */ js.Any
    ]
     with GridRowGapProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRowGap<TLengthStyledSystem> */ js.Any
    ]
     with GridColumnProps[ThemeType]
     with GridRowProps[ThemeType]
     with GridAutoFlowProps[ThemeType]
     with GridAutoColumnsProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoColumns<TLengthStyledSystem> */ js.Any
    ]
     with GridAutoRowsProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoRows<TLengthStyledSystem> */ js.Any
    ]
     with GridTemplateColumnsProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateColumns<TLengthStyledSystem> */ js.Any
    ]
     with GridTemplateRowsProps[
      ThemeType, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateRows<TLengthStyledSystem> */ js.Any
    ]
     with GridTemplateAreasProps[ThemeType]
     with GridAreaProps[ThemeType]
object GridProps {
  
  inline def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps[ThemeType]]
  }
}
