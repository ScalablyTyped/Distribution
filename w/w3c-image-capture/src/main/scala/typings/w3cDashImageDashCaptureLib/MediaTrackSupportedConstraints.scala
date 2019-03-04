package typings
package w3cDashImageDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackSupportedConstraints extends js.Object {
  var brightness: scala.Boolean
  var colorTemperature: scala.Boolean
  var contrast: scala.Boolean
  var exposureCompensation: scala.Boolean
  var exposureMode: scala.Boolean
  var focusDistance: scala.Boolean
  var focusMode: scala.Boolean
  var iso: scala.Boolean
  var pointsOfInterest: scala.Boolean
  var saturation: scala.Boolean
  var sharpness: scala.Boolean
  var torch: scala.Boolean
  var whiteBalanceMode: scala.Boolean
  var zoom: scala.Boolean
}

object MediaTrackSupportedConstraints {
  @scala.inline
  def apply(
    brightness: scala.Boolean,
    colorTemperature: scala.Boolean,
    contrast: scala.Boolean,
    exposureCompensation: scala.Boolean,
    exposureMode: scala.Boolean,
    focusDistance: scala.Boolean,
    focusMode: scala.Boolean,
    iso: scala.Boolean,
    pointsOfInterest: scala.Boolean,
    saturation: scala.Boolean,
    sharpness: scala.Boolean,
    torch: scala.Boolean,
    whiteBalanceMode: scala.Boolean,
    zoom: scala.Boolean
  ): MediaTrackSupportedConstraints = {
    val __obj = js.Dynamic.literal(brightness = brightness, colorTemperature = colorTemperature, contrast = contrast, exposureCompensation = exposureCompensation, exposureMode = exposureMode, focusDistance = focusDistance, focusMode = focusMode, iso = iso, pointsOfInterest = pointsOfInterest, saturation = saturation, sharpness = sharpness, torch = torch, whiteBalanceMode = whiteBalanceMode, zoom = zoom)
  
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
}

