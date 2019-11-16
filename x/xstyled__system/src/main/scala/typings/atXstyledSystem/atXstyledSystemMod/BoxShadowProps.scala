package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.BoxShadowProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxShadowProps extends js.Object {
  val boxShadow: js.UndefOr[ResponsiveValue[BoxShadowProperty | Double]] = js.undefined
}

object BoxShadowProps {
  @scala.inline
  def apply(boxShadow: ResponsiveValue[BoxShadowProperty | Double] = null): BoxShadowProps = {
    val __obj = js.Dynamic.literal()
    if (boxShadow != null) __obj.updateDynamic("boxShadow")(boxShadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxShadowProps]
  }
}

