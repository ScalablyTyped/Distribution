package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.AlignSelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignSelfProps extends js.Object {
  val alignSelf: js.UndefOr[ResponsiveValue[AlignSelfProperty]] = js.undefined
}

object AlignSelfProps {
  @scala.inline
  def apply(alignSelf: ResponsiveValue[AlignSelfProperty] = null): AlignSelfProps = {
    val __obj = js.Dynamic.literal()
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignSelfProps]
  }
}

