package typings
package w3cDashImageDashCaptureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackConstraintSet extends js.Object {
  var brightness: js.UndefOr[webrtcLib.W3CNs.ConstrainDouble] = js.undefined
  var colorTemperature: js.UndefOr[webrtcLib.W3CNs.ConstrainDouble] = js.undefined
  var contrast: js.UndefOr[webrtcLib.W3CNs.ConstrainDouble] = js.undefined
  var exposureCompensation: js.UndefOr[webrtcLib.W3CNs.ConstrainDouble] = js.undefined
  var exposureMode: js.UndefOr[webrtcLib.W3CNs.ConstrainString] = js.undefined
  var focusDistance: js.UndefOr[webrtcLib.W3CNs.ConstrainDouble] = js.undefined
  var focusMode: js.UndefOr[webrtcLib.W3CNs.ConstrainString] = js.undefined
  var iso: js.UndefOr[webrtcLib.W3CNs.ConstrainDouble] = js.undefined
  var pointsOfInterest: js.UndefOr[w3cDashImageDashCaptureLib.W3CNs.ConstrainPoint2D] = js.undefined
  var saturation: js.UndefOr[webrtcLib.W3CNs.ConstrainDouble] = js.undefined
  var sharpness: js.UndefOr[webrtcLib.W3CNs.ConstrainDouble] = js.undefined
  var torch: js.UndefOr[webrtcLib.W3CNs.ConstrainBoolean] = js.undefined
  var whiteBalanceMode: js.UndefOr[webrtcLib.W3CNs.ConstrainString] = js.undefined
  var zoom: js.UndefOr[webrtcLib.W3CNs.ConstrainDouble] = js.undefined
}

object MediaTrackConstraintSet {
  @scala.inline
  def apply(
    brightness: webrtcLib.W3CNs.ConstrainDouble = null,
    colorTemperature: webrtcLib.W3CNs.ConstrainDouble = null,
    contrast: webrtcLib.W3CNs.ConstrainDouble = null,
    exposureCompensation: webrtcLib.W3CNs.ConstrainDouble = null,
    exposureMode: webrtcLib.W3CNs.ConstrainString = null,
    focusDistance: webrtcLib.W3CNs.ConstrainDouble = null,
    focusMode: webrtcLib.W3CNs.ConstrainString = null,
    iso: webrtcLib.W3CNs.ConstrainDouble = null,
    pointsOfInterest: w3cDashImageDashCaptureLib.W3CNs.ConstrainPoint2D = null,
    saturation: webrtcLib.W3CNs.ConstrainDouble = null,
    sharpness: webrtcLib.W3CNs.ConstrainDouble = null,
    torch: webrtcLib.W3CNs.ConstrainBoolean = null,
    whiteBalanceMode: webrtcLib.W3CNs.ConstrainString = null,
    zoom: webrtcLib.W3CNs.ConstrainDouble = null
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

