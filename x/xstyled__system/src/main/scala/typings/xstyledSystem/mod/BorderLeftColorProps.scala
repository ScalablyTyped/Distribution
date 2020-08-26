package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderLeftColorProps extends js.Object {
  val borderLeftColor: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderColorProperty */ _
    ]
  ] = js.native
}

object BorderLeftColorProps {
  @scala.inline
  def apply(): BorderLeftColorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderLeftColorProps]
  }
  @scala.inline
  implicit class BorderLeftColorPropsOps[Self <: BorderLeftColorProps] (val x: Self) extends AnyVal {
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
    def setBorderLeftColor(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.BorderColorProperty */ _
        ]
    ): Self = this.set("borderLeftColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftColor: Self = this.set("borderLeftColor", js.undefined)
  }
  
}

