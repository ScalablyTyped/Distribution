package typings.xstyledSystem.mod

import typings.csstype.mod.PaddingLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingLeftProps[TLength] extends js.Object {
  val paddingLeft: js.UndefOr[ResponsiveValue[PaddingLeftProperty[TLength]]] = js.undefined
  val pl: js.UndefOr[ResponsiveValue[PaddingLeftProperty[TLength]]] = js.undefined
}

object PaddingLeftProps {
  @scala.inline
  def apply[TLength](
    paddingLeft: ResponsiveValue[PaddingLeftProperty[TLength]] = null,
    pl: ResponsiveValue[PaddingLeftProperty[TLength]] = null
  ): PaddingLeftProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingLeftProps[TLength]]
  }
}

