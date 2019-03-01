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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("brightness")(brightness)
    __obj.updateDynamic("colorTemperature")(colorTemperature)
    __obj.updateDynamic("contrast")(contrast)
    __obj.updateDynamic("exposureCompensation")(exposureCompensation)
    __obj.updateDynamic("exposureMode")(exposureMode)
    __obj.updateDynamic("focusDistance")(focusDistance)
    __obj.updateDynamic("focusMode")(focusMode)
    __obj.updateDynamic("iso")(iso)
    __obj.updateDynamic("pointsOfInterest")(pointsOfInterest)
    __obj.updateDynamic("saturation")(saturation)
    __obj.updateDynamic("sharpness")(sharpness)
    __obj.updateDynamic("torch")(torch)
    __obj.updateDynamic("whiteBalanceMode")(whiteBalanceMode)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[MediaTrackSupportedConstraints]
  }
}

