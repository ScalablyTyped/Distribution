package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.FontWeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontWeightProps extends js.Object {
  val fontWeight: js.UndefOr[ResponsiveValue[FontWeightProperty | AliasKey]] = js.undefined
}

object FontWeightProps {
  @scala.inline
  def apply(fontWeight: ResponsiveValue[FontWeightProperty | AliasKey] = null): FontWeightProps = {
    val __obj = js.Dynamic.literal()
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontWeightProps]
  }
}

