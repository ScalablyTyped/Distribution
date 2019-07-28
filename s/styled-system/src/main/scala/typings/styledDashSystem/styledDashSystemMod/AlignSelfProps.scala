package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.AlignSelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignSelfProps extends js.Object {
  /**
    * The align-self CSS property aligns flex items of the current flex line overriding the align-items value.
    *
    * If any of the item's cross-axis margin is set to auto, then align-self is ignored. In Grid layout align-self
    * aligns the item inside the grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-self)
    */
  var alignSelf: js.UndefOr[ResponsiveValue[AlignSelfProperty]] = js.undefined
}

object AlignSelfProps {
  @scala.inline
  def apply(alignSelf: ResponsiveValue[AlignSelfProperty] = null): AlignSelfProps = {
    val __obj = js.Dynamic.literal()
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignSelfProps]
  }
}

