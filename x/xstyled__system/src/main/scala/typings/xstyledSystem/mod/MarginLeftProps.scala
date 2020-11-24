package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginLeftProps[TLength] extends js.Object {
  
  val marginLeft: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
    ]
  ] = js.native
  
  val ml: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
    ]
  ] = js.native
}
object MarginLeftProps {
  
  @scala.inline
  def apply[TLength](): MarginLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginLeftProps[TLength]]
  }
  
  @scala.inline
  implicit class MarginLeftPropsOps[Self <: MarginLeftProps[_], TLength] (val x: Self with MarginLeftProps[TLength]) extends AnyVal {
    
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
    def setMarginLeftVarargs(value: js.Any*): Self = this.set("marginLeft", js.Array(value :_*))
    
    @scala.inline
    def setMarginLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
        ]
    ): Self = this.set("marginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginLeft: Self = this.set("marginLeft", js.undefined)
    
    @scala.inline
    def setMlVarargs(value: js.Any*): Self = this.set("ml", js.Array(value :_*))
    
    @scala.inline
    def setMl(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
        ]
    ): Self = this.set("ml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMl: Self = this.set("ml", js.undefined)
  }
}
