package typings.xstyledSystem.mod

import typings.csstype.mod.LeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeftProps[TLength] extends js.Object {
  val left: js.UndefOr[ResponsiveValue[LeftProperty[TLength]]] = js.undefined
}

object LeftProps {
  @scala.inline
  def apply[TLength](left: ResponsiveValue[LeftProperty[TLength]] = null): LeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftProps[TLength]]
  }
}

