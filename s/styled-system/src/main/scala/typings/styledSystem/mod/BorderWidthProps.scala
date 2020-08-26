package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderWidthProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-bottom-width CSS property sets the width of the bottom border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-width)
    */
  var borderBottomWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-left-width CSS property sets the width of the left border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-width)
    */
  var borderLeftWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-right-width CSS property sets the width of the right border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-width)
    */
  var borderRightWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-top-width CSS property sets the width of the top border of an element.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-width)
    */
  var borderTopWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-width shorthand CSS property sets the width of all sides of an element's border.
    *
    * [MDN * reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-width)
    */
  var borderWidth: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BorderWidthProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): BorderWidthProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderWidthProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BorderWidthPropsOps[Self <: BorderWidthProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (BorderWidthProps[ThemeType, TVal])) extends AnyVal {
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
    def setBorderBottomWidthVarargs(value: (TVal | Null)*): Self = this.set("borderBottomWidth", js.Array(value :_*))
    @scala.inline
    def setBorderBottomWidth(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderBottomWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomWidth: Self = this.set("borderBottomWidth", js.undefined)
    @scala.inline
    def setBorderBottomWidthNull: Self = this.set("borderBottomWidth", null)
    @scala.inline
    def setBorderLeftWidthVarargs(value: (TVal | Null)*): Self = this.set("borderLeftWidth", js.Array(value :_*))
    @scala.inline
    def setBorderLeftWidth(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderLeftWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftWidth: Self = this.set("borderLeftWidth", js.undefined)
    @scala.inline
    def setBorderLeftWidthNull: Self = this.set("borderLeftWidth", null)
    @scala.inline
    def setBorderRightWidthVarargs(value: (TVal | Null)*): Self = this.set("borderRightWidth", js.Array(value :_*))
    @scala.inline
    def setBorderRightWidth(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderRightWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightWidth: Self = this.set("borderRightWidth", js.undefined)
    @scala.inline
    def setBorderRightWidthNull: Self = this.set("borderRightWidth", null)
    @scala.inline
    def setBorderTopWidthVarargs(value: (TVal | Null)*): Self = this.set("borderTopWidth", js.Array(value :_*))
    @scala.inline
    def setBorderTopWidth(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderTopWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopWidth: Self = this.set("borderTopWidth", js.undefined)
    @scala.inline
    def setBorderTopWidthNull: Self = this.set("borderTopWidth", null)
    @scala.inline
    def setBorderWidthVarargs(value: (TVal | Null)*): Self = this.set("borderWidth", js.Array(value :_*))
    @scala.inline
    def setBorderWidth(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    @scala.inline
    def setBorderWidthNull: Self = this.set("borderWidth", null)
  }
  
}

