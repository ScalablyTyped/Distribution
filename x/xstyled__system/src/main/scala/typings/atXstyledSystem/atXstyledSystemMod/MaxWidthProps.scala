package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.MaxWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxWidthProps[TLength] extends js.Object {
  val maxWidth: js.UndefOr[ResponsiveValue[MaxWidthProperty[TLength]]] = js.undefined
}

object MaxWidthProps {
  @scala.inline
  def apply[TLength](maxWidth: ResponsiveValue[MaxWidthProperty[TLength]] = null): MaxWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxWidthProps[TLength]]
  }
}

