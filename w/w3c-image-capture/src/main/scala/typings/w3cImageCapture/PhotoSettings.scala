package typings.w3cImageCapture

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
    imageHeight: js.UndefOr[Double] = js.undefined,
    imageWidth: js.UndefOr[Double] = js.undefined,
    redEyeReduction: js.UndefOr[Boolean] = js.undefined
  ): PhotoSettings = {
    val __obj = js.Dynamic.literal()
    if (fillLightMode != null) __obj.updateDynamic("fillLightMode")(fillLightMode.asInstanceOf[js.Any])
    if (!js.isUndefined(imageHeight)) __obj.updateDynamic("imageHeight")(imageHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageWidth)) __obj.updateDynamic("imageWidth")(imageWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(redEyeReduction)) __obj.updateDynamic("redEyeReduction")(redEyeReduction.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotoSettings]
  }
}

