package typings.twilioVideo.mod

import typings.std.ConstrainBoolean
import typings.std.ConstrainDOMString
import typings.std.ConstrainDouble
import typings.std.ConstrainULong
import typings.std.MediaTrackConstraintSet
import typings.std.MediaTrackConstraints
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocalTrackOptions extends MediaTrackConstraints {
  // In API reference logLevel is not optional, but in the Twilio examples it is
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var workaroundWebKitBug180748: js.UndefOr[Boolean] = js.undefined
}

object CreateLocalTrackOptions {
  @scala.inline
  def apply(
    advanced: js.Array[MediaTrackConstraintSet] = null,
    aspectRatio: ConstrainDouble = null,
    autoGainControl: ConstrainBoolean = null,
    channelCount: ConstrainULong = null,
    deviceId: ConstrainDOMString = null,
    echoCancellation: ConstrainBoolean = null,
    facingMode: ConstrainDOMString = null,
    frameRate: ConstrainDouble = null,
    groupId: ConstrainDOMString = null,
    height: ConstrainULong = null,
    latency: ConstrainDouble = null,
    logLevel: LogLevel | LogLevels = null,
    name: String = null,
    noiseSuppression: ConstrainBoolean = null,
    resizeMode: ConstrainDOMString = null,
    sampleRate: ConstrainULong = null,
    sampleSize: ConstrainULong = null,
    width: ConstrainULong = null,
    workaroundWebKitBug180748: js.UndefOr[Boolean] = js.undefined
  ): CreateLocalTrackOptions = {
    val __obj = js.Dynamic.literal()
    if (advanced != null) __obj.updateDynamic("advanced")(advanced.asInstanceOf[js.Any])
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (autoGainControl != null) __obj.updateDynamic("autoGainControl")(autoGainControl.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (echoCancellation != null) __obj.updateDynamic("echoCancellation")(echoCancellation.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (noiseSuppression != null) __obj.updateDynamic("noiseSuppression")(noiseSuppression.asInstanceOf[js.Any])
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(workaroundWebKitBug180748)) __obj.updateDynamic("workaroundWebKitBug180748")(workaroundWebKitBug180748.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLocalTrackOptions]
  }
}

