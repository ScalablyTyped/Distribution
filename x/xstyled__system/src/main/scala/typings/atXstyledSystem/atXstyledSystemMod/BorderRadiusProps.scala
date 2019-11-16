package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.BorderRadiusProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderRadiusProps[TLength] extends js.Object {
  val borderRadius: js.UndefOr[ResponsiveValue[BorderRadiusProperty[TLength]]] = js.undefined
}

object BorderRadiusProps {
  @scala.inline
  def apply[TLength](borderRadius: ResponsiveValue[BorderRadiusProperty[TLength]] = null): BorderRadiusProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderRadiusProps[TLength]]
  }
}

