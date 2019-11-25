package typings.yandexDashMaps.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClustererOptions extends js.Object {
  var gridSize: js.UndefOr[Double] = js.undefined
  var groupByCoordinates: js.UndefOr[Boolean] = js.undefined
  var hasBalloon: js.UndefOr[Boolean] = js.undefined
  var hasHint: js.UndefOr[Boolean] = js.undefined
  var margin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  var maxZoom: js.UndefOr[js.Array[Double] | Double] = js.undefined
  var minClusterSize: js.UndefOr[Double] = js.undefined
  var preset: js.UndefOr[PresetKey] = js.undefined
  var showInAlphabeticalOrder: js.UndefOr[Boolean] = js.undefined
  var useMapMargin: js.UndefOr[Boolean] = js.undefined
  var viewportMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  var zoomMargin: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
}

object IClustererOptions {
  @scala.inline
  def apply(
    gridSize: Int | Double = null,
    groupByCoordinates: js.UndefOr[Boolean] = js.undefined,
    hasBalloon: js.UndefOr[Boolean] = js.undefined,
    hasHint: js.UndefOr[Boolean] = js.undefined,
    margin: (js.Array[js.Array[Double] | Double]) | Double = null,
    maxZoom: js.Array[Double] | Double = null,
    minClusterSize: Int | Double = null,
    preset: PresetKey = null,
    showInAlphabeticalOrder: js.UndefOr[Boolean] = js.undefined,
    useMapMargin: js.UndefOr[Boolean] = js.undefined,
    viewportMargin: (js.Array[js.Array[Double] | Double]) | Double = null,
    zoomMargin: (js.Array[js.Array[Double] | Double]) | Double = null
  ): IClustererOptions = {
    val __obj = js.Dynamic.literal()
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByCoordinates)) __obj.updateDynamic("groupByCoordinates")(groupByCoordinates.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBalloon)) __obj.updateDynamic("hasBalloon")(hasBalloon.asInstanceOf[js.Any])
    if (!js.isUndefined(hasHint)) __obj.updateDynamic("hasHint")(hasHint.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minClusterSize != null) __obj.updateDynamic("minClusterSize")(minClusterSize.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset.asInstanceOf[js.Any])
    if (!js.isUndefined(showInAlphabeticalOrder)) __obj.updateDynamic("showInAlphabeticalOrder")(showInAlphabeticalOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin.asInstanceOf[js.Any])
    if (viewportMargin != null) __obj.updateDynamic("viewportMargin")(viewportMargin.asInstanceOf[js.Any])
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClustererOptions]
  }
}

