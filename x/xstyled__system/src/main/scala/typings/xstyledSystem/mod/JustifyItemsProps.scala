package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JustifyItemsProps extends js.Object {
  val justifyItems: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.JustifyItemsProperty */ _
    ]
  ] = js.native
}

object JustifyItemsProps {
  @scala.inline
  def apply(): JustifyItemsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyItemsProps]
  }
  @scala.inline
  implicit class JustifyItemsPropsOps[Self <: JustifyItemsProps] (val x: Self) extends AnyVal {
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
    def setJustifyItems(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.JustifyItemsProperty */ _
        ]
    ): Self = this.set("justifyItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJustifyItems: Self = this.set("justifyItems", js.undefined)
  }
  
}

