package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.JustifyItemsProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JustifyItemsProps extends js.Object {
  val justifyItems: js.UndefOr[ResponsiveValue[JustifyItemsProperty]] = js.undefined
}

object JustifyItemsProps {
  @scala.inline
  def apply(justifyItems: ResponsiveValue[JustifyItemsProperty] = null): JustifyItemsProps = {
    val __obj = js.Dynamic.literal()
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifyItemsProps]
  }
}

