package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFamilyProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  var fontFamily: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _, 
      ThemeType
    ]
  ] = js.native
}

object FontFamilyProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): FontFamilyProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFamilyProps[ThemeType]]
  }
  @scala.inline
  implicit class FontFamilyPropsOps[Self <: FontFamilyProps[_], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType] (val x: Self with FontFamilyProps[ThemeType]) extends AnyVal {
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
    def setFontFamilyVarargs(value: (js.Any | Null)*): Self = this.set("fontFamily", js.Array(value :_*))
    @scala.inline
    def setFontFamily(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.FontFamilyProperty */ _, 
          ThemeType
        ]
    ): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontFamilyNull: Self = this.set("fontFamily", null)
  }
  
}

