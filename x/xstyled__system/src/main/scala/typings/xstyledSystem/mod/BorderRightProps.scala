package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderRightProps[TLength] extends js.Object {
  val borderRight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRightProperty<TLength> */ _
    ]
  ] = js.native
}

object BorderRightProps {
  @scala.inline
  def apply[TLength](): BorderRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRightProps[TLength]]
  }
  @scala.inline
  implicit class BorderRightPropsOps[Self <: BorderRightProps[_], TLength] (val x: Self with BorderRightProps[TLength]) extends AnyVal {
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
    def setBorderRight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderRightProperty<TLength> */ _
        ]
    ): Self = this.set("borderRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRight: Self = this.set("borderRight", js.undefined)
  }
  
}

