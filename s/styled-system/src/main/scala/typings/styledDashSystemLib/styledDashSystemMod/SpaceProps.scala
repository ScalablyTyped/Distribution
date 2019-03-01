package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpaceProps[TLength] extends js.Object {
  /** Margin on top, left, bottom and right */
  var m: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.MarginProperty[TLength]]] = js.undefined
  /** Margin for the bottom */
  var mb: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.MarginBottomProperty[TLength]]] = js.undefined
  /** Margin for the left */
  var ml: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.MarginLeftProperty[TLength]]] = js.undefined
  /** Margin for the right */
  var mr: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.MarginRightProperty[TLength]]] = js.undefined
  /** Margin for the top */
  var mt: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.MarginTopProperty[TLength]]] = js.undefined
  /** Margin for the left and right */
  var mx: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]]] = js.undefined
  /** Margin for the top and bottom */
  var my: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]]] = js.undefined
  /** Padding on top, left, bottom and right */
  var p: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]]] = js.undefined
  /** Padding for the bottom */
  var pb: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PaddingBottomProperty[TLength]]] = js.undefined
  /** Padding for the left */
  var pl: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PaddingLeftProperty[TLength]]] = js.undefined
  /** Padding for the right */
  var pr: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PaddingRightProperty[TLength]]] = js.undefined
  /** Padding for the top */
  var pt: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PaddingTopProperty[TLength]]] = js.undefined
  /** Padding for the left and right */
  var px: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]]] = js.undefined
  /** Padding for the top and bottom */
  var py: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]]] = js.undefined
}

object SpaceProps {
  @scala.inline
  def apply[TLength](
    m: ResponsiveValue[csstypeLib.csstypeMod.MarginProperty[TLength]] = null,
    mb: ResponsiveValue[csstypeLib.csstypeMod.MarginBottomProperty[TLength]] = null,
    ml: ResponsiveValue[csstypeLib.csstypeMod.MarginLeftProperty[TLength]] = null,
    mr: ResponsiveValue[csstypeLib.csstypeMod.MarginRightProperty[TLength]] = null,
    mt: ResponsiveValue[csstypeLib.csstypeMod.MarginTopProperty[TLength]] = null,
    mx: ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]] = null,
    my: ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]] = null,
    p: ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]] = null,
    pb: ResponsiveValue[csstypeLib.csstypeMod.PaddingBottomProperty[TLength]] = null,
    pl: ResponsiveValue[csstypeLib.csstypeMod.PaddingLeftProperty[TLength]] = null,
    pr: ResponsiveValue[csstypeLib.csstypeMod.PaddingRightProperty[TLength]] = null,
    pt: ResponsiveValue[csstypeLib.csstypeMod.PaddingTopProperty[TLength]] = null,
    px: ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]] = null,
    py: ResponsiveValue[csstypeLib.csstypeMod.PaddingProperty[TLength]] = null
  ): SpaceProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (mb != null) __obj.updateDynamic("mb")(mb.asInstanceOf[js.Any])
    if (ml != null) __obj.updateDynamic("ml")(ml.asInstanceOf[js.Any])
    if (mr != null) __obj.updateDynamic("mr")(mr.asInstanceOf[js.Any])
    if (mt != null) __obj.updateDynamic("mt")(mt.asInstanceOf[js.Any])
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    if (my != null) __obj.updateDynamic("my")(my.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (pb != null) __obj.updateDynamic("pb")(pb.asInstanceOf[js.Any])
    if (pl != null) __obj.updateDynamic("pl")(pl.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (pt != null) __obj.updateDynamic("pt")(pt.asInstanceOf[js.Any])
    if (px != null) __obj.updateDynamic("px")(px.asInstanceOf[js.Any])
    if (py != null) __obj.updateDynamic("py")(py.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceProps[TLength]]
  }
}

