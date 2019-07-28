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
    val __obj = js.Dynamic.literal(brightness = brightness, colorTemperature = colorTemperature, contrast = contrast, exposureCompensation = exposureCompensation, exposureMode = exposureMode, focusDistance = focusDistance, focusMode = focusMode, iso = iso, pointsOfInterest = pointsOfInterest, saturation = saturation, sharpness = sharpness, torch = torch, whiteBalanceMode = whiteBalanceMode, zoom = zoom)
  
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
}

