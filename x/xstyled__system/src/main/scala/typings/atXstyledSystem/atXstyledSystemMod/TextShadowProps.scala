package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.TextShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextShadowProps extends js.Object {
  val textShadow: js.UndefOr[ResponsiveValue[TextShadowProperty | Double]] = js.undefined
}

object TextShadowProps {
  @scala.inline
  def apply(textShadow: ResponsiveValue[TextShadowProperty | Double] = null): TextShadowProps = {
    val __obj = js.Dynamic.literal()
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextShadowProps]
  }
}

