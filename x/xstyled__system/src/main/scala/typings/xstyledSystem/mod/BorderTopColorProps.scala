package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderTopColorProps extends js.Object {
  val borderTopColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderColorProperty */ _
    ]
  ] = js.native
}

object BorderTopColorProps {
  @scala.inline
  def apply(): BorderTopColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderTopColorProps]
  }
  @scala.inline
  implicit class BorderTopColorPropsOps[Self <: BorderTopColorProps] (val x: Self) extends AnyVal {
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
    def setBorderTopColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderColorProperty */ _
        ]
    ): Self = this.set("borderTopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopColor: Self = this.set("borderTopColor", js.undefined)
  }
  
}

