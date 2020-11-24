package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginBottomProps[TLength] extends js.Object {
  
  val marginBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
    ]
  ] = js.native
  
  val mb: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
    ]
  ] = js.native
}
object MarginBottomProps {
  
  @scala.inline
  def apply[TLength](): MarginBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginBottomProps[TLength]]
  }
  
  @scala.inline
  implicit class MarginBottomPropsOps[Self <: MarginBottomProps[_], TLength] (val x: Self with MarginBottomProps[TLength]) extends AnyVal {
    
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
    def setMarginBottomVarargs(value: js.Any*): Self = this.set("marginBottom", js.Array(value :_*))
    
    @scala.inline
    def setMarginBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
        ]
    ): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    
    @scala.inline
    def setMbVarargs(value: js.Any*): Self = this.set("mb", js.Array(value :_*))
    
    @scala.inline
    def setMb(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginBottom<TLength> */ _
        ]
    ): Self = this.set("mb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
  }
}
