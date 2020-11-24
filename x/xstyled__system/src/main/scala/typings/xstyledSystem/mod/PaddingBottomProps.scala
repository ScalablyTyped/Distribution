package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaddingBottomProps[TLength] extends js.Object {
  
  val paddingBottom: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
    ]
  ] = js.native
  
  val pb: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
    ]
  ] = js.native
}
object PaddingBottomProps {
  
  @scala.inline
  def apply[TLength](): PaddingBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingBottomProps[TLength]]
  }
  
  @scala.inline
  implicit class PaddingBottomPropsOps[Self <: PaddingBottomProps[_], TLength] (val x: Self with PaddingBottomProps[TLength]) extends AnyVal {
    
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
    def setPaddingBottomVarargs(value: js.Any*): Self = this.set("paddingBottom", js.Array(value :_*))
    
    @scala.inline
    def setPaddingBottom(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
        ]
    ): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    
    @scala.inline
    def setPbVarargs(value: js.Any*): Self = this.set("pb", js.Array(value :_*))
    
    @scala.inline
    def setPb(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.PaddingBottom<TLength> */ _
        ]
    ): Self = this.set("pb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePb: Self = this.set("pb", js.undefined)
  }
}
