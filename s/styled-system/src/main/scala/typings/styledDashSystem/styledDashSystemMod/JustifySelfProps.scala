package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.JustifySelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JustifySelfProps extends js.Object {
  /**
    * The CSS justify-self property set the way a box is justified inside its alignment container along
    * the appropriate axis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/justify-self)
    */
  var justifySelf: js.UndefOr[ResponsiveValue[JustifySelfProperty]] = js.undefined
}

object JustifySelfProps {
  @scala.inline
  def apply(justifySelf: ResponsiveValue[JustifySelfProperty] = null): JustifySelfProps = {
    val __obj = js.Dynamic.literal()
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifySelfProps]
  }
}

