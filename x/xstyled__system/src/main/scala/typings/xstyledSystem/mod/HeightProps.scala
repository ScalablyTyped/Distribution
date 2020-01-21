package typings.xstyledSystem.mod

import typings.csstype.mod.HeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightProps[TLength] extends js.Object {
  val height: js.UndefOr[ResponsiveValue[HeightProperty[TLength]]] = js.undefined
}

object HeightProps {
  @scala.inline
  def apply[TLength](height: ResponsiveValue[HeightProperty[TLength]] = null): HeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightProps[TLength]]
  }
}

