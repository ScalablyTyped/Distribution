package typings.xstyledSystem.mod

import typings.csstype.mod.TextAlignProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAlignProps extends js.Object {
  val textAlign: js.UndefOr[ResponsiveValue[TextAlignProperty]] = js.undefined
}

object TextAlignProps {
  @scala.inline
  def apply(textAlign: ResponsiveValue[TextAlignProperty] = null): TextAlignProps = {
    val __obj = js.Dynamic.literal()
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAlignProps]
  }
}

