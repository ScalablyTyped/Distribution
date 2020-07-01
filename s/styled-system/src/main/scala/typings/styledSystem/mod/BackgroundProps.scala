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
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType, TVal](
    background: js.UndefOr[Null | (ResponsiveValue[TVal, ThemeType])] = js.undefined,
    backgroundImage: js.UndefOr[Null | (ResponsiveValue[BackgroundImageProperty, ThemeType])] = js.undefined,
    backgroundPosition: js.UndefOr[
      Null | (ResponsiveValue[BackgroundPositionProperty[TLengthStyledSystem], ThemeType])
    ] = js.undefined,
    backgroundRepeat: js.UndefOr[Null | (ResponsiveValue[BackgroundRepeatProperty, ThemeType])] = js.undefined,
    backgroundSize: js.UndefOr[Null | (ResponsiveValue[BackgroundSizeProperty[TLengthStyledSystem], ThemeType])] = js.undefined
  ): BackgroundProps[ThemeType, TVal] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundImage)) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundPosition)) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundRepeat)) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundSize)) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundProps[ThemeType, TVal]]
  }
}

