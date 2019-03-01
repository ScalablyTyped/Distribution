package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignItemsProps extends js.Object {
  /**
    * The CSS align-items property sets the align-self value on all direct children as a group. The align-self
    * property sets the alignment of an item within its containing block.
    *
    * In Flexbox it controls the alignment of items on the Cross Axis, in Grid Layout it controls the alignment
    * of items on the Block Axis within their grid area.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/align-items)
    */
  var alignItems: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.AlignItemsProperty]] = js.undefined
}

object AlignItemsProps {
  @scala.inline
  def apply(alignItems: ResponsiveValue[csstypeLib.csstypeMod.AlignItemsProperty] = null): AlignItemsProps = {
    val __obj = js.Dynamic.literal()
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItemsProps]
  }
}

