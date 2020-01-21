package typings.styledSystem.mod

import typings.csstype.mod.MaxWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaxWidthProps[TLength] extends js.Object {
  /**
    * The max-width CSS property sets the maximum width of an element.
    * It prevents the used value of the width property from becoming larger than the value specified by max-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/max-width)
    */
  var maxWidth: js.UndefOr[ResponsiveValue[MaxWidthProperty[TLength]]] = js.undefined
}

object MaxWidthProps {
  @scala.inline
  def apply[TLength](maxWidth: ResponsiveValue[MaxWidthProperty[TLength]] = null): MaxWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxWidthProps[TLength]]
  }
}

