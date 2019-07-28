package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.Anon_ColumnFooter
import typings.vegaDashLite.Anon_Signal
import typings.vegaDashLite.vegaDashLiteStrings.flush
import typings.vegaDashLite.vegaDashLiteStrings.full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgLayout extends js.Object {
  var align: js.UndefOr[VgLayoutAlign | RowCol[VgLayoutAlign]] = js.undefined
  var bounds: js.UndefOr[full | flush] = js.undefined
  var center: js.UndefOr[Boolean | RowCol[Boolean]] = js.undefined
  var columns: js.UndefOr[Double | Anon_Signal] = js.undefined
  var footerBand: js.UndefOr[Double | RowCol[Double]] = js.undefined
  var headerBand: js.UndefOr[Double | RowCol[Double]] = js.undefined
  var offset: js.UndefOr[Double | Anon_ColumnFooter] = js.undefined
  var padding: js.UndefOr[Double | RowCol[Double]] = js.undefined
}

object VgLayout {
  @scala.inline
  def apply(
    align: VgLayoutAlign | RowCol[VgLayoutAlign] = null,
    bounds: full | flush = null,
    center: Boolean | RowCol[Boolean] = null,
    columns: Double | Anon_Signal = null,
    footerBand: Double | RowCol[Double] = null,
    headerBand: Double | RowCol[Double] = null,
    offset: Double | Anon_ColumnFooter = null,
    padding: Double | RowCol[Double] = null
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

