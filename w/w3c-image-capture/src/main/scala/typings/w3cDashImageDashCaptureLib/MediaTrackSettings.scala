package typings
package w3cDashImageDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackSettings extends js.Object {
  var brightness: scala.Double
  var colorTemperature: scala.Double
  var contrast: scala.Double
  var exposureCompensation: scala.Double
  var exposureMode: MeteringMode
  var focusDistance: scala.Double
  var focusMode: MeteringMode
  var iso: scala.Double
  var pointsOfInterest: js.Array[Point2D]
  var saturation: scala.Double
  var sharpness: scala.Double
  var torch: scala.Boolean
  var whiteBalanceMode: MeteringMode
  var zoom: scala.Double
}

object MediaTrackSettings {
  @scala.inline
  def apply(
    brightness: scala.Double,
    colorTemperature: scala.Double,
    contrast: scala.Double,
    exposureCompensation: scala.Double,
    exposureMode: MeteringMode,
    focusDistance: scala.Double,
    focusMode: MeteringMode,
    iso: scala.Double,
    pointsOfInterest: js.Array[Point2D],
    saturation: scala.Double,
    sharpness: scala.Double,
    torch: scala.Boolean,
    whiteBalanceMode: MeteringMode,
    zoom: scala.Double
  ): MediaTrackSettings = {
    val __obj = js.Dynamic.literal(brightness = brightness, colorTemperature = colorTemperature, contrast = contrast, exposureCompensation = exposureCompensation, exposureMode = exposureMode, focusDistance = focusDistance, focusMode = focusMode, iso = iso, pointsOfInterest = pointsOfInterest, saturation = saturation, sharpness = sharpness, torch = torch, whiteBalanceMode = whiteBalanceMode, zoom = zoom)
  
    __obj.asInstanceOf[MediaTrackSettings]
  }
}

