package typings.styledDashSystem.styledDashSystemMod

import typings.csstype.csstypeMod.AlignContentProperty
import typings.csstype.csstypeMod.AlignItemsProperty
import typings.csstype.csstypeMod.AlignSelfProperty
import typings.csstype.csstypeMod.FlexBasisProperty
import typings.csstype.csstypeMod.FlexDirectionProperty
import typings.csstype.csstypeMod.FlexProperty
import typings.csstype.csstypeMod.FlexWrapProperty
import typings.csstype.csstypeMod.GlobalsNumber
import typings.csstype.csstypeMod.JustifyContentProperty
import typings.csstype.csstypeMod.JustifyItemsProperty
import typings.csstype.csstypeMod.JustifySelfProperty
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
    alignContent: ResponsiveValue[AlignContentProperty] = null,
    alignItems: ResponsiveValue[AlignItemsProperty] = null,
    alignSelf: ResponsiveValue[AlignSelfProperty] = null,
    flex: ResponsiveValue[FlexProperty[TLengthStyledSystem]] = null,
    flexBasis: ResponsiveValue[FlexBasisProperty[TLengthStyledSystem]] = null,
    flexDirection: ResponsiveValue[FlexDirectionProperty] = null,
    flexGrow: ResponsiveValue[GlobalsNumber] = null,
    flexShrink: ResponsiveValue[GlobalsNumber] = null,
    flexWrap: ResponsiveValue[FlexWrapProperty] = null,
    justifyContent: ResponsiveValue[JustifyContentProperty] = null,
    justifyItems: ResponsiveValue[JustifyItemsProperty] = null,
    justifySelf: ResponsiveValue[JustifySelfProperty] = null,
    order: ResponsiveValue[GlobalsNumber] = null
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

