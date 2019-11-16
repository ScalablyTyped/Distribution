package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.JustifySelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JustifySelfProps extends js.Object {
  val justifySelf: js.UndefOr[ResponsiveValue[JustifySelfProperty]] = js.undefined
}

object JustifySelfProps {
  @scala.inline
  def apply(justifySelf: ResponsiveValue[JustifySelfProperty] = null): JustifySelfProps = {
    val __obj = js.Dynamic.literal()
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[JustifySelfProps]
  }
}

