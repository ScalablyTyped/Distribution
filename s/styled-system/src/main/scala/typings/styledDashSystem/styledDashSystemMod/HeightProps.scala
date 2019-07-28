package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.HeightProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightProps[TLength] extends js.Object {
  /**
    * The height CSS property specifies the height of an element. By default, the property defines the height of the
    * content area. If box-sizing is set to border-box, however, it instead determines the height of the border area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/height)
    */
  var height: js.UndefOr[ResponsiveValue[HeightProperty[TLength]]] = js.undefined
}

object HeightProps {
  @scala.inline
  def apply[TLength](height: ResponsiveValue[HeightProperty[TLength]] = null): HeightProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightProps[TLength]]
  }
}

