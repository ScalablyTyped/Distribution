package typings.xstyledSystem.mod

import typings.csstype.mod.BackgroundPositionProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundPositionProps[TLength] extends js.Object {
  val backgroundPosition: js.UndefOr[ResponsiveValue[BackgroundPositionProperty[TLength]]] = js.undefined
}

object BackgroundPositionProps {
  @scala.inline
  def apply[TLength](backgroundPosition: ResponsiveValue[BackgroundPositionProperty[TLength]] = null): BackgroundPositionProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (backgroundPosition != null) __obj.updateDynamic("backgroundPosition")(backgroundPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPositionProps[TLength]]
  }
}

