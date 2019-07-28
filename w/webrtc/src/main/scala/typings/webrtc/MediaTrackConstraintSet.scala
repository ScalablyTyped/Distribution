package typings.webrtc

import typings.webrtc.W3CNs.ConstrainBoolean
import typings.webrtc.W3CNs.ConstrainDouble
import typings.webrtc.W3CNs.ConstrainLong
import typings.webrtc.W3CNs.ConstrainString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackConstraintSet extends js.Object {
  var aspectRatio: js.UndefOr[ConstrainDouble] = js.undefined
  var deviceId: js.UndefOr[ConstrainString] = js.undefined
  var echoCancellation: js.UndefOr[ConstrainBoolean] = js.undefined
  var facingMode: js.UndefOr[ConstrainString] = js.undefined
  var frameRate: js.UndefOr[ConstrainDouble] = js.undefined
  var groupId: js.UndefOr[ConstrainString] = js.undefined
  var height: js.UndefOr[ConstrainLong] = js.undefined
  var latency: js.UndefOr[ConstrainDouble] = js.undefined
  var sampleRate: js.UndefOr[ConstrainLong] = js.undefined
  var sampleSize: js.UndefOr[ConstrainLong] = js.undefined
  var volume: js.UndefOr[ConstrainDouble] = js.undefined
  var width: js.UndefOr[ConstrainLong] = js.undefined
}

object MediaTrackConstraintSet {
  @scala.inline
  def apply(
    aspectRatio: ConstrainDouble = null,
    deviceId: ConstrainString = null,
    echoCancellation: ConstrainBoolean = null,
    facingMode: ConstrainString = null,
    frameRate: ConstrainDouble = null,
    groupId: ConstrainString = null,
    height: ConstrainLong = null,
    latency: ConstrainDouble = null,
    sampleRate: ConstrainLong = null,
    sampleSize: ConstrainLong = null,
    volume: ConstrainDouble = null,
    width: ConstrainLong = null
  ): MediaTrackConstraintSet = {
    val __obj = js.Dynamic.literal()
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (echoCancellation != null) __obj.updateDynamic("echoCancellation")(echoCancellation.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackConstraintSet]
  }
}

