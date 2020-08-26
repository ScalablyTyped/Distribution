package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderRadiusProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-bottom-left-radius CSS property rounds the bottom-left corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-left-radius)
    */
  var borderBottomLeftRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-bottom-right-radius CSS property rounds the bottom-right corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-right-radius)
    */
  var borderBottomRightRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-radius CSS property rounds the corners of an element's outer border edge. You can set a single
    * radius to make circular corners, or two radii to make elliptical corners.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-radius)
    */
  var borderRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-top-left-radius CSS property rounds the top-left corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-left-radius)
    */
  var borderTopLeftRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
  /**
    * The border-top-right-radius CSS property rounds the top-right corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-right-radius)
    */
  var borderTopRightRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.native
}

object BorderRadiusProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](): BorderRadiusProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderRadiusProps[ThemeType, TVal]]
  }
  @scala.inline
  implicit class BorderRadiusPropsOps[Self <: BorderRadiusProps[_, _], /* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal] (val x: Self with (BorderRadiusProps[ThemeType, TVal])) extends AnyVal {
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
    def setBorderBottomLeftRadiusVarargs(value: (TVal | Null)*): Self = this.set("borderBottomLeftRadius", js.Array(value :_*))
    @scala.inline
    def setBorderBottomLeftRadius(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderBottomLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomLeftRadius: Self = this.set("borderBottomLeftRadius", js.undefined)
    @scala.inline
    def setBorderBottomLeftRadiusNull: Self = this.set("borderBottomLeftRadius", null)
    @scala.inline
    def setBorderBottomRightRadiusVarargs(value: (TVal | Null)*): Self = this.set("borderBottomRightRadius", js.Array(value :_*))
    @scala.inline
    def setBorderBottomRightRadius(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderBottomRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderBottomRightRadius: Self = this.set("borderBottomRightRadius", js.undefined)
    @scala.inline
    def setBorderBottomRightRadiusNull: Self = this.set("borderBottomRightRadius", null)
    @scala.inline
    def setBorderRadiusVarargs(value: (TVal | Null)*): Self = this.set("borderRadius", js.Array(value :_*))
    @scala.inline
    def setBorderRadius(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    @scala.inline
    def setBorderRadiusNull: Self = this.set("borderRadius", null)
    @scala.inline
    def setBorderTopLeftRadiusVarargs(value: (TVal | Null)*): Self = this.set("borderTopLeftRadius", js.Array(value :_*))
    @scala.inline
    def setBorderTopLeftRadius(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderTopLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopLeftRadius: Self = this.set("borderTopLeftRadius", js.undefined)
    @scala.inline
    def setBorderTopLeftRadiusNull: Self = this.set("borderTopLeftRadius", null)
    @scala.inline
    def setBorderTopRightRadiusVarargs(value: (TVal | Null)*): Self = this.set("borderTopRightRadius", js.Array(value :_*))
    @scala.inline
    def setBorderTopRightRadius(value: ResponsiveValue[TVal, ThemeType]): Self = this.set("borderTopRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderTopRightRadius: Self = this.set("borderTopRightRadius", js.undefined)
    @scala.inline
    def setBorderTopRightRadiusNull: Self = this.set("borderTopRightRadius", null)
  }
  
}

