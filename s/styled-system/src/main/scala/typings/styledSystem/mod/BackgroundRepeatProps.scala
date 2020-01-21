package typings.styledSystem.mod

import typings.csstype.mod.BackgroundRepeatProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundRepeatProps extends js.Object {
  /**
    * The background-repeat CSS property sets how background images are repeated. A background
    * image can be repeated along the horizontal and vertical axes, or not repeated at all.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-repeat)
    */
  var backgroundRepeat: js.UndefOr[ResponsiveValue[BackgroundRepeatProperty]] = js.undefined
}

object BackgroundRepeatProps {
  @scala.inline
  def apply(backgroundRepeat: ResponsiveValue[BackgroundRepeatProperty] = null): BackgroundRepeatProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundRepeat != null) __obj.updateDynamic("backgroundRepeat")(backgroundRepeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundRepeatProps]
  }
}

