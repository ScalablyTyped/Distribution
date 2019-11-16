package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.PaddingProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingProps[TLength] extends js.Object {
  val p: js.UndefOr[ResponsiveValue[PaddingProperty[TLength]]] = js.undefined
  val padding: js.UndefOr[ResponsiveValue[PaddingProperty[TLength]]] = js.undefined
}

object PaddingProps {
  @scala.inline
  def apply[TLength](
    p: ResponsiveValue[PaddingProperty[TLength]] = null,
    padding: ResponsiveValue[PaddingProperty[TLength]] = null
  ): PaddingProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingProps[TLength]]
  }
}

