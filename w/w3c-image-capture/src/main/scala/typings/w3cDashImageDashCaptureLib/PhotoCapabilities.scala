package typings
package w3cDashImageDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoCapabilities extends js.Object {
  val fillLightMode: js.Array[FillLightMode]
  val imageHeight: MediaSettingsRange
  val imageWidth: MediaSettingsRange
  val redEyeReduction: RedEyeReduction
}

object PhotoCapabilities {
  @scala.inline
  def apply(
    fillLightMode: js.Array[FillLightMode],
    imageHeight: MediaSettingsRange,
    imageWidth: MediaSettingsRange,
    redEyeReduction: RedEyeReduction
  ): PhotoCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fillLightMode")(fillLightMode)
    __obj.updateDynamic("imageHeight")(imageHeight)
    __obj.updateDynamic("imageWidth")(imageWidth)
    __obj.updateDynamic("redEyeReduction")(redEyeReduction)
    __obj.asInstanceOf[PhotoCapabilities]
  }
}

