package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaddingYProps[TLength] extends js.Object {
  val py: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingTopProperty<TLength> */ _
    ]
  ] = js.native
}

object PaddingYProps {
  @scala.inline
  def apply[TLength](): PaddingYProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaddingYProps[TLength]]
  }
  @scala.inline
  implicit class PaddingYPropsOps[Self <: PaddingYProps[_], TLength] (val x: Self with PaddingYProps[TLength]) extends AnyVal {
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
    def setPy(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.PaddingTopProperty<TLength> */ _
        ]
    ): Self = this.set("py", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePy: Self = this.set("py", js.undefined)
  }
  
}

