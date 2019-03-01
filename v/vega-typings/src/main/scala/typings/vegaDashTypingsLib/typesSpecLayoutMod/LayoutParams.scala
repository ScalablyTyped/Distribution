package typings
package vegaDashTypingsLib.typesSpecLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutParams extends Layout {
  var align: js.UndefOr[
    LayoutAlign | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[LayoutAlign]
  ] = js.undefined
  var bounds: js.UndefOr[LayoutBounds] = js.undefined
  var columns: js.UndefOr[scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef] = js.undefined
  var footerBand: js.UndefOr[
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double]
  ] = js.undefined
  var headerBand: js.UndefOr[
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double]
  ] = js.undefined
  var offset: js.UndefOr[LayoutOffset] = js.undefined
  var padding: js.UndefOr[
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double]
  ] = js.undefined
  var titleBand: js.UndefOr[
    scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double]
  ] = js.undefined
}

object LayoutParams {
  @scala.inline
  def apply(
    align: LayoutAlign | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[LayoutAlign] = null,
    bounds: LayoutBounds = null,
    columns: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef = null,
    footerBand: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double] = null,
    headerBand: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double] = null,
    offset: LayoutOffset = null,
    padding: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double] = null,
    titleBand: scala.Double | vegaDashTypingsLib.typesSpecSignalMod.SignalRef | RowColumn[scala.Double] = null
  ): LayoutParams = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (footerBand != null) __obj.updateDynamic("footerBand")(footerBand.asInstanceOf[js.Any])
    if (headerBand != null) __obj.updateDynamic("headerBand")(headerBand.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (titleBand != null) __obj.updateDynamic("titleBand")(titleBand.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutParams]
  }
}

