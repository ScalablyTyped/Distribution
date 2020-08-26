package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingXProps[TLength] extends js.Object {
  val px: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingLeftProperty<TLength> */ _
    ]
  ] = js.native
}

object PaddingXProps {
  @scala.inline
  def apply[TLength](): PaddingXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingXProps[TLength]]
  }
  @scala.inline
  implicit class PaddingXPropsOps[Self <: PaddingXProps[_], TLength] (val x: Self with PaddingXProps[TLength]) extends AnyVal {
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
    def setPx(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingLeftProperty<TLength> */ _
        ]
    ): Self = this.set("px", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePx: Self = this.set("px", js.undefined)
  }
  
}

