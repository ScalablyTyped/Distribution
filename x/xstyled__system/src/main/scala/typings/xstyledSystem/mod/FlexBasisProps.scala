package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlexBasisProps[TLength] extends js.Object {
  val flexBasis: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexBasisProperty<TLength> */ _
    ]
  ] = js.native
}

object FlexBasisProps {
  @scala.inline
  def apply[TLength](): FlexBasisProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexBasisProps[TLength]]
  }
  @scala.inline
  implicit class FlexBasisPropsOps[Self <: FlexBasisProps[_], TLength] (val x: Self with FlexBasisProps[TLength]) extends AnyVal {
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
    def setFlexBasis(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FlexBasisProperty<TLength> */ _
        ]
    ): Self = this.set("flexBasis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlexBasis: Self = this.set("flexBasis", js.undefined)
  }
  
}

