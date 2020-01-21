package typings.xstyledSystem.mod

import typings.csstype.mod.BoxShadowProperty
import typings.csstype.mod.TextShadowProperty
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

