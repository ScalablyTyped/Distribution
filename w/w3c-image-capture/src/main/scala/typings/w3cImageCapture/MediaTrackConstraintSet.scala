package typings.w3cImageCapture

import typings.w3cImageCapture.W3C.ConstrainPoint2D
import typings.webrtc.W3C.ConstrainBoolean
import typings.webrtc.W3C.ConstrainDouble
import typings.webrtc.W3C.ConstrainString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackConstraintSet extends js.Object {
  var brightness: js.UndefOr[ConstrainDouble] = js.undefined
  var colorTemperature: js.UndefOr[ConstrainDouble] = js.undefined
  var contrast: js.UndefOr[ConstrainDouble] = js.undefined
  var exposureCompensation: js.UndefOr[ConstrainDouble] = js.undefined
  var exposureMode: js.UndefOr[ConstrainString] = js.undefined
  var focusDistance: js.UndefOr[ConstrainDouble] = js.undefined
  var focusMode: js.UndefOr[ConstrainString] = js.undefined
  var iso: js.UndefOr[ConstrainDouble] = js.undefined
  var pointsOfInterest: js.UndefOr[ConstrainPoint2D] = js.undefined
  var saturation: js.UndefOr[ConstrainDouble] = js.undefined
  var sharpness: js.UndefOr[ConstrainDouble] = js.undefined
  var torch: js.UndefOr[ConstrainBoolean] = js.undefined
  var whiteBalanceMode: js.UndefOr[ConstrainString] = js.undefined
  var zoom: js.UndefOr[ConstrainDouble] = js.undefined
}

object MediaTrackConstraintSet {
  @scala.inline
  def apply(
    brightness: ConstrainDouble = null,
    colorTemperature: ConstrainDouble = null,
    contrast: ConstrainDouble = null,
    exposureCompensation: ConstrainDouble = null,
    exposureMode: ConstrainString = null,
    focusDistance: ConstrainDouble = null,
    focusMode: ConstrainString = null,
    iso: ConstrainDouble = null,
    pointsOfInterest: ConstrainPoint2D = null,
    saturation: ConstrainDouble = null,
    sharpness: ConstrainDouble = null,
    torch: ConstrainBoolean = null,
    whiteBalanceMode: ConstrainString = null,
    zoom: ConstrainDouble = null
  ): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (colorTemperature != null) __obj.updateDynamic("colorTemperature")(colorTemperature.asInstanceOf[js.Any])
    if (contrast != null) __obj.updateDynamic("contrast")(contrast.asInstanceOf[js.Any])
    if (exposureCompensation != null) __obj.updateDynamic("exposureCompensation")(exposureCompensation.asInstanceOf[js.Any])
    if (exposureMode != null) __obj.updateDynamic("exposureMode")(exposureMode.asInstanceOf[js.Any])
    if (focusDistance != null) __obj.updateDynamic("focusDistance")(focusDistance.asInstanceOf[js.Any])
    if (focusMode != null) __obj.updateDynamic("focusMode")(focusMode.asInstanceOf[js.Any])
    if (iso != null) __obj.updateDynamic("iso")(iso.asInstanceOf[js.Any])
    if (pointsOfInterest != null) __obj.updateDynamic("pointsOfInterest")(pointsOfInterest.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    if (sharpness != null) __obj.updateDynamic("sharpness")(sharpness.asInstanceOf[js.Any])
    if (torch != null) __obj.updateDynamic("torch")(torch.asInstanceOf[js.Any])
    if (whiteBalanceMode != null) __obj.updateDynamic("whiteBalanceMode")(whiteBalanceMode.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
}

