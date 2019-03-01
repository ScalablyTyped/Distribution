package typings
package w3cDashImageDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoSettings extends js.Object {
  var fillLightMode: js.UndefOr[FillLightMode] = js.undefined
  var imageHeight: js.UndefOr[scala.Double] = js.undefined
  var imageWidth: js.UndefOr[scala.Double] = js.undefined
  var redEyeReduction: js.UndefOr[scala.Boolean] = js.undefined
}

object PhotoSettings {
  @scala.inline
  def apply(
    fillLightMode: FillLightMode = null,
    imageHeight: scala.Int | scala.Double = null,
    imageWidth: scala.Int | scala.Double = null,
    redEyeReduction: js.UndefOr[scala.Boolean] = js.undefined
  ): PhotoSettings = {
    val __obj = js.Dynamic.literal()
    if (fillLightMode != null) __obj.updateDynamic("fillLightMode")(fillLightMode)
    if (imageHeight != null) __obj.updateDynamic("imageHeight")(imageHeight.asInstanceOf[js.Any])
    if (imageWidth != null) __obj.updateDynamic("imageWidth")(imageWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(redEyeReduction)) __obj.updateDynamic("redEyeReduction")(redEyeReduction)
    __obj.asInstanceOf[PhotoSettings]
  }
}

