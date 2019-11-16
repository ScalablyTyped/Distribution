package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.MarginTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginYProps[TLength] extends js.Object {
  val my: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.undefined
}

object MarginYProps {
  @scala.inline
  def apply[TLength](my: ResponsiveValue[MarginTopProperty[TLength]] = null): MarginYProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginYProps[TLength]]
  }
}

