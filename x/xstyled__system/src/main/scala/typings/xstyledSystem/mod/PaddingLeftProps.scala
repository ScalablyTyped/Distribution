package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingLeftProps[TLength] extends js.Object {
  val paddingLeft: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingLeftProperty<TLength> */ _
    ]
  ] = js.native
  val pl: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingLeftProperty<TLength> */ _
    ]
  ] = js.native
}

object PaddingLeftProps {
  @scala.inline
  def apply[TLength](): PaddingLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingLeftProps[TLength]]
  }
  @scala.inline
  implicit class PaddingLeftPropsOps[Self <: PaddingLeftProps[_], TLength] (val x: Self with PaddingLeftProps[TLength]) extends AnyVal {
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
    def setPaddingLeft(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingLeftProperty<TLength> */ _
        ]
    ): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPl(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingLeftProperty<TLength> */ _
        ]
    ): Self = this.set("pl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePl: Self = this.set("pl", js.undefined)
  }
  
}

