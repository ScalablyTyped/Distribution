package typings.styledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridTemplateAreasProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends StObject {
  
  /**
    * The grid-template-areas CSS property specifies named grid areas.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas)
    */
  var gridTemplateAreas: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _, 
      ThemeType
    ]
  ] = js.native
}
object GridTemplateAreasProps {
  
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](): GridTemplateAreasProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridTemplateAreasProps[ThemeType]]
  }
  
  @scala.inline
  implicit class GridTemplateAreasPropsMutableBuilder[Self <: GridTemplateAreasProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with GridTemplateAreasProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def setGridTemplateAreas(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _, 
          ThemeType
        ]
    ): Self = StObject.set(x, "gridTemplateAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridTemplateAreasNull: Self = StObject.set(x, "gridTemplateAreas", null)
    
    @scala.inline
    def setGridTemplateAreasUndefined: Self = StObject.set(x, "gridTemplateAreas", js.undefined)
    
    @scala.inline
    def setGridTemplateAreasVarargs(value: (js.Any | Null)*): Self = StObject.set(x, "gridTemplateAreas", js.Array(value :_*))
  }
}
