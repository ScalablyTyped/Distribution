package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.BorderTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderTopProps[TLength] extends js.Object {
  val borderTop: js.UndefOr[ResponsiveValue[BorderTopProperty[TLength]]] = js.undefined
}

object BorderTopProps {
  @scala.inline
  def apply[TLength](borderTop: ResponsiveValue[BorderTopProperty[TLength]] = null): BorderTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopProps[TLength]]
  }
}

