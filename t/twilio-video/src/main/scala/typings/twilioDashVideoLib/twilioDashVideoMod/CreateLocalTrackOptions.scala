package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLocalTrackOptions
  extends stdLib.MediaTrackConstraints {
  // In API reference logLevel is not optional, but in the Twilio examples it is
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var workaroundWebKitBug180748: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateLocalTrackOptions {
  @scala.inline
  def apply(
    advanced: js.Array[stdLib.MediaTrackConstraintSet] = null,
    aspectRatio: scala.Double | stdLib.ConstrainDoubleRange = null,
    channelCount: scala.Double | stdLib.ConstrainLongRange = null,
    deviceId: java.lang.String | js.Array[java.lang.String] | stdLib.ConstrainDOMStringParameters = null,
    displaySurface: java.lang.String | js.Array[java.lang.String] | stdLib.ConstrainDOMStringParameters = null,
    echoCancellation: scala.Boolean | stdLib.ConstrainBooleanParameters = null,
    facingMode: java.lang.String | js.Array[java.lang.String] | stdLib.ConstrainDOMStringParameters = null,
    frameRate: scala.Double | stdLib.ConstrainDoubleRange = null,
    groupId: java.lang.String | js.Array[java.lang.String] | stdLib.ConstrainDOMStringParameters = null,
    height: scala.Double | stdLib.ConstrainLongRange = null,
    latency: scala.Double | stdLib.ConstrainDoubleRange = null,
    logLevel: LogLevel | LogLevels = null,
    logicalSurface: scala.Boolean | stdLib.ConstrainBooleanParameters = null,
    name: java.lang.String = null,
    sampleRate: scala.Double | stdLib.ConstrainLongRange = null,
    sampleSize: scala.Double | stdLib.ConstrainLongRange = null,
    volume: scala.Double | stdLib.ConstrainDoubleRange = null,
    width: scala.Double | stdLib.ConstrainLongRange = null,
    workaroundWebKitBug180748: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateLocalTrackOptions = {
    val __obj = js.Dynamic.literal()
    if (advanced != null) __obj.updateDynamic("advanced")(advanced)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (displaySurface != null) __obj.updateDynamic("displaySurface")(displaySurface.asInstanceOf[js.Any])
    if (echoCancellation != null) __obj.updateDynamic("echoCancellation")(echoCancellation.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (logicalSurface != null) __obj.updateDynamic("logicalSurface")(logicalSurface.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(workaroundWebKitBug180748)) __obj.updateDynamic("workaroundWebKitBug180748")(workaroundWebKitBug180748)
    __obj.asInstanceOf[CreateLocalTrackOptions]
  }
}

