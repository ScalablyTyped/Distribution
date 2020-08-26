package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarginRightProps[TLength] extends js.Object {
  val marginRight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginRightProperty<TLength> */ _
    ]
  ] = js.native
  val mr: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginRightProperty<TLength> */ _
    ]
  ] = js.native
}

object MarginRightProps {
  @scala.inline
  def apply[TLength](): MarginRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarginRightProps[TLength]]
  }
  @scala.inline
  implicit class MarginRightPropsOps[Self <: MarginRightProps[_], TLength] (val x: Self with MarginRightProps[TLength]) extends AnyVal {
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
    def setMarginRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginRightProperty<TLength> */ _
        ]
    ): Self = this.set("marginRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginRight: Self = this.set("marginRight", js.undefined)
    @scala.inline
    def setMr(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.MarginRightProperty<TLength> */ _
        ]
    ): Self = this.set("mr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMr: Self = this.set("mr", js.undefined)
  }
  
}

