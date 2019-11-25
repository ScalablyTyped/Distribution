package typings.vegaDashTypings.typesSpecLayoutMod

import typings.vegaDashTypings.typesSpecSignalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutParams extends Layout {
  var align: js.UndefOr[LayoutAlign | SignalRef | RowColumn[LayoutAlign]] = js.undefined
  var bounds: js.UndefOr[LayoutBounds] = js.undefined
  var columns: js.UndefOr[Double | SignalRef] = js.undefined
  var footerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.undefined
  var headerBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.undefined
  var offset: js.UndefOr[LayoutOffset] = js.undefined
  var padding: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.undefined
  var titleAnchor: js.UndefOr[LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor]] = js.undefined
  var titleBand: js.UndefOr[Double | SignalRef | RowColumn[Double]] = js.undefined
}

object LayoutParams {
  @scala.inline
  def apply(
    align: LayoutAlign | SignalRef | RowColumn[LayoutAlign] = null,
    bounds: LayoutBounds = null,
    columns: Double | SignalRef = null,
    footerBand: Double | SignalRef | RowColumn[Double] = null,
    headerBand: Double | SignalRef | RowColumn[Double] = null,
    offset: LayoutOffset = null,
    padding: Double | SignalRef | RowColumn[Double] = null,
    titleAnchor: LayoutTitleAnchor | SignalRef | RowColumn[LayoutTitleAnchor] = null,
    titleBand: Double | SignalRef | RowColumn[Double] = null
  ): LayoutParams = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (footerBand != null) __obj.updateDynamic("footerBand")(footerBand.asInstanceOf[js.Any])
    if (headerBand != null) __obj.updateDynamic("headerBand")(headerBand.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (titleAnchor != null) __obj.updateDynamic("titleAnchor")(titleAnchor.asInstanceOf[js.Any])
    if (titleBand != null) __obj.updateDynamic("titleBand")(titleBand.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParams]
  }
}

