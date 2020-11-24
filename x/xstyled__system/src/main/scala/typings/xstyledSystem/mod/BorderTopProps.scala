package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderTopProps[TLength] extends js.Object {
  
  val borderTop: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLength> */ _
    ]
  ] = js.native
}
object BorderTopProps {
  
  @scala.inline
  def apply[TLength](): BorderTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopProps[TLength]]
  }
  
  @scala.inline
  implicit class BorderTopPropsOps[Self <: BorderTopProps[_], TLength] (val x: Self with BorderTopProps[TLength]) extends AnyVal {
    
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
    def setBorderTopVarargs(value: js.Any*): Self = this.set("borderTop", js.Array(value :_*))
    
    @scala.inline
    def setBorderTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.BorderTop<TLength> */ _
        ]
    ): Self = this.set("borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderTop: Self = this.set("borderTop", js.undefined)
  }
}
