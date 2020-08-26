package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineHeightProps[TLength] extends js.Object {
  val lineHeight: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineHeightProperty<TLength> */ _
    ]
  ] = js.native
}

object LineHeightProps {
  @scala.inline
  def apply[TLength](): LineHeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineHeightProps[TLength]]
  }
  @scala.inline
  implicit class LineHeightPropsOps[Self <: LineHeightProps[_], TLength] (val x: Self with LineHeightProps[TLength]) extends AnyVal {
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
    def setLineHeight(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.LineHeightProperty<TLength> */ _
        ]
    ): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
  }
  
}

