package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgAxis extends js.Object {
  var domain: js.UndefOr[scala.Boolean] = js.undefined
  var encode: js.UndefOr[VgAxisEncode] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var grid: js.UndefOr[scala.Boolean] = js.undefined
  var gridScale: js.UndefOr[java.lang.String] = js.undefined
  var labelBound: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var labelFlush: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var labelOverlap: js.UndefOr[
    scala.Boolean | vegaDashLiteLib.vegaDashLiteLibStrings.parity | vegaDashLiteLib.vegaDashLiteLibStrings.greedy
  ] = js.undefined
  var labelPadding: js.UndefOr[scala.Double] = js.undefined
  var labels: js.UndefOr[scala.Boolean] = js.undefined
  var maxExtent: js.UndefOr[scala.Double] = js.undefined
  var minExtent: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var orient: js.UndefOr[AxisOrient] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var scale: java.lang.String
  var tickCount: js.UndefOr[scala.Double] = js.undefined
  var tickSize: js.UndefOr[scala.Double] = js.undefined
  var ticks: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var titlePadding: js.UndefOr[scala.Double] = js.undefined
  var values: js.UndefOr[js.Array[_] | VgSignalRef] = js.undefined
  var zindex: js.UndefOr[scala.Double] = js.undefined
}

object VgAxis {
  @scala.inline
  def apply(
    scale: java.lang.String,
    domain: js.UndefOr[scala.Boolean] = js.undefined,
    encode: VgAxisEncode = null,
    format: java.lang.String = null,
    grid: js.UndefOr[scala.Boolean] = js.undefined,
    gridScale: java.lang.String = null,
    labelBound: scala.Boolean | scala.Double = null,
    labelFlush: scala.Boolean | scala.Double = null,
    labelOverlap: scala.Boolean | vegaDashLiteLib.vegaDashLiteLibStrings.parity | vegaDashLiteLib.vegaDashLiteLibStrings.greedy = null,
    labelPadding: scala.Int | scala.Double = null,
    labels: js.UndefOr[scala.Boolean] = js.undefined,
    maxExtent: scala.Int | scala.Double = null,
    minExtent: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    orient: AxisOrient = null,
    position: scala.Int | scala.Double = null,
    tickCount: scala.Int | scala.Double = null,
    tickSize: scala.Int | scala.Double = null,
    ticks: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titlePadding: scala.Int | scala.Double = null,
    values: js.Array[_] | VgSignalRef = null,
    zindex: scala.Int | scala.Double = null
  ): VgAxis = {
    val __obj = js.Dynamic.literal(scale = scale)
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid)
    if (gridScale != null) __obj.updateDynamic("gridScale")(gridScale)
    if (labelBound != null) __obj.updateDynamic("labelBound")(labelBound.asInstanceOf[js.Any])
    if (labelFlush != null) __obj.updateDynamic("labelFlush")(labelFlush.asInstanceOf[js.Any])
    if (labelOverlap != null) __obj.updateDynamic("labelOverlap")(labelOverlap.asInstanceOf[js.Any])
    if (labelPadding != null) __obj.updateDynamic("labelPadding")(labelPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (maxExtent != null) __obj.updateDynamic("maxExtent")(maxExtent.asInstanceOf[js.Any])
    if (minExtent != null) __obj.updateDynamic("minExtent")(minExtent.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (tickCount != null) __obj.updateDynamic("tickCount")(tickCount.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (!js.isUndefined(ticks)) __obj.updateDynamic("ticks")(ticks)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titlePadding != null) __obj.updateDynamic("titlePadding")(titlePadding.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (zindex != null) __obj.updateDynamic("zindex")(zindex.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgAxis]
  }
}

