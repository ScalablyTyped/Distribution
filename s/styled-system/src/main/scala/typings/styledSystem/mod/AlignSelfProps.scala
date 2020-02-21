package typings.styledSystem.mod

import typings.csstype.mod.AlignSelfProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignSelfProps[ThemeType /* <: Theme[TLengthStyledSystem] */] extends js.Object {
  /**
    * The align-self CSS property aligns flex items of the current flex line overriding the align-items value.
    *
    * If any of the item's cross-axis margin is set to auto, then align-self is ignored. In Grid layout align-self
    * aligns the item inside the grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-self)
    */
  var alignSelf: js.UndefOr[ResponsiveValue[AlignSelfProperty, ThemeType]] = js.undefined
}

object AlignSelfProps {
  @scala.inline
  def apply[ThemeType /* <: Theme[TLengthStyledSystem] */](alignSelf: ResponsiveValue[AlignSelfProperty, ThemeType] = null): AlignSelfProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignSelfProps[ThemeType]]
  }
}

