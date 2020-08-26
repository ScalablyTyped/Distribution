package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTransformProps extends js.Object {
  val textTransform: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TextTransformProperty */ _
    ]
  ] = js.native
}

object TextTransformProps {
  @scala.inline
  def apply(): TextTransformProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextTransformProps]
  }
  @scala.inline
  implicit class TextTransformPropsOps[Self <: TextTransformProps] (val x: Self) extends AnyVal {
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
    def setTextTransform(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TextTransformProperty */ _
        ]
    ): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
  }
  
}

