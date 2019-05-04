package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgLayout extends js.Object {
  var align: js.UndefOr[VgLayoutAlign | RowCol[VgLayoutAlign]] = js.undefined
  var bounds: js.UndefOr[
    vegaDashLiteLib.vegaDashLiteLibStrings.full | vegaDashLiteLib.vegaDashLiteLibStrings.flush
  ] = js.undefined
  var center: js.UndefOr[scala.Boolean | RowCol[scala.Boolean]] = js.undefined
  var columns: js.UndefOr[scala.Double | vegaDashLiteLib.Anon_Signal] = js.undefined
  var footerBand: js.UndefOr[scala.Double | RowCol[scala.Double]] = js.undefined
  var headerBand: js.UndefOr[scala.Double | RowCol[scala.Double]] = js.undefined
  var offset: js.UndefOr[scala.Double | vegaDashLiteLib.Anon_ColumnFooter] = js.undefined
  var padding: js.UndefOr[scala.Double | RowCol[scala.Double]] = js.undefined
}

object VgLayout {
  @scala.inline
  def apply(
    align: VgLayoutAlign | RowCol[VgLayoutAlign] = null,
    bounds: vegaDashLiteLib.vegaDashLiteLibStrings.full | vegaDashLiteLib.vegaDashLiteLibStrings.flush = null,
    center: scala.Boolean | RowCol[scala.Boolean] = null,
    columns: scala.Double | vegaDashLiteLib.Anon_Signal = null,
    footerBand: scala.Double | RowCol[scala.Double] = null,
    headerBand: scala.Double | RowCol[scala.Double] = null,
    offset: scala.Double | vegaDashLiteLib.Anon_ColumnFooter = null,
    padding: scala.Double | RowCol[scala.Double] = null
  ): VgLayout = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (footerBand != null) __obj.updateDynamic("footerBand")(footerBand.asInstanceOf[js.Any])
    if (headerBand != null) __obj.updateDynamic("headerBand")(headerBand.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgLayout]
  }
}

