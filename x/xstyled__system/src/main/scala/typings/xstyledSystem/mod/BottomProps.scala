package typings.xstyledSystem.mod

import typings.csstype.mod.BottomProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomProps[TLength] extends js.Object {
  val bottom: js.UndefOr[ResponsiveValue[BottomProperty[TLength]]] = js.undefined
}

object BottomProps {
  @scala.inline
  def apply[TLength](bottom: ResponsiveValue[BottomProperty[TLength]] = null): BottomProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomProps[TLength]]
  }
}

