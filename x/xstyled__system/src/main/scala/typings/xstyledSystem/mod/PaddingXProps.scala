package typings.xstyledSystem.mod

import typings.csstype.mod.PaddingLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingXProps[TLength] extends js.Object {
  val px: js.UndefOr[ResponsiveValue[PaddingLeftProperty[TLength]]] = js.undefined
}

object PaddingXProps {
  @scala.inline
  def apply[TLength](px: ResponsiveValue[PaddingLeftProperty[TLength]] = null): PaddingXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingXProps[TLength]]
  }
}

