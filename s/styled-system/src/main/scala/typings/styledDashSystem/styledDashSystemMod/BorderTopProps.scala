package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.BorderTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderTopProps[TLength] extends js.Object {
  /**
    * The border-top CSS property is a shorthand that sets the values of border-top-width, border-top-style,
    * and border-top-color. These properties describe an element's top border.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border-top)
    */
  var borderTop: js.UndefOr[ResponsiveValue[BorderTopProperty[TLength]]] = js.undefined
}

object BorderTopProps {
  @scala.inline
  def apply[TLength](borderTop: ResponsiveValue[BorderTopProperty[TLength]] = null): BorderTopProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderTopProps[TLength]]
  }
}

