package typings.styledSystem.mod

import typings.csstype.mod.MinWidthProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinWidthProps[TLength] extends js.Object {
  /**
    * The min-width CSS property sets the minimum width of an element.
    * It prevents the used value of the width property from becoming smaller than the value specified for min-width.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/min-width)
    */
  var minWidth: js.UndefOr[ResponsiveValue[MinWidthProperty[TLength]]] = js.undefined
}

object MinWidthProps {
  @scala.inline
  def apply[TLength](minWidth: ResponsiveValue[MinWidthProperty[TLength]] = null): MinWidthProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinWidthProps[TLength]]
  }
}

