package typings.w3cDashImageDashCapture

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
    val __obj = js.Dynamic.literal(fillLightMode = fillLightMode.asInstanceOf[js.Any], imageHeight = imageHeight.asInstanceOf[js.Any], imageWidth = imageWidth.asInstanceOf[js.Any], redEyeReduction = redEyeReduction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PhotoCapabilities]
  }
}

