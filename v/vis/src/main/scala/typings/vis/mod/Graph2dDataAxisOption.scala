package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph2dDataAxisOption extends js.Object {
  var alignZeros: js.UndefOr[Boolean] = js.undefined
  var iconWidth: js.UndefOr[Double] = js.undefined
  var icons: js.UndefOr[Boolean] = js.undefined
  var labelOffsetX: js.UndefOr[Double] = js.undefined
  var labelOffsetY: js.UndefOr[Double] = js.undefined
  var left: js.UndefOr[DataAxisSideOption] = js.undefined
  var majorLinesOffset: js.UndefOr[Double] = js.undefined
  var minorLinesOffset: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[TimelineOptionsOrientationType] = js.undefined
  var right: js.UndefOr[DataAxisSideOption] = js.undefined
  var showMajorLabels: js.UndefOr[Boolean] = js.undefined
  var showMinorLabels: js.UndefOr[Boolean] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object Graph2dDataAxisOption {
  @scala.inline
  def apply(
    alignZeros: js.UndefOr[Boolean] = js.undefined,
    iconWidth: js.UndefOr[Double] = js.undefined,
    icons: js.UndefOr[Boolean] = js.undefined,
    labelOffsetX: js.UndefOr[Double] = js.undefined,
    labelOffsetY: js.UndefOr[Double] = js.undefined,
    left: DataAxisSideOption = null,
    majorLinesOffset: js.UndefOr[Double] = js.undefined,
    minorLinesOffset: js.UndefOr[Double] = js.undefined,
    orientation: TimelineOptionsOrientationType = null,
    right: DataAxisSideOption = null,
    showMajorLabels: js.UndefOr[Boolean] = js.undefined,
    showMinorLabels: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): Graph2dDataAxisOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignZeros)) __obj.updateDynamic("alignZeros")(alignZeros.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iconWidth)) __obj.updateDynamic("iconWidth")(iconWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelOffsetX)) __obj.updateDynamic("labelOffsetX")(labelOffsetX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelOffsetY)) __obj.updateDynamic("labelOffsetY")(labelOffsetY.get.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(majorLinesOffset)) __obj.updateDynamic("majorLinesOffset")(majorLinesOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorLinesOffset)) __obj.updateDynamic("minorLinesOffset")(minorLinesOffset.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(showMajorLabels)) __obj.updateDynamic("showMajorLabels")(showMajorLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinorLabels)) __obj.updateDynamic("showMinorLabels")(showMinorLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dDataAxisOption]
  }
}

