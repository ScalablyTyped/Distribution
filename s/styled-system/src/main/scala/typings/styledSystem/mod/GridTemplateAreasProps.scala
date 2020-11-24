package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridTemplateAreasProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  
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
  implicit class GridTemplateAreasPropsOps[Self <: GridTemplateAreasProps[_], ThemeType /* <: Theme[TLengthStyledSystem] */] (val x: Self with GridTemplateAreasProps[ThemeType]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGridTemplateAreasVarargs(value: (js.Any | Null)*): Self = this.set("gridTemplateAreas", js.Array(value :_*))
    
    @scala.inline
    def setGridTemplateAreas(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridTemplateAreas */ _, 
          ThemeType
        ]
    ): Self = this.set("gridTemplateAreas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridTemplateAreas: Self = this.set("gridTemplateAreas", js.undefined)
    
    @scala.inline
    def setGridTemplateAreasNull: Self = this.set("gridTemplateAreas", null)
  }
}
