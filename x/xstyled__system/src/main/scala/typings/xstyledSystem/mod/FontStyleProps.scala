package typings.xstyledSystem.mod

import typings.csstype.mod.FontStyleProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontStyleProps extends js.Object {
  val fontStyle: js.UndefOr[ResponsiveValue[FontStyleProperty]] = js.undefined
}

object FontStyleProps {
  @scala.inline
  def apply(fontStyle: ResponsiveValue[FontStyleProperty] = null): FontStyleProps = {
    val __obj = js.Dynamic.literal()
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontStyleProps]
  }
}

