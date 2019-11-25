package typings.webrtc

import typings.webrtc.W3C.ConstrainBoolean
import typings.webrtc.W3C.ConstrainDouble
import typings.webrtc.W3C.ConstrainLong
import typings.webrtc.W3C.ConstrainString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackConstraints extends MediaTrackConstraintSet {
  var advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.undefined
}

object MediaTrackConstraints {
  @scala.inline
  def apply(
    advanced: js.Array[MediaTrackConstraintSet] = null,
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
  ): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal()
    if (advanced != null) __obj.updateDynamic("advanced")(advanced.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[MediaTrackConstraints]
  }
}

