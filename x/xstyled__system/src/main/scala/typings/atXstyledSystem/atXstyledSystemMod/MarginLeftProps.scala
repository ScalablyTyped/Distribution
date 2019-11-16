package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.MarginLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginLeftProps[TLength] extends js.Object {
  val marginLeft: js.UndefOr[ResponsiveValue[MarginLeftProperty[TLength]]] = js.undefined
  val ml: js.UndefOr[ResponsiveValue[MarginLeftProperty[TLength]]] = js.undefined
}

object MarginLeftProps {
  @scala.inline
  def apply[TLength](
    marginLeft: ResponsiveValue[MarginLeftProperty[TLength]] = null,
    ml: ResponsiveValue[MarginLeftProperty[TLength]] = null
  ): MarginLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginLeftProps[TLength]]
  }
}

