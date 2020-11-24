package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridGapProps[TLength] extends js.Object {
  
  val gridGap: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ _
    ]
  ] = js.native
}
object GridGapProps {
  
  @scala.inline
  def apply[TLength](): GridGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridGapProps[TLength]]
  }
  
  @scala.inline
  implicit class GridGapPropsOps[Self <: GridGapProps[_], TLength] (val x: Self with GridGapProps[TLength]) extends AnyVal {
    
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
    def setGridGapVarargs(value: js.Any*): Self = this.set("gridGap", js.Array(value :_*))
    
    @scala.inline
    def setGridGap(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridGap<TLength> */ _
        ]
    ): Self = this.set("gridGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridGap: Self = this.set("gridGap", js.undefined)
  }
}
