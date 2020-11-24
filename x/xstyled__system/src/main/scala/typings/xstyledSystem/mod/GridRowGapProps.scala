package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridRowGapProps[TLength] extends js.Object {
  
  val gridRowGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRowGap<TLength> */ _
    ]
  ] = js.native
}
object GridRowGapProps {
  
  @scala.inline
  def apply[TLength](): GridRowGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowGapProps[TLength]]
  }
  
  @scala.inline
  implicit class GridRowGapPropsOps[Self <: GridRowGapProps[_], TLength] (val x: Self with GridRowGapProps[TLength]) extends AnyVal {
    
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
    def setGridRowGapVarargs(value: js.Any*): Self = this.set("gridRowGap", js.Array(value :_*))
    
    @scala.inline
    def setGridRowGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridRowGap<TLength> */ _
        ]
    ): Self = this.set("gridRowGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridRowGap: Self = this.set("gridRowGap", js.undefined)
  }
}
