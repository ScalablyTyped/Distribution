package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingTopProps[TLength] extends js.Object {
  val paddingTop: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingTopProperty<TLength> */ _
    ]
  ] = js.native
  val pt: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingTopProperty<TLength> */ _
    ]
  ] = js.native
}

object PaddingTopProps {
  @scala.inline
  def apply[TLength](): PaddingTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingTopProps[TLength]]
  }
  @scala.inline
  implicit class PaddingTopPropsOps[Self <: PaddingTopProps[_], TLength] (val x: Self with PaddingTopProps[TLength]) extends AnyVal {
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
    def setPaddingTop(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingTopProperty<TLength> */ _
        ]
    ): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setPt(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingTopProperty<TLength> */ _
        ]
    ): Self = this.set("pt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePt: Self = this.set("pt", js.undefined)
  }
  
}

