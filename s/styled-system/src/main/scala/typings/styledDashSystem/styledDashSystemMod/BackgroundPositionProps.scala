package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.BackgroundPositionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundPositionProps[TLength] extends js.Object {
  /**
    * The background-position CSS property sets the initial position for each background image. The
    * position is relative to the position layer set by background-origin.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-position)
    */
  var backgroundPosition: js.UndefOr[ResponsiveValue[BackgroundPositionProperty[TLength]]] = js.undefined
}

object BackgroundPositionProps {
  @scala.inline
  def apply[TLength](backgroundPosition: ResponsiveValue[BackgroundPositionProperty[TLength]] = null): BackgroundPositionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPositionProps[TLength]]
  }
}

