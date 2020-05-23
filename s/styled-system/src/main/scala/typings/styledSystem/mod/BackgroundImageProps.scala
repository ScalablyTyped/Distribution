package typings.styledSystem.mod

import typings.csstype.mod.BackgroundImageProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundImageProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The background-image CSS property sets one or more background images on an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-image)
    */
  var backgroundImage: js.UndefOr[ResponsiveValue[BackgroundImageProperty, ThemeType]] = js.undefined
}

object BackgroundImageProps {
  @scala.inline
  def apply[ThemeType](
    backgroundImage: js.UndefOr[Null | (ResponsiveValue[BackgroundImageProperty, ThemeType])] = js.undefined
  ): BackgroundImageProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundImage)) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageProps[ThemeType]]
  }
}

