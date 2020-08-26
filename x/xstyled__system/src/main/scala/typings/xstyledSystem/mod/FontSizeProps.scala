package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontSizeProps[TLength] extends js.Object {
  val fontSize: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontSizeProperty<TLength> */ _
    ]
  ] = js.native
}

object FontSizeProps {
  @scala.inline
  def apply[TLength](): FontSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontSizeProps[TLength]]
  }
  @scala.inline
  implicit class FontSizePropsOps[Self <: FontSizeProps[_], TLength] (val x: Self with FontSizeProps[TLength]) extends AnyVal {
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
    def setFontSize(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontSizeProperty<TLength> */ _
        ]
    ): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
  }
  
}

