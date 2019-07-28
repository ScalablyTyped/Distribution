package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.BackgroundSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundSizeProps[TLength] extends js.Object {
  /**
    * The background-size CSS property sets the size of the element's background image. The
    * image can be left to its natural size, stretched, or constrained to fit the available space.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-size)
    */
  var backgroundSize: js.UndefOr[ResponsiveValue[BackgroundSizeProperty[TLength]]] = js.undefined
}

object BackgroundSizeProps {
  @scala.inline
  def apply[TLength](backgroundSize: ResponsiveValue[BackgroundSizeProperty[TLength]] = null): BackgroundSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (backgroundSize != null) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundSizeProps[TLength]]
  }
}

