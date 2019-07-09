package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexboxProps
  extends AlignItemsProps
     with AlignContentProps
     with JustifyItemsProps
     with JustifyContentProps
     with FlexWrapProps
     with FlexDirectionProps
     with FlexProps[TLengthStyledSystem]
     with FlexGrowProps
     with FlexShrinkProps
     with FlexBasisProps[TLengthStyledSystem]
     with JustifySelfProps
     with AlignSelfProps
     with OrderProps

object FlexboxProps {
  @scala.inline
  def apply(
    alignContent: ResponsiveValue[csstypeLib.csstypeMod.AlignContentProperty] = null,
    alignItems: ResponsiveValue[csstypeLib.csstypeMod.AlignItemsProperty] = null,
    alignSelf: ResponsiveValue[csstypeLib.csstypeMod.AlignSelfProperty] = null,
    flex: ResponsiveValue[csstypeLib.csstypeMod.FlexProperty[TLengthStyledSystem]] = null,
    flexBasis: ResponsiveValue[csstypeLib.csstypeMod.FlexBasisProperty[TLengthStyledSystem]] = null,
    flexDirection: ResponsiveValue[csstypeLib.csstypeMod.FlexDirectionProperty] = null,
    flexGrow: ResponsiveValue[csstypeLib.csstypeMod.GlobalsNumber] = null,
    flexShrink: ResponsiveValue[csstypeLib.csstypeMod.GlobalsNumber] = null,
    flexWrap: ResponsiveValue[csstypeLib.csstypeMod.FlexWrapProperty] = null,
    justifyContent: ResponsiveValue[csstypeLib.csstypeMod.JustifyContentProperty] = null,
    justifyItems: ResponsiveValue[csstypeLib.csstypeMod.JustifyItemsProperty] = null,
    justifySelf: ResponsiveValue[csstypeLib.csstypeMod.JustifySelfProperty] = null,
    order: ResponsiveValue[csstypeLib.csstypeMod.GlobalsNumber] = null
  ): FlexboxProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    if (flexDirection != null) __obj.updateDynamic("flexDirection")(flexDirection.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (flexWrap != null) __obj.updateDynamic("flexWrap")(flexWrap.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (justifyItems != null) __obj.updateDynamic("justifyItems")(justifyItems.asInstanceOf[js.Any])
    if (justifySelf != null) __obj.updateDynamic("justifySelf")(justifySelf.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexboxProps]
  }
}

