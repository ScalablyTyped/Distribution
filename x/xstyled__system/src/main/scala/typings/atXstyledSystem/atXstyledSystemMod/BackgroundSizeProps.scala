package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.BackgroundSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundSizeProps[TLength] extends js.Object {
  val backgroundSize: js.UndefOr[ResponsiveValue[BackgroundSizeProperty[TLength]]] = js.undefined
}

object BackgroundSizeProps {
  @scala.inline
  def apply[TLength](backgroundSize: ResponsiveValue[BackgroundSizeProperty[TLength]] = null): BackgroundSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (backgroundSize != null) __obj.updateDynamic("backgroundSize")(backgroundSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundSizeProps[TLength]]
  }
}

