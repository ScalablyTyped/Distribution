package typings
package webrtcLib

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
    aspectRatio: webrtcLib.W3CNs.ConstrainDouble = null,
    deviceId: webrtcLib.W3CNs.ConstrainString = null,
    echoCancellation: webrtcLib.W3CNs.ConstrainBoolean = null,
    facingMode: webrtcLib.W3CNs.ConstrainString = null,
    frameRate: webrtcLib.W3CNs.ConstrainDouble = null,
    groupId: webrtcLib.W3CNs.ConstrainString = null,
    height: webrtcLib.W3CNs.ConstrainLong = null,
    latency: webrtcLib.W3CNs.ConstrainDouble = null,
    sampleRate: webrtcLib.W3CNs.ConstrainLong = null,
    sampleSize: webrtcLib.W3CNs.ConstrainLong = null,
    volume: webrtcLib.W3CNs.ConstrainDouble = null,
    width: webrtcLib.W3CNs.ConstrainLong = null
  ): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal()
    if (advanced != null) __obj.updateDynamic("advanced")(advanced)
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

