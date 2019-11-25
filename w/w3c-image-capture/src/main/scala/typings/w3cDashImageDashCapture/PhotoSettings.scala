package typings.w3cDashImageDashCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoSettings extends js.Object {
  var fillLightMode: js.UndefOr[FillLightMode] = js.undefined
  var imageHeight: js.UndefOr[Double] = js.undefined
  var imageWidth: js.UndefOr[Double] = js.undefined
  var redEyeReduction: js.UndefOr[Boolean] = js.undefined
}

object PhotoSettings {
  @scala.inline
  def apply(
    fillLightMode: FillLightMode = null,
    imageHeight: Int | Double = null,
    imageWidth: Int | Double = null,
    redEyeReduction: js.UndefOr[Boolean] = js.undefined
  ): PhotoSettings = {
    val __obj = js.Dynamic.literal()
    if (fillLightMode != null) __obj.updateDynamic("fillLightMode")(fillLightMode.asInstanceOf[js.Any])
    if (imageHeight != null) __obj.updateDynamic("imageHeight")(imageHeight.asInstanceOf[js.Any])
    if (imageWidth != null) __obj.updateDynamic("imageWidth")(imageWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(redEyeReduction)) __obj.updateDynamic("redEyeReduction")(redEyeReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoSettings]
  }
}

