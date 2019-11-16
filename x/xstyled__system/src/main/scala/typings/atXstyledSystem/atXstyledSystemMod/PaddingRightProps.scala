package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.PaddingRightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingRightProps[TLength] extends js.Object {
  val paddingRight: js.UndefOr[ResponsiveValue[PaddingRightProperty[TLength]]] = js.undefined
  val pr: js.UndefOr[ResponsiveValue[PaddingRightProperty[TLength]]] = js.undefined
}

object PaddingRightProps {
  @scala.inline
  def apply[TLength](
    paddingRight: ResponsiveValue[PaddingRightProperty[TLength]] = null,
    pr: ResponsiveValue[PaddingRightProperty[TLength]] = null
  ): PaddingRightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingRightProps[TLength]]
  }
}

