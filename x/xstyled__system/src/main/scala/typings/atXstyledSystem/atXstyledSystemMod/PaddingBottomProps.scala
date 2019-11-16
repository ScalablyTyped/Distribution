package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.PaddingBottomProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaddingBottomProps[TLength] extends js.Object {
  val paddingBottom: js.UndefOr[ResponsiveValue[PaddingBottomProperty[TLength]]] = js.undefined
  val pb: js.UndefOr[ResponsiveValue[PaddingBottomProperty[TLength]]] = js.undefined
}

object PaddingBottomProps {
  @scala.inline
  def apply[TLength](
    paddingBottom: ResponsiveValue[PaddingBottomProperty[TLength]] = null,
    pb: ResponsiveValue[PaddingBottomProperty[TLength]] = null
  ): PaddingBottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaddingBottomProps[TLength]]
  }
}

