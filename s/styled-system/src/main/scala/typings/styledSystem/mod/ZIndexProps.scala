package typings.styledSystem.mod

import typings.csstype.mod.ZIndexProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZIndexProps extends js.Object {
  /**
    * The z-index CSS property sets the z-order of a positioned element and its descendants or
    * flex items. Overlapping elements with a larger z-index cover those with a smaller one.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/z-index)
    */
  var zIndex: js.UndefOr[ResponsiveValue[ZIndexProperty]] = js.undefined
}

object ZIndexProps {
  @scala.inline
  def apply(zIndex: ResponsiveValue[ZIndexProperty] = null): ZIndexProps = {
    val __obj = js.Dynamic.literal()
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndexProps]
  }
}

