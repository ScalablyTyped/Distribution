package typings.styledSystem.mod

import typings.csstype.mod.BackgroundRepeatProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundRepeatProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The background-repeat CSS property sets how background images are repeated. A background
    * image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat)
    */
  var backgroundRepeat: js.UndefOr[ResponsiveValue[BackgroundRepeatProperty, ThemeType]] = js.undefined
}

object BackgroundRepeatProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](backgroundRepeat: ResponsiveValue[BackgroundRepeatProperty, ThemeType] = null): BackgroundRepeatProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundRepeatProps[ThemeType]]
  }
}

