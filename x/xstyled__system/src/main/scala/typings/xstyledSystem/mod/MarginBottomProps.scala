package typings.xstyledSystem.mod

import typings.csstype.mod.MarginBottomProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginBottomProps[TLength] extends js.Object {
  val marginBottom: js.UndefOr[ResponsiveValue[MarginBottomProperty[TLength]]] = js.undefined
  val mb: js.UndefOr[ResponsiveValue[MarginBottomProperty[TLength]]] = js.undefined
}

object MarginBottomProps {
  @scala.inline
  def apply[TLength](
    marginBottom: ResponsiveValue[MarginBottomProperty[TLength]] = null,
    mb: ResponsiveValue[MarginBottomProperty[TLength]] = null
  ): MarginBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginBottomProps[TLength]]
  }
}

