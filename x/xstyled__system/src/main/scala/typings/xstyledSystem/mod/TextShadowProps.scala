package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextShadowProps extends js.Object {
  val textShadow: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TextShadowProperty */ _) | Double
    ]
  ] = js.native
}

object TextShadowProps {
  @scala.inline
  def apply(): TextShadowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowProps]
  }
  @scala.inline
  implicit class TextShadowPropsOps[Self <: TextShadowProps] (val x: Self) extends AnyVal {
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
    def setTextShadow(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TextShadowProperty */ _) | Double
        ]
    ): Self = this.set("textShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextShadow: Self = this.set("textShadow", js.undefined)
  }
  
}

