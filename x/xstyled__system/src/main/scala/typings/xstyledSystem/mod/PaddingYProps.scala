package typings.xstyledSystem.mod

import typings.csstype.mod.PaddingTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingYProps[TLength] extends js.Object {
  val py: js.UndefOr[ResponsiveValue[PaddingTopProperty[TLength]]] = js.undefined
}

object PaddingYProps {
  @scala.inline
  def apply[TLength](py: ResponsiveValue[PaddingTopProperty[TLength]] = null): PaddingYProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingYProps[TLength]]
  }
}

