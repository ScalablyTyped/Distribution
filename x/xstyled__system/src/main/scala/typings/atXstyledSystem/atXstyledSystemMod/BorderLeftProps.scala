package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.BorderLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderLeftProps[TLength] extends js.Object {
  val borderLeft: js.UndefOr[ResponsiveValue[BorderLeftProperty[TLength]]] = js.undefined
}

object BorderLeftProps {
  @scala.inline
  def apply[TLength](borderLeft: ResponsiveValue[BorderLeftProperty[TLength]] = null): BorderLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderLeftProps[TLength]]
  }
}

