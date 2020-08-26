package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderColorProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-bottom-color CSS property sets the color of an element's bottom border. It can also be set with the shorthand CSS properties border-color or border-bottom.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-color)
    */
  var borderBottomColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-color shorthand CSS property sets the color of all sides of an element's border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-color)
    */
  var borderColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-left-color CSS property sets the color of an element's left border. It can also be set with the shorthand CSS properties border-color or border-left.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-left-color)
    */
  var borderLeftColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-right-color CSS property sets the color of an element's right border. It can also be set with the shorthand CSS properties border-color or border-right.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-right-color)
    */
  var borderRightColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-top-color CSS property sets the color of an element's top border. It can also be set with the shorthand CSS properties border-color or border-top.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-color)
    */
  var borderTopColor: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BorderColorProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): BorderColorProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BorderColorPropsOps[Self <: BorderColorProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (BorderColorProps[ThemeType, TVal])) extends AnyVal {
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
    def setBorderBottomColorVarargs(value: (TVal | Null)*): Self = this.set("borderBottomColor", js.Array(value :_*))
    @scala.inline
    def setBorderBottomColor(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderBottomColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomColor: Self = this.set("borderBottomColor", js.undefined)
    @scala.inline
    def setBorderBottomColorNull: Self = this.set("borderBottomColor", null)
    @scala.inline
    def setBorderColorVarargs(value: (TVal | Null)*): Self = this.set("borderColor", js.Array(value :_*))
    @scala.inline
    def setBorderColor(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    @scala.inline
    def setBorderColorNull: Self = this.set("borderColor", null)
    @scala.inline
    def setBorderLeftColorVarargs(value: (TVal | Null)*): Self = this.set("borderLeftColor", js.Array(value :_*))
    @scala.inline
    def setBorderLeftColor(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderLeftColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderLeftColor: Self = this.set("borderLeftColor", js.undefined)
    @scala.inline
    def setBorderLeftColorNull: Self = this.set("borderLeftColor", null)
    @scala.inline
    def setBorderRightColorVarargs(value: (TVal | Null)*): Self = this.set("borderRightColor", js.Array(value :_*))
    @scala.inline
    def setBorderRightColor(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderRightColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRightColor: Self = this.set("borderRightColor", js.undefined)
    @scala.inline
    def setBorderRightColorNull: Self = this.set("borderRightColor", null)
    @scala.inline
    def setBorderTopColorVarargs(value: (TVal | Null)*): Self = this.set("borderTopColor", js.Array(value :_*))
    @scala.inline
    def setBorderTopColor(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderTopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopColor: Self = this.set("borderTopColor", js.undefined)
    @scala.inline
    def setBorderTopColorNull: Self = this.set("borderTopColor", null)
  }
  
}

