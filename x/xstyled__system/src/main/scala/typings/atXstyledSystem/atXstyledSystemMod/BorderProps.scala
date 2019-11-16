package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.BorderProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderProps[TLength] extends js.Object {
  val border: js.UndefOr[ResponsiveValue[BorderProperty[TLength]]] = js.undefined
}

object BorderProps {
  @scala.inline
  def apply[TLength](border: ResponsiveValue[BorderProperty[TLength]] = null): BorderProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderProps[TLength]]
  }
}

