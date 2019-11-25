package typings.w3cDashImageDashCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackSupportedConstraints extends js.Object {
  var brightness: Boolean
  var colorTemperature: Boolean
  var contrast: Boolean
  var exposureCompensation: Boolean
  var exposureMode: Boolean
  var focusDistance: Boolean
  var focusMode: Boolean
  var iso: Boolean
  var pointsOfInterest: Boolean
  var saturation: Boolean
  var sharpness: Boolean
  var torch: Boolean
  var whiteBalanceMode: Boolean
  var zoom: Boolean
}

object MediaTrackSupportedConstraints {
  @scala.inline
  def apply(
    brightness: Boolean,
    colorTemperature: Boolean,
    contrast: Boolean,
    exposureCompensation: Boolean,
    exposureMode: Boolean,
    focusDistance: Boolean,
    focusMode: Boolean,
    iso: Boolean,
    pointsOfInterest: Boolean,
    saturation: Boolean,
    sharpness: Boolean,
    torch: Boolean,
    whiteBalanceMode: Boolean,
    zoom: Boolean
  ): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any], colorTemperature = colorTemperature.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], exposureMode = exposureMode.asInstanceOf[js.Any], focusDistance = focusDistance.asInstanceOf[js.Any], focusMode = focusMode.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], pointsOfInterest = pointsOfInterest.asInstanceOf[js.Any], saturation = saturation.asInstanceOf[js.Any], sharpness = sharpness.asInstanceOf[js.Any], torch = torch.asInstanceOf[js.Any], whiteBalanceMode = whiteBalanceMode.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
}

