package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShadowProps
  extends BoxShadowProps
     with TextShadowProps

object ShadowProps {
  @scala.inline
  def apply(
    boxShadow: ResponsiveValue[csstypeLib.csstypeMod.BoxShadowProperty | scala.Double] = null,
    textShadow: ResponsiveValue[csstypeLib.csstypeMod.TextShadowProperty | scala.Double] = null
  ): ShadowProps = {
    val __obj = js.Dynamic.literal()
    if (boxShadow != null) __obj.updateDynamic("boxShadow")(boxShadow.asInstanceOf[js.Any])
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowProps]
  }
}

