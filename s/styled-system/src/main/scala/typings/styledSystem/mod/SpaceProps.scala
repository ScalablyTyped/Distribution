package typings.styledSystem.mod

import typings.csstype.mod.MarginBottomProperty
import typings.csstype.mod.MarginLeftProperty
import typings.csstype.mod.MarginProperty
import typings.csstype.mod.MarginRightProperty
import typings.csstype.mod.MarginTopProperty
import typings.csstype.mod.PaddingBottomProperty
import typings.csstype.mod.PaddingLeftProperty
import typings.csstype.mod.PaddingProperty
import typings.csstype.mod.PaddingRightProperty
import typings.csstype.mod.PaddingTopProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceProps[TLength] extends js.Object {
  /** Margin on top, left, bottom and right */
  var m: js.UndefOr[ResponsiveValue[MarginProperty[TLength]]] = js.undefined
  /** Margin on top, left, bottom and right */
  var margin: js.UndefOr[ResponsiveValue[MarginProperty[TLength]]] = js.undefined
  /** Margin on bottom */
  var marginBottom: js.UndefOr[ResponsiveValue[MarginBottomProperty[TLength]]] = js.undefined
  /** Margin on left */
  var marginLeft: js.UndefOr[ResponsiveValue[MarginLeftProperty[TLength]]] = js.undefined
  /** Margin on right */
  var marginRight: js.UndefOr[ResponsiveValue[MarginRightProperty[TLength]]] = js.undefined
  /** Margin on top */
  var marginTop: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.undefined
  /** Margin on left and right */
  var marginX: js.UndefOr[ResponsiveValue[MarginProperty[TLength]]] = js.undefined
  /** Margin on top and bottom */
  var marginY: js.UndefOr[ResponsiveValue[MarginProperty[TLength]]] = js.undefined
  /** Margin on bottom */
  var mb: js.UndefOr[ResponsiveValue[MarginBottomProperty[TLength]]] = js.undefined
  /** Margin on left */
  var ml: js.UndefOr[ResponsiveValue[MarginLeftProperty[TLength]]] = js.undefined
  /** Margin on right */
  var mr: js.UndefOr[ResponsiveValue[MarginRightProperty[TLength]]] = js.undefined
  /** Margin on top */
  var mt: js.UndefOr[ResponsiveValue[MarginTopProperty[TLength]]] = js.undefined
  /** Margin on left and right */
  var mx: js.UndefOr[ResponsiveValue[MarginProperty[TLength]]] = js.undefined
  /** Margin on top and bottom */
  var my: js.UndefOr[ResponsiveValue[MarginProperty[TLength]]] = js.undefined
  /** Padding on top, left, bottom and right */
  var p: js.UndefOr[ResponsiveValue[PaddingProperty[TLength]]] = js.undefined
  /** Padding on top, left, bottom and right */
  var padding: js.UndefOr[ResponsiveValue[PaddingProperty[TLength]]] = js.undefined
  /** Padding on bottom */
  var paddingBottom: js.UndefOr[ResponsiveValue[PaddingBottomProperty[TLength]]] = js.undefined
  /** Padding on left */
  var paddingLeft: js.UndefOr[ResponsiveValue[PaddingLeftProperty[TLength]]] = js.undefined
  /** Padding on right */
  var paddingRight: js.UndefOr[ResponsiveValue[PaddingRightProperty[TLength]]] = js.undefined
  /** Padding on top */
  var paddingTop: js.UndefOr[ResponsiveValue[PaddingTopProperty[TLength]]] = js.undefined
  /** Padding on left and right */
  var paddingX: js.UndefOr[ResponsiveValue[PaddingProperty[TLength]]] = js.undefined
  /** Padding on top and bottom */
  var paddingY: js.UndefOr[ResponsiveValue[PaddingProperty[TLength]]] = js.undefined
  /** Padding on bottom */
  var pb: js.UndefOr[ResponsiveValue[PaddingBottomProperty[TLength]]] = js.undefined
  /** Padding on left */
  var pl: js.UndefOr[ResponsiveValue[PaddingLeftProperty[TLength]]] = js.undefined
  /** Padding on right */
  var pr: js.UndefOr[ResponsiveValue[PaddingRightProperty[TLength]]] = js.undefined
  /** Padding on top */
  var pt: js.UndefOr[ResponsiveValue[PaddingTopProperty[TLength]]] = js.undefined
  /** Padding on left and right */
  var px: js.UndefOr[ResponsiveValue[PaddingProperty[TLength]]] = js.undefined
  /** Padding on top and bottom */
  var py: js.UndefOr[ResponsiveValue[PaddingProperty[TLength]]] = js.undefined
}

object SpaceProps {
  @scala.inline
  def apply[TLength](
    m: ResponsiveValue[MarginProperty[TLength]] = null,
    margin: ResponsiveValue[MarginProperty[TLength]] = null,
    marginBottom: ResponsiveValue[MarginBottomProperty[TLength]] = null,
    marginLeft: ResponsiveValue[MarginLeftProperty[TLength]] = null,
    marginRight: ResponsiveValue[MarginRightProperty[TLength]] = null,
    marginTop: ResponsiveValue[MarginTopProperty[TLength]] = null,
    marginX: ResponsiveValue[MarginProperty[TLength]] = null,
    marginY: ResponsiveValue[MarginProperty[TLength]] = null,
    mb: ResponsiveValue[MarginBottomProperty[TLength]] = null,
    ml: ResponsiveValue[MarginLeftProperty[TLength]] = null,
    mr: ResponsiveValue[MarginRightProperty[TLength]] = null,
    mt: ResponsiveValue[MarginTopProperty[TLength]] = null,
    mx: ResponsiveValue[MarginProperty[TLength]] = null,
    my: ResponsiveValue[MarginProperty[TLength]] = null,
    p: ResponsiveValue[PaddingProperty[TLength]] = null,
    padding: ResponsiveValue[PaddingProperty[TLength]] = null,
    paddingBottom: ResponsiveValue[PaddingBottomProperty[TLength]] = null,
    paddingLeft: ResponsiveValue[PaddingLeftProperty[TLength]] = null,
    paddingRight: ResponsiveValue[PaddingRightProperty[TLength]] = null,
    paddingTop: ResponsiveValue[PaddingTopProperty[TLength]] = null,
    paddingX: ResponsiveValue[PaddingProperty[TLength]] = null,
    paddingY: ResponsiveValue[PaddingProperty[TLength]] = null,
    pb: ResponsiveValue[PaddingBottomProperty[TLength]] = null,
    pl: ResponsiveValue[PaddingLeftProperty[TLength]] = null,
    pr: ResponsiveValue[PaddingRightProperty[TLength]] = null,
    pt: ResponsiveValue[PaddingTopProperty[TLength]] = null,
    px: ResponsiveValue[PaddingProperty[TLength]] = null,
    py: ResponsiveValue[PaddingProperty[TLength]] = null
  ): SpaceProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
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
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceProps[TLength]]
  }
}

