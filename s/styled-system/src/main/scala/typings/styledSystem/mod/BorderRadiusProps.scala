package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderRadiusProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal] extends js.Object {
  /**
    * The border-bottom-left-radius CSS property rounds the bottom-left corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-left-radius)
    */
  var borderBottomLeftRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-bottom-right-radius CSS property rounds the bottom-right corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-bottom-right-radius)
    */
  var borderBottomRightRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-radius CSS property rounds the corners of an element's outer border edge. You can set a single
    * radius to make circular corners, or two radii to make elliptical corners.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-radius)
    */
  var borderRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-top-left-radius CSS property rounds the top-left corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-left-radius)
    */
  var borderTopLeftRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
  /**
    * The border-top-right-radius CSS property rounds the top-right corner of an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top-right-radius)
    */
  var borderTopRightRadius: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BorderRadiusProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](
    borderBottomLeftRadius: ResponsiveValue[TVal, ThemeType] = null,
    borderBottomRightRadius: ResponsiveValue[TVal, ThemeType] = null,
    borderRadius: ResponsiveValue[TVal, ThemeType] = null,
    borderTopLeftRadius: ResponsiveValue[TVal, ThemeType] = null,
    borderTopRightRadius: ResponsiveValue[TVal, ThemeType] = null
  ): BorderRadiusProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (borderBottomLeftRadius != null) __obj.updateDynamic("borderBottomLeftRadius")(borderBottomLeftRadius.asInstanceOf[js.Any])
    if (borderBottomRightRadius != null) __obj.updateDynamic("borderBottomRightRadius")(borderBottomRightRadius.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderTopLeftRadius != null) __obj.updateDynamic("borderTopLeftRadius")(borderTopLeftRadius.asInstanceOf[js.Any])
    if (borderTopRightRadius != null) __obj.updateDynamic("borderTopRightRadius")(borderTopRightRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusProps[ThemeType, TVal]]
  }
}

