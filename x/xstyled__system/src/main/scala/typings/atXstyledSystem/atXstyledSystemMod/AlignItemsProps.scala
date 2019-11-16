package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.AlignItemsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignItemsProps extends js.Object {
  val alignItems: js.UndefOr[ResponsiveValue[AlignItemsProperty]] = js.undefined
}

object AlignItemsProps {
  @scala.inline
  def apply(alignItems: ResponsiveValue[AlignItemsProperty] = null): AlignItemsProps = {
    val __obj = js.Dynamic.literal()
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsProps]
  }
}

