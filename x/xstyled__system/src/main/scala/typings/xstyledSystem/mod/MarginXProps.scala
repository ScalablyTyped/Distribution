package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarginXProps[TLength] extends js.Object {
  
  val mx: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
    ]
  ] = js.native
}
object MarginXProps {
  
  @scala.inline
  def apply[TLength](): MarginXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginXProps[TLength]]
  }
  
  @scala.inline
  implicit class MarginXPropsOps[Self <: MarginXProps[_], TLength] (val x: Self with MarginXProps[TLength]) extends AnyVal {
    
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
    def setMxVarargs(value: js.Any*): Self = this.set("mx", js.Array(value :_*))
    
    @scala.inline
    def setMx(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.MarginLeft<TLength> */ _
        ]
    ): Self = this.set("mx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMx: Self = this.set("mx", js.undefined)
  }
}
