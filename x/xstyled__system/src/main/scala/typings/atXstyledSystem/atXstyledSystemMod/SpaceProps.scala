package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.MarginBottomProperty
import typings.csstype.csstypeMod.MarginLeftProperty
import typings.csstype.csstypeMod.MarginRightProperty
import typings.csstype.csstypeMod.MarginTopProperty
import typings.csstype.csstypeMod.PaddingBottomProperty
import typings.csstype.csstypeMod.PaddingLeftProperty
import typings.csstype.csstypeMod.PaddingProperty
import typings.csstype.csstypeMod.PaddingRightProperty
import typings.csstype.csstypeMod.PaddingTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceProps
  extends MarginProps[StyledSystemLength]
     with MarginTopProps[StyledSystemLength]
     with MarginRightProps[StyledSystemLength]
     with MarginBottomProps[StyledSystemLength]
     with MarginLeftProps[StyledSystemLength]
     with MarginXProps[StyledSystemLength]
     with MarginYProps[StyledSystemLength]
     with PaddingProps[StyledSystemLength]
     with PaddingTopProps[StyledSystemLength]
     with PaddingRightProps[StyledSystemLength]
     with PaddingBottomProps[StyledSystemLength]
     with PaddingLeftProps[StyledSystemLength]
     with PaddingXProps[StyledSystemLength]
     with PaddingYProps[StyledSystemLength]

object SpaceProps {
  @scala.inline
  def apply(
    m: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    margin: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    marginBottom: ResponsiveValue[MarginBottomProperty[StyledSystemLength]] = null,
    marginLeft: ResponsiveValue[MarginLeftProperty[StyledSystemLength]] = null,
    marginRight: ResponsiveValue[MarginRightProperty[StyledSystemLength]] = null,
    marginTop: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    mb: ResponsiveValue[MarginBottomProperty[StyledSystemLength]] = null,
    ml: ResponsiveValue[MarginLeftProperty[StyledSystemLength]] = null,
    mr: ResponsiveValue[MarginRightProperty[StyledSystemLength]] = null,
    mt: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    mx: ResponsiveValue[MarginLeftProperty[StyledSystemLength]] = null,
    my: ResponsiveValue[MarginTopProperty[StyledSystemLength]] = null,
    p: ResponsiveValue[PaddingProperty[StyledSystemLength]] = null,
    padding: ResponsiveValue[PaddingProperty[StyledSystemLength]] = null,
    paddingBottom: ResponsiveValue[PaddingBottomProperty[StyledSystemLength]] = null,
    paddingLeft: ResponsiveValue[PaddingLeftProperty[StyledSystemLength]] = null,
    paddingRight: ResponsiveValue[PaddingRightProperty[StyledSystemLength]] = null,
    paddingTop: ResponsiveValue[PaddingTopProperty[StyledSystemLength]] = null,
    pb: ResponsiveValue[PaddingBottomProperty[StyledSystemLength]] = null,
    pl: ResponsiveValue[PaddingLeftProperty[StyledSystemLength]] = null,
    pr: ResponsiveValue[PaddingRightProperty[StyledSystemLength]] = null,
    pt: ResponsiveValue[PaddingTopProperty[StyledSystemLength]] = null,
    px: ResponsiveValue[PaddingLeftProperty[StyledSystemLength]] = null,
    py: ResponsiveValue[PaddingTopProperty[StyledSystemLength]] = null
  ): SpaceProps = {
    val __obj = js.Dynamic.literal()
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottom != null) __obj.updateDynamic("paddingBottom")(paddingBottom.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (paddingTop != null) __obj.updateDynamic("paddingTop")(paddingTop.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceProps]
  }
}

