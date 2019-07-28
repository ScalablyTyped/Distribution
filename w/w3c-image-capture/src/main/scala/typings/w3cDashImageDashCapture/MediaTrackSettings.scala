package typings.w3cDashImageDashCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackSettings extends js.Object {
  var brightness: Double
  var colorTemperature: Double
  var contrast: Double
  var exposureCompensation: Double
  var exposureMode: MeteringMode
  var focusDistance: Double
  var focusMode: MeteringMode
  var iso: Double
  var pointsOfInterest: js.Array[Point2D]
  var saturation: Double
  var sharpness: Double
  var torch: Boolean
  var whiteBalanceMode: MeteringMode
  var zoom: Double
}

object MediaTrackSettings {
  @scala.inline
  def apply(
    brightness: Double,
    colorTemperature: Double,
    contrast: Double,
    exposureCompensation: Double,
    exposureMode: MeteringMode,
    focusDistance: Double,
    focusMode: MeteringMode,
    iso: Double,
    pointsOfInterest: js.Array[Point2D],
    saturation: Double,
    sharpness: Double,
    torch: Boolean,
    whiteBalanceMode: MeteringMode,
    zoom: Double
  ): MediaTrackSettings = {
    val __obj = js.Dynamic.literal(brightness = brightness, colorTemperature = colorTemperature, contrast = contrast, exposureCompensation = exposureCompensation, exposureMode = exposureMode, focusDistance = focusDistance, focusMode = focusMode, iso = iso, pointsOfInterest = pointsOfInterest, saturation = saturation, sharpness = sharpness, torch = torch, whiteBalanceMode = whiteBalanceMode, zoom = zoom)
  
    __obj.asInstanceOf[MediaTrackSettings]
  }
}

