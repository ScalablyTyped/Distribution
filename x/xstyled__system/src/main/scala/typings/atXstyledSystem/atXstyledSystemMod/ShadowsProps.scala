package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.BoxShadowProperty
import typings.csstype.csstypeMod.TextShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowsProps
  extends BoxShadowProps
     with TextShadowProps

object ShadowsProps {
  @scala.inline
  def apply(
    boxShadow: ResponsiveValue[BoxShadowProperty | Double] = null,
    textShadow: ResponsiveValue[TextShadowProperty | Double] = null
  ): ShadowsProps = {
    val __obj = js.Dynamic.literal()
    if (boxShadow != null) __obj.updateDynamic("boxShadow")(boxShadow.asInstanceOf[js.Any])
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowsProps]
  }
}

