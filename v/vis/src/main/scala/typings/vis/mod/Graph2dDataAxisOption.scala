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
    iconWidth: Int | Double = null,
    icons: js.UndefOr[Boolean] = js.undefined,
    labelOffsetX: Int | Double = null,
    labelOffsetY: Int | Double = null,
    left: DataAxisSideOption = null,
    majorLinesOffset: Int | Double = null,
    minorLinesOffset: Int | Double = null,
    orientation: TimelineOptionsOrientationType = null,
    right: DataAxisSideOption = null,
    showMajorLabels: js.UndefOr[Boolean] = js.undefined,
    showMinorLabels: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: String = null
  ): Graph2dDataAxisOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignZeros)) __obj.updateDynamic("alignZeros")(alignZeros.asInstanceOf[js.Any])
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (labelOffsetX != null) __obj.updateDynamic("labelOffsetX")(labelOffsetX.asInstanceOf[js.Any])
    if (labelOffsetY != null) __obj.updateDynamic("labelOffsetY")(labelOffsetY.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (majorLinesOffset != null) __obj.updateDynamic("majorLinesOffset")(majorLinesOffset.asInstanceOf[js.Any])
    if (minorLinesOffset != null) __obj.updateDynamic("minorLinesOffset")(minorLinesOffset.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(showMajorLabels)) __obj.updateDynamic("showMajorLabels")(showMajorLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(showMinorLabels)) __obj.updateDynamic("showMinorLabels")(showMinorLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph2dDataAxisOption]
  }
}

