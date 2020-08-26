package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexProps[TLength] extends js.Object {
  val flex: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexProperty<TLength> */ _
    ]
  ] = js.native
}

object FlexProps {
  @scala.inline
  def apply[TLength](): FlexProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexProps[TLength]]
  }
  @scala.inline
  implicit class FlexPropsOps[Self <: FlexProps[_], TLength] (val x: Self with FlexProps[TLength]) extends AnyVal {
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
    def setFlex(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexProperty<TLength> */ _
        ]
    ): Self = this.set("flex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlex: Self = this.set("flex", js.undefined)
  }
  
}

