package typings.xstyledSystem.mod

import typings.csstype.mod.MarginTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginProps[TLength] extends js.Object {
  val m: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.undefined
  val margin: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.undefined
}

object MarginProps {
  @scala.inline
  def apply[TLength](
    m: ResponsiveValue[MarginTopProperty[TLength]] = null,
    margin: ResponsiveValue[MarginTopProperty[TLength]] = null
  ): MarginProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginProps[TLength]]
  }
}

