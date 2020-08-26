package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontStyleProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The font-style CSS property specifies whether a font should be styled with a normal, italic,
    * or oblique face from its font-family.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/font-style)
    */
  var fontStyle: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontStyleProperty */ _, 
      ThemeType
    ]
  ] = js.native
}

object FontStyleProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): FontStyleProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontStyleProps[ThemeType]]
  }
  @scala.inline
  implicit class FontStylePropsOps[Self <: FontStyleProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with FontStyleProps[ThemeType]) extends AnyVal {
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
    def setFontStyleVarargs(value: (js.Any | Null)*): Self = this.set("fontStyle", js.Array(value :_*))
    @scala.inline
    def setFontStyle(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontStyleProperty */ _, 
          ThemeType
        ]
    ): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    @scala.inline
    def setFontStyleNull: Self = this.set("fontStyle", null)
  }
  
}

