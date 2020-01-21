package typings.xstyledSystem.mod

import typings.csstype.mod.AlignContentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignContentProps extends js.Object {
  val alignContent: js.UndefOr[ResponsiveValue[AlignContentProperty]] = js.undefined
}

object AlignContentProps {
  @scala.inline
  def apply(alignContent: ResponsiveValue[AlignContentProperty] = null): AlignContentProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignContentProps]
  }
}

