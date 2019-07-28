package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import typings.vegaDashLite.vegaDashLiteStrings.greedy
import typings.vegaDashLite.vegaDashLiteStrings.parity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgAxis extends js.Object {
  var domain: js.UndefOr[Boolean] = js.undefined
  var encode: js.UndefOr[VgAxisEncode] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var grid: js.UndefOr[Boolean] = js.undefined
  var gridScale: js.UndefOr[String] = js.undefined
  var labelBound: js.UndefOr[Boolean | Double] = js.undefined
  var labelFlush: js.UndefOr[Boolean | Double] = js.undefined
  var labelOverlap: js.UndefOr[Boolean | parity | greedy] = js.undefined
  var labelPadding: js.UndefOr[Double] = js.undefined
  var labels: js.UndefOr[Boolean] = js.undefined
  var maxExtent: js.UndefOr[Double] = js.undefined
  var minExtent: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var orient: js.UndefOr[AxisOrient] = js.undefined
  var position: js.UndefOr[Double] = js.undefined
  var scale: String
  var tickCount: js.UndefOr[Double] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  var ticks: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titlePadding: js.UndefOr[Double] = js.undefined
  var values: js.UndefOr[js.Array[_] | VgSignalRef] = js.undefined
  var zindex: js.UndefOr[Double] = js.undefined
}

object VgAxis {
  @scala.inline
  def apply(
    scale: String,
    domain: js.UndefOr[Boolean] = js.undefined,
    encode: VgAxisEncode = null,
    format: String = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    gridScale: String = null,
    labelBound: Boolean | Double = null,
    labelFlush: Boolean | Double = null,
    labelOverlap: Boolean | parity | greedy = null,
    labelPadding: Int | Double = null,
    labels: js.UndefOr[Boolean] = js.undefined,
    maxExtent: Int | Double = null,
    minExtent: Int | Double = null,
    offset: Int | Double = null,
    orient: AxisOrient = null,
    position: Int | Double = null,
    tickCount: Int | Double = null,
    tickSize: Int | Double = null,
    ticks: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titlePadding: Int | Double = null,
    values: js.Array[_] | VgSignalRef = null,
    zindex: Int | Double = null
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

