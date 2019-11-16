package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.MarginTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginTopProps[TLength] extends js.Object {
  val marginTop: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.undefined
  val mt: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.undefined
}

object MarginTopProps {
  @scala.inline
  def apply[TLength](
    marginTop: ResponsiveValue[MarginTopProperty[TLength]] = null,
    mt: ResponsiveValue[MarginTopProperty[TLength]] = null
  ): MarginTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginTopProps[TLength]]
  }
}

