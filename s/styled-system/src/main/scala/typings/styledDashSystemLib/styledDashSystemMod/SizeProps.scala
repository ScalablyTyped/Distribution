package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- styledDashSystemLib.styledDashSystemMod.SizeWidthProps because var conflicts: size. Inlined  */ trait SizeProps extends SizeHeightProps[TLengthStyledSystem]

object SizeProps {
  @scala.inline
  def apply(size: ResponsiveValue[csstypeLib.csstypeMod.WidthProperty[TLengthStyledSystem]] = null): SizeProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeProps]
  }
}

