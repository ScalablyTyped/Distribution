package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The `text-shadow` CSS property adds shadows to text. It accepts a comma-separated list of shadows to be applied
    * to the text and any of its `decorations`. Each shadow is described by some combination of X and Y offsets from
    * the element, blur radius, and color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/text-shadow)
    */
  var textShadow: js.UndefOr[
    ResponsiveValue[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TextShadowProperty */ _) | Double, 
      ThemeType
    ]
  ] = js.native
}

object TextShadowProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): TextShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextShadowProps[ThemeType]]
  }
  @scala.inline
  implicit class TextShadowPropsOps[Self <: TextShadowProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with TextShadowProps[ThemeType]) extends AnyVal {
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
    def setTextShadowVarargs(value: ((js.Any | Double) | Null)*): Self = this.set("textShadow", js.Array(value :_*))
    @scala.inline
    def setTextShadow(
      value: ResponsiveValue[
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.TextShadowProperty */ _) | Double, 
          ThemeType
        ]
    ): Self = this.set("textShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextShadow: Self = this.set("textShadow", js.undefined)
    @scala.inline
    def setTextShadowNull: Self = this.set("textShadow", null)
  }
  
}

