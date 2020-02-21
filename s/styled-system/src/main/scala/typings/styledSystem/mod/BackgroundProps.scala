package typings.styledSystem.mod

import typings.csstype.mod.BackgroundImageProperty
import typings.csstype.mod.BackgroundPositionProperty
import typings.csstype.mod.BackgroundRepeatProperty
import typings.csstype.mod.BackgroundSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundProps[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal]
  extends BackgroundImageProps[ThemeType]
     with BackgroundSizeProps[ThemeType, BackgroundSizeProperty[TLengthStyledSystem]]
     with BackgroundPositionProps[ThemeType, BackgroundPositionProperty[TLengthStyledSystem]]
     with BackgroundRepeatProps[ThemeType] {
  /**
    * The background shorthand CSS property sets all background style properties at once,
    * such as color, image, origin and size, repeat method, and others.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background)
    */
  var background: js.UndefOr[ResponsiveValue[TVal, ThemeType]] = js.undefined
}

object BackgroundProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */, TVal](
    background: ResponsiveValue[TVal, ThemeType] = null,
    backgroundImage: ResponsiveValue[BackgroundImageProperty, ThemeType] = null,
    backgroundPosition: ResponsiveValue[BackgroundPositionProperty[TLengthStyledSystem], ThemeType] = null,
    backgroundRepeat: ResponsiveValue[BackgroundRepeatProperty, ThemeType] = null,
    backgroundSize: ResponsiveValue[BackgroundSizeProperty[TLengthStyledSystem], ThemeType] = null
  ): BackgroundProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    if (backgroundSize != null) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundProps[ThemeType, TVal]]
  }
}

