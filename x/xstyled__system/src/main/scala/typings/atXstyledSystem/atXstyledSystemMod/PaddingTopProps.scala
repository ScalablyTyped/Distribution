package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.PaddingTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingTopProps[TLength] extends js.Object {
  val paddingTop: js.UndefOr[ResponsiveValue[PaddingTopProperty[TLength]]] = js.undefined
  val pt: js.UndefOr[ResponsiveValue[PaddingTopProperty[TLength]]] = js.undefined
}

object PaddingTopProps {
  @scala.inline
  def apply[TLength](
    paddingTop: ResponsiveValue[PaddingTopProperty[TLength]] = null,
    pt: ResponsiveValue[PaddingTopProperty[TLength]] = null
  ): PaddingTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingTopProps[TLength]]
  }
}

