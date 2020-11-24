package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginTopProps[TLength] extends js.Object {
  
  val marginTop: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
    ]
  ] = js.native
  
  val mt: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
    ]
  ] = js.native
}
object MarginTopProps {
  
  @scala.inline
  def apply[TLength](): MarginTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginTopProps[TLength]]
  }
  
  @scala.inline
  implicit class MarginTopPropsOps[Self <: MarginTopProps[_], TLength] (val x: Self with MarginTopProps[TLength]) extends AnyVal {
    
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
    def setMarginTopVarargs(value: js.Any*): Self = this.set("marginTop", js.Array(value :_*))
    
    @scala.inline
    def setMarginTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
        ]
    ): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    
    @scala.inline
    def setMtVarargs(value: js.Any*): Self = this.set("mt", js.Array(value :_*))
    
    @scala.inline
    def setMt(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginTop<TLength> */ _
        ]
    ): Self = this.set("mt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMt: Self = this.set("mt", js.undefined)
  }
}
