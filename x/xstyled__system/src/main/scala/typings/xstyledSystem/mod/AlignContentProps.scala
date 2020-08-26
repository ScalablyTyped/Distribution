package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignContentProps extends js.Object {
  val alignContent: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.AlignContentProperty */ _
    ]
  ] = js.native
}

object AlignContentProps {
  @scala.inline
  def apply(): AlignContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignContentProps]
  }
  @scala.inline
  implicit class AlignContentPropsOps[Self <: AlignContentProps] (val x: Self) extends AnyVal {
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
    def setAlignContent(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.AlignContentProperty */ _
        ]
    ): Self = this.set("alignContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignContent: Self = this.set("alignContent", js.undefined)
  }
  
}

