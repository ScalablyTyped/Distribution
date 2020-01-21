package typings.xstyledSystem.mod

import typings.csstype.mod.FontSizeProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontSizeProps[TLength] extends js.Object {
  val fontSize: js.UndefOr[ResponsiveValue[FontSizeProperty[TLength]]] = js.undefined
}

object FontSizeProps {
  @scala.inline
  def apply[TLength](fontSize: ResponsiveValue[FontSizeProperty[TLength]] = null): FontSizeProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeProps[TLength]]
  }
}

