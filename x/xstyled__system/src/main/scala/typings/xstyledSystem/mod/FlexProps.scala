package typings.xstyledSystem.mod

import typings.csstype.mod.FlexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps[TLength] extends js.Object {
  val flex: js.UndefOr[ResponsiveValue[FlexProperty[TLength]]] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply[TLength](flex: ResponsiveValue[FlexProperty[TLength]] = null): FlexProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps[TLength]]
  }
}

